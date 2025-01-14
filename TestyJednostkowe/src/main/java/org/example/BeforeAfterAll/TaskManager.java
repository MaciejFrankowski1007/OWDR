package org.example.BeforeAfterAll;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public boolean removeTaskById(int id){
        return tasks.removeIf(task -> task.getId() == id);
    }

    public void changeTaskStatus(int id, String newStatus){
        tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .ifPresent(task -> task.setStatus(newStatus));
    }

    public List<Task> getTasks(){
        return new ArrayList<>(tasks);
    }
}
