package com.example.myschool.bsSupervisorUI.reports;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myschool.ChildList;
import com.example.myschool.R;
import com.example.myschool.databinding.FragmentReportsBinding;

public class ReportsFragment extends Fragment {

    private FragmentReportsBinding binding;
    private TextView s1, s2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentReportsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        s1 = root.findViewById(R.id.report1);
        s2 = root.findViewById(R.id.report2);

        s1.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), ChildList.class));
        });
        s2.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), ChildList.class));
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}