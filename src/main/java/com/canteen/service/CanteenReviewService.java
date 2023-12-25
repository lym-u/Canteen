package com.canteen.service;

import com.canteen.bean.Canteenreview;
import com.canteen.bean.CanteenreviewExample;

import java.util.List;

public interface CanteenReviewService {

    long countByExample(CanteenreviewExample example);

    int deleteByExample(CanteenreviewExample example);

    int deleteByPrimaryKey(Integer canteenreviewid);

    int insert(Canteenreview record);

    int insertSelective(Canteenreview record);

    List<Canteenreview> selectByExampleWithBLOBs(CanteenreviewExample example);

    List<Canteenreview> selectByExample(CanteenreviewExample example);

    Canteenreview selectByPrimaryKey(Integer canteenreviewid);

    int updateByExampleSelective(Canteenreview record, CanteenreviewExample example);

    int updateByExampleWithBLOBs(Canteenreview record, CanteenreviewExample example);

    int updateByExample(Canteenreview record, CanteenreviewExample example);

    int updateByPrimaryKeySelective(Canteenreview record);

    int updateByPrimaryKeyWithBLOBs(Canteenreview record);

    int updateByPrimaryKey(Canteenreview record);
}

