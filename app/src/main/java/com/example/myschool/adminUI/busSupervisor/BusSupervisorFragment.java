package com.example.myschool.adminUI.busSupervisor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myschool.R;
import com.example.myschool.SupervisorActivity;
import com.example.myschool.databinding.FragmentBusSupervisorsBinding;


public class BusSupervisorFragment extends Fragment {

    private TextView s1, s2;

    private FragmentBusSupervisorsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentBusSupervisorsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        s1 = root.findViewById(R.id.superVisor1);
        s2 = root.findViewById(R.id.superVisor2);

        s1.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), SupervisorActivity.class));
        });

        s2.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), SupervisorActivity.class));
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}