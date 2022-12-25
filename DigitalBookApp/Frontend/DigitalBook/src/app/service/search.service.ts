import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
const API_URL = 'http://localhost:8081/api/test/';
@Injectable({
  providedIn: 'root'
})
export class SearchService {

  constructor(private http: HttpClient) { }

  getBookByTitle(title:String){
    return this.http.get(API_URL+"search/"+title);
  }

  getBookByCategory(category:String){
    return this.http.get(API_URL+"searchbycategory/"+category);
  }

  getBookByPublisher(publisher:String){
    return this.http.get(API_URL+"searchbypublisher/"+publisher);
  }
}
