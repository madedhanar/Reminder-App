import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from 'src/app/patient';
import { priority } from 'src/app/priority';
import { priorityList } from 'src/app/priority-list';
import { Reminder } from 'src/app/reminder';
import { ReminderService } from '../reminder-detail/reminder.service';
//import validator and FormBuilder
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';



@Component({
  selector: 'app-reminder-add',
  templateUrl: './reminder-add.component.html',
  styleUrls: ['./reminder-add.component.css']
})
export class ReminderAddComponent implements OnInit {
  selectedPriority: number;
  selectedPatient: number;
  reminder:Reminder = new Reminder();
  patients: Patient[];
  priority: priority[] = priorityList
  requiredForm: FormGroup;

  constructor(private reminderService:ReminderService, private router: Router, private fb: FormBuilder){
    this.myForm();
   }
   myForm() {
    this.requiredForm = this.fb.group({
    name: ['', Validators.required ]
    });
 }

  ngOnInit(): void {
    this.getPatientList();
  }

  //change value priority select option
  ChangePriority(e){
    console.log(e.target.value)
    this.selectedPriority=e.target.value;
  }

  //change value patient select option
  ChangePatient(e){
    console.log(Number(e.target.value))
    this.selectedPatient= Number(e.target.value)
  }

  //function to save new reminder
  saveReminder(){
    this.reminderService.addReminder(this.reminder).subscribe(data => {
      console.log(data);
      this.goToHome();
    })
  }

  //function to direct to home after submit
  goToHome(){
    this.router.navigate(['/home'])
  }

  //function to trigger saveReminder() function when form submitted
  onSubmit(){
    console.log(this.reminder)
    this.saveReminder()
  }

  //function to get patient list from service to component
  private getPatientList(){
    this.reminderService.getPatientList().subscribe(dataPatient =>{
      this.patients = dataPatient
    })
  }



}
