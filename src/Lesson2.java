import java.util.Scanner;

public class Lesson2 {
    public void doClass(){
        Person n1 = new Person("Xiaonuan", 15); // here a new Person object is created called n1 and it has the name Xiaonuan and the age of 15
        Person n2 = new Person("Xiaonuan", 15); // here another new Person object is created called n2 but it has the exact same parameters as n1
        Person n3 = n1; // here n3 is made so that it is another tag for n1 (n1 and n3 point to the same object, but n1 and n2 point to different objects)

        //System.out.println("Comparing n1 and n2" + n1 == n2); // the == operator compares if two references point to the same object in memory (here n1 and n2 point to 2 different Person objects so this returns as false)
        System.out.println(n1.equals(n2)); //the .equals() method compares the contents or values of two objects and if the contents are the same, it returns "true" and if the contents are different, it returns false
        //but why does this still return as false if n1 and n2 both have "Xiaonuan" and 15 as their parameters?

        System.out.println(n1 == n3); // this returns as true because n3 is just another tag for n1 meaning they point to the same object
        System.out.println(n1.equals(n3)); // this is also true because n3 and n1 point to the same object

        Double d1 = 2.0;
        Double d2 = 2.5;
        Double d3 = 2.0;
        // three Double objects are created

        System.out.println(d1 == d3); // this returns to false because d1 and d3 are two different objects and the == operator compares the location of objects
        System.out.println(d1.equals(d3)); // this compares the content of two objects which is why it returns to true because d1 and d3 all equal to 2.0
        System.out.println(d1.compareTo(d2)); // this returns to -1 because d1 is being compared to d2, and d1 < d2, so it returns -1 (if the first object is smaller Java would return a negative number)
        // if this was comparing d2 to d1, d2 > d1 so it would return +1 (if the first object is greater Java would return a positive number)

        // if we were comparing two objects using the compareTo function here is what would happen:
        String s1 = "Hello world";
        String s2 = "Hello";
        String s3 = "My name is Nancy";

        System.out.println(s1.compareTo(s2)); // this would return to 6 because s1 and s2 have no index position at which they differ, meaning they both start with "Hello" but s1 is just longer
        // so Java would only return their difference in length as an int
        System.out.println(s1.compareTo(s3)); // this would return to -5 because first of all s1 is shorter than s3 so it would return as a negative
        // second, they are completely different, for example at index 0, s2's character is 'H' and s3's character is 'M'
        // this means Java would compare their lexicographic values, aka dictionary order, aka their ASCII values
        // Here, the difference between the ASCII value of H and the ASCII value of M is 5, which is why in the end this would return -5
    }
    public void doMath(){
        Integer i1 = 2147483647; // this is an Integer object (not the primitive Integer type) and its max value is 2147483647
        Integer i2 = 128; // this is also creating an Integer object with the value of 128

        System.out.println((i1.equals(i2))); // this is comparing the value of i1 and i2 and it is going to return to false because i1 != i2

        System.out.println(i1 + 1); //just then we said that the max value of an Integer in Java is 2147483647, but what if we add 1 to it?
        // it's just going to make i1 into a negative value because you can interpret the values of Integer like a circle, once 1 is added to 2147483647, it goes back to -2147483648
        // but why does it return to -2147483647 if +2?

        double d1 = 1.0 - 0.3 - 0.3 - 0.3;
        double d2 = 3 / 5.0000;
        System.out.println(d1);
        // this is going to print out 0.0999999999998 because double is a binary floating point meaning sometimes there are inaccuracies in calculations

        Scanner input = new Scanner(System.in); // this inputting a scanner class so the user can interact with the program
        System.out.println("Please enter a radius ");
        double r = input.nextDouble(); // this is asking the user to enter a number that Java is later going to use for calculations
        // Java is going to label the inputted radius as r
        // what does nextDouble do?
        if (r < 0) {
            System.out.println("No Area ");
        }
        else {
            System.out.println("The area of the circle is: " + circleArea(r));
        }
        // this is calculating the radius of a circle
        // if the radius value entered by the user is less than 0 Java is going to return No Area because you can't have a negative length
        // if the radius is greater than 0 Java is going to return the area of the circle with the words "The area of the circle is:"

        double rand = 123 + Math.random() * 334;
        System.out.println(rand);
        // This is going to print a random number between 123 and 456 (but it's going to be represented by [123, 457] because the random method doesn't take in 457 so the maximum value is going to be 456)
        // This is multiplied by 334 because the difference between 123 and 457 is 334
        // so basically whenever you are asked to find a number between x and y, you are going to plus Math.random() by your starting value (x)
        // and you multiply Math.random by the difference between y+1 and x

        double random = -50 + Math.random() * 100;
        // This is going to print a random number between -50 and 50 because working the same logic as before
        // you add Math.random() by -50 because that is your starting value
        // and multiply Math.random() by 100 because the difference between 50 and -50 is 100

    }
    public double circleArea(double r){ // this is a method that belongs to Lesson 2 that calculates the circle of an area
        return Math.PI * Math.pow(r, 2);
        // this uses the Pi value built into the Java Math library to multiply r squared, which is represented by Math.pow(r, 2)
        // r is the number on the bottom and 2 is the exponent
        // pow stands for "power"
    }

    public void doString(){ // this is a method that calls the String Replace method and replaces the word "love" in the sentence "I love you" with the word "hate"
        String s1 = "Hello world!";
        String s2 = new String ("r");
        // Ok so here we have two Strings that are respectively "Hello world!" and "r"
        System.out.println(s1.indexOf(s2));
        // What this is doing is it's going to find where the index of "r" is located in the String "Hello world!"
        // indexOf starts counting from 0

        String s3 = new String ("l"); // new String with variable "l"
        System.out.println("The index of the third l is: " + s1.indexOf(s3, 5));
        // So you might have noticed that "Hello world!" has 3 l's but if I just tell Java to find the index of "l", it's going to return the index value of the first "l" that appears
        // but what if I want the third L? Then I would add a comma and make Java start counting from a specific index, which here, is 5

        System.out.println(s1.substring(0,9));
        // what this is doing is that Java is going to print the character starting with character with the index of 0, up to the character with the index of 8 because 9 is not included
        // .substring starts counting from 0

        System.out.println(s1.length());
        // this is going to count how many letters (including spaces and symbols) is in the String s1
        // .length() starts counting from 1

        System.out.println(stringReplace("I Love You", "Love", "Hate"));
        // this is calling the stringReplace method to replace the word "Love" in the String "I Love You" with the word "Hate"

        System.out.println(stringReplace("I Love You Love", "Love", "Hate"));
        // this is also calling the stringReplace method to replace the word "Love" in the String "I Love You Love" with "Hate" but only the first "Love" not the second "Love"
        // this is because that's how the method was written so it's not going to replace the second "Love" :P
    }

    public String stringReplace(String originstr, String str1, String str2){ // this is a method that replaces a word (str1) in a sentence/word (originstr) with a new word (str2)
        if (originstr.indexOf(str1) == -1) {
            return originstr;
            // this is executed if there isn't even the word str1 in the sentence, because how you can replace something that doesn't exist?
        }
        else {
            return originstr.substring(0, originstr.indexOf(str1)) + str2 + (originstr.substring(str1.length() + originstr.indexOf(str1) ));
            // ok so let's break this down into three parts:

            // part 1: originstr.substring(0, originstr.indexOf(str1))
            // this is going to return the part before the replacement

            // what originstr.substring is doing it's going to return the characters in originstr starting with the character that has the index 0, aka the first character
            // it's going to return the substring up until the index where str appears (it doesn't matter how long str1, as soon as Java sees the first letter of originstr that matches with the first letter of str1, it's going to count THAT number), aka end this
            // so far originstr.substring contains the first letters up until before the first letter of str1 that appears

            // part 2: str2
            // this is going to return the replacement

            // we add the str2, which is what we want to replace str1 with

            // part 3:
            // this is going to replace the part after the replacement

            // originstr.indexOf(str1) finds where str1 starts
            // str1.length finds how many characters str1 contains
            // in conclusion, it's going to return the sum of the starting index and how many letters str1 contains, which is the index of the final letter of str1
            // and the substring will continue printing until originstr ends
        }


    }

}
