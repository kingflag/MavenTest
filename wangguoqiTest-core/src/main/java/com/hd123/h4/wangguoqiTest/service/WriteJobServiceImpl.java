package com.hd123.h4.wangguoqiTest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd123.h4.wangguoqiTest.dao.WriteJobDao;


public class WriteJobServiceImpl implements WriteJobService {

  @Autowired
  WriteJobDao writeJobDaoImpl;  
  
  @Override
  public String insert() {
    writeJobDaoImpl.insert();
    return "ServiceTestinsert";
  }

}
