import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Reminder } from 'src/app/reminder';


@Injectable(
    {providedIn: 'root'}
    )
export class ReminderService {
  private baseURL = "http://localhost:8080/api/v1/reminder";
  constructor(private http: HttpClient) { }
  
    //get API Reminder with patient id 2
    getReminderList(): Observable<Reminder[]>{
        return this.http.get<Reminder[]>(`${this.baseURL}`+"/patient/3");
    }
    
    // //post API Reminder
    // addReminder(reminder: Reminder): Observable<any>{
    //     return this.http.post(`${this.baseURL}`, reminder);
    // }

    updateReminder(reminderId: number, reminder: Reminder):Observable<Object>{
        return this.http.put(`${this.baseURL}/${reminderId}`, reminder)
    }


    
}