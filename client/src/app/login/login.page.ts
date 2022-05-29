import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { NgForm, FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { ApiService } from '../api.service';
import { MenuController } from '@ionic/angular';


@Component({
  selector: 'login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  dataPatient = null;
  params: Params;
  loginForm: FormGroup;

  constructor(private route: ActivatedRoute, public api: ApiService, public formBuilder: FormBuilder, private menuCtrl: MenuController) { 
      this.menuCtrl.enable(false);
      this.loginForm = this.formBuilder.group({
          username: ['',Validators.required],
          password: ['', Validators.required],

        });

  }

  ngOnInit() {
    this.getDataPatient()
    
  }

  async getDataPatient(){
    await this.api.getDataPatient()
    .subscribe(res => {
      console.log(res);
      this.dataPatient = res;
    }, err =>{
      console.log(err)
    })
  }

  submit() {
    console.log(this.loginForm.value)
    }

}
