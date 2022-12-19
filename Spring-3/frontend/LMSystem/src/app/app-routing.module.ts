import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookDetailsComponent } from './book-details/book-details.component';
import { BookListComponent } from './book-list/book-list.component';
import { CreateBookComponent } from './create-book/create-book.component';
import { HomeComponent } from './home/home.component';
import { UpdateBookComponent } from './update-book/update-book.component';

const newLocal = 'update-book/:id';
const routes: Routes = [
  {path: 'book', component:BookListComponent},
  {path: 'create-book', component:CreateBookComponent},
  {path: 'home', component:HomeComponent},
  {path: 'book-details/:id', component:BookDetailsComponent},
  {path: 'update-book/:id', component:UpdateBookComponent},
  {path: '', redirectTo: 'book', pathMatch: 'full'}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
