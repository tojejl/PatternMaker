package com.company;

public class CrossStitchWigglePattern extends Pattern {

    public void pattern() {
        //overrides the parent class, Pattern
        //Inherits the stitches, Small cross stitch and Large cross stitch from the objects created in the Pattern Class.
        //Uses the for loops the print out the pattern: xXxXxXxXxX
        //loops through the cross stitch objects to create the Cross Stitch Wiggle Pattern
        for (int index = 0; index <= 4; index++)
        {
            for (index = 0; index <= 4; index++)
            {
                scs.sew();
                lcs.sew();
            }
        }

    }
}


