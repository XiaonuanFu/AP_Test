//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        //Lesson5.number3 = 3;
//        Lesson5 lesson = new Lesson5(4);
////        lesson.number = 1;
//        lesson.changeNum5(1);
//        lesson.Lesson5();
//
//        //int a = lesson.changeNum5(1) / 20; //没有返回值不能在公式里用
//        double a = lesson.Method1(2);
//        System.out.println(a);
//        if (true && lesson.Method4())
//            System.out.println("true");
//        System.out.println(lesson.Method5() + " world");
//        System.out.println(lesson.Sum(5));
//        double b = Math.abs(3.0);

        Lesson8 lesson = new Lesson8();
        lesson.doArray5();

//        double totalIncome = 0.0;
//
//        for (int i = 1; i < 11; i++) {
//            totalIncome += investmentIncome(0,100,900);
//            System.out.println("今年是第 "+ i + " 年，投资总收入是："+ totalIncome);
//            System.out.println();
//        }

        //类的方法调
//
//        Integer original = 8;
//        Integer first = original.intValue() * 2;
//        Integer second = original.intValue() + 2;
//
//        System.out.println(Math.pow(3, 2));

        //Lesson3.doOperators();

        //Lesson3.doSwitch(13);

        //Lesson2 lesson = new Lesson2();
        //lesson.doClass();

        //Lesson2 lesson1 = new Lesson2();
        //lesson1.doMath();



    }

    private static double investmentIncome(int lowRisk, int middleRisk, int highRisk){
        double riskRate = Math.random();
        double lowRiskIncome,middleRiskIncome,highRiskIncome;
        //低风险收入
        if (riskRate < 0.05)
            lowRiskIncome = lowRisk *  -0.05;
        else
            lowRiskIncome = lowRisk * 0.05;

        //中风险收入
        riskRate = Math.random();
        if (riskRate < 0.2)
            middleRiskIncome = middleRisk * -0.2;
        else
            middleRiskIncome = middleRisk * 0.2;

        //高风险收入
        riskRate = Math.random();
        if (riskRate < 0.4)
            highRiskIncome = highRisk * -0.4;
        else
            highRiskIncome = highRisk * 0.4;

        System.out.println("您投资组合，低风险投资：" + lowRisk + "万元，中风险投资：" + middleRisk + "万元，高风险投资："+highRisk);
        System.out.print("您今年收益是：" + (lowRiskIncome + middleRiskIncome + highRiskIncome));
        System.out.println(" , 其中低风险投资收益："+lowRiskIncome + "万元, 中风险收益：" + middleRiskIncome + "万元，高风险投资收益：" + highRiskIncome);

        return lowRiskIncome + middleRiskIncome + highRiskIncome;
    }
}