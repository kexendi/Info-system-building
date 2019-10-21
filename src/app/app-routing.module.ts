import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { RepresentativeComponent } from './representative/representative.component';


const routes: Routes = [
  {component: LoginComponent, path: 'login'},
  {component: WelcomeComponent, path: 'welcome'},
  {component: RepresentativeComponent, path: 'representative'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
