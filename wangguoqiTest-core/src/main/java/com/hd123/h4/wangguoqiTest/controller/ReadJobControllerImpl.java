package com.hd123.h4.wangguoqiTest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd123.h4.wangguoqiTest.domain.HdUserinfo;
import com.hd123.h4.wangguoqiTest.service.IReadJobService;

public class ReadJobControllerImpl implements IReadJobController {

  @Autowired
  private IReadJobService readJobServiceImpl;
  
  @Override
  public List<HdUserinfo> selectall() throws Exception {
    List<HdUserinfo> result = new ArrayList<HdUserinfo>();
    result = readJobServiceImpl.selectall();
    System.out.println("selectAll");
    return result;
    
  }

}
