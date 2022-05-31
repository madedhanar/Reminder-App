
import { Reminder } from "./reminder";


export interface Patient{
    patient_name: String,
    email: string,
    password: string,
    reminder:Reminder,
    doctor_name:string,
    unfinished_high:number,
    unfinished_middle:number,
    unfinished_low:number,
}