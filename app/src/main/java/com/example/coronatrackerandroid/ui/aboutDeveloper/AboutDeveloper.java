package com.example.coronatrackerandroid.ui.aboutDeveloper;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.coronatrackerandroid.R;

public class AboutDeveloper extends Fragment {

    private AboutDeveloperViewModel mViewModel;
    private ImageView imageProfile;

    public static AboutDeveloper newInstance() {
        return new AboutDeveloper();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_about_developer, container, false);
        imageProfile=view.findViewById(R.id.imageProfile);

        Glide.with(getActivity()).load(R.drawable.profilepic).into(imageProfile);





        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AboutDeveloperViewModel.class);
        // TODO: Use the ViewModel
    }



}
