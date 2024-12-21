package Animal;

public class Dolphin extends Animal {
    public Dolphin(){
        super(); // 调超类的构造函数必须放在第一句
    }

    public Dolphin(String n){
        super(n);
    }

    @Override
    public String sound(){
        return "zhi zhi";
    }
    @Override
    public String move(){
        return "Swim";
    }

    public String show(){
        return "Show";
    }
}
