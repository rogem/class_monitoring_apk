package com.example.cas_app;
public class Personn {
    private String namee;
    private String timeinout;
    private String time;
    private String datee;

    public Personn(String namee, String timeinout,  String time,String datee) {
        this.timeinout = timeinout;
        this.namee = namee;
        this.time = time;
        this.datee = datee;
    }

    public String getTimeinout() {
        return timeinout;
    }

    public void setTimeinout(String timeinout) {
        this.timeinout = timeinout;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDatee() {
        return datee;
    }

    public void setDatee(String datee) {
        this.datee = datee;
    }
}
