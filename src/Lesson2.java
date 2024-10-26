import java.util.Scanner;

public class Lesson2 {
    public void doClass(){
        Person n1 = new Person("Xiaonuan", 15);
        Person n2 = new Person("Xiaonuan", 15);
        Person n3 = n1;

        System.out.println(n1);

    }

    public void doMath(){
        Integer i1 = 2147483647;
        Integer i2 = 128;

        System.out.println((i1.equals(i2)));

        System.out.println(i1 + 1);

        double d1 = 1.0 - 0.3 -0.3 -0.3;
        double d2 = 3/ 5.0000;
        System.out.println(d1);

        double d3 = 0.5;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius ");
        double r = input.nextDouble();
        if (r < 0) {
            System.out.println("No Area ");
        }
        else {
            System.out.println("The area of the circle is: " + circleArea(r));
        }

        double rand = 123 + Math.random() * 334;

        double random = -50 + Math.random() * 100;

    }

    public double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public void doString(){
        String s1 = "Hello world!";
        String s2 = new String ("Hell");

        System.out.println(stringReplace("I Love You Love", "Love", "Hate"));
    }

    public String stringReplace(String originstr, String str1, String str2){
        if (originstr.indexOf(str1) == -1) {
            return originstr;
        }
        else {
            return originstr.substring(0, originstr.indexOf(str1)) + str2 + (originstr.substring(str1.length() + originstr.indexOf(str1)));
        }
    }

}
