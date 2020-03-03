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
    private static int SecondBand;
     private static int ThirdBand;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("first band ");
        //System.out.println(""+ FirstBand);
        //FirstBand();
//    System.out.println(""+ FirstBand());
//    System.out.println(""+ SecondBand());
//    System.out.println(""+ ThirdBand());
        int band1=FirstBand();
        int band2= SecondBand();
        int band3 = ThirdBand();
        int bandValue = (((band1*10)+band2)*10^band3);
        System.out.println(""+ bandValue);
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
    
    public static int SecondBand () {
        String myInput;
       
         //collect phrase from user
        myInput = JOptionPane.showInputDialog("Please enter the second band's colour");
        //Convert all characters to uppercase, remove all spaces 
        myInput=myInput.toUpperCase();
        
        switch (myInput) {
            case "BLACK":
                SecondBand=0;
                break;
            case "BROWN":
                SecondBand=1;
                break;
            case "RED":
                SecondBand=2;
                break;
            case "ORANGE":
                SecondBand=3;
                break;
            case "YELLOW":
                SecondBand=4;
                break;
            case "GREEN":
                SecondBand=5;
                break;
            case "BLUE":
                SecondBand=6;
                break;
            case "VIOLET":
                SecondBand=7;
                break;
            case "GREY":
                SecondBand=8;
                break;
            case "WHITE":
                SecondBand=9;
                break;
        }
        return SecondBand;
        
    }
    
    public static int ThirdBand () {
        String myInput;
       
         //collect phrase from user
        myInput = JOptionPane.showInputDialog("Please enter the Third band's colour");
        //Convert all characters to uppercase, remove all spaces 
        myInput=myInput.toUpperCase();
        
        switch (myInput) {
            case "BLACK":
                ThirdBand=0;
                break;
            case "BROWN":
                ThirdBand=1;
                break;
            case "RED":
                ThirdBand=2;
                break;
            case "ORANGE":
                ThirdBand=3;
                break;
            case "YELLOW":
                ThirdBand=4;
                break;
            case "GREEN":
                ThirdBand=5;
                break;
            case "BLUE":
                ThirdBand=6;
                break;
            case "VIOLET":
                ThirdBand=7;
                break;
            case "GREY":
                ThirdBand=8;
                break;
            case "WHITE":
                ThirdBand=9;
                break;
        }
        return ThirdBand;
        
    }
}
