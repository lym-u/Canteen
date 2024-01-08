package com.canteen.service;

import com.canteen.bean.Canteenreviewreply;
import com.canteen.bean.CanteenreviewreplyExample;

import java.util.List;

public interface CanteenReviewReplyService {
    long countByExample(CanteenreviewreplyExample example);

    int deleteByExample(CanteenreviewreplyExample example);

    int deleteByPrimaryKey(Integer replyid);

    int insert(Canteenreviewreply record);

    int insertSelective(Canteenreviewreply record);

    List<Canteenreviewreply> selectByExampleWithBLOBs(CanteenreviewreplyExample example);

    List<Canteenreviewreply> selectByExample(CanteenreviewreplyExample example);

    Canteenreviewreply selectByPrimaryKey(Integer replyid);

    int updateByExampleSelective(Canteenreviewreply record, CanteenreviewreplyExample example);

    int updateByExampleWithBLOBs(Canteenreviewreply record, CanteenreviewreplyExample example);

    int updateByExample(Canteenreviewreply record, CanteenreviewreplyExample example);

    int updateByPrimaryKeySelective(Canteenreviewreply record);

    int updateByPrimaryKeyWithBLOBs(Canteenreviewreply record);

    int updateByPrimaryKey(Canteenreviewreply record);



}


