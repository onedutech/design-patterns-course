package com.onedutech.dp.creation.singleton.example;

public class ThreadTask extends Thread {
    private final String taskName;

    public ThreadTask(String taskName) {
        this.taskName = taskName;
    }
    
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        singleton.traiter(taskName);
    }
}
