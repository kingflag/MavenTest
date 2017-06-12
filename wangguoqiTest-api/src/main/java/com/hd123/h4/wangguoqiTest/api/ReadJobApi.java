package com.hd123.h4.wangguoqiTest.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/apicla")
@Produces("application/json")
public class ReadJobApi {

  public ReadJobApi() {
    System.out.println("ReadJobApi构造方法+++++++++++");
  }

  @GET
  @Path("/apifunc")
  @Consumes("application/xml")
  public String test() {
    System.out.println("APITEST");
    String resultString = "我要输出的数据";

    try {
      //response.setContentType("text/html;charset=UTF-8");
      //response.getWriter().write(resultString);
      System.out.println(resultString);
    } catch (Exception e) {
      e.printStackTrace();
    }finally{
      return "this is test data";
    }
  }

}
