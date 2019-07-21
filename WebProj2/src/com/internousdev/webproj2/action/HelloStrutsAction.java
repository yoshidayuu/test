package com.internousdev.webproj2.action;
import com.internousdev.webproj2.dao.HelloStrutsDao;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport {
 public String execute() {
  String ret=ERROR;
  HelloStrutsDao dao=new HelloStrutsDao();
  boolean b=dao.select();
  if(b==true){
   ret=SUCCESS;
  }else{
   ret=ERROR;
  }
  return ret;
 }
}