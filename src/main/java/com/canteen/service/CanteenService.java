package com.canteen.service;

import com.canteen.bean.Canteen;
import com.canteen.bean.CanteenExample;

import java.util.List;

public interface CanteenService {
//    Canteen getCanteenById(int id);
//    List<Canteen> getAllCanteens();
//    Integer addCanteen(Canteen canteen);
//    Integer updateCanteen(Canteen canteen);
//    Integer deleteCanteen(int id);
    //根据指定的条件统计符合条件的食堂数量。
    long countByExample(CanteenExample example);

    //根据指定的条件删除符合条件的食堂信息。
    int deleteByExample(CanteenExample example);

    //根据主键删除对应的食堂信息。
    int deleteByPrimaryKey(Integer canteenid);

    //插入一条新的食堂记录。
    int insert(Canteen record);

    //选择性地插入一条新的食堂记录，只插入非空字段。
    int insertSelective(Canteen record);

    //根据指定的条件查询符合条件的食堂信息。
    List<Canteen> selectByExample(CanteenExample example);

    //根据主键查询对应的食堂信息。
    Canteen selectByPrimaryKey(Integer canteenid);

    //根据指定的条件选择性地更新食堂信息，只更新非空字段。
    int updateByExampleSelective(Canteen record, CanteenExample example);

    //根据指定的条件更新食堂信息。
    int updateByExample(Canteen record, CanteenExample example);

    //根据主键选择性地更新食堂信息，只更新非空字段。
    int updateByPrimaryKeySelective(Canteen record);

    //根据主键更新食堂信息。
    int updateByPrimaryKey(Canteen record);

    //CanteenService 接口中定义那些不在 CanteenMapper 接口中的方法
}