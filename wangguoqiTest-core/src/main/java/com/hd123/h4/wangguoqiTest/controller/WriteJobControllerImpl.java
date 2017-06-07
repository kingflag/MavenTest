package com.hd123.h4.wangguoqiTest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd123.h4.wangguoqiTest.service.WriteJobService;

/**
 * 
 * @author wangguoqi
 *
 */
public class WriteJobControllerImpl implements WriteJobController {

  @Autowired
  private WriteJobService writeJobServiceImpl;

  @Override
  public void insert() {
    System.out.println("插入过程");
    writeJobServiceImpl.insert();
  }

}
