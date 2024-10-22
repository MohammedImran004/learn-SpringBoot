package com.SpringBoot.learn_SpringBoot;

public class Course {
    private long id;
    private String name;
    public Course(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    
}
