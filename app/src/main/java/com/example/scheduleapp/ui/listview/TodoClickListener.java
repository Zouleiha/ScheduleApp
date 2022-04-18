package com.example.scheduleapp.ui.listview;

import com.example.scheduleapp.database.Task;

public interface TodoClickListener {
    void  TodoClick(int adapterPosition, Task task);

    void TodoRadioButtonClick(Task task);
}
