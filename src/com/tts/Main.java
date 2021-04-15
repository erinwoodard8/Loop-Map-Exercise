package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {


//        ======= EXERCISE 1 ==================
        Scanner input = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();

        System.out.println("Enter a number.");
        int num1 = input.nextInt();

        System.out.println("Enter a number again.");
        int num2 = input.nextInt();

        System.out.println("Enter a number and again.");
        int num3 = input.nextInt();

        System.out.println("Enter a number....and again.");
        int num4 = input.nextInt();

        System.out.println("Enter a number one last time.");
        int num5 = input.nextInt();


        intList.add(num1);
        intList.add(num2);
        intList.add(num3);
        intList.add(num4);
        intList.add(num5);

        int sum = 0;
        for( int num : intList ) {
            sum = sum+num;
        }

        List<Integer> sortedList = new ArrayList<>(intList);
        Collections.sort(sortedList);
        System.out.println(sortedList);

        int max = sortedList.get(sortedList.size()-1);
        int min = sortedList.get(0);


       int product = num1 * num2 * num3 * num4 * num5;




        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Product: " + product);



//        ============== EXERCISE 2 =================
        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("civic", "Honda");
        carMap.put ("crv", "Honda");
        carMap.put("corolla", "Toyota");
        carMap.put("rav4", "Toyota");
        carMap.put("forester", "Subaru");
        carMap.put("outback", "Subaru");

        System.out.println("What model of car are you looking for?");
        String carModel = input.next();

        String make = carMap.get(carModel.toLowerCase());
        if(make == null){
            System.out.println("Sorry we don't have that");
        } else {
            System.out.println("Oh, you're looking for a " + carModel +"? Our " +  make + " selection is right over here...");
        }




//        switch(carModel){
//            case "Civic":
//                System.out.println("This mode is in our " + carMap.get("Civic") + " section...");
//                break;
//
//            case "CRV":
//                System.out.println("This mode is in our " + carMap.get("CRV") + " section...");
//                break;
//
//            case "Corolla":
//                System.out.println("This mode is in our " + carMap.get("Corolla") + " section...");
//                break;
//
//            case "RAV4":
//                System.out.println("That is in our " + carMap.get("RAV4") + " section...");
//                break;
//
//            case "Forester":
//                System.out.println("That is in our " + carMap.get("Forester") + " section...");
//                break;
//
//            case "Outback":
//                System.out.println("That is in our " + carMap.get("Outback") + " section...");
//                break;
//
//            default:
//                System.out.println("I'm sorry we don't have that model");
//
//        }










    }
}
