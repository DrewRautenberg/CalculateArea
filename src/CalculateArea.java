/* PROJECT:  CaculateArea
 * AUTHOR:  Drew Rautenberg    DESIGNER:  Dr. Kaminski
 * DESCRIPTION: This calculates the area of a square, circle, rectangle
 *      or triangle, depending on which the user specifies.  The user also
 *      specifies the appropriate dimensions.
 * NOTE:  Program uses OVERLOADED METHODS.
 *****************************************************************************/

import javax.swing.JOptionPane;

public class CalculateArea {

    public static void main(String[] args) {

//        char shape = getShapeFromUser();                  // S, C, R, T

        double side = 0;
        double radius = 0;
        double height = 0;
        double width = 0;
        double area = 0;

        // TO DO:  use a switch statement to:
        //          1) get appropriate dimensions from user - that is,
        //                  for Square:                side
        //                  for Circle:                radius
        //                  for Rectangle & Triangle:  length & width
        //          2) print dimensions to Console with labels
        // Some code to use inside switch - cut & paste as needed:
//        side   = Integer.parseInt(JOptionPane.showInputDialog(
//                        "Enter side"));
//        radius = Integer.parseInt(JOptionPane.showInputDialog(
//                        "Enter radius"));
//        height = Integer.parseInt(JOptionPane.showInputDialog(
//                        "Enter height"));
//        width  = Integer.parseInt(JOptionPane.showInputDialog(
//                        "Enter height"));
//        System.out.printf("side is %d\n", side);
//        System.out.printf("radius is %d\n", radius);
//        System.out.printf("height & width are %d and %d\n",
//                height, width);











        System.out.printf("Area is %.1f\n", area);
        System.exit(0);
    }
    //*************************************************************************
    // TO DO:  Write these methods:
    //          - getShapeFromUser
    //              (Capitalize it after getting shape from user to simplify
    //                  your switch)
    //          - findArea   2 OVERLOADED methods
    //              (Can't do 4 methods here because T & R take 2 parameters
    //                  while C & S take 1 parameter.  So how to differentiate?
    //                  Send in an extra char parameter to each, with the 
    //                  shape value - so method can differentiate).
    // FYI:  Math.PI is a constant for pi's value.





}