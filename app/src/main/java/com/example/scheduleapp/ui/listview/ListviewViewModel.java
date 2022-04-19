package com.example.scheduleapp.ui.listview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.scheduleapp.database.Task;
import com.example.scheduleapp.database.TaskRepository;

import java.util.List;

public class ListviewViewModel extends AndroidViewModel {

    private final LiveData<List<Task>> allTasks;
    public static TaskRepository repository;

    public ListviewViewModel(@NonNull Application application) {
        super(application);
        repository = new TaskRepository(application);
        allTasks = repository.getAllTasks();
        //mText.setValue("This is listview fragment");
    }

    public LiveData<List<Task>> getAllTasks() {
        return allTasks;
    }
    public static void insert(Task task){repository.insert(task);}
    public LiveData<Task> get(long id) {return repository.get(id); }
    public static void update(Task task){ repository.update(task); }
    public static void  delete(Task task) {repository.delete(task);}

}