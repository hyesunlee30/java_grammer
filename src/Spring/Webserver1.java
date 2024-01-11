package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver1 {
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
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n"+"hello";
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
