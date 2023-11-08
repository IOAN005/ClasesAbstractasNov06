package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;

public class ProbarPolimorfismo {
    public static void main(String[] args) {
        Gerente g1 =new Gerente("juan",2000,500);
        Empleado e1=new Gerente("poli",3000,700);
        System.out.println("Calcular nomina"+e1.calcularNomina());
        System.out.println(e1.toString());

        Gerente g2=(Gerente) e1;
        System.out.println("El bono es ->" + g2.getBono());

        Empleado e2= new Vendedor("Luis",1500,20000,0.01);
        System.out.println("calcula la nomina" + e2.calcularNomina());
        System.out.println(e2.toString());

        Empleado e3 =new Operador("Pedro",1000,1000,0.02);
        System.out.println("Calcular nomina "+ e3.calcularNomina());
        System.out.println(e3.toString());

        Empleado [] empleados = new Empleado[3] ;
        empleados[0]=e1;
        empleados[1]=e2;
        empleados[2]=e3;

        for (Empleado elementos:empleados
             ) {
            if (elementos instanceof Empleado){
                System.out.println("entra ele bucle --->");
            }
            if(elementos instanceof Gerente){
                System.out.println("bono ->" +((Gerente) elementos).getBono());
            }
            if (elementos instanceof Vendedor){
                System.out.println("ventas "+ ((Vendedor) elementos).getVentas());

            }
            if (elementos instanceof Operador){
                System.out.println("piezas" + ((Operador) elementos).getPiezas());
            }
            System.out.println("calcular nomina "+ elementos.calcularNomina());
            System.out.println(elementos.toString());
        }

    }
}
