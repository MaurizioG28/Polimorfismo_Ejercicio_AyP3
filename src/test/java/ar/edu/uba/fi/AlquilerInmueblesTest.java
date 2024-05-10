package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlquilerInmueblesTest {
    @Test
    public void test01AlAlquilarHabitacionHotelPorDiezDiasConCincoCamas() {
        int camas = 5;
        int dias = 10;
        HabitacionHotel hotel = new HabitacionHotel(camas);

        Double valor = hotel.alquilarPorDias(dias);

        assertEquals((camas*(dias+500)), valor);
    }

    @Test
    public void test02AlAlquilarHabitacionHotelDeUnaCamaPorUnDia() {
        int camas = 1;
        int dias = 1;
        HabitacionHotel hotel = new HabitacionHotel(camas);

        Double valor = hotel.alquilarPorDias(dias);

        assertEquals((camas*(dias+500)), valor);
    }
    @Test
    public void test03AlAlquilarCabañaParaCincoPersonasporCincoDias() {
        int dias = 1;
        int inquilinos = 5;
        Cabaña cabaña = new Cabaña(inquilinos);

        Double valor = cabaña.alquilarPorDias(dias);

        assertEquals(((dias * inquilinos * inquilinos)), valor);
    }

    @Test
    public void test04AlAlquilarDepartamentoDe10m2PorDiezDIas() {
        int dias = 10;
        int metrosCuadrados = 5;
        Departamento departamento = new Departamento(metrosCuadrados);

        Double valor = departamento.alquilarPorDias(dias);

        assertEquals( (dias * metrosCuadrados), valor);
    }




}
