import static org.junit.jupiter.api.Assertions.*;

import org.example.BeforeAfterAll.Task;
import org.example.BeforeAfterAll.TaskManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskManagerTest {

    private TaskManager taskManager;
    private Task task1;
    private Task task2;

    @BeforeEach
    public void setUp(){
        taskManager = new TaskManager();
        task1 = new Task(1, "Task 1", "Description to Task 1", "pending");
        task2 = new Task(2, "Task 2", "Description to Task 2", "pending");
        taskManager.addTask(task1);
        taskManager.addTask(task2);
    }

    @AfterEach
    public void tearDown(){
        taskManager = null;
        task1 = null;
        task2 = null;
    }

    @Test
    public void testAddTask(){
        Task newTask = new Task(3, "Task 3", "Description to Task 3", "pending");
        taskManager.addTask(newTask);
        assertEquals(3, taskManager.getTasks().size(), "Task count should be 3 after adding a new task");
        assertTrue(taskManager.getTasks().contains(newTask), "Task list should contain the new task");
    }

    @Test
    public void testRemoveTaskById(){
        boolean removed = taskManager.removeTaskById(1); // Corrected method name
        assertTrue(removed, "Task with id 1 should be removed");
        assertEquals(1, taskManager.getTasks().size(), "Task count should be 1 after removal");
        assertFalse(taskManager.getTasks().stream().anyMatch(task -> task.getId() == 1), "Task with id 1 should not be present");
    }

    @Test
    public void testChangeTaskStatus(){ // Corrected method name
        taskManager.changeTaskStatus(1,"completed");
        Task updatedTask = taskManager.getTasks().stream()
                .filter(task -> task.getId() == 1)
                .findFirst()
                .orElse(null);
        assertNotNull(updatedTask, "Task with id 1 should be present.");
        assertEquals("completed", updatedTask.getStatus(), "Task status should be 'completed'");
    }

    @Test
    public void testChangeStatusOfNonExistingTask(){
        taskManager.changeTaskStatus(999,"completed");
        assertEquals(2, taskManager.getTasks().size(), "Task count should remain 2.");
    }

}
