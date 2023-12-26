package com.canteen.service.impl;

import com.canteen.bean.Canteenmanager;
import com.canteen.bean.CanteenmanagerExample;
import com.canteen.dao.CanteenmanagerMapper;
import com.canteen.service.CanteenManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenManagerServiceImpl implements CanteenManagerService {

    @Autowired
    private CanteenmanagerMapper canteenmanagerMapper;

    @Override
    public long countByExample(CanteenmanagerExample example) {
        return canteenmanagerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CanteenmanagerExample example) {
        return canteenmanagerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer managerid) {
        return canteenmanagerMapper.deleteByPrimaryKey(managerid);
    }

    @Override
    public int insert(Canteenmanager record) {
        return canteenmanagerMapper.insert(record);
    }

    @Override
    public int insertSelective(Canteenmanager record) {
        return canteenmanagerMapper.insertSelective(record);
    }

    @Override
    public List<Canteenmanager> selectByExample(CanteenmanagerExample example) {
        return canteenmanagerMapper.selectByExample(example);
    }

    @Override
    public Canteenmanager selectByPrimaryKey(Integer managerid) {
        return canteenmanagerMapper.selectByPrimaryKey(managerid);
    }

    @Override
    public int updateByExampleSelective(Canteenmanager record, CanteenmanagerExample example) {
        return canteenmanagerMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Canteenmanager record, CanteenmanagerExample example) {
        return canteenmanagerMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Canteenmanager record) {
        return canteenmanagerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Canteenmanager record) {
        return canteenmanagerMapper.updateByPrimaryKey(record);
    }
}

