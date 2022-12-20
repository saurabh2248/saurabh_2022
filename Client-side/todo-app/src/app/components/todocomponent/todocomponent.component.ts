import { Component, OnInit } from '@angular/core';
import { select, Store } from '@ngrx/store';


@Component({
  selector: 'app-todocomponent',
  templateUrl: './todocomponent.component.html',
  styleUrls: ['./todocomponent.component.css']
})
export class TodocomponentComponent implements OnInit {
todos : Todo[];

  constructor(private store: Store<{todos : Todo[]}> ) {
    store.pipe(select(this.todos)).subscribe((value)=>{
      this.todos = value;
      console.log(value);
    })
   }

  ngOnInit(): void {
  }

}
