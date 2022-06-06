import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Doctor } from "src/app/doctor";

@Injectable({
    providedIn:"root"
})
export class LoginService{
    private  baseURL="http://localhost:8080/api/v1/doctor/login"
    constructor(private http:HttpClient){}

    loginUser(user: Doctor):Observable<object>{
        console.log(user)
        return this.http.post(`${this.baseURL}`, user);
    }
}