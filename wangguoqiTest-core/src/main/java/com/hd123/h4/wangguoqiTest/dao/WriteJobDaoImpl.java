package com.hd123.h4.wangguoqiTest.dao;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class WriteJobDaoImpl implements WriteJobDao {

  private JdbcTemplate jdbcTemplate;
  
  public void setDataSource(DataSource dataSource) {
      this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
  
  @Override
  public String insert() throws Exception  {
    System.out.println("daoc============+++++++");
    String sql = "insert into hduserinfo values (1, 7777,65.6,2012-06-06)";
    System.out.println(sql);
    /*测试数据库连接信息*/
//    DatabaseMetaData md = this.jdbcTemplate.getDataSource().getConnection().getMetaData();  
//    System.out.println(md.getDatabaseProductName());  
//    System.out.println(md.getDatabaseProductVersion());  
    jdbcTemplate.update(sql);
    return null;
  }

}
