package com.hd123.h4.wangguoqiTest.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hd123.h4.wangguoqiTest.domain.HdUserinfo;

public class ReadJobDaoImpl implements IReadJobDao {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public List<HdUserinfo> selectall() throws Exception {
    System.out.println("测试连接");
  
      /* 测试数据库连接信息 */
  //    DatabaseMetaData md = this.jdbcTemplate.getDataSource().getConnection().getMetaData();
  //    System.out.println(md.getDatabaseProductName());
  //    System.out.println(md.getDatabaseProductVersion());
      
      final String ID = "id";
      final String USER = "user";
      final String SURPLUS = "surplus";
      //private final Date CREATETIME = "createtime"; 

      String sql = "select * from HdUserinfo "; 
      return jdbcTemplate.query(sql, new BeanPropertyRowMapper(HdUserinfo.class));
  }
}
