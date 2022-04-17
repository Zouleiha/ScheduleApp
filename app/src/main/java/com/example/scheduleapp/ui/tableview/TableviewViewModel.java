package com.example.scheduleapp.ui.tableview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TableviewViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TableviewViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is tableview fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}