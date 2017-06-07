package com.hd123.h4.wangguoqiTest.controller;

import javax.ws.rs.Path;



@Path("/readJobcontroller")
public class ReadJobControllerImpl implements IReadJobController {

  @Override
  public void selectall() {
    System.out.println("selectAll");

  }

}
