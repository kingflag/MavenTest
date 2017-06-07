/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	mcdts-about
 * 文件名：	McDtsAbout.java
 * 模块说明：	
 * 修改历史：
 * 2016-08-03 - qinliming - 创建。
 */
package com.hd123.h4.wangguoqiTest.about;

import com.hd123.rumba.commons.jar.ApplicationAbout;

/**
 * 
 * 关于HEADING® McDts™应用系统。
 * 
 * @author qinliming
 * 
 */
public class McDtsAbout extends ApplicationAbout {

  private static McDtsAbout instance = null;

  public static synchronized McDtsAbout getInstance() {
    if (instance == null) {
      instance = new McDtsAbout();
    }
    return instance;
  }

  private McDtsAbout() {
    // Do Nothing
  }

}
