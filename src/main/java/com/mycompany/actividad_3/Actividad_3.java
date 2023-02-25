package com.mycompany.actividad_3;
public class Actividad_3 {

    public static void main(String[] args) {
        double neto,bruto,impuesto;                   
        bruto=48*5000;
        impuesto=bruto*0.125;
        neto=bruto-impuesto;
        
        System.out.println("Salario bruto: " + bruto);
        System.out.println("Retención en la fuente: " + impuesto);
        System.out.println("Salario neto: " + neto);
    }
}
