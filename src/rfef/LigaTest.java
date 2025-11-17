package rfef;

import java.time.LocalDate;
import java.util.Random;

public class LigaTest {

    public static void main(String[] args) {
        Random rand = new Random(); // Generador de números aleatorios para simular goles

       
        // CREAR EQUIPOS CON JUGADORES Y PORTEROS
      
        // Cada jugador inicia con 0 estadísticas para la simulación
        
        EquipoFutbol eq1 = new EquipoFutbol(
                "Real Madrid", "Madrid", "Bernabeu", LocalDate.of(1902,3,6),
                new EntrenadorMario(0,0,"Ancelotti",0),
                new PorteroMario(35,0,"Courtois"), // edad, porterías recibidas iniciales, nombre
                new DefensaMario("Alaba",0,0),
                new DefensaMario("Militao",0,0),
                new DefensaMario("Mendy",0,0),
                new DefensaMario("Carvajal",0,0),
                new CentrocampistaMario("Modric",0,0),
                new CentrocampistaMario("Kroos",0,0),
                new CentrocampistaMario("Camavinga",0,0),
                new DelanteroMario("Vinicius",0,0),
                new DelanteroMario("Rodrygo",0,0),
                new DelanteroMario("Benzema",0,0),
                0
        );

        // Crear los otros equipos con el mismo patrón
        
        EquipoFutbol eq2 = new EquipoFutbol(
                "Barcelona", "Barcelona", "Camp Nou", LocalDate.of(1899,11,29),
                new EntrenadorMario(0,0,"Xavi",0),
                new PorteroMario(31,0,"Ter Stegen"),
                new DefensaMario("Pique",0,0),
                new DefensaMario("Araujo",0,0),
                new DefensaMario("Alba",0,0),
                new DefensaMario("Dest",0,0),
                new CentrocampistaMario("Busquets",0,0),
                new CentrocampistaMario("De Jong",0,0),
                new CentrocampistaMario("Pedri",0,0),
                new DelanteroMario("Fati",0,0),
                new DelanteroMario("Dembele",0,0),
                new DelanteroMario("Lewandowski",0,0),
                0
        );

        EquipoFutbol eq3 = new EquipoFutbol(
                "Juventus", "Turin", "Allianz", LocalDate.of(1897,11,1),
                new EntrenadorMario(0,0,"Allegri",0),
                new PorteroMario(32,0,"Szczesny"),
                new DefensaMario("Bonucci",0,0),
                new DefensaMario("Chiellini",0,0),
                new DefensaMario("Danilo",0,0),
                new DefensaMario("Alex Sandro",0,0),
                new CentrocampistaMario("Locatelli",0,0),
                new CentrocampistaMario("Rabiot",0,0),
                new CentrocampistaMario("McKennie",0,0),
                new DelanteroMario("Vlahovic",0,0),
                new DelanteroMario("Chiesa",0,0),
                new DelanteroMario("Di Maria",0,0),
                0
        );

        EquipoFutbol eq4 = new EquipoFutbol(
                "Bayern", "Munich", "Allianz Arena", LocalDate.of(1900,2,27),
                new EntrenadorMario(0,0,"Nagelsmann",0),
                new PorteroMario(37,0,"Neuer"),
                new DefensaMario("Pavard",0,0),
                new DefensaMario("Upamecano",0,0),
                new DefensaMario("Davies",0,0),
                new DefensaMario("Kimmich",0,0),
                new CentrocampistaMario("Goretzka",0,0),
                new CentrocampistaMario("Musiala",0,0),
                new CentrocampistaMario("Sabitzer",0,0),
                new DelanteroMario("Sane",0,0),
                new DelanteroMario("Gnabry",0,0),
                new DelanteroMario("Harry kane",0,0),
                0
        );

        // VARIABLES PARA REGISTRAR GOLES RECIBIDOS POR CADA EQUIPO
        
        int golesRecibidosEq1 = 0;
        int golesRecibidosEq2 = 0;
        int golesRecibidosEq3 = 0;
        int golesRecibidosEq4 = 0;

      
        // SIMULAR TODOS LOS PARTIDOS
       
        // Se llama a simularPartido para cada enfrentamiento
        
        golesRecibidosEq1 = simularPartido(eq1, eq2, rand, golesRecibidosEq1, golesRecibidosEq2);
        golesRecibidosEq2 = simularPartido(eq2, eq1, rand, golesRecibidosEq2, golesRecibidosEq1);

        golesRecibidosEq1 = simularPartido(eq1, eq3, rand, golesRecibidosEq1, golesRecibidosEq3);
        golesRecibidosEq3 = simularPartido(eq3, eq1, rand, golesRecibidosEq3, golesRecibidosEq1);

        golesRecibidosEq1 = simularPartido(eq1, eq4, rand, golesRecibidosEq1, golesRecibidosEq4);
        golesRecibidosEq4 = simularPartido(eq4, eq1, rand, golesRecibidosEq4, golesRecibidosEq1);

        golesRecibidosEq2 = simularPartido(eq2, eq3, rand, golesRecibidosEq2, golesRecibidosEq3);
        golesRecibidosEq3 = simularPartido(eq3, eq2, rand, golesRecibidosEq3, golesRecibidosEq2);

        golesRecibidosEq2 = simularPartido(eq2, eq4, rand, golesRecibidosEq2, golesRecibidosEq4);
        golesRecibidosEq4 = simularPartido(eq4, eq2, rand, golesRecibidosEq4, golesRecibidosEq2);

        golesRecibidosEq3 = simularPartido(eq3, eq4, rand, golesRecibidosEq3, golesRecibidosEq4);
        golesRecibidosEq4 = simularPartido(eq4, eq3, rand, golesRecibidosEq4, golesRecibidosEq3);

        
        // ORDENAR EQUIPOS POR PUNTOS (clasificación)
     
        EquipoFutbol primero = eq1, segundo = eq2, tercero = eq3, cuarto = eq4;

        // Comparaciones para ordenar 
        
        if(segundo.getPuntos() > primero.getPuntos()) { EquipoFutbol tmp = primero; primero = segundo; segundo = tmp; }// Guarda el valor de 'primero' en una variable temporal 
        if(tercero.getPuntos() > primero.getPuntos()) { EquipoFutbol tmp = primero; primero = tercero; tercero = tmp; }// Asigna a 'primero' el valor que tenía 'segundo
        if(cuarto.getPuntos() > primero.getPuntos()) { EquipoFutbol tmp = primero; primero = cuarto; cuarto = tmp; }// Asigna a 'segundo' el valor original de 'primero' (guardado en 'tmp')

        if(tercero.getPuntos() > segundo.getPuntos()) { EquipoFutbol tmp = segundo; segundo = tercero; tercero = tmp; }
        if(cuarto.getPuntos() > segundo.getPuntos()) { EquipoFutbol tmp = segundo; segundo = cuarto; cuarto = tmp; }

        if(cuarto.getPuntos() > tercero.getPuntos()) { EquipoFutbol tmp = tercero; tercero = cuarto; cuarto = tmp; }

        
        // MOSTRAR CLASIFICACIÓN FINAL CON INDICACIÓN CAMPEÓN/DESCIENDE
        
        System.out.println("\nClasificación final:");
        System.out.println("1. " + primero.getNombreEquipo() + " (" + primero.getPuntos() + " pts) - Campeón");
        System.out.println("2. " + segundo.getNombreEquipo() + " (" + segundo.getPuntos() + " pts)");
        System.out.println("3. " + tercero.getNombreEquipo() + " (" + tercero.getPuntos() + " pts)");
        System.out.println("4. " + cuarto.getNombreEquipo() + " (" + cuarto.getPuntos() + " pts) - Desciende");

   
        // PICHICHI (máximo goleador)
     
        EquipoFutbol[] todos = {eq1, eq2, eq3, eq4};
        String pichichiNombre = eq1.getDelanteroCentro().getNombre();
        String pichichiEquipo = eq1.getNombreEquipo();
        int maxGoles = eq1.getDelanteroCentro().getGolesAnotados();

        // Comparar los delanteros centrales de todos los equipos
        for(EquipoFutbol eq : todos) {
            if(eq.getDelanteroCentro().getGolesAnotados() > maxGoles) {
                maxGoles = eq.getDelanteroCentro().getGolesAnotados();
                pichichiNombre = eq.getDelanteroCentro().getNombre();
                pichichiEquipo = eq.getNombreEquipo();
            }
        }

        System.out.println("\nPichichi: " + pichichiNombre + " (" + pichichiEquipo + ") con " + maxGoles + " goles");

        
        // DETERMINAR ZAMORA (portero del equipo con menos goles recibidos)
        
        EquipoFutbol zamoraEquipo = eq1;
        int minGolesRecibidos = golesRecibidosEq1;

        if(golesRecibidosEq2 < minGolesRecibidos) { zamoraEquipo = eq2; minGolesRecibidos = golesRecibidosEq2; }
        if(golesRecibidosEq3 < minGolesRecibidos) { zamoraEquipo = eq3; minGolesRecibidos = golesRecibidosEq3; }
        if(golesRecibidosEq4 < minGolesRecibidos) { zamoraEquipo = eq4; minGolesRecibidos = golesRecibidosEq4; }

        System.out.println("Zamora: " + zamoraEquipo.getPortero().getNombre() +
                " (" + zamoraEquipo.getNombreEquipo() + ") con " + minGolesRecibidos + " goles recibidos");
    }

    
    // MÉTODO PARA SIMULAR PARTIDO ENTRE DOS EQUIPOS
    
    public static int simularPartido(EquipoFutbol eq1, EquipoFutbol eq2, Random rand,
                                     int golesRecibidosEq1, int golesRecibidosEq2) {
        int goles1 = rand.nextInt(6); // goles aleatorios equipo 1
        int goles2 = rand.nextInt(6); // goles aleatorios equipo 2

        // Actualizar estadísticas de goles de los delanteros centrales
        
        eq1.getDelanteroCentro().setGolesAnotados(eq1.getDelanteroCentro().getGolesAnotados() + goles1);
        eq2.getDelanteroCentro().setGolesAnotados(eq2.getDelanteroCentro().getGolesAnotados() + goles2);

        // Sumar goles recibidos a cada equipo
        
        golesRecibidosEq1 += goles2;
        golesRecibidosEq2 += goles1;

        // Actualizar puntos según el resultado
        
        if(goles1 > goles2) 
        eq1.setPuntos(eq1.getPuntos() + 3);
        else if(goles2 > goles1) 
        eq2.setPuntos(eq2.getPuntos() + 3);
        else { eq1.setPuntos(eq1.getPuntos() + 1); 
        eq2.setPuntos(eq2.getPuntos() + 1); }

        // Mostrar resultado del partido
        
        System.out.println(eq1.getNombreEquipo() + " " + goles1 + " - " + goles2 + " " + eq2.getNombreEquipo());

        return golesRecibidosEq1; // devuelve actualización goles recibidos equipo 1
    }
}
