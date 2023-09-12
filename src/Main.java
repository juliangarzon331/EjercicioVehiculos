public class Main {
    public static void main(String[] args) {
        CarroNormal carroNormal = new CarroNormal("Toyota", "Corolla", 2000, "Manual", "Azul");
        CarroTurbo carroTurbo = new CarroTurbo("Ford", "Mustang", 3500, "Automática", "Rojo");
        Motocicleta motocicleta = new Motocicleta("Honda", "CBR 1000", 1000, "Manual", "Negro");
        int revolucionesPorMinuto = 3000;
        System.out.println("Potencia del Carro Normal: " + carroNormal.calcularPotencia(revolucionesPorMinuto));
        System.out.println("Potencia del Carro Turbo: " + carroTurbo.calcularPotencia(revolucionesPorMinuto));
        System.out.println("Potencia de la Motocicleta: " + motocicleta.calcularPotencia(revolucionesPorMinuto));

    }
}