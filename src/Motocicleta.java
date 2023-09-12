public class Motocicleta extends Vehiculo implements CalculaPotencia{
    public Motocicleta(String marca, String referencia, int cilindraje, String tipoCaja, String color) {
        super(marca, referencia, cilindraje, tipoCaja, color);
        this.setTorque(50); // Torque para motocicleta
    }

    @Override
    public double calcularPotencia(int revolucionesPorMinuto) {
        return (getTorque() * revolucionesPorMinuto / 9.8) / 745.7;
    }
}
