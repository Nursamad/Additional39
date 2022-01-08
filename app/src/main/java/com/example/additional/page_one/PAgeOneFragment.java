package com.example.additional.page_one;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.additional.R;
import com.example.additional.adapters.ImageAdapter;
import com.example.additional.databinding.FragmentPAgeOneBinding;

import java.util.ArrayList;

public class PAgeOneFragment extends Fragment {

    private FragmentPAgeOneBinding binding;
    private ImageAdapter adapter;
    private ArrayList<Integer> images = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPAgeOneBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ImageAdapter();
        loadList();
        adapter.setImages(images);
        binding.pageOneRv.setAdapter(adapter);

    }

    private void loadList() {
        for (int i = 0; i < 20; i++) {
            images.add(R.drawable.ic_launcher_background);
            images.add(R.drawable.ic_launcher_foreground);

        }
    }
}