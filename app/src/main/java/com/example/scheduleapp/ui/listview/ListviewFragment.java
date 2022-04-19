package com.example.scheduleapp.ui.listview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.scheduleapp.R;
import com.example.scheduleapp.database.Priority;
import com.example.scheduleapp.database.Task;
import com.example.scheduleapp.databinding.FragmentListviewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class ListviewFragment extends Fragment {

    private FragmentListviewBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ListviewViewModel listviewViewModel =
                new ViewModelProvider(this).get(ListviewViewModel.class);

        binding = FragmentListviewBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}