public class CarroTurbo extends Vehiculo implements CalculaPotencia {
    public CarroTurbo(String marca, String referencia, int cilindraje, String tipoCaja, String color) {
        super(marca, referencia, cilindraje, tipoCaja, color);
        this.setTorque(200); // Torque para carro turbo
    }


    @Override
    public double calcularPotencia(int revolucionesPorMinuto) {
        double potencia = (getTorque() * revolucionesPorMinuto / 9.6) / 745.7;
        return potencia * 1.12;
    }
}
