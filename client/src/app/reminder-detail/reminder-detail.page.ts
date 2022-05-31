import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Reminder } from '../reminder';
import { ReminderService } from '../reminder.service';


@Component({
  selector: 'reminder-detail-reminder-detail',
  templateUrl: './reminder-detail.page.html',
  styleUrls: ['./reminder-detail.page.scss'],
})
export class ReminderDetailPage implements OnInit {

  params: Params;

  constructor(private route: ActivatedRoute, private reminderService:ReminderService) { }

  reminders:Reminder[]

  ngOnInit() {
    this.params = this.route.snapshot.params;
    this.getReminder()
  }

  private getReminder(){
    this.reminderService.getReminderList().subscribe(data =>{
      this.reminders = data;
    })
  } 

}
