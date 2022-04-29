package list_continued;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {


    public static void main(String[] args) {



     //   int[] nums = {1,2,3,4};

        int[] nums = new int[100];



        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(100);
        list.add(45);



        System.out.println(list.size());

        //generics

        List<Student> students = new ArrayList<>();
        students.add( new Student("Kevin Lee", 6) );
        students.add( new Student("Frenandez Lawrence", 5));


        System.out.println(   students.size() );



        List<String> names = new ArrayList<>();
        // [Kevin, Peter, Kevin, Peter, KEvin, Peter, Kevin, Peter, Peter]
        // [Kevin, Peter, Kevin, Peter, KEvin, Peter, Kevin, Peter, Peter, Kevin, null, null, null, null]
        names.add("Kevin");
        names.add("Peter");
        names.add("Kevin");
        names.add("Peter");
        names.add("Kevin");
        names.add("Peter");
        names.add("Kevin");
        names.add("Peter");
        names.add("Kevin");
        names.add("Peter");
        names.add("Kevin"); //11th


        new ArrayList<>();


    }
}


