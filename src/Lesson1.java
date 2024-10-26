public class Lesson1 {
    public static void inc(Person x){
        x.Grow();
    }
    // this is a  method that belongs to the Main class and itself takes in Person type objects in its parameter list
    // it uses the "Grow" method of Person type objects that increases the age of a Person by 1

    public void doLesson(){
        Person x = new Person("Fuxiaonuan", 15);
        // here we are creating a new Person object labeled "x"
        // this new Person has a name of "Fuxiaonuan" and an age of 15
        inc(x);
        // notice here how when we are calling the inc method, we write "inc(x);" instead of "x.inc()"
        // this is because the inc method belongs to the same class as we're writing this code in
        // and the Grow method, for example, belongs to the Person class, which is why we would write x.Grow() instead of Grow(x)
        System.out.println(x.GetAge());
        // something interesting to note here is that now the age for Person-x is 16 instead of 15 (the original age we entered when constructing this object)
        // if we were to do this with int c = 2, for example, and then call the inc method on c, and then print it
        // System.out.println(c); would still print out 2
        // this is because for Java's built-in data types, when we call a method on it, Java is going to automatically duplicate that
        // so one "c" would point to 2 and another "c" that has been called to a method would point to "3", despite both of these variables having the name of "c"
        // this is different with objects we construct because Java wouldn't duplicate that object - it would just change whatever information needed to be changed about that object
        // which is why here x.GetAge() would output 16 instead of 15

        Person y = x;
        // here you are creating a "new" person labeled y
        // I say "new" here because in reality, you're replacing the information in x with y
        // it's like if y and x were objects, y and x would both point to the same thing
        // while if y and x were integers (for example), y and x would point to different things (that have the same value)
        x.Grow(); // what is the difference between using the x.Grow method here and using the inc(x) method? Won't they all do the same thing?
        // here you are making x (and simultaneously, y) grow, so 16 + 1 = 17
        // the new age for x/y is 17
        System.out.println(y.GetName() + " " + y.GetAge());
        // so now if you print out y, it would display "Fuxiaonuan 17"
        System.out.println(x.GetName() + " " + x.GetAge() );
        // this would, as a result, also display "Fuxiaonuan 17" because these objects are the same thing - they just have different labels


        Person mom = new Person("Zhunan", 50);
        // here we create a new Person object whose name is "Zhunan" and age is 50
        Person.SetMaxAge(200);
        // now we are calling the SetMaxAge method to set a new maximum age for the Person object
        // notice how we use Person, the name of the object class, instead of "mom" or "x" or "y"
        // this is because we're changing the MAX_AGE value for all future Person objects we create from now on - this is going to apply to all Person objects, not just the one we created
        // therefore we would use "Person"
        // also, SetMaxAge is a static method because MAX_AGE is a static value - meaning there is only one instance of this variable
        // thus also explaining why we would use "Person" instead of "mom"
        // the lesson we can learn from this is that when we are calling a static method, we would use the name of the class the method belongs to to call it
        System.out.println(mom.GetMaxAge());
        // here we are getting the maximum age for the "mom" Person-object
        // which would be 200 since we just set it to 200 previously
        System.out.println(x.GetMaxAge());
        // we are now getting the maximum age for the "x" Person-object
        // this would also be 200 because the MAX_AGE is a static value and changing MAX_AGE would change its value for all the objects created of that class

        for (int i=0; i<=10; i++){
            x.Grow();
            System.out.println(x.GetAge());
        }
        // this is a for-loop that shows the age of the "x" Person-object for the next 10 years
        // every year "x" grows, the code out would print out the age of "x" corresponding to that year, for 10 years in a row

        Person baby = new Person("Mimi", -2);
        // here we have created another new Person object called "baby"
        // the "baby" Person-object has the name "Mimi" and an age of -2
        // but remember how we set the minimum value for a Person to be 0, meaning no human can be younger than 0 years old?
        // this is when the line "this.age = (a >= 0)?a:MIN_AGE;" comes into play
        // a >= 0 is false so the value of a would now equal to the minimum age of a Person-object, which is 0
        // thus forcefully making the age of the baby Person object 0
        System.out.println(baby.GetName() + " " + baby.GetAge() );
        // if we print this information, we would see that the name of the baby is Mimi, followed by 0
    }
}
