package Spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver3 {
//                POST /somepath HTTP/1.1
//                Host: www.example.com
//                Content-Type: application/x-www-form-urlencoded
//                Content-Length: 27
//
//                username=johndoe&password=1234
    public static void main(String[] args) {
        //간단한 8080 서버 생성
        try {
            //창구를 만들었따. 서버가 구동된다.
            ServerSocket serverSocket = new ServerSocket(8081);
            //8081을 치고 들어오면
            System.out.println("8081 서비스 시작");
            while (true) {
                //자바 내장 통신 라이브러리
                try(Socket socket = serverSocket.accept()){
                    //socket.getInputStream -> 사용자가 보낸 정보를 가져온다.
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    //한줄씩 리드 readLine()
                    //전체 리드 read
                    while(!(line = br.readLine()).isBlank()) {
                        sb.append(line+"\n");
                    }
                    if(sb.toString().contains("POST")) {
                        char[] buffer = new char[1024];
                        br.read(buffer);
                        System.out.println("POST body data : "+new String(buffer));
                        System.out.println("POST header data : "+new String(sb));
                    }
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n"+"ok";
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
