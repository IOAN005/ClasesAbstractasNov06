package com.corenetworks.modelo;

public class Bateria extends InstrumentoMusical{
    private int noPlatitos;


    @Override
    public String emitirSonido() {
        return "bam bam bam";
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "noPlatitos='" + noPlatitos + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Bateria() {
    }

    public Bateria(String marca, int noPlatitos) {
        super(marca);
        this.noPlatitos = noPlatitos;
    }

    public int getNoPlatitos() {
        return noPlatitos;
    }

    public void setNoPlatitos(int noPlatitos) {
        this.noPlatitos = noPlatitos;
    }
}
