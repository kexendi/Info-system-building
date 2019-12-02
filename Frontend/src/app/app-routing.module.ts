import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { RepresentativeComponent } from './tabs/representative/representative.component';
import { NewsComponent } from './tabs/news/news.component';
import { AboutChurchComponent } from './tabs/about-church/about-church.component';
import { ContactComponent } from './tabs/contact/contact.component';


const routes: Routes = [

  { path: '', redirectTo: 'welcome', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'welcome', component: WelcomeComponent },
  { path: 'representative', component: RepresentativeComponent },
  { path: 'aboutChurch', component: AboutChurchComponent },
  { path: 'news', component: NewsComponent },
  { path: 'contact', component: ContactComponent },
  { path: '**', redirectTo: 'welcome' }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
