package com.corenetworks.presentacion;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;
import com.corenetworks.modelo.InstrumentoMusical;

public class ProbarInstrumentosMusicales {
    public static void main(String[] args) {
        InstrumentoMusical guido=new Guitarra("Ferrari","largas");
        System.out.println(guido.emitirSonido());
        System.out.println(guido.toString());

        InstrumentoMusical bataca=new Bateria("Lambo",6);
        System.out.println(bataca.emitirSonido());
        System.out.println(bataca.toString());

        InstrumentoMusical ham= new Flauta("Kruger","vibratium");
        System.out.println(ham.emitirSonido());
        System.out.println(ham.toString());

        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos [0]=guido;
        instrumentos [1]=bataca;
        instrumentos [2]=ham;

        for (InstrumentoMusical elemento:instrumentos
             ) {
            System.out.println("Sonidos emitidos   "+ elemento.emitirSonido());
            System.out.println(elemento.toString());
        }
        for ( int i=0;i<instrumentos.length;i++){
            System.out.println(instrumentos[i].emitirSonido());
            System.out.println(instrumentos[i].toString());

        }
    }
}
