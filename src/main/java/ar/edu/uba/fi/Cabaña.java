package ar.edu.uba.fi;

public class Cabaña extends Inmueble{
    private int inquilinos;

    public Cabaña(int inquilinos){
        this.inquilinos = inquilinos;
    }
    private  Double calcularPrecioCabania(int dias){
        return (double) (dias *  Math.pow(inquilinos,2));

    }


    @Override
    public Double alquilarPorDias(int dias) {
        return calcularPrecioCabania(dias);
    }
}
