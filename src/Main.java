import java.util.Date;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Da Vinci Tournament");
        Date comienzoDeCursada = new Date(2022, 7, 18);
        comienzoDeCursada.setYear(2022);
        comienzoDeCursada.setMonth(7); //Enero 0, Agosto 7
        comienzoDeCursada.setDate(18);

        Date finDeCursada = new Date();
        finDeCursada.setYear(2022);
        finDeCursada.setMonth(11); //Enero 0, Dic 11
        finDeCursada.setDate(5);
        Date fechaParcial = new Date(2022,7,18);
        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri", comienzoDeCursada, finDeCursada);

        Match primerParcial = new Match("Aula 116", fechaParcial);

        Player profeSergio = new Player("sergio mediana", "aguatero");
        Player estudianteThiago = new Player("sthiaho", "aguatero");

        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(profeSergio);
        profesPoo.addPlayer(estudianteThiago);

        Team estudiantesPoo = new Team("Estudiantes POO");

        primerParcial.setLocalGoalCounter(0);
        primerParcial.setVisitantGoalCounter(0);
    }




}
