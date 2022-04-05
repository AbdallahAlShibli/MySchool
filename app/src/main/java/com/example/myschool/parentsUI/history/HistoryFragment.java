package com.example.myschool.parentsUI.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myschool.R;
import com.example.myschool.databinding.FragmentHistoryBinding;

import org.naishadhparmar.zcustomcalendar.CustomCalendar;
import org.naishadhparmar.zcustomcalendar.Property;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;


public class HistoryFragment extends Fragment {

    private FragmentHistoryBinding binding;
    private CustomCalendar calendarView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHistoryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        calendarView = root.findViewById(R.id.calendarView);

        HashMap<Object, Property> descrip = new HashMap<>();

        Property defaultP = new Property();
        defaultP.layoutResource = R.layout.default_view;

        defaultP.dateTextViewResource = R.id.textV;

        descrip.put("default", defaultP);


        Property current = new Property();
        current.layoutResource = R.layout.current_view;
        current.dateTextViewResource = R.id.textV;
        descrip.put("current", current);

        Property present = new Property();
        present.layoutResource = R.layout.present_view;
        present.dateTextViewResource = R.id.textV;
        descrip.put("present", present);

        Property absent = new Property();
        absent.layoutResource = R.layout.absent_view;
        absent.dateTextViewResource = R.id.textV;
        descrip.put("absent", present);

        calendarView.setMapDescToProp(descrip);


        HashMap<Integer, Object> dateMap = new HashMap<>();

        Calendar calendar = Calendar.getInstance();
        dateMap.put(calendar.get(Calendar.DAY_OF_MONTH), "current");
        dateMap.put(15, "present");
        dateMap.put(16, "absent");


        calendarView.setDate(calendar, dateMap);



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}