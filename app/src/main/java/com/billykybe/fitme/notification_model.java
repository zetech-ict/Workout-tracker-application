package com.billykybe.fitme;public class notification_model {
    int notificationIcon,priority,imgView;
    String n_title,n_text;



    public notification_model(int notificationIcon, String n_title, String n_text,int priority,int imgView) {
        this.notificationIcon = notificationIcon;
        this.imgView = imgView;
        this.priority = priority;
        this.n_title = n_title;
        this.n_text = n_text;

    }

    public int getPriority() {
        return priority;
    }
    public int getImgView() {
        return imgView;
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
