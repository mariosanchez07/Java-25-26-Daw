package rfef;

import java.time.LocalDate;

public class EquipoFutbolTest {
    public static void main(String[] args) {
        // Entrenador
        EntrenadorMario entrenador = new EntrenadorMario(54, 39, "Pep Guardiola", 18);

        // Portero
        PorteroMario portero = new PorteroMario (33, 787, "Manuel Neuer" );

        // Defensssas
        DefensaMario central1 = new DefensaMario("Sergio Ramos", 39, 18);
        DefensaMario central2 = new DefensaMario("Gerard Piqué", 33, 7);
        DefensaMario interiorIzq = new DefensaMario("Jordi Alba", 32, 2);
        DefensaMario interiorDcha = new DefensaMario("Dani Carvajal", 30, 5);

        // Centrocampistas
        CentrocampistaMario centro1 = new CentrocampistaMario("Luka Modric", 41, 300);
        CentrocampistaMario centro2 = new CentrocampistaMario("Toni Kroos", 38, 400);
        CentrocampistaMario centro3 = new CentrocampistaMario("Casemiro", 39, 150);

        // Delanteros
        DelanteroMario extremoIzq = new DelanteroMario("Eden Hazard", 38, 140);
        DelanteroMario extremoDcha = new DelanteroMario("Lionel Messi", 39, 880);
        DelanteroMario delanteroCentro = new DelanteroMario("Karim Benzema", 37, 560);

        // Crear el equipo
        EquipoFutbol equipo = new EquipoFutbol(
                "Real Madrid",
                "Madrid",
                "Santiago Bernabéu",
                LocalDate.of(1902, 3, 6),
                entrenador,
                portero,
                central1,
                central2,
                interiorIzq,
                interiorDcha,
                centro1,
                centro2,
                centro3,
                extremoIzq,
                extremoDcha,
                delanteroCentro,
                0 // puntos iniciales
        );

        // Mostrar datos del equipo
        System.out.println("=== Datos del Equipo ===");
        System.out.println("Nombre del equipo: " + equipo.getNombreEquipo());
        System.out.println("Ciudad: " + equipo.getCiudad());
        System.out.println("Campo: " + equipo.getNombreCampo());
        System.out.println("Fecha de fundación: " + equipo.getFechaFundacion());
        System.out.println("Entrenador: " + equipo.getEntrenador().getNombre());
        System.out.println("Portero: " + equipo.getPortero().getNombre());
        System.out.println("Defensas: " +
                equipo.getCentral1().getNombre() + ", " +
                equipo.getCentral2().getNombre() + ", " +
                equipo.getInteriorDcha().getNombre() + ", " +
                equipo.getInteriorDcha().getNombre());
        System.out.println("Centrocampistas: " +
                equipo.getCentral1().getNombre() + ", " +
                equipo.getCentral2().getNombre() + ", " +
                equipo.getCentro3().getNombre());
        System.out.println("Delanteros: " +
                equipo.getExtremoIzq().getNombre() + ", " +
                equipo.getExtremoDcha().getNombre() + ", " +
                equipo.getDelanteroCentro().getNombre());
        System.out.println("Puntos: " + equipo.getPuntos());

        // Test setters: actualizar puntos y nombre
        equipo.setNombreCampo("Real Madrid CF");
        equipo.setPuntos(85);
        System.out.println("\n=== Después de actualizar ===");
        System.out.println("Nombre actualizado: " + equipo.getNombreEquipo());
        System.out.println("Puntos actualizados: " + equipo.getPuntos());

        // Test toString
        System.out.println("\n=== ToString del equipo ===");
        System.out.println(equipo);
    }
}
