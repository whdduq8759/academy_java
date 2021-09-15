package day18.exception;

public class FinallyExample {
    public static void main(String[] args) {
        String[] pet = {"비둘기", "거북이", "이구아나"};
        for (int i = 0; i < 4 ; i++) {
            try {
                System.out.println(pet[i] + " 키울꺼야!");
            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다.");
            } finally {
                //메모리 해제 코드(DB나 네트워크 연결시, 하드디스크)
                System.out.println("pet is good!");
            }
        }
        System.out.println("프로그램 종료!");
    }



}
