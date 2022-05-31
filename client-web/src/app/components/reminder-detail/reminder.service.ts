import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Reminder } from 'src/app/reminder';


@Injectable(
    {providedIn: 'root'}
    )
export class ReminderService {
  private baseURL = "http://localhost:8080/api/v1/reminder";
  constructor(private http: HttpClient) { }
  
    getReminderList(): Observable<Reminder[]>{
        return this.http.get<Reminder[]>(`${this.baseURL}`);
    }

    
}