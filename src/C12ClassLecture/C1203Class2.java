package C12ClassLecture;

public class C1203Class2 {
    public static void main(String[] args) {
        //변수값에 직접 접근하여 값을 할당
        //이렇게 하면 덮어쓰게 됨. 고유의 값이 아님.
        //private를 추가하면 변수값에 직접 접근 되지 않음.
//        Person p = new Person();
//        p.name ="홍길동";
//        p.email = "abc@naver.com";
//        p.password = "123";
//        p.age = 20;
//        p.person_total += 1;
//        System.out.println(p.whoIs());

        //private 때문에 getter, setter 패턴을 사용해야한다.
        Person p1 = new Person();
        p1.setName("이차돌ererererererererersdsdsds");
        p1.setEmail("123naver.com");
        p1.setPassword("abc");
        p1.setAge(10);
        System.out.println(p1.whoIs());


        Person p2 = new Person();
        p2.setName("홍길동");
        p2.setEmail("123naver.com");
        p2.setPassword("abc");
        p2.setAge(19);
        System.out.println(p2.whoIs());




    }
}


class Person {
    private String name;
    private String email;
    private String password; // null
    private int age;

    void setName(String name) {
        if(name.length() > 10) {
            System.out.println("이름의 최대길이는 10자입니다.");
        } else {
            this.name = name;
        }

    }
    void setEmail(String email) {
        if(email.indexOf("@") == -1){
            System.out.println("정확한 email 패턴을 입력하세요");
        } else {
            this.email = email;
        }

    }
    void setPassword(String password) {
        this.password = password;
    }
    void setAge(int age) {
        if(age < 20) {
            System.out.println("20세 이상만 사용가능합니다.");
        } else {
            this.age = age;
        }

    }

    String getName(){
        return name;
    }
    String getEmail() {
        return email;
    }

    String getPassword() {
        return password;
    }

    int getAge() {
        return age;
    }

    String whoIs() {
        String a = "whoIs : name "+getName()+" email "+getEmail()+" password "+getPassword()+" age "+getAge();
        return a;
    }



}