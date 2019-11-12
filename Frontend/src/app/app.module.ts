import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RepresentativeComponent } from './tabs/representative/representative.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { HeaderComponent } from './header/header.component';
import { AboutChurchComponent } from './tabs/about-church/about-church.component';
import { ContactComponent } from './tabs/contact/contact.component';
import { NewsComponent } from './tabs/news/news.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatCardModule } from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';
import { MainService } from './service/main.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RepresentativeComponent,
    WelcomeComponent,
    HeaderComponent,
    AboutChurchComponent,
    ContactComponent,
    NewsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    HttpClientModule
  ],
  providers: [
    MainService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
