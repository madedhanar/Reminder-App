import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Reminder } from 'src/app/reminder';
import { ReminderService } from '../reminder-detail/reminder.service';


@Component({
  selector: 'app-reminder-add',
  templateUrl: './reminder-add.component.html',
  styleUrls: ['./reminder-add.component.css']
})
export class ReminderAddComponent implements OnInit {

  reminder:Reminder = new Reminder();

  constructor(private reminderService:ReminderService, private router: Router){ }

  ngOnInit(): void {
  }

  saveReminder(){
    this.reminderService.addReminder(this.reminder).subscribe(data => {
      console.log(data);
      this.goToHome();
    }, 
    error => console.log(error))
  }

  goToHome(){
    this.router.navigate(['/home'])
  }

  onSubmit(){
    console.log(this.reminder)
    this.saveReminder()
  }



}
