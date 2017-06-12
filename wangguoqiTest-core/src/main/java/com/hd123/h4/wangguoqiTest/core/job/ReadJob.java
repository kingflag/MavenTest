package com.hd123.h4.wangguoqiTest.core.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.hd123.h4.wangguoqiTest.controller.IReadJobController;
import com.hd123.h4.wangguoqiTest.controller.WriteJobController;

public class ReadJob implements ApplicationContextAware {

  protected static final Logger logger = LoggerFactory.getLogger(ReadJob.class);

  private ApplicationContext appCtx;

  @Autowired
  private IReadJobController readJobControllerImpl;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    this.appCtx = applicationContext;

  }

  public void run() throws Exception {
    System.out.println("ReadJob");
    logger.info(null, appCtx);
    String beanName = "readJobcontroller";
    System.out.println("取testbean:" + appCtx.containsBean("testbaen"));
    if (appCtx.containsBean(beanName)) {
      System.out.println("存在ReadJobcontroller");
      readJobControllerImpl.selectall();
    } else {
      System.out.println("不存在此bean");
    }
  }

}
