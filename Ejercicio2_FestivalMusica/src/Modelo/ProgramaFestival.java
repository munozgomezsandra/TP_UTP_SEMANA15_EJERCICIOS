package Modelo;

public class ProgramaFestival {

    private Presentacion[] presentaciones;
    private int contador;

    public ProgramaFestival(int capacidad) {
        presentaciones = new Presentacion[capacidad];
        contador = 0;
    }

    public Presentacion[] obtenerTodas() {
        Presentacion[] resultado = new Presentacion[contador];

        for (int i = 0; i < contador; i++) {
            resultado[i] = presentaciones[i];
        }

        return resultado;
    }

    public boolean agregar(Presentacion p) {
        if (contador < presentaciones.length) {
            presentaciones[contador] = p;
            contador++;
            return true;
        }

        return false;
    }

    public int calcularDuracionTotal() {
        int total = 0;

        for (int i = 0; i < contador; i++) {
            total += presentaciones[i].getDuracionMinutos();
        }

        return total;
    }

    public String listar() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < contador; i++) {
            sb.append(i + 1)
              .append(". ")
              .append(presentaciones[i].getCodigo())
              .append(" - ")
              .append(presentaciones[i].getBanda().getNombre())
              .append(" - ")
              .append(presentaciones[i].getDuracionMinutos())
              .append(" min\n");
        }

        sb.append("Duración total: ")
          .append(calcularDuracionTotal())
          .append(" min");

        return sb.toString();
    }
}