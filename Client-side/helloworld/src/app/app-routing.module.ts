import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PipeComponent } from './Components/pipe/pipe.component';
import { HomeComponent } from './Components/home/home.component';
import { RegUsersComponent } from './Components/reg-users/reg-users.component';
import { UserformComponent } from './Components/userform/userform.component';

const routes: Routes = [
  {path:"", component:HomeComponent}, 
  {path:"register" , component:UserformComponent},
  {path:"reg", component:RegUsersComponent},
  {path:"pipe", component:PipeComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
