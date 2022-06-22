import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { PatientListComponent } from './components/patient-list/patient-list.component';
import { ReminderAddComponent } from './components/reminder-add/reminder-add.component';
import { ReminderDetailComponent } from './components/reminder-detail/reminder-detail.component';
import { ReminderComponent } from './components/reminder/reminder.component';


const routes: Routes = [
  {path:'', component: LoginComponent},
  {path:'login', component: LoginComponent},
  {path:'home', component: ReminderComponent},
  {path:'detail', component: ReminderDetailComponent},
  {path:'add', component: ReminderAddComponent},
  {path:'list', component: PatientListComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
