import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Reminder } from 'src/app/reminder';


@Injectable(
    {providedIn: 'root'}
    )
export class ReminderService {
  private baseURL = "http://localhost:8080/api/v1/reminder";
  private getPatientURL = "http://localhost:8080/api/v1/patient/doctor/1"
  constructor(private http: HttpClient) { }
  
    //get API Reminder
    getReminderList(): Observable<Reminder[]>{
        return this.http.get<Reminder[]>(`${this.baseURL}`);
    }

    //get PatientList API Reminder
    getPatientList(): Observable<Reminder[]>{
        return this.http.get<Reminder[]>(`${this.getPatientURL}`);
    }
    
    //post API Reminder
    addReminder(reminder: Reminder): Observable<any>{
        return this.http.post(`${this.baseURL}`, reminder);
    }

    
}
