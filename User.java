package edu.dmacc.codedsm.hw14;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String title;
    private List<Task> AssignedTasks;
    private boolean active;

    public User() {
        this.name = "";
        this.title ="";
        this.AssignedTasks = new ArrayList<>();
        this.active = false;

    }

    public User(String name, String title, List<Task> assignedTasks, boolean active) {
        this.name = name;
        this.title = title;
        AssignedTasks = assignedTasks;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Task> getAssignedTasks() {
        return AssignedTasks;
    }

    public void setAssignedTasks(List<Task> assignedTasks) {
        AssignedTasks = assignedTasks;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", AssignedTasks=" + AssignedTasks +
                ", active=" + active +
                '}';
    }

}
