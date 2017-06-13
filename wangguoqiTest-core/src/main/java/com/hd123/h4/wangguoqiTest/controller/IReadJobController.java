package com.hd123.h4.wangguoqiTest.controller;

import java.util.List;

import com.hd123.h4.wangguoqiTest.domain.HdUserinfo;


public interface IReadJobController {
  
  public List<HdUserinfo> selectall() throws Exception;

}
