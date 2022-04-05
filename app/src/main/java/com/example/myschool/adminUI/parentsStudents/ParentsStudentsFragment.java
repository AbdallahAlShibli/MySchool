package com.example.myschool.adminUI.parentsStudents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myschool.FatherActivity;
import com.example.myschool.R;
import com.example.myschool.databinding.FragmentParentsStudentsBinding;


public class ParentsStudentsFragment extends Fragment {


    private TextView f1, f2;
    private FragmentParentsStudentsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentParentsStudentsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        f1 = root.findViewById(R.id.father1);
        f2 = root.findViewById(R.id.father2);

        f1.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), FatherActivity.class));
        });
        f2.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), FatherActivity.class));
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}