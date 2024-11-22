import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lesson7 {
    ArrayList<Integer> list1 = new ArrayList<Integer>(); // 不给长度缺省为10 //ArrayList里只能存储对象 // 不能放原生的int和double
    ArrayList<Integer> list2 = new ArrayList<Integer>(5); // 指定长度为5
    ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("one", "two", "three")); //三个长度并且赋予了初始值
    ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("ten", "eleven", "twelve"));

    public void doArrayList(){
        list3.add("four"); //从尾部追加
        list3.add(0, "zero");
        list3.addFirst("negative one");
//        System.out.println(list3.get(2));
//        System.out.println(list3.set(4, "hello"));
//        System.out.println(list3.get(4));
//        System.out.println(list3.remove(5)); // set 和 remove 都有返回值(原来位置是什么）
//        System.out.println(list3.remove("two")); // 返回boolean值 (删没删成功）
        //printArrayList(list3);

        //list3.addAll(list4); //把一个arrayList追加到另一个arrayList尾部
        list3.addAll(3, list4); //在制定位置插入arrayList
//        printArrayList(list3);

        if (list3.contains("six")){ //返回boolean //查找
            System.out.println("found");
        }
        else
            System.out.println("not found");

        System.out.println(list3.indexOf("four")); //取某一个值的index
        Collections.reverse(list3); // 反转列表 (Collections类的静态方法）
        Collections.sort(list3); // 按ASCII码的大小排序
        printArrayList(list3);

        list3.clear();
        System.out.println(list3.size());
        if (list3.isEmpty())
            System.out.println("empty");


//        for (double i = 0; i < Integer.MAX_VALUE; i ++){
//            list1.add((int) i);
//           // System.out.println(list1.get((int) i));
//        }


    }


    public void printArrayList(ArrayList<String> list ){
        for (int i = 0; i < list.size(); i ++){ // 用.size()求ArrayList的大小
            System.out.println("Index at: " + i + " is " + list.get(i));
        }
    }
}
