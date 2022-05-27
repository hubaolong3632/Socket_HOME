package com.客户端.server;

import com.客户端.IFwqService.MessageType;
import com.Model.Message;
import com.Model.SocketThreadMap;
import com.Model.USerPasword;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SoketServicce {
    private USerPasword user=new USerPasword();
    private Socket socket;
    private SocketThreadMap stm=new SocketThreadMap();

    public boolean userPasWordBool(String user1,String password){ //判断登录成功
                 user.setName(user1);
                 user.setPasword(password); //放入账号密码

        try {
            socket=new Socket(InetAddress.getByName("127.0.0.1"),9999);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user); //发送对象
            System.out.println(user);

            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
            Message ms = (Message)ois.readObject(); //获取传输回来的是否成功

            if(ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)){ //判断是否登录成功

                SoketThreadService soketThread = new SoketThreadService(socket);//启动获取
                soketThread.start(); //启动线程


                stm.setMap(user1,soketThread); //保存到map集合里面方便以后用
                return true;
            }else{
                //如果登录失败
                socket.close(); //关闭操作
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  false;
    }

}
