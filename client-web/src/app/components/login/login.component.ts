import { Component, OnInit } from '@angular/core';
import { Doctor } from 'src/app/doctor';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  title:String = "Login"
  
  doctor: Doctor = new Doctor();
  
  constructor(private loginService:LoginService) { }

  ngOnInit(): void {
  }

  userLogin(){
    console.log(this.doctor);
    this.loginService.loginUser(this.doctor).subscribe(data =>{
      alert("login")
    },error=>alert("Please enter correct ID or Passwords"))
  }

}
