package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AuthorPostService {
    public static void main(String[] args) {
        //실행서비스
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();

        //1.회원가입
        //2.게시글작성
        //3.회원목록조회 : 회원 email들을 출력
        //4.회원 상세 조회 : id로 조회, 회원명, 회원 email 회원작성글수
        //5. 게시글상세조회 : 제목, 작성자email
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("이용하실 서비스를 입력하세요. 0: 회원가입, 1:글작성, 2: 회원목록조회, 3:회원 상세 조회, 4:게시글 상세 조회");
            int type = scanner.nextInt();
            if(type == 0) {
                System.out.println("회원가입 입니다.");
                System.out.println("이름을 입력하세요");
                String name = scanner.next();
                System.out.println("email을 입력하세요.");
                String email = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String password = scanner.next();
                Author author = new Author(name, email, password);
                authors.add(author);
                System.out.println("회원가입이 완료 되었습니다.");
            } else if (type == 1) {
                System.out.println("글 작성입니다.");
                System.out.println("제목을 입력해주세요");
                String title = scanner.next();
                System.out.println("내용을 입력해주세요");
                String contents = scanner.next();
                System.out.println("이메일을 입력하세요");
                String email = scanner.next();
                List<Author> alist = authors.stream().filter(author -> Objects.equals(author.getEmail(), email)).collect(Collectors.toList());

                if(!alist.isEmpty()) {
                    Post post = new Post(title, contents, alist.get(0));
                    posts.add(post);
//                    Author a = alist.get(0);
//                    a.addPost(post);
                } else {
                    System.out.println("잘못된 이메일을 입력하셨습니다.");
                }

            } else if (type == 2) {
                System.out.println("회원 목록 조회입니다.");
                System.out.println(authors.stream().map(Author::getEmail).collect(Collectors.toList()));
            } else if (type == 3) {
                System.out.println("회원 상세 조회입니다.");
                System.out.println("회원 이메일을 입력하세요");
                String email = scanner.next();
                System.out.println("email "+email);
                Author a =authors.stream().filter(author -> Objects.equals(author.getEmail(), email)).collect(Collectors.toList()).get(0);
                System.out.println("이름 "+a.getName()+" email "+a.getEmail()+" 작성글 수 "+a.getPosts().size());
                List<Post> pl = a.getPosts();
                for(Post p : pl) {
                    System.out.println(p.getTitle());
                }
            } else {
                System.out.println("게시글 상세 조회입니다");
                System.out.println("조회하실 게시글 id를 입력하세요");
                Long id = scanner.nextLong();
                if(posts.isEmpty()) {
                    System.out.println("조회하실 글이 없습니다.");
                } else {
                    Post p = posts.stream().filter(post -> Objects.equals(post.getId(), id)).collect(Collectors.toList()).get(0);
                    System.out.println("제목 "+p.getTitle()+" 작성자 email "+p.getAuthor().getEmail());
                }
            }
        }
    }
}

//entity
class Author {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Post> posts;
    static private Long staticId = 0L;
    Author(String name, String email, String password) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email= email;
        this.password = password;
        this.posts = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
//    public void setPosts(List<Post> p) {
//        this.posts = p;
//    }
    void addPost(Post post) {
        this.posts.add(post);
    }
}

class Post {
    private Long id;
    private String title;
    private String contents;
    private Author author;
    private static Long staticId = 0L;

    public Post(String title, String contents, Author author) {
        staticId++;
        this.id = staticId;
        this.author = author; // 주소만 저장 값 셋팅
        this.author.addPost(this); // 주소만 저장 값 셋팅
        this.title = title;
        this.contents = contents;
        
    }



    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
    public Author getAuthor() {
        return author;
    }

}
