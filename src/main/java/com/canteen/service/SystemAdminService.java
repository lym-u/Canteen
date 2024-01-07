package com.canteen.service;

import com.canteen.bean.Systemadmin;
import com.canteen.bean.SystemadminExample;

import java.util.List;

public interface SystemAdminService {
    long countByExample(SystemadminExample example);

    int deleteByExample(SystemadminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Systemadmin record);

    int insertSelective(Systemadmin record);

    List<Systemadmin> selectByExample(SystemadminExample example);

    Systemadmin selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(Systemadmin record, SystemadminExample example);

    int updateByExample(Systemadmin record, SystemadminExample example);

    int updateByPrimaryKeySelective(Systemadmin record);

    int updateByPrimaryKey(Systemadmin record);
}
