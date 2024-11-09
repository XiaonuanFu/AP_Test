public class Lesson5 {
    public int number; //belongs to object //里外都能用 //谁懂能改 （类不能改）
    private int number2; //belongs to object //object里看到 //object里能改
    public static int number3 = 10; //belongs to class //里外都能看到 // class 和 object // 都能改
    private static int number4; // belongs to class // 类和对象里能看到/用 //只有static的方法能改
    public final int number5 = 10; // belongs to object // 对象里外都能看 //只能在attributes里直接赋值 或者在constructor里
    private final int number6 = 100; // belongs to object // 只能在对象里看到 // 和上面定义一样
    public static final int number7 = 100; // belongs to class (static always belongs to class) //

    public Lesson5(){
        number2 = 2 * number3;
      System.out.println("this is constructor 1");
    }

    public Lesson5(int a){ //不可以是static但可以是public/private
        this(); //constructor 想用constructor 必须在第一行调
        this.number = a;
        System.out.println("This is constructor 2");
    }

    public void Lesson5(){
        System.out.println("this is not a constructor");
    }

    public void changeNum5(int a){ // belongs to object //只能object调用
        System.out.println(number5);
        changeNum4(); // 属于类的method对象里可以调用 但属于class的static method object不能调用
        if (true)
            return;
    }

    public static void changeNum4(){ //belongs to class
        number4 = 10;
        System.out.println(number4);
    }

    public double Method1(double a){
        double b = Method2(a);
        System.out.println("I'm Method1");
        return 3.0 * b;
    }

    public double Method2(double a){
        double b = Method3(a);
        System.out.println("I'm method2");
        return 3.0 * b;
    }

    public double Method3(double a){
        System.out.println("I'm Method3");
        return 3.0 * a;
    }

    public boolean Method4(){
        return true;
    }

    public String Method5(){
        return "hi";
    }

        public int sign(int n){
        int a = 0;

        if (n > 10)
            a = 0;
        else if (n > 0)
            a = 1;
        else if (n == 0)
            a = -1;
        return a;
    }

    // Overloading method parameters: 个数，类型，顺序 -> 有任何一个不一样就认为是不一样的 method
    public int Sum(int n){ return n + 1; }
    public int Sum(int n, double m){ return n + (int) m; }
    public int Sum(double n){ return (int) n + 1; }
    public int Sum(double m, int n) { return (int) m + n; }


    public class InnerClass{

    }
}
