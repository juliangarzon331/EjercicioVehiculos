public class CarroNormal extends Vehiculo implements CalculaPotencia{
    public CarroNormal(String marca, String referencia, int cilindraje, String tipoCaja, String color) {
        super(marca, referencia, cilindraje, tipoCaja, color);
        this.setTorque(160);
    }

    @Override
    public double calcularPotencia(int revolucionesPorMinuto) {
        return (getTorque() * revolucionesPorMinuto / 9.6) / 745.7;
    }
}
