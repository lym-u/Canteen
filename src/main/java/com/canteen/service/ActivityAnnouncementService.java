package com.canteen.service;

import com.canteen.bean.ActivityAnnouncement;
import com.canteen.bean.ActivityAnnouncementExample;
import com.canteen.bean.Canteen;
import com.canteen.bean.CanteenExample;

import java.util.List;
/**
 * 公告接口类
 * @CasseShimada
 */
public interface ActivityAnnouncementService {
    int addAnnouncement(ActivityAnnouncement announcement);

    ActivityAnnouncement getAnnouncementById(int announcementId);

    List<ActivityAnnouncement> getAllAnnouncements();

    int updateAnnouncement(ActivityAnnouncement announcement);

    int deleteAnnouncement(int announcementId);

    List<ActivityAnnouncement> selectByExample(ActivityAnnouncementExample example);
}
