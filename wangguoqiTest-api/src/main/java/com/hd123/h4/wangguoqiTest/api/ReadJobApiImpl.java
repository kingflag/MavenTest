package com.hd123.h4.wangguoqiTest.api;



public class ReadJobApiImpl  implements ReadJobApi{

  public ReadJobApiImpl() {
    System.out.println("ReadJobApi构造方法+++++++++++");
  }


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
