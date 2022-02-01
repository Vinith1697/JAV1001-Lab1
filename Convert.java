/*Name: Vinith Nair
Student number: A00241282
Program description: This code that allows a user to convert between different forms of measurement. */
import java.util.*;
import java.io.*;
import java.lang.*;

class Convert {
    public static void main(String[] args) {

        // Creating a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        //taking value as input
        System.out.println("Enter a value to convert:");
        int value = sc.nextInt();


        Scanner sc2 = new Scanner(System.in);
        //taking measurement unit as input
        System.out.println("Enter the current unit of measure");
        String unit = sc2.nextLine();

        switch (unit){
          case "km":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else {
            //conversion of km to mi
            double mi = 0.0d;
            mi = value*0.62;
            System.out.println(value + "km is equal to "+mi+" mi");
          }
          break;

          case "mi":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else {
            //conversion of mi to km
            double km = 0.0d;
            km = value*1.61;
            System.out.println(value + "mi is equal to "+km+" km");
          }
          break;

          case "in":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of in to cm
            double cm = 0.0d;
            cm = value*0.39;
            System.out.println(value + "in is equal to "+cm+" cm");
          }
          break;

          case "cm":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of cm to in
            double in = 0.0d;
            in = value*2.54;
            System.out.println(value + "cm is equal to "+in+" in");
          }
          break;

          case "lb":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of lb to kg
            double kg = 0.0d;
            kg = value*2.2;
            System.out.println(value + "lb is equal to "+kg+" kg");
          }
          break;

          case "kg":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of kg to lb
            double lb = 0.0d;
            lb = value*2.2;
            System.out.println(value + "kg is equal to "+lb+" lb");
          }
          break;

          case "g":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of g to oz
            double oz = 0.0d;
            oz = value*28.35;
            System.out.println(value + "g is equal to "+oz+" oz");
          }
          break;

          case "oz":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of oz to g
            double g = 0.0d;
            g = value*0.04;
            System.out.println(value + "oz is equal to "+g+" g");
          }
          break;

          case "C":
          //conversion of C to F
          double F = 0.0d;
          F = (value*(9/5))+32;
          System.out.println(value + "C is equal to "+F+" F");
          break;

          case "F":
          //conversion of F to C
          double C = 0.0d;
          C = (value - 32)*(5/9);
          System.out.println(value + "F is equal to "+C+" C");
          break;

          case "L":
          if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of L to cups
            double cup = 0.0d;
            cup = value*4.17;
            System.out.println(value + "L is equal to "+cup+" cup");
          }
          break;

          case "cup":
            if(value <= 0){
            System.out.println("Enter a positive value");
          }
          else{
            //conversion of cups to L
            double L = 0.0d;
            L = value*0.24;
            System.out.println(value + "cup is equal to "+L+" L");
          }
          break;

          default:
            System.out.println("You have not enterred a valid input. Please try again");
        }

    }
}
