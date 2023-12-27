package com.canteen.service;

import com.canteen.bean.Communitypost;
import com.canteen.bean.CommunitypostExample;

import java.util.List;

/**
 * 社区服务接口类
 */
public interface CommunitypostService {
    long countByExample(CommunitypostExample example);

    int deleteByExample(CommunitypostExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(Communitypost record);

    int insertSelective(Communitypost record);

    List<Communitypost> selectByExampleWithBLOBs(CommunitypostExample example);

    List<Communitypost> selectByExample(CommunitypostExample example);

    Communitypost selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(Communitypost record, CommunitypostExample example);

    int updateByExampleWithBLOBs(Communitypost record, CommunitypostExample example);

    int updateByExample(Communitypost record, CommunitypostExample example);

    int updateByPrimaryKeySelective(Communitypost record);

    int updateByPrimaryKeyWithBLOBs(Communitypost record);

    int updateByPrimaryKey(Communitypost record);
}

