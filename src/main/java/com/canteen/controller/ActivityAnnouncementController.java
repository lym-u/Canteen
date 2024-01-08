package com.canteen.controller;

import com.canteen.bean.*;
import com.canteen.service.ActivityAnnouncementService;
import com.canteen.service.CanteenManagerService;
import com.canteen.service.CanteenService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announcement")
public class ActivityAnnouncementController {

    @Autowired
    private ActivityAnnouncementService announcementService;

    @Autowired
    private CanteenManagerService canteenManagerService;

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
    //按照食堂id查询公告信息
    @RequestMapping("/getCanteenId")
    public ResultObject<List<ActivityAnnouncement>> getActivity(@RequestParam("canteenid") int canteenid) {
        int canteenmid=0;
        ResultObject<List<ActivityAnnouncement>> result = new ResultObject<>();
        CanteenmanagerExample example1=new CanteenmanagerExample();
        CanteenmanagerExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andCanteenidEqualTo(canteenid);
        System.out.println(canteenid);
        List<Canteenmanager> canteenmanagers = canteenManagerService.selectByExample(example1);
        //一个食堂应该对应一个食堂管理员
        for (int i = 0; i < canteenmanagers.size(); i++) {
            System.out.println("A");
            Canteenmanager canteenmanager = canteenmanagers.get(i);
            if(canteenmanager.getManagerid()!=null&&!canteenmanager.getManagerid().equals("")){
                canteenmid=canteenmanager.getManagerid();
                System.out.println(canteenmid);
            }
            // 在这里对每个 canteenmanager 进行操作
        }

        ActivityAnnouncementExample example = new ActivityAnnouncementExample();
        ActivityAnnouncementExample.Criteria criteria = example.createCriteria();
        criteria.andManagerIdEqualTo(canteenmid);
        List<ActivityAnnouncement> activityAnnouncements = announcementService.selectByExample(example);

        if (activityAnnouncements != null&& !activityAnnouncements.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
//            for (ActivityAnnouncement announcement : activityAnnouncements) {
            result.setData(activityAnnouncements);
//            }
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("未找到对应的活动公告");
        }

        return result;
    }
}
