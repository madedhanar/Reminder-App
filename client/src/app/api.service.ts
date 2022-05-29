import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';
import {catchError, tap, map} from 'rxjs/operators'

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
}

const apiUrl = "http://localhost:8080/api/v1/patient"

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { 

  }

  //API Error Handling
  private handleError(error: HttpErrorResponse){
      if(error.error instanceof ErrorEvent){
        console.error('An error occured: ', error.error.message)
      } else{
        console.error(
          `Backend returned code ${error.status}` + 
          `body was: ${error.error}`
        )
      }
      return throwError('Something bad happened; please try again later.')
  }
  //API Extract Response
  private extractData(res:Response){
    let body = res;
    return body || { };
  }

  //API Get Data Patient
  getDataPatient(): Observable<any>{
    return this.http.get(apiUrl).pipe(
      map(this.extractData),
      catchError(this.handleError)
    )
  }
}
