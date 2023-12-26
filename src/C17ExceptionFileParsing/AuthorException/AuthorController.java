package C17ExceptionFileParsing.AuthorException;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        //요구사항
        //메모리 DB에 데이터 추가/삭제 부분은 repository로 분리
        //1.회원가입
        //2.회원 로그인
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("이용하실 서비스를 입력하세요. 1: 회원가입,2: 로그인");
            int type = scanner.nextInt();
            if(type == 1) {
                System.out.println("회원가입 입니다.");
                System.out.println("이름을 입력하세요");
                String name = scanner.next();
                System.out.println("email을 입력하세요.");
                String email = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String password = scanner.next();
                System.out.println("전화번호를 입력하세요(- 없이 입력)");
                String number = scanner.next();
                Author author1 = new Author(name, email, password, number);
                try {
                    authorService.register(author1);
                    System.out.println("회원가입이 완료 되었습니다.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (type == 2) {
                System.out.println("이메일을 입력하세요");
                String email = scanner.next();
                System.out.println("비밀번호를 입력하세요");
                String password = scanner.next();
                try {
                    Optional<Author> loginedAuthor = authorService.login(email,password);
                    loginedAuthor.ifPresent(author -> System.out.println(author.getName() + " 님 로그인을 환영합니다."));
                } catch (IllegalArgumentException | NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}


