package C16EtcClass;

public class C1605EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("hong1");
        //그냥 스트링을 쓰는 경우 잘못된 데이터 입력가능
        s1.setClassGrade("first");
        EnumStudent s2 = new EnumStudent();
        s2.setName("hong2");
        //static을 쓰면 오류가 조금 낮아지겠지만, static을 개발자가 제대로 넣어주지 않으면
        //오류 또 발생
        s2.setClassGrade(ClassGrade.a2);
        EnumStudent s3 = new EnumStudent();
        s3.setName("hong3");
        s3.setClassGrade("third");
        //DB의 enum 타입 지정되어 있어 잘못된 String 들어갈 수 없기 때문에 오류 적어짐.
        //타입과 값을 지정할 수 있음.
        s3.setRole(Role.GENERAL_USER);
        System.out.println(s3.getRole());
        System.out.println(s3.getRole().getClass());
        //enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s3.getRole().ordinal());

    }
}

//상수인 열거형 변수 콤마로 구분하고, 상수 목록 끝에는 세미코론
enum Role {
    GENERAL_USER,
    ADMIN_USER,
    SUPER_USER;
}
class EnumStudent {
    private String name;

    private String classGrade;
    private Role role;

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ClassGrade {
    static final String a1 = "first_grade";
    static final String a2 = "second_grade";
    static final String a3 = "third_grade";
}