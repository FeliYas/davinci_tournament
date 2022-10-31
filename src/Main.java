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

        Player profeSergio = new Player("sergio mediana", "arquero");
        Player estudianteThiago = new Player("sthiaho daun", "arquero");
        Player profeAgus = new Player("agus orosa", "defensor");
        Player profeSilvio = new Player("silvio salvio", "defensor");
        Player profeToro = new Player("vino toro", "medio");
        Player profeMessi = new Player("lio messi", "delantero");
        Player estudianteFeli = new Player("feli yas", "defensor");
        Player estudianteLucho = new Player("lucho cerru", "defensor");
        Player estudianteTute = new Player("jonata cornudo", "medio");
        Player estudianteDiego = new Player("diego marado", "delantero");



        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(profeSergio);
        profesPoo.addPlayer(profeAgus);
        profesPoo.addPlayer(profeSilvio);
        profesPoo.addPlayer(profeToro);
        profesPoo.addPlayer(profeMessi);


        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(estudianteThiago);
        estudiantesPoo.addPlayer(estudianteFeli);
        estudiantesPoo.addPlayer(estudianteLucho);
        estudiantesPoo.addPlayer(estudianteTute);
        estudiantesPoo.addPlayer(estudianteDiego);


        primerParcial.setLocalGoalCounter(0);
        primerParcial.setVisitantGoalCounter(0);

        System.out.println(primerParcial.generateMarker());
        primerParcial.makegoal(profesPoo, profesPoo.getPlayers().get(0));
        System.out.println(primerParcial.generateMarker());
    }




}
