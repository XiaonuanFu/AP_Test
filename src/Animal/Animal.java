package Animal;

public class Animal { //final的class不能被继承
    public String name;

    public Animal(){
        name = "?";
    }

    public Animal(String n){
        this.name = n;
    }

    public String sound(){
        return "Ah";
    }

    public String move(){
        return "Moved";
    }

    @Override // 不能带分号
    public String toString(){
        return "My name is " + this.name + " I can " + sound() + " I can " + move();
    }

    private void checkDNA(){

    }

    protected void idk(){
// 只能给子类和当前animal包里的其他类用叫protected
    }
}
