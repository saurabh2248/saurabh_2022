import  {Action } from '@ngrx/store'
import { TodoActionType } from '../shared/todo-action-types-enum';

export class  ActionParent implements  Action{
    type : any;
    payload: any;
}

export class TodoAdd implements ActionParent{
    payload: any;
    type: TodoActionType.Add;
    constuctor (){

    };
}