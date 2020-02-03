package fr.p10.miage.rps.model;

public enum RPSEnum {
    ROCK ("rock"),
    PAPER ("paper"),
    SCISSORS ("scissors");
    private String name;

    private RPSEnum(String n){
        this.name=n;
    }

    public String getName(){
        return this.name;
    }
}
