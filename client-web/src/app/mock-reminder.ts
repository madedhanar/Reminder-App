import { Reminder } from "./reminder";


let start_date: Date = new Date("2020-05-31 00:00");  
let end_date: Date = new Date("2020-05-31 12:00"); 
export const ReminderList: Reminder[] = [
    {
        id:1,
        reminder_title:"Take a walk for 30 minutes",
        reminder_desc:"You should take a walk for 30 minutes to keep your body healthy",
        duration: 30,
        start_date: start_date,
        end_date: end_date,
        finish_flag: 0,
        patient: "patient1",
        doctor: "doctor1",
        status:"MIDDLE"

        
    },
    {
        id:2,
        reminder_title:"Drink 8 Glass of Water",
        reminder_desc:"You drink 8 glass of water to keep your body hydrate",
        duration: 1440,
        start_date: start_date,
        end_date: end_date,
        finish_flag: 1,
        patient: "patient1",
        doctor: "doctor1",
        status:"HIGH"

        
    },
    {
        id:1,
        reminder_title:"Sleep for 8 hours",
        reminder_desc:"You should take sleep  for 8 hours to keep your body healthy",
        duration: 480,
        start_date: start_date,
        end_date: end_date,
        finish_flag: 0,
        patient: "patient1",
        doctor: "doctor1",
        status:"HIGH"

        
    }
]