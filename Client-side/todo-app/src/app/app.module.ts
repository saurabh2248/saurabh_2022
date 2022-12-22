import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {StoreModule} from '@ngrx/store';
import { TodoReducer } from './reducers/todo.reducer';
import { RemoveTodoComponent } from './components/remove-todo/remove-todo.component';
import { AddTodoComponentComponent } from './components/add-todo-component/add-todo-component.component';

@NgModule({
  declarations: [
    AppComponent,
    RemoveTodoComponent,
    AddTodoComponentComponent,
    RemoveTodoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    StoreModule.forRoot({todos:TodoReducer})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }