import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReminderComponent } from './components/reminder/reminder.component';
import { ReminderDetailComponent } from './components/reminder-detail/reminder-detail.component';
import { ReminderAddComponent } from './components/reminder-add/reminder-add.component';
import { LoginComponent } from './components/login/login.component';
import {MatSortModule} from '@angular/material/sort';
import {MatNativeDateModule} from '@angular/material/core';
import { MaterialExampleModule } from './material.module';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ReminderComponent,
    ReminderDetailComponent,
    ReminderAddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatSortModule,
    MatNativeDateModule,
    MaterialExampleModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
