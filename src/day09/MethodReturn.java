package day09;

public class MethodReturn {

    //리턴값이 없는 메소드: 메소드가 코드만 실행하고 호출부로 값을 전달하지 않는 경우
    static void showMultiply(int n1, int n2){
        System.out.printf("%d x %d = %d\n", n1, n2, n1*n2);
    }

    static void sayHello(String name) {
        if (name.length() > 5) {
            System.out.println("ㄲㅈ");
            return;
        }
        System.out.println(name + "님 하이~");
    }

    // 모든 메소드의 리턴값은 오직 한개!!!!!!!!!!!!!!!!
    // 두 개의 정수를 전달받아 덧셈, 뺄셈, 곱셉, 나눗셈의 결과를 리턴
    static int[] oprateAll(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }


    public static void main(String[] args) {
        //  return값이 없는 void타입 메소드는 단독호출해서 사용한다

        showMultiply(5, 8);


        sayHello("냠냠냠냠냠냠냠냠");

        System.out.println("===============");
        int[] operList = oprateAll(10, 5);
        System.out.println("덧셈결과: " + operList[0]);
        System.out.println("뺄결과: " + operList[1]);
        System.out.println("곱결과: " + operList[2]);
        System.out.println("나눔결과: " + operList[3]);

    }
}
