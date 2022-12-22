import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/Todo';
import { Store,select } from '@ngrx/store';
import { TodoRemove } from 'src/app/actions/todo.action';

@Component({
  selector: 'app-remove-todo',
  templateUrl: './remove-todo.component.html',
  styleUrls: ['./remove-todo.component.css']
})
export class RemoveTodoComponent implements OnInit {

  todos: Todo[];
  constructor(private store:Store<{todos:Todo[]}>){
    store.pipe(select('todos')).subscribe((values)=>{
      this.todos=values;
      console.log(values);
    });
  }


  ngOnInit(): void {
  }

  removeTodo(index: number){
    this.store.dispatch(new TodoRemove(index));
    console.log(index)
  }

}
