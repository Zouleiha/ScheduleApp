package com.example.scheduleapp.database;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class TaskRepository {
    private final TaskDao taskDao;
    private final LiveData<List<Task>> allTasks;

    public TaskRepository(Application application){
        TaskDatabase database = TaskDatabase.getDatabase(application);
        taskDao = database.taskDao();
        allTasks = taskDao.getTasks();
    }

    public LiveData<List<Task>> getAllTasks(){
        return allTasks;
    }

    public void insert(Task task){
        TaskDatabase.databaseWriterExecutor.execute(() -> taskDao.insertTask(task));
    }

    public LiveData<Task> get(long id){ return taskDao.get(id);}

    public void update(Task task){
        TaskDatabase.databaseWriterExecutor.execute(() -> taskDao.update(task));
    }

    public void delete(Task task){
        TaskDatabase.databaseWriterExecutor.execute(() -> taskDao.delete(task));
    }

}
