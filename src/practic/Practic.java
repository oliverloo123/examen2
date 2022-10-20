/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practic;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Practic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vt;
        double vc;
        String n;
        
        for (int i = l; i < 10; i++) {
            System.out.println("Ingrese nombre");
            n = sc.nextLine();
            System.out.println(n+"Ingrese el numero de sus ventas totales: ");
            vt = sc.nextInt();
            
            
            if (vt>= 1000000 && vt<= 3000000) {
                comi = venta *  0.03;
            } else if (venta > 3000000 && venta < 5000000) {
                comi = venta * 0.04;
            } else if (venta > 5000000 && venta < 7000000) {
                comi = venta * 0.05;
            }else if (venta > 7000000) {
                comi = venta* 0.06;

            } else {
                comi = 0;
            }
        }
        System.out.println("venta totales : "+ comi);

    }

}
