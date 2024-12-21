package Animal;

// 1. 继承用extends
// 2. final是不能继承的
// 3. 只能继承一个父类不能多个
// 4. 但可以多层继承
// 5. 父类的public 和 protected都可以Override (private不可以）
public class Dog extends Animal{

    public Dog(){
        super(); // 调超类的构造函数必须放在第一句
    }

    public Dog(String n){
        super(n);
    }

    @Override // @Override不是必须的 - 如果加上会进行检查保持一致
    // Override必须和父类的返回值，名字，和参数都是一模一样的
    // 只能override public和protected的method,不能override private的
    // override只能把权限放大，不能缩小
    public String sound(){
        return "woof";
    }
    @Override
    public String move(){
        return "Run";
    }

    public String hunting(){
        return "Hunting";
    }

// 因为是private的所以不能override
//    @Override
//    public void checkDNA(){
//
//    }

    // protected可以override
    @Override
    public void idk(){

    }
}
