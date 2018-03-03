/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_memoria_objetos;

/**
 *
 * @author Kevin Ortiz
 */
public class EVA1_2_MEMORIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//objetos al heap y se accede atraves de la direccion la cual esta almacenada en el stack
        int iOtroVal = 10;
        double dSalario = 500.50;
        Preuba pObj = new Preuba();//pobj es la referencia y el new crea el objeto
        System.out.println("iOtroVal = " + iOtroVal);
        System.out.println("dSalario = " + dSalario);
        System.out.println("pObj = " + pObj);//imprimie la direccion donde esta el objeto(direccion de memeoria
        System.out.println("Valor de iVal = " + pObj.iVal);
    }
    
}
class Preuba{
    int iVal = 5;
}