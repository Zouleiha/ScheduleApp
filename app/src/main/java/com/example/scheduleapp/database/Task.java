package com.example.scheduleapp.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Time;
import java.util.Date;

@Entity(tableName = "task_table")
public class Task {
    @PrimaryKey(autoGenerate = true)
    public long taskId;

    public String taskName;

    public String taskDescription;

    public Priority priority;

//    public Time Duration;
//
//    public Time startTime;
//
//    public Time stopTime;

    public Date dueDate;

    public Task(long taskId, String taskName, String taskDescription, Priority priority,/* Time duration, Time startTime, Time stopTime,*/ Date dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.priority = priority;
//        Duration = duration;
//        this.startTime = startTime;
//        this.stopTime = stopTime;
        this.dueDate = dueDate;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

//    public Time getDuration() {
//        return Duration;
//    }
//
//    public void setDuration(Time duration) {
//        Duration = duration;
//    }
//
//    public Time getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(Time startTime) {
//        this.startTime = startTime;
//    }
//
//    public Time getStopTime() {
//        return stopTime;
//    }
//
//    public void setStopTime(Time stopTime) {
//        this.stopTime = stopTime;
//    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", priority=" + priority +
//                ", Duration=" + Duration +
//                ", startTime=" + startTime +
//                ", stopTime=" + stopTime +
                ", dueDate=" + dueDate +
                '}';
    }

}
