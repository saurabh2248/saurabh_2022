import { Component, NgModule, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Book } from 'src/app/Entity/book';
import { BookService } from 'src/app/Services/book.service';
import { NgModel } from '@angular/forms';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent implements OnInit {

  id: number;
  book = new Book();
  constructor(private bookService: BookService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.bookService.getBookById(this.id).subscribe(data => {
      this.book = data;
    }, error => console.log(error));
  }

  onSubmit() {
    this.bookService.updateBook(this.id, this.book).subscribe(data => {
      this.goToBookList();
    },
      error => console.log(error));
  }

  goToBookList() {
    this.router.navigate(['/books'])
  }
}
