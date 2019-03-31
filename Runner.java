package edu.dmacc.codedsm.hw14;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Runner {

    public static void main(String[] args) {



        Task task1 = new Task(1,"Implementation of CSS Bank VLANS", LocalDateTime.of(2019, 4, 9,07,00,00), LocalDateTime.of(2019, 4, 9, 9,00),"running",1,"Computer Networks");
        Task task2 = new Task(2,"Data analysis",LocalDateTime.of(2019, 4, 9,9,00,00), LocalDateTime.of(2019, 4, 9,11,00,00), "coming",2,"Database");
        List<Task> assignedTasks = new ArrayList<>();
        assignedTasks.add(task1);
        assignedTasks.add(task2);
        User user1 = new User("James"," IP Engineer",assignedTasks,true);
        User user2 = new User("Joe","Database Engineer",assignedTasks,true);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        TaskManager tasksManager = new TaskManager();
        tasksManager.assignTasksToUser(user1,assignedTasks);
        System.out.println("Show the user's tasks : " + user1.toString());
        System.out.println("User's first task starting time " + user1.getAssignedTasks().get(0).getStartDateTime());
        System.out.println("User's first task ending time " + user1.getAssignedTasks().get(0).getEndDateTime());
    }
}
