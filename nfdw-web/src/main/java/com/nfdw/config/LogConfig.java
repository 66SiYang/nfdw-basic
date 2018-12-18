package com.nfdw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nfdw.core.annotation.LogAspect;

/**
 * @author zhuxiaomeng
 * @date 2018/1/3.
 * @email 154040976@qq.com
 */
@Configuration
public class LogConfig {

  @Bean(name = "logAspect")
  public LogAspect getLogAspect(){
    return new LogAspect();
  }

}
