package com.nfdw.service.impl;

import com.nfdw.base.BaseMapper;
import com.nfdw.base.impl.BaseServiceImpl;
import com.nfdw.entity.SysJob;
import com.nfdw.mapper.SysJobMapper;
import com.nfdw.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaomeng
 * @date 2018/1/6.
 * @email 154040976@qq.com
 */
@Service
public class JobServiceImpl  extends BaseServiceImpl<SysJob,String> implements JobService {

  @Autowired
  SysJobMapper jobMapper;
  @Override
  public BaseMapper<SysJob, String> getMappser() {
    return jobMapper;
  }
}
