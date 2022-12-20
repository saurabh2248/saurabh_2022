import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/Entity/book';
import { BookService } from 'src/app/Services/book.service';
import { Router } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { NgForm } from '@angular/forms';
 
@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})
export class CreateBookComponent implements OnInit {

  books: Book = new Book();

  constructor(private bookService: BookService, private router: Router) { }

  ngOnInit(): void {
  }

  saveBook() {
    this.bookService.createBook(this.books).subscribe(data => {
      //console.log(data);
      this.goToBookList();
    },
    error => console.log(error));
  }

  goToBookList() {
    this.router.navigate(['/books'])
  }

  onSubmit() {
    console.log(this.books)
    this.saveBook();
  }
}
