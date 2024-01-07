package com.canteen.service;

import com.canteen.bean.Postreply;
import com.canteen.bean.PostreplyExample;

import java.util.List;

public interface PostreplyService {
    // 根据条件统计回复数量
    long countByExample(PostreplyExample example);

    // 根据条件删除回复
    int deleteByExample(PostreplyExample example);

    // 根据主键删除回复
    int deleteByPrimaryKey(Integer replyid);

    // 插入回复
    int insert(Postreply record);

    // 选择性地插入回复
    int insertSelective(Postreply record);

    // 根据条件查询包含大字段的回复列表
    List<Postreply> selectByExampleWithBLOBs(PostreplyExample example);

    // 根据条件查询回复列表
    List<Postreply> selectByExample(PostreplyExample example);

    // 根据主键查询回复
    Postreply selectByPrimaryKey(Integer replyid);

    // 根据条件选择性地更新回复
    int updateByExampleSelective(Postreply record, PostreplyExample example);

    // 根据条件更新包含大字段的回复
    int updateByExampleWithBLOBs(Postreply record, PostreplyExample example);

    // 根据条件更新回复
    int updateByExample(Postreply record, PostreplyExample example);

    // 根据主键选择性地更新回复
    int updateByPrimaryKeySelective(Postreply record);

    // 根据主键更新包含大字段的回复
    int updateByPrimaryKeyWithBLOBs(Postreply record);

    // 根据主键更新回复
    int updateByPrimaryKey(Postreply record);
}

