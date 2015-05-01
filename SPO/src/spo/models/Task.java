package spo.models;

public class Task {
    public long id = -1;
    public String name;
    public String description;
    public long start = -1; //start time in milliseconds since epoch (Date.getTime())
    public long end = -1;
}
