package com.hd123.h4.wangguoqiTest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd123.h4.wangguoqiTest.dao.WriteJobDao;


public class WriteJobServiceImpl implements WriteJobService {

  @Autowired
  private WriteJobDao writeJobDaoImpl;  
  
  @Override
  public String insert() throws Exception {
    writeJobDaoImpl.insert();
    return "ServiceTestinsert";
  }

}
