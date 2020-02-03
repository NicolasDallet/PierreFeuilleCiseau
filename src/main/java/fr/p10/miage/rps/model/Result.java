package fr.p10.miage.rps.model;

public enum Result {
    WIN ("Win"),
    LOST ("Lost"),
    TIE ("TIE");
    private String name ;

    private Result (String n){
        this.name=n;
    }

    public String getName(){
        return this.name;
    }
}
