import { Component, OnInit } from '@angular/core';
import { Reminder } from 'src/app/reminder';
import { Patient } from 'src/app/patient';
import {Sort} from '@angular/material/sort';
import { ReminderService } from './reminder.service';
import { PatientList } from 'src/app/mock-patient';

@Component({
  selector: 'app-reminder-detail',
  templateUrl: './reminder-detail.component.html',
  styleUrls: ['./reminder-detail.component.css']
})
export class ReminderDetailComponent implements OnInit {
  reminders: Reminder[];
  patients: Patient[];
  countPriority: Object[] = [];
  patientList: Patient[] = PatientList;

  constructor(private reminderService: ReminderService) {
    // this.sortedData = this.patientList.slice();
   }

  ngOnInit(): void {
    this.getPatientList();
    this.getCountByPriority();
  }

  private getReminder(){
    this.reminderService.getReminderList().subscribe(data =>{
      this.reminders = data;
    })
  }

  private getPatientList(){
    this.reminderService.getPatientList().subscribe(dataPatient =>{
      this.patients = dataPatient
    })
  }

  private getCountByPriority(){
    this.reminderService.getCountByPriority().subscribe(dataCount =>{
      this.countPriority = dataCount;
    })
  }

//   sortData(sort: Sort) {
//     const data = this.patientList.slice();
//     if (!sort.active || sort.direction === '') {
//       this.sortedData = data;
//       return;
//     }
//     this.sortedData = data.sort((a, b) => {
//       const isAsc = sort.direction === 'asc';
//       switch (sort.active) {
//         case 'unfinished_high':
//           return compare(a.unfinished_high, b.unfinished_high, isAsc);
//         case 'unfinished_middle':
//           return compare(a.unfinished_middle, b.unfinished_middle, isAsc);
//         case 'unfinished_low':
//           return compare(a.unfinished_low, b.unfinished_low, isAsc);
//         default:
//           return 0;
//       }
//     });
//   }

// }

// function compare(a: number | string, b: number | string, isAsc: boolean) {
//   return (a < b ? -1 : 1) * (isAsc ? 1 : -1);
 }
