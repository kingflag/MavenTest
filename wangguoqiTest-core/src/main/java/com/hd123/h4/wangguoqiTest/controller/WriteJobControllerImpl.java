package com.hd123.h4.wangguoqiTest.controller;

import com.hd123.h4.wangguoqiTest.service.WriteJobService;




public class WriteJobControllerImpl implements WriteJobController {
  
  

  WriteJobService writeJobServiceImpl;

  public WriteJobService getWriteJobServiceImpl() {
    return writeJobServiceImpl;
  }

  public void setWriteJobServiceImpl(WriteJobService writeJobServiceImpl) {
    this.writeJobServiceImpl = writeJobServiceImpl;
  }

  @Override
  public void insert() {
    System.out.println("插入过程");
    writeJobServiceImpl.insert();
  }

}
