package arrayslist_intro;

import java.util.ArrayList;
import java.util.List;

public class ListsBasics {

    public static void main(String[] args) {


        //With lists order is guaranteed
        List<Integer> list = new ArrayList<>();

        //add method will take an argument
        list.add(12); //0
        list.add(13); //1
        list.add(14); //2
        list.add(-2);


        System.out.println(list);
        System.out.println("size: " +  list.size());


        list.remove(2);
        System.out.println("removing 14");

        System.out.println(list);
        System.out.println("size: " + list.size());

        System.out.println(list);




        List<String> names = new ArrayList<>();
        names.add("Peter Pan");
        names.add("Jason Lee");
        names.add("Mike Lawrence");

        System.out.println(names);
        System.out.println("names arraylist has " + names.size() + " elements" );
        names.remove(2);

        System.out.println(names);




        List<String> books = new ArrayList<>();
        books.add("Java for Beginners");
        books.add("Kite Runner");
        books.add("Python for Java people");
        books.add("Harry Potter");

        String firstBook = books.get(0);
        String lastBook = books.get( books.size() - 1 );

//        books.get(100); will throw IndexOutOfBoundsException

        System.out.println(firstBook);
        System.out.println(lastBook);


        List<Double> prices = new ArrayList<>();
        prices.add(12.50);
        prices.add(80.453);
        prices.add(45.22);
        prices.add(65.234);


        System.out.println(prices);


        List<Byte> bytes = new ArrayList<>();
        bytes.add((byte) 1);


        List<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');

        System.out.println(chars);
        System.out.println(chars.get(1));

    }
}
