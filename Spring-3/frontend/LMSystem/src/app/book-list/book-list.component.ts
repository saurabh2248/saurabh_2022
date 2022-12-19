import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from '../book';
import { BookService } from '../book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[];

  constructor(private bookService: BookService,
               private router :Router) { }

  ngOnInit(): void {
    this.getBook();
  }

  private getBook() {
    this.bookService.getBookList().subscribe(data => {
      this.books = data;
    })
  }

  updateBook(id : number){
     this.router.navigate(['update-book', id]);
  }

  bookDetails(id : number){
   this.router.navigate(['book-details', id]);
 }

  deleteBook(id : number){
    this.bookService.deleteBook(id).subscribe(data => {
      console.log(data);
      this.getBook();
    })
  }
}
