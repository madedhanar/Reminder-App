import { Component, OnInit } from '@angular/core';
import { Reminder } from 'src/app/reminder';
import { Patient } from 'src/app/patient';
import { ReminderService } from './reminder.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-reminder-detail',
  templateUrl: './reminder-detail.component.html',
  styleUrls: ['./reminder-detail.component.css']
})
export class ReminderDetailComponent implements OnInit {
  reminders: Reminder[];
  patients: Patient[];
  countPriority: Object[] = [];
  // patientList: Patient[] = PatientList;

  constructor(private reminderService: ReminderService, private router:Router) {

   }

  ngOnInit(): void {
    this.getPatientList();
    this.getCountByPriority();
  }

    //function to get patient list from service to component
  private getPatientList(){
    this.reminderService.getPatientList().subscribe(dataPatient =>{
      this.patients = dataPatient
    })
  }

  //stil on test
  private getCountByPriority(){
    this.reminderService.getCountByPriority().subscribe(dataCount =>{
      this.countPriority = dataCount;
    })
  }


 }
