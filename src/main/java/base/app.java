package base;
import com.sun.security.jgss.GSSUtil;

import java.text.DecimalFormat;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.00");

        //Input
        System.out.print("Enter the price of item 1: ");
        int price1 = newScan.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = newScan.nextInt();

        System.out.print("Enter the price of item 2: ");
        int price2 = newScan.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = newScan.nextInt();

        System.out.print("Enter the price of item 3: ");
        int price3 = newScan.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = newScan.nextInt();

        //Calculations
        double subtotal = (double)(price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        //Output
        System.out.println("$" + numFormat.format(subtotal));
        System.out.println("$" + numFormat.format(tax));
        System.out.println("$" + numFormat.format(total));
    }

}
