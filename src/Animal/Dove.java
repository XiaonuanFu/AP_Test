package Animal;

public class Dove extends Animal{
    public Dove(){
        super(); // 调超类的构造函数必须放在第一句
    }

    public Dove(String n){
        super(n);
    }

    @Override
    public String sound(){
        return "gu gu";
    }
    @Override
    public String move(){
        return "Fly";
    }

    public String sendMail(){
        return "Send Mail";
    }
}
