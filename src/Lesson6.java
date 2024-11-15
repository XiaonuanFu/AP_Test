import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson6 {
    private int[] Array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //连定义带赋值
    private char[] Array2 = new char[10]; //只定义不赋值 - 只定义长度 //一旦定义了长度就不能改了
    private double[] Array3 = new double[10];
    private String[] Array4 = {"Hello", "guys", "1", "2", "3", "4", "5"}; //只声明不定义
    // index从零开始

    public void doArray(){
        System.out.println(Array1[0]); //获取每一个位置的数组元素 //元素下标超出会有run time error
        Array4[1] = "girls"; //给某一个位置的元素赋值
        System.out.println(Array4[1]);
        System.out.println(Array4.length); //获取数组长度 length不带括号

        for (int i = 0; i < Array1.length; i++){ //for循环能改元素
            Array1[i] = i * i;
            System.out.println(Array1[i]);
        }

        for (String i : Array4){ // 不能改原生元素和Integer和String //可以改非原生类的内容
            i = "test";
            System.out.println(i);
        }

        System.out.println(Array4[0]);

        Person p1 = new Person("Nancy", 16);
        Person p2 = new Person("Bob", 100);

        Person[] Array5 = new Person[2];
        Array5[0] = p1;
        Array5[1] = p2;

        for (Person i : Array5){
            i.Grow();
            System.out.println(i);
        }

        int[] Array6 = new int[20]; // int, long, 初始化没有的话都是0， 如果是String的话就是null
        System.arraycopy(Array1, 3, Array6,5, 6); //数组拷贝
        for (int i : Array6){
            System.out.println(i);
        }

        int[] Array7 = new int[10000];
        for(int i = 0; i < Array7.length; i++){
            Array7[i] = 1 + (int) (Math.random() * 10001);
        }
        int pos = linearSearch(Array7, 9);
//        if (pos == -1)
//            System.out.println("Didn't find number");
//        else
//            System.out.println("The number was found at: " + pos);

        Arrays.sort(Array7); //调用arrays的系统排序方法

        pos = binarySearch(Array7, 9999);
        if (pos == -1)
            System.out.println("Didn't find number");
        else
            System.out.println("The number was found at: " + pos);
    }

    public int linearSearch(int[] Array, int key){
        for (int i = 0; i < Array.length; i++){
            if (Array[i] == key)
                return i;
        }
        return -1;
    }

    public int binarySearch(int[] Array, int key){
        int low = 0;
        int high = Array.length - 1;
        int middle = 0;

        while(high >= low){
            middle = (low + high) / 2;
            if (key < Array[middle])
                high = middle - 1;  //
            else if (key > Array[middle])
                low = middle + 1;
            else //key = list[middle]
                return middle;
        }

        return -1;
    }

}
