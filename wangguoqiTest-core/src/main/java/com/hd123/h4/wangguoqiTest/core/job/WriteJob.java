package com.hd123.h4.wangguoqiTest.core.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WriteJob implements ApplicationContextAware {

  protected static final Logger logger = LoggerFactory.getLogger(WriteJob.class);
  private ApplicationContext appCtx;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.appCtx = applicationContext;
  }

  public void run() {
    System.out.println("WriteJob");
    String beanName = "writeJobcontroller";
    if (appCtx.containsBean(beanName)) {
      System.out.println("存在WriteJobcontroller");
      
    }else {
      System.out.println("不存在此bean");
    }
  }
}
