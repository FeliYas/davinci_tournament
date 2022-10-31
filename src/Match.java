import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;
    private Player team;
    private int setLocalGoalCounter;
    private int setVisitantGoalCounter;

    Match (){
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
    }

    Match(String location, Date date){
        this.setDate(date);
        this.setLocation(location);
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
    }
    Match(String location, Date date, Team localTeam, Team visitantTeam){
        this.setDate(date);
        this.setLocation(location);
        this.setLocalGoalCounter(0);
        this.setVisitantGoalCounter(0);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }



    public String generateMarker(){
        //return this.getLocalGoalCounter() + "-" + this.getVisitantGoalCounter();
        return String.format("%d - %d",
                this.getLocalTeam().getName(),
                this.getLocalGoalCounter(),
                this.getVisitantGoalCounter(),
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
    public void incrementLocalCounter(){
        this.localGoalCounter++;
    }


    public int getVisitantGoalCounter() {
        return visitantGoalCounter;
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }

    public int getLocalGoalCounter() {
        return localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }

    public Team getVisitantTeam() {
        return visitantTeam;
    }

    public void makegoal(Team profesPoo, Player player) {
        
        if (team.getName() == this.localTeam.getName()){
            this.setLocalGoalCounter++;
           
        }  
        if (team.getName() == this.getVisitantTeam().getName()){
            this.setVisitantGoalCounter++; 
        }
    }
    }
}
