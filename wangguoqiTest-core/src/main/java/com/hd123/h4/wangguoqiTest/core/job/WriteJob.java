package com.hd123.h4.wangguoqiTest.core.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.hd123.h4.wangguoqiTest.controller.WriteJobController;

public class WriteJob implements ApplicationContextAware {

  protected static final Logger logger = LoggerFactory.getLogger(WriteJob.class);
  private ApplicationContext appCtx;

  @Autowired
  private WriteJobController writeJobControllerImpl;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.appCtx = applicationContext;
  }

  public void run() throws Exception {
    System.out.println("WriteJob");
    String beanName = "writeJobcontroller";
    if (appCtx.containsBean(beanName)) {
      System.out.println("存在WriteJobcontroller");
      writeJobControllerImpl.insert();
    } else {
      System.out.println("不存在此bean");
    }
  }

}
