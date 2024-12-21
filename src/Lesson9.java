import Animal.*;

import java.util.ArrayList;

public class Lesson9 {

    public void doAnimal(){
        Animal a1 = new Animal();
        Dog d1 = new Dog("Mimi");
        Animal a2 = new Dog("Imim");
        Dolphin dolph1 = new Dolphin("Ok");
        Dove dove1 = new Dove("Mi^2");

        ArrayList<Animal> zoo = new ArrayList<Animal>(0);
        zoo.add(a1);
        zoo.addFirst(d1);
        zoo.add(a2);
        zoo.add(dolph1);
        zoo.add(dove1);

        for (int i = 0; i < zoo.size(); i++){
            System.out.println(zoo.get(i));
        }

        Animal b1 = new Beagle();
        System.out.println(b1);

        if (b1 instanceof Animal)
            System.out.println("b1 is animal");
        else
            System.out.println("b1 is not animal");

        if (b1 instanceof Dog)
            System.out.println("b1 is dog");
        else
            System.out.println("b1 is not dog");

        if (b1 instanceof Dolphin)
            System.out.println("b1 is dolphin");
        else
            System.out.println("b1 is not dolphin");

        if (b1 instanceof Beagle)
            System.out.println("b1 is beagle");
        else
            System.out.println("b1 is not beagle");

        if (b1 instanceof Dachshund)
            System.out.println("b1 is dachshund");
        else
            System.out.println("b1 is not dachshund");

//        System.out.println(((Dog) a2).hunting());
//        System.out.println(a1);
//        System.out.println(d1);

    }
}
