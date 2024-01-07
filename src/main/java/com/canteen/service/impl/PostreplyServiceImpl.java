package com.canteen.service.impl;

import com.canteen.bean.Postreply;
import com.canteen.bean.PostreplyExample;
import com.canteen.dao.PostreplyMapper;
import com.canteen.service.PostreplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostreplyServiceImpl implements PostreplyService {

    private final PostreplyMapper postreplyMapper;

    @Autowired
    public PostreplyServiceImpl(PostreplyMapper postreplyMapper) {
        this.postreplyMapper = postreplyMapper;
    }

    @Override
    public long countByExample(PostreplyExample example) {
        return postreplyMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PostreplyExample example) {
        return postreplyMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer replyid) {
        return postreplyMapper.deleteByPrimaryKey(replyid);
    }

    @Override
    public int insert(Postreply record) {
        return postreplyMapper.insert(record);
    }

    @Override
    public int insertSelective(Postreply record) {
        return postreplyMapper.insertSelective(record);
    }

    @Override
    public List<Postreply> selectByExampleWithBLOBs(PostreplyExample example) {
        return postreplyMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Postreply> selectByExample(PostreplyExample example) {
        return postreplyMapper.selectByExample(example);
    }

    @Override
    public Postreply selectByPrimaryKey(Integer replyid) {
        return postreplyMapper.selectByPrimaryKey(replyid);
    }

    @Override
    public int updateByExampleSelective(Postreply record, PostreplyExample example) {
        return postreplyMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExampleWithBLOBs(Postreply record, PostreplyExample example) {
        return postreplyMapper.updateByExampleWithBLOBs(record, example);
    }

    @Override
    public int updateByExample(Postreply record, PostreplyExample example) {
        return postreplyMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Postreply record) {
        return postreplyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Postreply record) {
        return postreplyMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Postreply record) {
        return postreplyMapper.updateByPrimaryKey(record);
    }
}

