export class Reminder {
    reminderId: number;
    reminderTitle: string;
    reminderDescription: string;
    duration: number;
    endDate: Date;
    priority: string;
    finishFlag: number = 0;
    patient: number;
    doctor: number = 3;
}