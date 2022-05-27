package com.客户端.server;

import com.Model.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**线程操作*/
public class SoketThreadService extends Thread {

    Socket socket;

    SoketThreadService(Socket socket){
        this.socket=socket;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {
    while(true){

        try {
            System.out.println("客户端:获取服务器发来的信息->");
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message msg = (Message)ois.readObject(); //获取来自服务器的类


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



    }
}
