package com.hd123.h4.wangguoqiTest.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hd123.h4.wangguoqiTest.controller.IReadJobController;
import com.hd123.h4.wangguoqiTest.domain.HdUserinfo;

public class ReadJobApiImpl implements ReadJobApi {

  protected static final Logger logger = LoggerFactory.getLogger(ReadJobApiImpl.class);

  private IReadJobController readJobController;

  public ReadJobApiImpl() {
    System.out.println("ReadJobApi构造方法+++++++++++");
  }

  public IReadJobController getreadJobController() {
    return readJobController;
  }

  public void setreadJobController(IReadJobController readJobController) {
    this.readJobController = readJobController;
  }

  @SuppressWarnings("finally")
  public List<HdUserinfo> test() throws Exception {
    String resultString = "我要输出的数据";

    try {

      logger.info(resultString);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      return readJobController.selectall();
    }
  }

}
