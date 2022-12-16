import { Component, OnInit } from '@angular/core';
import User from 'src/app/Entity/user'
import { UserService } from 'src/app/Services/user.service';


@Component({
  selector: 'app-reg-users',
  templateUrl: './reg-users.component.html',
  styleUrls: ['./reg-users.component.css']
})
export class RegUsersComponent implements OnInit {

  users: User[] = [];

  constructor(private userService: UserService) { }

  deleteRow(user, index) {
    const observables = this.userService.deleteUsers(user);
    observables.subscribe((response: any) => {
      console.log(response);
      this.users.splice(index, 1);
    })
  }

  sort(){
    this.users.sort((users1, users2)=> {
    return users1.age-users2.age;
    })
  }
  /**
   * 
   */
  ngOnInit(): void {
    const promise = this.userService.getUser();
    promise.subscribe((response) => {
      console.log(response);
      this.users = response as User[];
    })

  }

}
