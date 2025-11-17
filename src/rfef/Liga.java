package rfef;

import java.util.Random;

/**
 * Liga con 4 equipos. Versión defensiva: evita NPEs y muestra mensajes claros.
 */
public class Liga {
    private EquipoFutbol Equipo1;
    private EquipoFutbol Equipo2;
    private EquipoFutbol Equipo3;
    private EquipoFutbol Equipo4;
    private final Random rnd = new Random();

    public Liga(EquipoFutbol Equipo1, EquipoFutbol Equipo2, EquipoFutbol Equipo3, EquipoFutbol Equipo4) {
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.Equipo3 = Equipo3;
        this.Equipo4 = Equipo4;
    }

    public void simularPartido(EquipoFutbol local, EquipoFutbol visitante) {
        if (local == null || visitante == null) {
            System.err.println("ERROR: Uno de los equipos es null. local=" + local + " visitante=" + visitante);
            return;
        }

        int golesLocal = rnd.nextInt(7);     // 0..4
        int golesVisitante = rnd.nextInt(7); // 0..4

        String nombreLocal = safeNombre(local);
        String nombreVisitante = safeNombre(visitante);

        System.out.println("====================================");
        System.out.println("Partido: " + nombreLocal + " vs " + nombreVisitante);
        System.out.println("Resultado: " + golesLocal + " - " + golesVisitante);

        if (golesLocal > golesVisitante) {
            System.out.println("Ganador: " + nombreLocal);
            local.setPuntos(local.getPuntos() + 3);
        } else if (golesVisitante > golesLocal) {
            System.out.println("Ganador: " + nombreVisitante);
            visitante.setPuntos(visitante.getPuntos() + 3);
        } else {
            System.out.println("Empate");
            local.setPuntos(local.getPuntos() + 1);
            visitante.setPuntos(visitante.getPuntos() + 1);
        }
        System.out.println();
    }

    public void listarPuntos() {
        System.out.println("====== CLASIFICACIÓN LIGA ======");
        printEquipoPuntos(Equipo1);
        printEquipoPuntos(Equipo2);
        printEquipoPuntos(Equipo3);
        printEquipoPuntos(Equipo4);
        System.out.println("================================");
    }

    private void printEquipoPuntos(EquipoFutbol e) {
        if (e == null) {
            System.out.println("Equipo null");
        } else {
            System.out.println(e.getNombreEquipo() + ": " + e.getPuntos() + " puntos");
        }
    }

    private String safeNombre(EquipoFutbol e) {
        if (e == null) return "null";
        String n = e.getNombreEquipo();
        return (n == null) ? "sin-nombre" : n;
    }

    // getters y setters
    public EquipoFutbol getEquipo1() { return Equipo1; }
    public void setEquipo1(EquipoFutbol equipo1) { Equipo1 = equipo1; }
    public EquipoFutbol getEquipo2() { return Equipo2; }
    public void setEquipo2(EquipoFutbol equipo2) { Equipo2 = equipo2; }
    public EquipoFutbol getEquipo3() { return Equipo3; }
    public void setEquipo3(EquipoFutbol equipo3) { Equipo3 = equipo3; }
    public EquipoFutbol getEquipo4() { return Equipo4; }
    public void setEquipo4(EquipoFutbol equipo4) { Equipo4 = equipo4; }

    @Override
    public String toString() {
        return "Liga [Equipo1=" + (Equipo1 == null ? "null" : Equipo1.getNombreEquipo()) +
               ", Equipo2=" + (Equipo2 == null ? "null" : Equipo2.getNombreEquipo()) +
               ", Equipo3=" + (Equipo3 == null ? "null" : Equipo3.getNombreEquipo()) +
               ", Equipo4=" + (Equipo4 == null ? "null" : Equipo4.getNombreEquipo()) + "]";
    }
}
