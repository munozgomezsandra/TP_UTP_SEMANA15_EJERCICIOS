package Modelo;

public class Nave {

    private int capacidadTripulantes;
    private String modelo;
    private String nombreNave;

    public Nave(int capacidadTripulantes, String modelo, String nombreNave) {
        this.capacidadTripulantes = capacidadTripulantes;
        this.modelo = modelo;
        this.nombreNave = nombreNave;
    }

    public int getCapacidadTripulantes() {
        return capacidadTripulantes;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    @Override
    public String toString() {
        return "Nave: " + nombreNave + " (modelo " + modelo + ") - "
                + capacidadTripulantes + " tripulantes";
    }
}