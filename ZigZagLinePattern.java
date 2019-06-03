package com.company;

public class ZigZagLinePattern extends Pattern {

    //Overrides the parent class, Pattern.
    //Inherits the stitches, zigzag line stitch and fill stitch from the objects created in the Pattern Class.
    //Uses the for loops the print out the pattern: ZZZ===ZZZ===
    public void pattern() {
        for (int x = 1; x <= 2; x++)
        {
            for (int y = 1; y <= 3; y++) {
                zzs.sew();
            }
            for( int index = 1; index <=3; index++){
                fs.sew();
            }
        }
    }
}







