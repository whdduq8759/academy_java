package day06;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        // 1. 배열 변수 선언
        int[] points;
        
        // 2. 배열 객체 생성
        points = new int[5];
        System.out.println("points = " + points);

        // 3. 배열 값 초기화
        points[0] = 87;
        points[1] = 95;
        points[2] = points[0] + 4;
        points[3] = (int)33.154;
        points[4] = 100;
//        points[5] = 55; //배열 인덱스 범위초과(runtime exception)

        // 4. 배열의 길이 확인
        System.out.println("배열의 총 요소 수:" + points.length);

        // 5. 배열의 반복문 처리
        System.out.println("===========================");
        for (int i = 0; i < points.length ; i++) {
            System.out.print(points[i] + " ");
        }

        // enhanced for: 향상된 for문
        System.out.println("\n=========향상된 for문============");
        for (int n : points) {
            System.out.print(n + " " + "\n");
        }

        int total = 0;

        // iter 단축키 사용하면 아래의 향상된 for문이 작성됨
        // clt + enter 단축키: for문을 다른 방식으로 바꿔줌
        for (int n : points) {
            total += n;
        }

        // 값 목록으로 배열 생성

        // 배열의 선언과 생성을 동시에 할 수 있음
        double[] dArr = new double[4];

        // 배열의 선언과 생성과 초기화를 동시에 할 수 있음
        // 갯수를 설정하지말고 뒤에 중가로로 배열을 넣는 것
        String[] foods = new String[] {"자장면", "볶음밥", "탕수육"};

        // 배열의 선얹시에만 new type[] 을 생략 가능
        String[] fruits = {"사과", "딸기", "바나나", "포도"};

        // 배열 내부 값 문자열로 보기
        System.out.println(Arrays.toString(foods));
        System.out.println(Arrays.toString(fruits));


        System.out.println("===============================");

        // 배열을 생성만하고 초기화하지 않은 경우 각 타입의 기본값 저장
        boolean[] bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));
        
        
        // 배열의 복사 사과 과자 자동차 차고 고라니 리어카 카멜레온 온도 도살장 장독대 대나무 무궁화 화장 장군 군수 수산물 물탱크 크레미 미국 국산 산기슭 슭곰발 발냄새 새장 장사 사장 장소 소장
        // 장미 미소 소라 라면 면상 상하차 차사고 고장 장부 부분 분수대 대부업자 자살 살구 구청 청포도 도장 장마 마차 차주 주먹 먹자골목 목수 수조 조사 사랑 낭만 만족 족발 발작 작업 업무 무기
        // 기지 지구 구문 문지기 기소 소망 망둥어 어부 부피 피구 구피 피자 자동문 문희는 포도가 머꼬시픈데...★

        int[] iArr = {1, 3, 5 ,7 ,9};
        // 배열 복사 알고리즘
        // 1. 원본배열과 크기가 같은 배열하나를 더 생성함

        int[] copyArr = new int[iArr.length];

        // 원본배열의 값들을 복사배열로 값 복사
        for (int i = 0; i < iArr.length; i++) {
            copyArr[i] = iArr[i];
        }
        copyArr[2] = 100;
        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(copyArr));

    }
}
