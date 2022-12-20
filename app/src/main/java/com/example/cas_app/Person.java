package com.example.cas_app;

public class Person {
    private String name;
    private String subject;
    private String timestart;
    private String timeend;

    public Person(String name, String subject,  String timestart,String timeend) {
        this.subject = subject;
        this.name = name;
        this.timestart = timestart;
        this.timeend = timeend;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestart() {
        return timestart;
    }

    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }

    public String getTimeend() {
        return timeend;
    }

    public void setTimeend(String timeend) {
        this.timeend = timeend;
    }
}
