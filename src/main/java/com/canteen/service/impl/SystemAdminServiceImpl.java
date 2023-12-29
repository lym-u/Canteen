package com.canteen.service.impl;

import com.canteen.bean.Systemadmin;
import com.canteen.bean.SystemadminExample;
import com.canteen.dao.SystemadminMapper;
import com.canteen.service.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemAdminServiceImpl implements SystemAdminService {

    @Autowired
    private SystemadminMapper systemadminMapper;

    @Override
    public long countByExample(SystemadminExample example) {
        return systemadminMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SystemadminExample example) {
        return systemadminMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer adminid) {
        return systemadminMapper.deleteByPrimaryKey(adminid);
    }

    @Override
    public int insert(Systemadmin record) {
        return systemadminMapper.insert(record);
    }

    @Override
    public int insertSelective(Systemadmin record) {
        return systemadminMapper.insertSelective(record);
    }

    @Override
    public List<Systemadmin> selectByExample(SystemadminExample example) {
        return systemadminMapper.selectByExample(example);
    }

    @Override
    public Systemadmin selectByPrimaryKey(Integer adminid) {
        return systemadminMapper.selectByPrimaryKey(adminid);
    }

    @Override
    public int updateByExampleSelective(Systemadmin record, SystemadminExample example) {
        return systemadminMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Systemadmin record, SystemadminExample example) {
        return systemadminMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Systemadmin record) {
        return systemadminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Systemadmin record) {
        return systemadminMapper.updateByPrimaryKey(record);
    }
}

