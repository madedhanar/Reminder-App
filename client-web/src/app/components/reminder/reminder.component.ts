import { Component, OnInit } from '@angular/core';
import { Reminder } from 'src/app/reminder';
import { ReminderList } from 'src/app/mock-reminder';

@Component({
  selector: 'app-reminder',
  templateUrl: './reminder.component.html',
  styleUrls: ['./reminder.component.css']
})
export class ReminderComponent implements OnInit {

  reminderList:Reminder[] = ReminderList;

  constructor() { }

  ngOnInit(): void {
  }

}
