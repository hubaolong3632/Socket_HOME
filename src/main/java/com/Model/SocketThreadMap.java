package com.Model;

import com.客户端.server.SoketThreadService;

import java.util.HashMap;
import java.util.Map;

public class SocketThreadMap {
   private Map<String, SoketThreadService> map=new HashMap<>();

   public void setMap(String str,SoketThreadService service){
       map.put(str,service);//用来保存线程

   }

   public SoketThreadService getMap(String str){
       return map.get(str); //返回线程
   }
}
