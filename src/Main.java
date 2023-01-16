import FizzBuzz.FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //create list empty list
        List<Integer> items=new ArrayList<Integer>();
        //add number to list
        items.add(1);
        items.add(3);
        items.add(9);
        items.add(15);
        //loop the list
        for (Integer item:items) {
            //initiate FizzBuzz Class
            FizzBuzz fizzbuzz=new FizzBuzz(item);
            //divide by 3
            boolean isDivisibleByThree=fizzbuzz.isDivibleBy(3);
            //divide by 5
            boolean isDivisibleByFive=fizzbuzz.isDivibleBy(5);

            if(isDivisibleByFive && isDivisibleByThree){//is it divisible by 3 and 5
                fizzbuzz.print("FizzBuzz");//print FizzBuzz
            }else if(isDivisibleByThree){ // is it divisible by 3
                fizzbuzz.print("Fizz");//print Fizz
            }else if(isDivisibleByFive){ //is it divisible by 5
                fizzbuzz.print("Buzz");//print Buzz
            }else{ //is not divisible by eith 3 or 5
                fizzbuzz.print(item.toString());
            }
        }

    }
}