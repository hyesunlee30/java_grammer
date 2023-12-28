package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C1702FileParsing {
    public static void main(String[] args) {
        //절대 경로
        //C:\Users\Playdata\IdeaProjects\java_grammer\src\C17ExceptionFileParsing
        //java 경로
        //src\C17ExceptionFileParsing
        String path = "src\\C17ExceptionFileParsing\\test_file.txt";
        Path filePath = Paths.get(path);
        //none-blocking
        //버퍼기능이 구현되어있고 nio패키지에서는 none-blocking 방식 사용
        //생략시 기본이 UTF-8
        //append 추가하기
        //write 덮어쓰기
        //checked exception
        try {

            if(Files.exists(filePath)) {
                Files.write(filePath,"손흥민\n".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath,"손흥민\n".getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE_NEW);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //파일 읽기 : readString,
        //개행을 기준으로 readAllLines(List형태)
        try {
            String temp = Files.readString(filePath);
            System.out.println(temp);
            List<String> arr = Files.readAllLines(filePath);
            for (String s : arr) {
                System.out.println(s+" 선수");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
