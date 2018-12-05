package com.accenture.lzq.service.impl;

import com.accenture.lzq.mapper.GroupMapper;
import com.accenture.lzq.model.Group;
import com.accenture.lzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private GroupMapper groupMapper;
    @Override
    public Group selectByPrimaryKey(String id) {
        return groupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Group record) {
        return groupMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return groupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Group record) {
        return groupMapper.updateByPrimaryKeySelective(record);
    }
}
