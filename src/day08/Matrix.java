package day08;

public class Matrix {
    public static void main(String[] args) {

        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        System.out.println("arr2d.length = " + arr2d.length);

        arr2d[1][2] = 100;

        arr2d[2] = new int[]{10, 20, 30};

        for (int[] arr : arr2d) {
            for (int arr2 : arr) {
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }

        // 배열 생성문으로 생성하기
        // 3행 5열짜리 배열

        System.out.println("------------------------------");
        int[][] testArr = new int[3][5];

        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        //3차원 배열
        int[][][] arr3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                },
                {
                        {19, 20, 21},
                        {22, 23, 24},
                        {25, 26, 27}
                }

        };

        System.out.println(arr3d[2][0][1]);

        int[][][] arr3dTest = new int[2][4][3];
        for (int[][] ints : arr3dTest) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.println();
                }
            }
        }
    }
}
