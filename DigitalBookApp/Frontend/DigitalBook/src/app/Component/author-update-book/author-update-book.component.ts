import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Book } from 'src/app/entity/Book';
import { AuthorService } from 'src/app/service/author.service';
import { TokenStorageService } from 'src/app/service/token-storage.service';

@Component({
  selector: 'app-author-update-book',
  templateUrl: './author-update-book.component.html',
  styleUrls: ['./author-update-book.component.css']
})
export class AuthorUpdateBookComponent implements OnInit {
  book = new Book();
  bookName:string="";
  constructor(private authorService:AuthorService,private tokenStorage:TokenStorageService) { }

  ngOnInit(): void {
  }
 authorId:number;
 bookId:number;
 authorName:string
  onSubmit(f:NgForm){
    
  
    console.log(this.book.bookId);
    this.authorService.updateBook(this.book,this.book.bookId)
    .subscribe(data=>{
      this.bookName = data;
    })
    console.log(this.book);
    f.resetForm();
    alert("Book updation done!");
  }

}
