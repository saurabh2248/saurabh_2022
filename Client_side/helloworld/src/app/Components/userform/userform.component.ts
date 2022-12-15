import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {
 
   
  title:String="Please fill the form";
  firstname:String="";
  lastname:String="";
  age=0;
  gender:String="";
  email:String="";

  save(){
    console.log(this.firstname+" "+this.lastname);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
