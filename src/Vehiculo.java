public abstract class Vehiculo {

    private String marca;
    private String referencia;
    private int cilindraje;
    private String tipoCaja;
    private String color;
    private double torque;

    // Constructor para inicializar los atributos comunes
    public Vehiculo(String marca, String referencia, int cilindraje, String tipoCaja, String color) {
        this.marca = marca;
        this.referencia = referencia;
        this.cilindraje = cilindraje;
        this.tipoCaja = tipoCaja;
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public String getColor() {
        return color;
    }

    public double getTorque() {
        return torque;
    }

}
