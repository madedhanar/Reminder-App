import { Component, OnInit } from '@angular/core';
import { Patient } from 'src/app/patient';
import { Reminder } from 'src/app/reminder';
import { ReminderService } from '../reminder-detail/reminder.service';


@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit {
    reminders: Reminder[];
    patients: Patient[];
    countPriority: Object[] = [];
    // patientList: Patient[] = PatientList;
  
    constructor(private reminderService: ReminderService) {

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
  

