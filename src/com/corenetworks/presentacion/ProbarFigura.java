package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarFigura {
    public static void main(String[] args) {
       //ne se puede instanciar porque es abstracta
        // Figura f1 =new Figura() ;
        Rectangulo r1=new Rectangulo(0,0,4,2);
        System.out.println("Area rectangulo es :" + r1.calcularArea());
        System.out.println(r1.toString());
        Circulo c1 =new Circulo(4,4,2);
        System.out.println("Area del circulo es :" + c1.calcularArea());
        System.out.println(c1.toString());

        Triangulo tMediano =new Triangulo(2,2,6,9);
        System.out.println("Area triangulo es ->" +tMediano.calcularArea());
        System.out.println(tMediano.toString());

        Cuadrado cPequeno = new Cuadrado(2,2,6);
        System.out.println("Area del cuadrado es ->" + cPequeno.calcularArea());
        System.out.println(cPequeno.toString());

        Figura [] figuras =new Figura[2];
        figuras[0]= tMediano;
        figuras[1]=cPequeno;

        for (Figura elemento:figuras
             ) {
            if (elemento instanceof Cuadrado){
                System.out.println("muestra el lado" +((Cuadrado) elemento).getLado());
            }
            if (elemento instanceof Triangulo){
                System.out.println("Altura" +  ((Triangulo) elemento).getAltura() + "base" + ((Triangulo) elemento).getBase());
            }
            System.out.println("El Area es -> "+ elemento.calcularArea());
            System.out.println(elemento.toString());

        }





    }


}
