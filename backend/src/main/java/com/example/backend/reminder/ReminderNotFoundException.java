package com.example.backend.reminder;

public class ReminderNotFoundException extends Exception {
    public ReminderNotFoundException() {
        super();
    }

    public ReminderNotFoundException(String message) {
        super(message);
    }

    public ReminderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReminderNotFoundException(Throwable cause) {
        super(cause);
    }

    protected ReminderNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
