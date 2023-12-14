package C12ClassLecture;

public class C1201MethodPratice {
    public static void main(String[] args) {
        //소수 : 1과 자시자신을 제외해서는 약수가 없는것.
        //소수인지 아닌지 판별 return boolean
        //main 메서드에서 호출하여 테스트
        System.out.println(isPrime(10));
        isPrimePrint(10);
    }


    static boolean isPrime(int num) {
        boolean res = num != 1;
        System.out.println(num);
        for (int i = 2; i*i<=num; i++) {
            if(num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
    //메서드가 return을 만나면 바로 종료
    //void 타입이어도 return을 통해 종료시킬 수 있음.
    static void isPrimePrint(int num) {
        if (num == 1) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        for (int i = 2; i*i <num; i++) {
            if(num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
    }
}
