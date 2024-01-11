package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver2 {
    public static void main(String[] args) {
        //간단한 8080 서버 생성
        try {
            //창구를 만들었따. 서버가 구동된다.
            ServerSocket serverSocket = new ServerSocket(8081);
            //8081을 치고 들어오면
            System.out.println("8081 서비스 시작");
            while (true) {
                //자바 내장 통신 라이브러리
                try(Socket socket = serverSocket.accept();){
                    String httpRes =
                            //header
                            "HTTP/1.1 200 OK\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n"
                            //body
                            +"<html><body><h1>Hello World</h1><p>공부하는 중</p></body></html>";
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
