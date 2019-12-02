import { Component, OnInit } from '@angular/core';
import { MainService } from '../service/main.service';
import { Users } from '../model/users';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  users: Users[];
  isAutorized = false;
  loginForm: FormGroup;

  constructor(
    private mainService: MainService,
    private formBuilder: FormBuilder) { }

  ngOnInit() {
    console.log("oninit: ", this.isAutorized)

    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });

    this.mainService.getUsers().subscribe(data => {
      this.users = data;

      console.log(": ", this.loginForm);

    });

  }

  authorize(username: string, password: string) {
    if (this.loginForm.invalid) {
      return;
    }
    
    for (let i; i<this.users.length; i++) {
      if (i.username === username && i.password === password) {
        this.isAutorized = true;
        console.log("authozized: ", this.isAutorized);
      }
    }
  }

}