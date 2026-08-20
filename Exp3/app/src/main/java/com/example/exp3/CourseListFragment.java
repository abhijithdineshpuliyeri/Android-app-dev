package com.example.exp3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CourseListFragment extends Fragment {

    String[] courses = {
            "Java",
            "Python",
            "Android",
            "Machine Learning",
            "Cyber Security"
    };

    public CourseListFragment() {
        // Required empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_course_list,
                container,
                false
        );

        ListView listView = view.findViewById(R.id.courseList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                courses
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {

            String selectedCourse = courses[position];

            DetailFragment detailFragment =
                    new DetailFragment();

            Bundle bundle = new Bundle();
            bundle.putString("course", selectedCourse);

            detailFragment.setArguments(bundle);

            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.detail_container, detailFragment)
                    .commit();
        });

        return view;
    }
}