package com.company;

public class BaublePattern extends Pattern {

    public void pattern() {
        //Overrides the parent class, Pattern.
        //Inherits the stitches, short line stitch stitch and circle stitch from the objects created in the Pattern Class.
        //Uses the for loops the print out the pattern: --o--o--o--o--o
        for (int index = 1; index <= 5; index++) {
            {
                for (int y = 1; y <= 2; y++) {
                    sls.sew();
                }
                for(int x = 1; x <= 1; x++){
                    cs.sew();
                }
            }
        }
    }
}


