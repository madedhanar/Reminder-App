import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Reminder } from 'src/app/reminder';
import { Patient } from 'src/app/patient';


@Injectable(
    {providedIn: 'root'}
    )
export class ReminderService {
  private baseURL = "http://localhost:8080/api/v1/reminder";
  private testGetCount = "http://localhost:8080/api/v1/reminder/getCount";
  private getPatientURL = "http://localhost:8080/api/v1/patient/doctor/2";
  
  constructor(private http: HttpClient) { }
  
    //get API Reminder
    getReminderList(): Observable<Reminder[]>{
        return this.http.get<Reminder[]>(`${this.baseURL}`);
    }

    //get PatientList API Reminder
    getPatientList(): Observable<Patient[]>{
        return this.http.get<Patient[]>(`${this.getPatientURL}`);
    }

    //get Count By Priority API Reminder
    getCountByPriority(): Observable<Object[]>{
        return this.http.get<Object[]>(`${this.testGetCount}`);
    }
    
    //post API Reminder
    addReminder(reminder: Reminder): Observable<any>{
        return this.http.post(`${this.baseURL}`, reminder);
    }
    

    
}
