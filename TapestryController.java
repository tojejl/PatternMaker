package com.company;


//for each make a for each loop to loop through each patterns to print the pattern blocks
//print a band of 8 pattern blocks wide and 3 rows tall
//leave a few lines blank
// pattern, print a band 6 pattern-blocks wide and 8 rows tall
//real ugly, must be a better way to print this. working on it, array list with for each loops.


public class TapestryController {

    public static void main(String[] args) {

        //Creates a new array object that stores the four distinctive patterns

        Pattern[] patternCollection = new Pattern[]{
                new CrossStitchWigglePattern(),
                new ZigZagLinePattern(),
                new BaublePattern(),
                new BlockyBaublePattern(),

        };

        //loops through the array and prints out the each pattern in a band of 8 patterns wide
        //and three rows tall
        for (int index = 0; index < patternCollection.length; index++) {
            for(int row = 0; row < 3; row++)
            {
                for (int column = 0; column <= 7; column++)
                    patternCollection[index].pattern();
                {
                    System.out.println();
                }
            }
        }

        System.out.println("\n" + "\n");
        //Loops through the array again creating another pattern sampler that is
        //6 patterns wide and 8 rows tall

        for(int index = 0; index < patternCollection.length; index++){
            for(int row = 0; row <= 7; row++)
            {
                for(int column = 0; column <=5; column++)
                    patternCollection[index].pattern();
                {
                    System.out.println();
                }
            }
        }
    }
}



















// end class TapestryController































































