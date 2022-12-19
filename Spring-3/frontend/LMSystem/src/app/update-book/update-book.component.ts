import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Book } from '../book';
import { BookService } from '../book.service';

@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent implements OnInit {

  id: number;
  books: Book = new Book();
  constructor(private bookService: BookService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.bookService.getBookById(this.id).subscribe(data => {
      this.books = data;
    }, error => console.log(error));
  }

  onSubmit() {
    this.bookService.updateBook(this.id, this.books).subscribe(data => {
      this.goToBookList();
    },
      error => console.log(error));
  }

  goToBookList() {
    this.router.navigate(['/books'])
  }
}
