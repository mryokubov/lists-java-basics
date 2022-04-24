package arrayslist_intro;

import java.util.ArrayList;
import java.util.List;

public class IterateLists {

    public static void main(String[] args) {



        List<String> cities = new ArrayList<>();
        cities.add("New York City");
        cities.add("McLean");
        cities.add("Houston");
        cities.add("Chicago");
        cities.add("LA");
        cities.add("Fairfax");
        cities.add("Philly");
        cities.add("Parsipanny");
        cities.add("San Francisco");
        cities.add("Pittsburgh");
        cities.add("Miami");


//        System.out.println(cities);


//        int index = 0;
//        while (index < cities.size()){
//            System.out.println(cities.get(index));
//            index++;
//        }

        // printing all elements from the list
//        for(int i = 0; i < cities.size(); i++){
//            System.out.println(cities.get(i));
//        }



//        for(int i = 0; i < cities.size(); i++){
//            if ( cities.get(i).startsWith("M")){
//                System.out.println(cities.get(i));
//            }
//        }
//
//
//        if (cities.contains("Abc")){
//            System.out.println("yes it exists");
//        }

        System.out.println(cities);

  //      cities.clear();
   //     cities.remove("New York City"); //removing one element

 //      cities.removeAll( List.of("New York City", "Chicago","Miami")); to remove multiple elements
        System.out.println(cities);

    }




}
