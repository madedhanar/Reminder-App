import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { ToastController } from '@ionic/angular';


@Component({
  selector: 'reminder-reminder',
  templateUrl: './reminder.page.html',
  styleUrls: ['./reminder.page.scss'],
})
export class ReminderPage implements OnInit {

  params: Params;

  constructor(private route: ActivatedRoute, public toastController: ToastController) { }

  ngOnInit() {
    this.params = this.route.snapshot.params;
  }

  async presentToast() {
    const toast = await this.toastController.create({
      message: 'Your settings have been saved.',
      duration: 2000
    });
    toast.present();
  }

}
