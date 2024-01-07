package com.canteen.controller;

import com.canteen.bean.ActivityAnnouncement;
import com.canteen.bean.ActivityAnnouncementExample;
import com.canteen.bean.ResultObject;
import com.canteen.service.ActivityAnnouncementService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announcement")
public class ActivityAnnouncementController {

    @Autowired
    private ActivityAnnouncementService announcementService;

    @PostMapping("/addAm")
    public ResultObject<Object> addAnnouncement(@RequestBody ActivityAnnouncement announcement) {
        ResultObject<Object> result = new ResultObject<>();
        int id = announcementService.addAnnouncement(announcement);
        if (id > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("Announcement added successfully");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("Failed to add announcement");
        }
        return result;
    }

    @GetMapping("/getAmById")
    public ResultObject<ActivityAnnouncement> getAnnouncementById(@PathVariable int id) {
        ResultObject<ActivityAnnouncement> result = new ResultObject<>();
        ActivityAnnouncement announcement = announcementService.getAnnouncementById(id);
        if (announcement != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("Announcement retrieved successfully");
            result.setData(announcement);
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("Announcement not found");
        }
        return result;
    }

    @GetMapping("/getAllAm")
    public ResultObject<List<ActivityAnnouncement>> getAllAnnouncements() {
        ResultObject<List<ActivityAnnouncement>> result = new ResultObject<>();
        List<ActivityAnnouncement> announcements = announcementService.getAllAnnouncements();
        result.setCode(Constant.SUCCESS_RETUEN_CODE);
        result.setMsg("Announcements retrieved successfully");
        result.setData(announcements);
        return result;
    }

    @PutMapping("/updateAm")
    public ResultObject<Object> updateAnnouncement(@RequestBody ActivityAnnouncement announcement) {
        ResultObject<Object> result = new ResultObject<>();
        int rows = announcementService.updateAnnouncement(announcement);
        if (rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("Announcement updated successfully");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("Failed to update announcement");
        }
        return result;
    }

    @DeleteMapping("/deleteAm")
    public ResultObject<Object> deleteAnnouncement(@PathVariable int id) {
        ResultObject<Object> result = new ResultObject<>();
        int rows = announcementService.deleteAnnouncement(id);
        if (rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("Announcement deleted successfully");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("Failed to delete announcement");
        }
        return result;
    }
}
