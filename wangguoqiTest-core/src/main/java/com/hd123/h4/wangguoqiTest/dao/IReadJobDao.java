package com.hd123.h4.wangguoqiTest.dao;

import java.util.List;

import com.hd123.h4.wangguoqiTest.domain.HdUserinfo;

public interface IReadJobDao {
  public List<HdUserinfo> selectall() throws Exception;

}
