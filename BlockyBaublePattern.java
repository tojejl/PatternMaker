package com.company;

public class BlockyBaublePattern extends Pattern {
    //Overrides the parent class, Pattern.
    //Inherits the stitches, short line stitch stitch and circle stitch from the objects created in the Pattern Class.
    //Uses the for loops the print out the pattern: []--o--[]--o--[]--o--
    public void pattern() {
        for(int index= 1; index <= 3; index++)
        {
            for (int w = 1; w <= 1; w ++) {
                bs.sew();
                {
                    for (int y = 1; y <= 2; y++) {
                        sls.sew();
                    }
                    for(int z = 1; z <= 1; z++){
                        cs.sew();
                    }
                    for(int z = 1; z <= 2; z++){
                        sls.sew();
                    }
                }
            }
        }
    }
}



