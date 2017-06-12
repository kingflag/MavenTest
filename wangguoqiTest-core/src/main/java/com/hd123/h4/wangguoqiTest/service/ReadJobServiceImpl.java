package com.hd123.h4.wangguoqiTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd123.h4.wangguoqiTest.dao.IReadJobDao;
import com.hd123.h4.wangguoqiTest.domain.HdUserinfo;


public class ReadJobServiceImpl implements IReadJobService {

  @Autowired
  private IReadJobDao readJobDaoImpl;  
  
  @Override
  public List<HdUserinfo> selectall() throws Exception {
    System.out.println("readJobDaoImpl的selectall");
    System.out.println("查询到："+readJobDaoImpl.selectall());
    
    return null;
  }

}
