package ar.edu.uba.fi;

public class Departamento extends Inmueble{
    private int  metrosCuadrados;

    public Departamento(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    private  Double calcularPrecioDepartamento(int dias){
        return (double) (dias * metrosCuadrados);

    }

    @Override
    public Double alquilarPorDias(int dias) {
        return calcularPrecioDepartamento(dias);
    }
}
