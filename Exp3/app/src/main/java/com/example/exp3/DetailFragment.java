package com.example.exp3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_detail,
                container,
                false
        );

        TextView courseName =
                view.findViewById(R.id.courseName);

        TextView courseDescription =
                view.findViewById(R.id.courseDescription);

        Bundle bundle = getArguments();

        if (bundle != null) {

            String course =
                    bundle.getString("course");

            courseName.setText(course);

            String description;

            switch (course) {

                case "Java":
                    description =
                            "Java is an object-oriented programming language.";
                    break;

                case "Python":
                    description =
                            "Python is a beginner-friendly programming language.";
                    break;

                case "Android":
                    description =
                            "Android is used for developing mobile applications.";
                    break;

                case "Machine Learning":
                    description =
                            "Machine Learning allows computers to learn from data.";
                    break;

                case "Cyber Security":
                    description =
                            "Cyber Security protects systems, networks and data.";
                    break;

                default:
                    description =
                            "Course information is not available.";
            }

            courseDescription.setText(description);
        }

        return view;
    }
}