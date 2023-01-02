import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from 'src/app/Entity/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private BASE_URL = "http://localhost:8080/books";
  constructor(private httpClient: HttpClient) { }


  getBookList(): Observable<Book[]> {
    return this.httpClient.get<Book[]>(`${this.BASE_URL}`)
  }

  createBook(book: Book): Observable<Object> {
    return this.httpClient.post(`${this.BASE_URL}`, book);
  }

  getBookById(id : number) : Observable<Book>{
       return this.httpClient.get<Book>(`${this.BASE_URL}/${id}`);
  }

  updateBook(id:number, book: Book): Observable<Object>{
     return  this.httpClient.put(`${this.BASE_URL}/${id}`, book);
  }

  deleteBook(id :number):  Observable<Object>{
    return this.httpClient.delete(`${this.BASE_URL}/${id}`);

  }
}
