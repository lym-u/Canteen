package com.canteen.service.impl;

import com.canteen.bean.Canteenreviewreply;
import com.canteen.bean.CanteenreviewreplyExample;
import com.canteen.dao.CanteenreviewreplyMapper;
import com.canteen.service.CanteenReviewReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 餐厅评论回复服务的实现类，用于管理餐厅评论回复实体。
 */
@Service
public class CanteenReviewReplyImpl implements CanteenReviewReplyService {

    private CanteenreviewreplyMapper canteenreviewreplyMapper;

    /**
     * 根据条件统计餐厅评论回复的数量。
     */
    @Override
    public long countByExample(CanteenreviewreplyExample example) {
        return canteenreviewreplyMapper.countByExample(example);
    }

    /**
     * 根据条件删除餐厅评论回复。
     */
    @Override
    public int deleteByExample(CanteenreviewreplyExample example) {
        return canteenreviewreplyMapper.deleteByExample(example);
    }

    /**
     * 根据主键ID删除餐厅评论回复。
     */
    @Override
    public int deleteByPrimaryKey(Integer replyid) {
        return canteenreviewreplyMapper.deleteByPrimaryKey(replyid);
    }

    /**
     * 插入一条新的餐厅评论回复记录。
     */
    @Override
    public int insert(Canteenreviewreply record) {
        return canteenreviewreplyMapper.insert(record);
    }

    /**
     * 选择性地插入一条新的餐厅评论回复记录。
     */
    @Override
    public int insertSelective(Canteenreviewreply record) {
        return canteenreviewreplyMapper.insertSelective(record);
    }

    /**
     * 根据条件查询带有大字段的餐厅评论回复列表。
     */
    @Override
    public List<Canteenreviewreply> selectByExampleWithBLOBs(CanteenreviewreplyExample example) {
        return canteenreviewreplyMapper.selectByExampleWithBLOBs(example);
    }

    /**
     * 根据条件查询餐厅评论回复列表。
     */
    @Override
    public List<Canteenreviewreply> selectByExample(CanteenreviewreplyExample example) {
        return canteenreviewreplyMapper.selectByExample(example);
    }

    /**
     * 根据主键ID查询餐厅评论回复记录。
     */
    @Override
    public Canteenreviewreply selectByPrimaryKey(Integer replyid) {
        return canteenreviewreplyMapper.selectByPrimaryKey(replyid);
    }

    /**
     * 根据条件更新餐厅评论回复记录（选择性）。
     */
    @Override
    public int updateByExampleSelective(Canteenreviewreply record, CanteenreviewreplyExample example) {
        return canteenreviewreplyMapper.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件更新带有大字段的餐厅评论回复记录（选择性）。
     */
    @Override
    public int updateByExampleWithBLOBs(Canteenreviewreply record, CanteenreviewreplyExample example) {
        return canteenreviewreplyMapper.updateByExampleWithBLOBs(record, example);
    }

    /**
     * 根据条件更新餐厅评论回复记录。
     */
    @Override
    public int updateByExample(Canteenreviewreply record, CanteenreviewreplyExample example) {
        return canteenreviewreplyMapper.updateByExample(record, example);
    }

    /**
     * 根据主键ID选择性地更新餐厅评论回复记录。
     */
    @Override
    public int updateByPrimaryKeySelective(Canteenreviewreply record) {
        return canteenreviewreplyMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键ID更新带有大字段的餐厅评论回复记录。
     */
    @Override
    public int updateByPrimaryKeyWithBLOBs(Canteenreviewreply record) {
        return canteenreviewreplyMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /**
     * 根据主键ID更新餐厅评论回复记录。
     */
    @Override
    public int updateByPrimaryKey(Canteenreviewreply record) {
        return canteenreviewreplyMapper.updateByPrimaryKey(record);
    }
}