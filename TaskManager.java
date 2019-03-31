package edu.dmacc.codedsm.hw14;

import java.util.List;

public class TaskManager {

    private String name;
    private String title;


    public TaskManager() {
        this.name = "Gabi";
        this.title = "IT Adminstrator";
    }

    public TaskManager(String name, String title) {
        this.name = name;
        this.title = title;
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

    @Override
    public String toString() {
        return "TaskManager{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static void assignTasksToUser(User user, List<Task> Task){

        user.setAssignedTasks(Task);
    }
}
