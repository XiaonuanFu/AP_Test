public class Lesson3 {

    public static void doOperators(){
        int i = 10;
        int b = ++i;
        System.out.println(i++ + ++i);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(!b1 || b2 && b3);
        System.out.println( (b1 || !b2) && (b3 || b4));

        b1 = ( 5 < 3 ) && ( 6 != 7 );

        b1 = ( 5 <= 5) ^ (10 >= 3);

        System.out.println(b1);

        System.out.println( b4 && b1 ^ b2 ^ b3);
    }

    public static void doIf(){
        if (false)
            if (true)
                System.out.println("I'm true");
        else
            System.out.println("I'm false");
    }

    public static void doGrade(int score){
        if ( score >= 60)
            System.out.println("D");
        else if ( score >= 70 )
            System.out.println("C");
        else if ( score >= 80)
            System.out.println("B");
        else if ( score >= 90)
            System.out.println("A");
        else
            System.out.println("E");
    }

    public static void discount(int age, String gender){
        if (age < 18)
            System.out.println("40%");
        else if ( 18 <= age && age <= 60){
            if (gender == "male")
                System.out.println("10%");
            else if (gender == "female")
                System.out.println("20%");
        }
        else
            System.out.println("30%");
    }

    public static void quadratic(double a, double b, double c){

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0){
            double x1 = (-b + Math.sqrt(delta) / 2 * a);
            double x2 = (-b - Math.sqrt(delta) / 2 * a);
            System.out.println(x1 + " " + x2);
        }
        else if (delta == 0){
            double x = -b / 2 * a;
            System.out.println(x);
        }
        else {
            System.out.println("No real solution");
        }
    }

    public static void doSwitch(int month){
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Not valid month");
        }
    }
}
