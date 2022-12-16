import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {

  employee = {
    "name": "Saurabh Pratap",
    "BaseSalary": 90000,
    "JoinedOn": Date.now(),
    "Qualification": "B.Tech",
    "About": "He is investor",
    "WinningPercentage": 35 / 100
  }

  constructor() { }

  ngOnInit(): void {
  }

}
