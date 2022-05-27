package com.客户端.View;

import com.客户端.server.SoketServicce;

import java.util.Scanner;

/**客户端界面*/
public class Text {
    private boolean loop = true; //控制是否显示菜单  默认显示
    private String key = ""; //用于键盘输入
    //主菜单

    public static void main(String[] args) {
        Text text = new Text();
        text.mainMEue();
    }

    private void mainMEue() {
        Scanner sc = new Scanner(System.in);
        SoketServicce soSer=new SoketServicce();
        while (loop) {
            System.out.println("================欢迎登录网络通信系统=============");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");

            key = sc.next(); //获取输入人
            switch (key) {
                case "1":
                    System.out.println("请输入账号:");
                    String user = sc.next();
                    System.out.println("请输入密码:");
                    String pasWord = sc.next();

                    if (soSer.userPasWordBool(user,pasWord)) { //如果合法
                        System.out.println("================欢迎(用户" + user + ")=============");
                        while (loop) {  //二级菜单
                            System.out.println("================操作平台(用户" + user + ")=============");
                            System.out.println("1 查看所有在线用户");
                            System.out.println("2 群发消息");
                            System.out.println("3 私聊消息");
                            System.out.println("4 发送文件");
                            System.out.println("9 退出操作");
                            key = sc.next();

                            switch (key) {
                                case "1":
                                    System.out.println("查看所有在线用户");
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    loop=false; //退出
                                    System.out.println("退出");
                                    break;

                            }
                        }

                    }else{  //到时会改成json格式
                        System.out.println("账号或密码错误");
                    }
                    break;
                case "9":
                    System.out.println("退出");
                    return; //退出

            }

        }

    }
}
