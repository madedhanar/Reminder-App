import { Component, OnInit } from '@angular/core';
import { Reminder } from 'src/app/reminder';


@Component({
  selector: 'app-reminder-add',
  templateUrl: './reminder-add.component.html',
  styleUrls: ['./reminder-add.component.css']
})
export class ReminderAddComponent implements OnInit {

  reminder:Reminder = new Reminder();

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.reminder)
  }



}
