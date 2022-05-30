export interface Reminder{
    id?: number;
    reminder_title: string;
    reminder_desc: string;
    duration: number;
    start_date: Date;
    end_date: Date;
    finish_flag: number;
    patient: string;
    doctor: string;
    status: string;
}