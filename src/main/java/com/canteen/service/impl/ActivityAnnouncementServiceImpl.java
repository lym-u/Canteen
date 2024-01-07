package com.canteen.service.impl;

import com.canteen.bean.ActivityAnnouncement;
import com.canteen.bean.ActivityAnnouncementExample;
import com.canteen.dao.ActivityAnnouncementMapper;
import com.canteen.service.ActivityAnnouncementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公告实现类
 * @CasseShimada
 */
@Service
public class ActivityAnnouncementServiceImpl implements ActivityAnnouncementService {

    @Autowired
    private ActivityAnnouncementMapper announcementMapper;

    @Override
    public int addAnnouncement(ActivityAnnouncement announcement) {
        // 添加公告
        return announcementMapper.insert(announcement);
    }

    @Override
    public ActivityAnnouncement getAnnouncementById(int announcementId) {
        // 根据ID检索公告
        return announcementMapper.selectByPrimaryKey(announcementId);
    }

    @Override
    public List<ActivityAnnouncement> getAllAnnouncements() {
        // 获取所有公告
        ActivityAnnouncementExample example = new ActivityAnnouncementExample();
        return announcementMapper.selectByExample(example);
    }

    @Override
    public int updateAnnouncement(ActivityAnnouncement announcement) {
        // 更新一个公告
        return announcementMapper.updateByPrimaryKey(announcement);
    }

    @Override
    public int deleteAnnouncement(int announcementId) {
        // 删除一个公告
        return announcementMapper.deleteByPrimaryKey(announcementId);
    }
}
