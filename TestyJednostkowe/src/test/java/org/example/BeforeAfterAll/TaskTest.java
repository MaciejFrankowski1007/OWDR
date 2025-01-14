package org.example.BeforeAfterAll;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;

    @BeforeEach
    public void setUp(){
        task = new Task(1, "Task Task", "This is a test task", "pending");
    }

    @AfterEach
    public void tearDown(){
        task = null;
    }

    @Test
    public void testChangeStATUS(){
        task.changeStatus("in progress");
        assertEquals("in progress", task.getStatus(), "Status should be 'in progress'");
    }

    @Test
    public void testCompleteTask(){
        task.completeTast();
        assertEquals("completed", task.getStatus(), "Status should be 'completed");
    }

    @Test
    public void testInitialStatus(){
        assertEquals("pending", task.getStatus(), "Initial status should be 'pemding");
    }

}