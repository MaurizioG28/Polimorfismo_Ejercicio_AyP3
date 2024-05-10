package ar.edu.uba.fi;

public class HabitacionHotel extends Inmueble{
    private  int camas;


    public HabitacionHotel(int camas) {
        this.camas = camas;
    }

    private  Double calcularPrecioHabitacion(int dias){
        return (((double) (camas* (dias+ 500))));
    }
    @Override
    public Double alquilarPorDias(int dias) {
        return calcularPrecioHabitacion(dias);
    }
}
