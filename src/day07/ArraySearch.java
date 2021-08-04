package day07;

public class ArraySearch {
    public static void main(String[] args) {

        String[] foods = {"치킨", "피자", "삼겹살", "족발"};

        //순차 탐색 알고리즘 프리즘 레이니즘
        String target = "족발";

        //찾은 인덱스를 저장할 변수
        int idx = -1;

        // 탐색하는 데이터의 유무를 저장할 변수
        boolean include = false;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(target)) {
                idx = i;
                include = true;
                break;
            }//end if
        }//end for

        System.out.println("탐색인덱스: " + idx);
        System.out.println("탐색결과 : " + include);
        //되시겠어연? 아시겠어연?



    }//end main
}//end class
