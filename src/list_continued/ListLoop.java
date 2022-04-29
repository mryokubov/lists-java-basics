package list_continued;

import java.util.ArrayList;
import java.util.List;

public class ListLoop {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Harry");
        names.add("Mike");

        names.add(0, "Walter");

        names.addAll(List.of("Jerry","Peter","David"));


        for (int i = 0; i < names.size(); i++) {

            System.out.println(  names.get(i) );
        }

        for (int i = names.size()-1; i >= 0 ; i--){
            System.out.println(  names.get(i) );
        }




    }
}
