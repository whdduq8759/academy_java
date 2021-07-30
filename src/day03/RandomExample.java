package day03;

public class RandomExample {
    public static void main(String[] args) {

        //Math.random(): 0.0이상 1.0미만의 실수 난수 생성
        /*
         *  - 랜덤 정수 생성 방범
         *
         *  # 1이상 10이하의 랜덤 정수 생성
         *
         *  Math.random()                        -> 0.0 <= ~ < 1.0
         *  Math.random() * 10                   -> 0.0 <= ~ < 10.0
         *  (int)(Math.random() * 10)            -> 0 <= ~ < 10
         *  (int)(Math.random() * 10) + 1        -> 1 <= ~ < 11
         *
         *  # 공식 x이상 y이하의 랜덤정수
         *  (int) (Math.random() * (y-x+1) + x
         */
        int rn = (int) (Math.random() * 100);
        System.out.println(rn);

        int ri = (int) (Math.floor(Math.random() * 10) + 1);
        System.out.println(ri);

    }
}

