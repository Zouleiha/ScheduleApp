package com.example.scheduleapp.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Time;
import java.util.Date;

@Entity(tableName = "task_table")
public class Task {
    @PrimaryKey(autoGenerate = true)
    protected long taskId;

    protected String taskName;

    protected String taskDescription;

    protected Priority priority;

    protected Date Duration;

    protected Date startTime;

    protected Date stopTime;

    protected Date dueDate;

    protected boolean  isDone;

    public Task(String taskName, String taskDescription, Priority priority, Date duration, Date startTime, Date stopTime, Date dueDate, boolean  isDone) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.priority = priority;
        Duration = duration;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.dueDate = dueDate;
        this.isDone = isDone;
    }

    public Task() {
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

    public Date getDuration() {
        return Duration;
    }

    public void setDuration(Date duration) {
        Duration = duration;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", priority=" + priority +
                ", Duration=" + Duration +
                ", startTime=" + startTime +
                ", stopTime=" + stopTime +
                ", dueDate=" + dueDate +
                ", isDone=" + isDone +
                '}';
    }
}
