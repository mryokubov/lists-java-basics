package arrayslist_intro;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    public static void main(String[] args) {

        //8 primitive data types have their corresponding Class Types (Wrapper)
        // primitive: byte, short, int,      long , float,  double,  char,      boolean
        //Class Type: Byte, Short, Integer, Long,    Float, Double,  Character, Boolean

        Integer n = 12;

        Double price = 55.70;


        String str= "1234";
        int converted = Integer.parseInt(str);



        String hoagiePrice = "$12.56";
        double actualHogiePrice = 12.56;

//                                                    "12.56"
        double parsedPrice = Double.parseDouble( hoagiePrice.replace("$","") );


        if ( actualHogiePrice == parsedPrice){
            System.out.println("Prices are equal");
        }


        String canTravel = "truee";
        boolean parsedCanTravel = Boolean.parseBoolean(canTravel);


        if (parsedCanTravel){
            System.out.println("yes you can travel");
        }else{
            System.out.println("you cannot travel");
        }

        int number = 23445;
        String numberStr = String.valueOf(2324);


        boolean canSwim = false;
        String s = String.valueOf(canSwim);




    }
}
