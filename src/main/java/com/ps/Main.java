package com.ps;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main {

    static Candy[] inventory = new Candy[100];

    public static void main(String[] args) {
        //class for candy with properties(name, price, flavor, quantity
        // inventory array to store em in
        // ------ above is done -----
        // read candy from a file
        // create candy and write it to file

        //plan, do it, refactor
        try {
            BufferedReader br = new BufferedReader(new FileReader("candies.csv"));
            // read the header line
            String header = br.readLine();
            String input;
            while((input = br.readLine() )!= null)
            {
                System.out.println(input);
                String [] candyArr = input.split("\\|");
                // System.out.println(Arrays.toString(candy));
                String name = candyArr[0];
                float price = Float.parseFloat(candyArr[1]);
                String flavor = candyArr[2];
                short quant = Short.parseShort(candyArr[3]);
                Candy candy = new Candy(name, price, flavor, quant);
                int nextEmptyIndex = inventory.length;
                inventory[nextEmptyIndex] = candy;
                //keep reading until its null then stop
                //Warheads|1.89|Sour|371
                //ChiliCrush|2.99|Spicy|300

            }

            // loop every line
            // add each piece to our array
        }
        catch(Exception e) {
            e.printStackTrace();

        }
    }
}
