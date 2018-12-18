package com.nfdw.service.impl;

import com.nfdw.base.BaseMapper;
import com.nfdw.base.impl.BaseServiceImpl;
import com.nfdw.entity.UserLeave;
import com.nfdw.mapper.UserLeaveMapper;
import com.nfdw.service.UserLeaveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaomeng
 * @date 2018/1/21.
 * @email 154040976@qq.com
 */
@Service
public class UserLeaveServiceImpl extends BaseServiceImpl<UserLeave,String> implements
    UserLeaveService {

  @Autowired
  UserLeaveMapper userLeaveMapper;

  @Override
  public BaseMapper<UserLeave,String> getMappser() {
    return userLeaveMapper;
  }
}
