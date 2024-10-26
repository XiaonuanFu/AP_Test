public class Person {
    private String name;
    private int age;
    // here you are initializing a value for the Person class - when someone creates a Person object, that object would have
    // a name (in the form of a String) and an age (in the form of an int)
    private static int MAX_AGE = 150;
    // here you set a static value for the maximum age a Person object can have
    // the "static" here means that there can only be one value of MAX_VALUE
    // the maximum age right now is 150, but if you use the SetMaxAge method later, you can replace this number with a new maximum age
    private final static int MIN_AGE = 0;
    // similarly, you are also setting a static minimum age here
    // the difference here is that this variable is also set as "final", meaning you CANT change this variable - as indicated by the lack of a "SetMinAge" method
    // the minimum age for a human would be 0, so the minimum age value here would make sense to also be 0

    public Person(){
        name = "";
        age = 0;
    }
    // this is a constructor for when you create a person class, and you don't give any parameters
    // for example if I say: Person a = new Person(); that means I just created a new Person-type object with the tag of "a" but I didn't give that person a name or an age
    // since I didn't intentionally give this Person a name/age, the program would automatically set that Person's name to "" (aka nothing) and age to 0

    public Person(String n, int a){
        this.name = n;

        this.age = (a >= 0)?a:MIN_AGE; // what this is doing is that if a >= 0 is true, the program is going to execute the code behind the "?"
        // and set the age to the "a" value you entered in your parameter list
        // but if a >=0 is false, then the program executes the code after the ":" and sets the age of this Person to the minimum age, which is 0
    }
    // similarly, this is also a constructor but this constructor requires you to put in variables when you create the object
    // the parameter list of this includes a String name variable and an int age variable
    // essentially what "this.name" is doing is saying that "this" "private String name" for this new Person is going to be the variable "n" that you entered
    // the same thing goes for age - the "private int age" of the Person you just created is going to be the variable "a" that you just entered

    // the two functions above are constructors, so you don't have to type in their return type

    public void Grow(){
        age += 1;
    }
    // this is a method that allows the age of the Person to increase by 1
    // it doesn't return any variable, so it's return type is void

    public int GetAge(){
        return age;
    }
    // this is a method that allows the programmer to access the age of a Person
    // for example, if you want to print the age of a Person n = new Person("Nancy", 15);
    // you can't just directly say "System.out.println(n);" because this is just going to print the location in which the Person object labeled "n" is stored in
    // instead you would have to say something like "System.out.println(n.GetAge());" so the code would actually print out 15

    public String GetName(){
        return name;
    }
    // the same thing goes for this method
    // this is going to return the name of a Person object you created

    public static void SetMaxAge(int a){
        MAX_AGE = a;
    }
    // as mentioned earlier, this function sets the MAX_AGE value
    // one thing to note here is that this method includes the word "static" before its return type
    // this is because MAX_AGE is a static value, meaning that there can only be one instance of the maximum age value
    // i guess the lesson here is that if you're dealing with static variables, your methods that use those static variables also have to be static

    public int GetMaxAge(){
       return MAX_AGE;
    }
    // this is also similar to what GetAge and GetName does - it returns the maximum age value

    public String toString(){
        return "name:" + name + " age:" + age;
    }
}
