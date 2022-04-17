package com.example.scheduleapp.ui.tableview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.scheduleapp.databinding.FragmentTableviewBinding;

public class TableviewFragment extends Fragment {

    private FragmentTableviewBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TableviewViewModel tableviewViewModel =
                new ViewModelProvider(this).get(TableviewViewModel.class);

        binding = FragmentTableviewBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}