package com.hd123.h4.wangguoqiTest.dao;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.UUID;

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

    /*测试数据库连接信息*/
//    DatabaseMetaData md = this.jdbcTemplate.getDataSource().getConnection().getMetaData();  
//    System.out.println(md.getDatabaseProductName());  
//    System.out.println(md.getDatabaseProductVersion()); 
    UUID uuid = UUID.randomUUID();
    String sql = "insert into hduserinfo (user,surplus,createtime) values (uuid,'65.6','2017-06-21 11:02:59')";
    System.out.println(sql);
    jdbcTemplate.update("insert into hduserinfo (user,surplus,createtime) values ('"+uuid+"','65.6','2017-06-21 11:02:59')");
    return null;
  }

}
