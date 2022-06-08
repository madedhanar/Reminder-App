import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Reminder } from '../reminder';
import { ReminderService } from '../reminder.service';


@Component({
  selector: 'reminder-reminder',
  templateUrl: './reminder.page.html',
  styleUrls: ['./reminder.page.scss'],
})
export class ReminderPage implements OnInit {

  params: Params;

  constructor(private route: ActivatedRoute, private reminderService:ReminderService) { }

  reminders:Reminder[]

  ngOnInit() {
    this.getReminder();
  }

  private getReminder(){
    this.reminderService.getReminderList().subscribe(data =>{
      this.reminders = data;
    })
  } 

  // onClick(){
  //   this.reminderService.updateReminder(this.reminderId, this.reminder)
  // }
}



