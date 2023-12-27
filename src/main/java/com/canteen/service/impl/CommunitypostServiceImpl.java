package com.canteen.service.impl;

import com.canteen.bean.Communitypost;
import com.canteen.bean.CommunitypostExample;
import com.canteen.dao.CommunitypostMapper;
import com.canteen.service.CommunitypostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 社区服务实现类
 */
@Service
public class CommunitypostServiceImpl implements CommunitypostService {

    private final CommunitypostMapper communitypostMapper;

    @Autowired
    public CommunitypostServiceImpl(CommunitypostMapper communitypostMapper) {
        this.communitypostMapper = communitypostMapper;
    }

    @Override
    public long countByExample(CommunitypostExample example) {
        return communitypostMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CommunitypostExample example) {
        return communitypostMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer postid) {
        return communitypostMapper.deleteByPrimaryKey(postid);
    }

    @Override
    public int insert(Communitypost record) {
        return communitypostMapper.insert(record);
    }

    @Override
    public int insertSelective(Communitypost record) {
        return communitypostMapper.insertSelective(record);
    }

    @Override
    public List<Communitypost> selectByExampleWithBLOBs(CommunitypostExample example) {
        return communitypostMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Communitypost> selectByExample(CommunitypostExample example) {
        return communitypostMapper.selectByExample(example);
    }

    @Override
    public Communitypost selectByPrimaryKey(Integer postid) {
        return communitypostMapper.selectByPrimaryKey(postid);
    }

    @Override
    public int updateByExampleSelective(Communitypost record, CommunitypostExample example) {
        return communitypostMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(Communitypost record, CommunitypostExample example) {
        return communitypostMapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(Communitypost record, CommunitypostExample example) {
        return communitypostMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Communitypost record) {
        return communitypostMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Communitypost record) {
        return communitypostMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Communitypost record) {
        return communitypostMapper.updateByPrimaryKey(record);
    }
}

