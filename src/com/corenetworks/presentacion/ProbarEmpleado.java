package com.corenetworks.presentacion;

import com.corenetworks.modelo.Gerente;
import com.corenetworks.modelo.Operador;
import com.corenetworks.modelo.Vendedor;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Gerente g1=new Gerente("Juan",2000,500);
        System.out.println("La nomina es :"+g1.calcularNomina());
        System.out.println(g1.toString());
        Vendedor v1=new Vendedor("Pepe",1500,3000,0.3);
        System.out.println("La nomina es :" + v1.calcularNomina());
        System.out.println(v1.toString());
        Operador o1=new Operador("Maria",1100,300,600);
        System.out.println("la nomina es :"+ o1.calcularNomina());
        System.out.println(o1.toString());


    }
}
