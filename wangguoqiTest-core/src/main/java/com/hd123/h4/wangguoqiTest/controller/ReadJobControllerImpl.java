package com.hd123.h4.wangguoqiTest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd123.h4.wangguoqiTest.service.IReadJobService;

public class ReadJobControllerImpl implements IReadJobController {

  @Autowired
  private IReadJobService readJobServiceImpl;
  
  @Override
  public void selectall() throws Exception {

    readJobServiceImpl.selectall();
    System.out.println("selectAll");

  }

}
