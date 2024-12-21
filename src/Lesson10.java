import java.util.Arrays;

public class Lesson10 {
    // 递归：函数自己调用自己，必须设置退出条件
    // 优点是简洁，缺点是消耗内存

    private int[] searchList = new int[1000];
    public void doLesson(){
        for (int i = 0; i < searchList.length; i++){
            searchList[i] = 1 + (int) (Math.random() * 1001);
        }
        Arrays.sort(searchList);
        System.out.println(recursiveBinarySearch(searchList, 123, 0, 1000));
    }

    public void matryoshka(int n){
        if (n == 0){ // 退出条件必须得在函数的开头
           System.out.println("end of matryoshka");
            return;
        }
        matryoshka(n - 1 );
        System.out.println("this is the " + n + " doll ");
    }

    // 这个函数是 1 + 1/2 + 1/3 + 。。。+ 1/n
    public double function1(double n){
        if (n == 1){
            return 1;
        }
        return 1/n + function1(n - 1);
    }

    public int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public double function2(double n){
        if (n == 0){
            return 0;
        }
        return n / (2 * n + 1) + function2(n - 1);
    }

    //Fibonacci值： 0 1 1 2 3 5 8 13 21 34
    //索引：        0 1 2 3 4 5 6  7  8  9
    public long Fibonacci(int n){ // 斐波那契双递归实现
        if (n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        System.out.println("I'm " + n);
        return Fibonacci(n - 1 ) + Fibonacci(n - 2);
    }

    //递归的折半查找
    public int recursiveBinarySearch(int[] list, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (low > high) //没找到
            return -low - 1;

        if (key < list[middle]) {
            return recursiveBinarySearch(list, key, low, middle - 1);
        } else if (key == list[middle]) {
            return middle;
        } else {
            return recursiveBinarySearch(list, key, middle + 1, high);
        }
    }
}
