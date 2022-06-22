import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReminderComponent } from './components/reminder/reminder.component';
import { ReminderDetailComponent } from './components/reminder-detail/reminder-detail.component';
import { ReminderAddComponent } from './components/reminder-add/reminder-add.component';
import { LoginComponent } from './components/login/login.component';
import { FormsModule } from '@angular/forms';
import { PatientListComponent } from './components/patient-list/patient-list.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ReminderComponent,
    ReminderDetailComponent,
    ReminderAddComponent,
    PatientListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule, 
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
