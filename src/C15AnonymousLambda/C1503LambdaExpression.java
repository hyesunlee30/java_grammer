package C15AnonymousLambda;

public class C1503LambdaExpression {

    public static void main(String[] args) {
        //실행문 1개일때에는 return 생략
        LambdaInterface li1 = (a, b, c) -> a+b+1;
        String b =li1.makeString("안녕 ","하세요",1);
        //실행문 2개 이상일 때에는 {} return 필요
        LambdaInterface li2 = (i, j,c) -> {
            return i+" "+j;
        };
        String a = li2.makeString("이","hs",2);

        System.out.println(a +" "+b);
    }
}
interface LambdaInterface {
    String makeString(String a, String b, int c);


}

