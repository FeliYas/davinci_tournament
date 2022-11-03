import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;
    private MatchResult result;
    private Player team;
    private int setLocalGoalCounter;
    private int setVisitantGoalCounter;
    private Player player;

    Match (){ this.result = new MatchResult();
    }

    Match(String location, Date date){
        this.result = new MatchResult();
        this.setDate(date);
        this.setLocation(location);


    }
    Match(String location, Date date, Team localTeam, Team visitantTeam){
        this.result = new MatchResult();
        this.setDate(date);
        this.setLocation(location);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }
    public void makegoal(Team team, Player player) {
        this.player = player;
        this.result.incrementLocalCounter();

        if (team.getName() == this.getLocalTeam().getName()){
            this.result.incrementLocalCounter();

        }
        if (team.getName() == this.getVisitantTeam().getName()){
            this.result.incrementVisitantCounter();
        }
    }
    public String generateMarker(){
        //return this.getLocalGoalCounter() + "-" + this.getVisitantGoalCounter();
        return String.format("%d - %d",
                this.getLocalTeam().getName(),
                this.result.generateMarker(),
                this.getVisitantTeam().getName()
        );
    }


    public void setLocation(String location){
        this.location = location;
        return;
    }
    public String getLocation(){
        return this.location;
    }

    public void setDate(Date date){
        this.date = date;
        return;
    }
    public Date getdate(){
        return this.date;
    }
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
    }
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
    }
    public Team getLocalTeam(){
        return this.localTeam;
    }


    public Team getVisitantTeam() {
        return visitantTeam;
    }


    }

