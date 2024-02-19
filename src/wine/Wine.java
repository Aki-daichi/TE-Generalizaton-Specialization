/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wine;

/**
 *
 * @author dzaka
 */

// Abstract superclass Wine
public abstract class Wine {
public abstract String getName();
public abstract String getOrigin();
 
    public static void main(String[] args) {
     // Red Wine
     System.out.println("Red Wine:");
     RedWine cabarnet = new RedWine("Cabernet Sauvignon", "Napa Valley, US");
     RedWine shiraz = new RedWine("Shiraz", "Barossa Valley, Australia");
     RedWine pinotNoir = new RedWine("Pinot Noir", "Burgundy, France");

     System.out.println(cabarnet.getName() + " " + cabarnet.getOrigin());
     System.out.println(shiraz.getName() + " " + shiraz.getOrigin());
     System.out.println(pinotNoir.getName() + " " + pinotNoir.getOrigin());

     // White Wine
     System.out.println("\nWhite Wine:");
     WhiteWine chardonay = new WhiteWine("Chardonay", "Sonoma County, US");
     WhiteWine sauvignonb = new WhiteWine("Sauvignon Blanc", "Marlborough, NZ");
     WhiteWine riesling = new WhiteWine("Riesling", "Mosel, Germany");

     System.out.println(chardonay.getName() + " " + chardonay.getOrigin());
     System.out.println(sauvignonb.getName() + " " + sauvignonb.getOrigin());
     System.out.println(riesling.getName() + " " + riesling.getOrigin());
    }
}
