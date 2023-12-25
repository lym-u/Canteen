package com.canteen.service;

import com.canteen.bean.Canteenmanager;
import com.canteen.bean.CanteenmanagerExample;

import java.util.List;

public interface CanteenManagerService {
    long countByExample(CanteenmanagerExample example);

    int deleteByExample(CanteenmanagerExample example);

    int deleteByPrimaryKey(Integer managerid);

    int insert(Canteenmanager record);

    int insertSelective(Canteenmanager record);

    List<Canteenmanager> selectByExample(CanteenmanagerExample example);

    Canteenmanager selectByPrimaryKey(Integer managerid);

    int updateByExampleSelective(Canteenmanager record, CanteenmanagerExample example);

    int updateByExample(Canteenmanager record, CanteenmanagerExample example);

    int updateByPrimaryKeySelective(Canteenmanager record);

    int updateByPrimaryKey(Canteenmanager record);
}
