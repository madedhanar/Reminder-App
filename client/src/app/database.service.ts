import { Injectable } from '@angular/core';
import { SQLite, SQLiteObject } from '@ionic-native/sqlite/ngx';
import { SQLitePorter } from '@ionic-native/sqlite-porter/ngx';
import { HttpClient } from '@angular/common/http'
import { Platform } from '@ionic/angular';
import { BehaviorSubject } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DatabaseService {
  databaseObj: SQLiteObject
  private dbReady: BehaviorSubject<boolean> = new BehaviorSubject(false);
  private patient = new BehaviorSubject([]);
  tables = {
    patients: 'patients',
    doctors: 'doctors'
  }
  constructor(private sqlite:SQLite, private sqlitePorter: SQLitePorter, private http:HttpClient, private platform:Platform) { 
    this.platform.ready().then(() =>{
       this.sqlite.create({
        name: 'reminder_db',
        location:'default'
      })
      .then((db: SQLiteObject) =>{
        this.databaseObj = db;
      })
      .catch((e) =>{
        alert("Error on creating database " + JSON.stringify(e))
      })
    })
  }

  reminderDB(){
    this.http.get('assets/app.sql', { responseType: 'text'})
    .subscribe(sql => {
      this.sqlitePorter.importSqlToDb(this.databaseObj, sql)
      .then(_ => {
      })
    })
  }


}
