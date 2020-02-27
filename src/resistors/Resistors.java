/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistors;

import javax.swing.JOptionPane;

/**
 *
 * @author omsay9559
 */
public class Resistors {
    private static int FirstBand;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("first band ");
    }
    public static int FirstBand () {
        String myInput;
       
         //collect phrase from user
        myInput = JOptionPane.showInputDialog("Please enter the first band's colour");
        //Convert all characters to uppercase, remove all spaces 
        myInput=myInput.toUpperCase();
        
        switch (myInput) {
            case "BLACK":
                FirstBand=0;
                break;
            case "BROWN":
                FirstBand=1;
                break;
            case "RED":
                FirstBand=2;
                break;
            case "ORANGE":
                FirstBand=3;
                break;
            case "YELLOW":
                FirstBand=4;
                break;
            case "GREEN":
                FirstBand=5;
                break;
            case "BLUE":
                FirstBand=6;
                break;
            case "VIOLET":
                FirstBand=7;
                break;
            case "GREY":
                FirstBand=8;
                break;
            case "WHITE":
                FirstBand=9;
                break;
        }
        return FirstBand;
        
    }
}
