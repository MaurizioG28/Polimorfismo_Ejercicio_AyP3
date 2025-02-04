package ar.edu.uba.fi;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();


    public void registrarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                throw new VehiculoYaRegistradoException();
            }
        }
        vehiculos.add(unVehiculo);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Double calcularAlquilerParaCliente(Cliente unCliente) {
        for (Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente.calcularPrecioAlquileres();
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public void registrarAlquiler(Cliente unCliente, Vehiculo unVehiculo, int dias) {
        Cliente cliente = buscarCliente(unCliente);
        Vehiculo vehiculo = buscarVehiculo(unVehiculo);

        cliente.registrarAlquiler(vehiculo, dias);
    }

    private Vehiculo buscarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                return vehiculo;
            }
        }
        throw new VehiculoNoRegistradoException();
    }

    private Cliente buscarCliente(Cliente unCliente) {
        for(Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente;
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public Double calcularAlquilerTotal() {
        double suma = 0;
        for(Cliente cliente: clientes){
            suma += cliente.calcularPrecioAlquileres();
        }
        return suma;
    }
}
