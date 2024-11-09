public class Lesson5Scope {
    private static int number;
    public int number2 = 0;

    public void Method1(int parameter1){
        int numberMethod = 1;
    }

    {
        int a = 0;
    }

    public void Method2(int parameter2){
        int numberMethod = 1;
        int number2 = 1;
        System.out.println(this.number2);
        for (int i = 0; i < 1; i++){
            if (i == 0){
                int j = i;
            }
        }
    }
}
