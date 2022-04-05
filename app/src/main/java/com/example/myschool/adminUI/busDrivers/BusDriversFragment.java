package com.example.myschool.adminUI.busDrivers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myschool.DriverActivity;
import com.example.myschool.R;
import com.example.myschool.databinding.FragmentBusDriversBinding;

import java.sql.Driver;


public class BusDriversFragment extends Fragment {

    private TextView driver1, driver2;


    private FragmentBusDriversBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentBusDriversBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        driver1 = root.findViewById(R.id.driver1);
        driver2 = root.findViewById(R.id.driver2);

        driver1.setOnClickListener(view -> {

            startActivity(new Intent(getActivity(), DriverActivity.class));

        });

        driver2.setOnClickListener(view -> {

            startActivity(new Intent(getActivity(), DriverActivity.class));

        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}