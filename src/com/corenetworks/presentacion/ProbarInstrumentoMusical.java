package com.corenetworks.presentacion;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;

public class ProbarInstrumentoMusical {
    public static void main(String[] args) {
        Guitarra g1=new Guitarra("leica","alambre");
        System.out.println("el tipo de sopnido es ;" + g1.emitirSonido());
        System.out.println(g1.toString());

        Bateria b1=new Bateria("Ferrari",15);
        System.out.println("el tipo de sonido es " + b1.emitirSonido());
        System.out.println(b1.toString());
        
        Flauta f1 =new Flauta("Lambo","adamantium");
        System.out.println("el tipo de sonido es " + f1.emitirSonido());
        System.out.println(f1.toString());
    }
}
