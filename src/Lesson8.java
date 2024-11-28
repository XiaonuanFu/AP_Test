import java.util.Scanner;

public class Lesson8 {

    int[][] Array0; //可以先定义不赋值
    int[][] Array1 = new int[10][10]; // 必须先给长度
    int[][] Array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; //行 x 列

    public void doArrays(){
        System.out.println(Array2.length); //行的长度
        System.out.println(Array2[0].length); //列的长度

        System.out.println(Array2[2][1]); //取值 （index都从0开始）

        Array2[1][1] = 32; //赋值

        for (int i = 0; i < Array2.length; i++){
            for (int j = 0; j <Array2[0].length; j++){
                System.out.print(Array2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < Array2[0].length; i++){
            for (int j = 0; j < Array2.length; j++){
                System.out.print(Array2[j][i] + " ");
            }
            System.out.println();
        }

        for (int[] i : Array2){ //for each只能读不能改
            for (int j : i){
                System.out.print(" " + j );
            }
            System.out.println();
        }

        doArray2(Array2);
        doArray3(Array2);
    }

    public void doArray2(int[][] demo){ //找最大和最小值
        int max = demo[0][0];
        int min = demo[0][0];

        for (int i = 0; i < demo.length; i ++){
            for (int j = 0; j < demo[0].length; j++){
                if (demo[i][j] > max)
                    max = demo[i][j];
                if (demo[i][j] < min)
                    min = demo[i][j];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    public void doArray3(int[][] demo){ //求行列的和
        int[] sumColumn = new int[demo[0].length];
        int sumRow = 0;

        for (int i = 0; i < demo.length; i ++){
            for (int j = 0; j < demo[0].length; j++){
                sumRow += demo[i][j];
                sumColumn[j] += demo[i][j];
            }
            System.out.println(sumRow);
            sumRow = 0;
        }

        for (int i = 0; i < sumColumn.length; i ++){
            System.out.println(sumColumn[i]);
        }

    }

    public void doArray4(){ // 大数组里找小数组 - 计算机视觉经常用
        int[][] Array3 = new int[30][30];
        int[][] ArraySmile = {{0, 1, 0} , {1, 0, 1} , {0, 1, 0}};

        for (int i = 0; i < Array3.length; i++){
            for (int j = 0; j < Array3[0].length; j++){
                Array3[i][j] = (int) (Math.random() + 0.5);
                System.out.print(Array3[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < Array3.length - 2; i++){
            for (int j = 0; j < Array3[0].length - 2; j++){
                if (Array3[i][j] == ArraySmile[0][0] &&
                Array3[i][j+1] == ArraySmile[0][1] &&
                Array3[i][j+2] == ArraySmile[0][2] &&
                Array3[i+1][j] == ArraySmile[1][0] &&
                Array3[i+1][j+1] == ArraySmile[1][1] &&
                Array3[i+1][j+2] == ArraySmile[1][2] &&
                Array3[i+2][j] == ArraySmile[2][0] &&
                Array3[i+2][j+1] == ArraySmile[2][1] &&
                Array3[i+2][j+2] == ArraySmile[2][2]){
                    System.out.println("Found pattern at " + i + " " + j);
                }
            }
        }
    }

    public void doArray5(){ // 大模型用的 - LLM
        int[][] Array4 = new int[10][3];

        for (int i = 0; i < Array4.length; i++){
            for (int j = 0; j < Array4[0].length; j++){
                Array4[i][j] = (int) (Math.random() * 101);
                System.out.print(Array4[i][j] + " ");
            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a coordinate: (x, y, z) ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        double instance = Double.MAX_VALUE;
        double length = 0;
        double record = 0;

        for (int i = 0; i < Array4.length; i++){
            length = Math.sqrt(Math.pow(Array4[i][0] - x, 2) + Math.pow(Array4[i][1] - y, 2) + Math.pow(Array4[i][2] - z, 2));
            if ( length < instance){
                instance = length;
                record = i;
            }
        }

        System.out.println("The closest point is at row:  " + record + " with a distance of: " + instance);

    }
}
