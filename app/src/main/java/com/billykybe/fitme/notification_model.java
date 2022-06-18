package com.billykybe.fitme;public class notification_model {
    int notificationIcon;
    String n_title,n_text;

    public notification_model(int notificationIcon, String n_title, String n_text) {
        this.notificationIcon = notificationIcon;
        this.n_title = n_title;
        this.n_text = n_text;
    }

    public int getNotificationIcon() {
        return notificationIcon;
    }

    public String getN_title() {
        return n_title;
    }

    public String getN_text() {
        return n_text;
    }
}
