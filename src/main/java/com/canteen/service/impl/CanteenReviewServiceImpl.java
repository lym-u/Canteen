package com.canteen.service.impl;

import com.canteen.bean.Canteenreview;
import com.canteen.bean.CanteenreviewExample;
import com.canteen.dao.CanteenreviewMapper;
import com.canteen.service.CanteenReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenReviewServiceImpl implements CanteenReviewService {

    @Autowired
    private CanteenreviewMapper canteenreviewMapper;

    @Override
    public long countByExample(CanteenreviewExample example) {
        return canteenreviewMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CanteenreviewExample example) {
        return canteenreviewMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer canteenreviewid) {
        return canteenreviewMapper.deleteByPrimaryKey(canteenreviewid);
    }

    @Override
    public int insert(Canteenreview record) {
        return canteenreviewMapper.insert(record);
    }

    @Override
    public int insertSelective(Canteenreview record) {
        return canteenreviewMapper.insertSelective(record);
    }

    @Override
    public List<Canteenreview> selectByExampleWithBLOBs(CanteenreviewExample example) {
        return canteenreviewMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Canteenreview> selectByExample(CanteenreviewExample example) {
        return canteenreviewMapper.selectByExample(example);
    }

    @Override
    public Canteenreview selectByPrimaryKey(Integer canteenreviewid) {
        return canteenreviewMapper.selectByPrimaryKey(canteenreviewid);
    }

    @Override
    public int updateByExampleSelective(Canteenreview record, CanteenreviewExample example) {
        return canteenreviewMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(Canteenreview record, CanteenreviewExample example) {
        return canteenreviewMapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(Canteenreview record, CanteenreviewExample example) {
        return canteenreviewMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Canteenreview record) {
        return canteenreviewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Canteenreview record) {
        return canteenreviewMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Canteenreview record) {
        return canteenreviewMapper.updateByPrimaryKey(record);
    }
}
