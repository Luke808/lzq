package com.accenture.lzq.service;

import com.accenture.lzq.model.Group;

public interface UserService {
    Group selectByPrimaryKey(String id);
    int insertSelective(Group record);
    int deleteByPrimaryKey(String id);
    int updateByPrimaryKeySelective(Group record);
}
