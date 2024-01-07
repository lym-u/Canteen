package com.canteen.bean;

import java.io.Serializable;

public class ActivityAnnouncement implements Serializable {
    private int announcementID;
    private int managerID;
    private String activityType;
    private String content;

    public ActivityAnnouncement() {
        // Default constructor
    }

//    public ActivityAnnouncement(int announcementID, int managerID, String activityType, String content) {
//        this.announcementID = announcementID;
//        this.managerID = managerID;
//        this.activityType = activityType;
//        this.content = content;
//    }

    public int getAnnouncementID() {
        return announcementID;
    }

    public void setAnnouncementID(int announcementID) {
        this.announcementID = announcementID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

