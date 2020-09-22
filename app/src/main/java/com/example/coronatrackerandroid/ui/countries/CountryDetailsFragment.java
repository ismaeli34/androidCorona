package com.example.coronatrackerandroid.ui.countries;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.coronatrackerandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CountryDetailsFragment extends Fragment {

    private int  positionCountry;
    ImageView flag;
    TextView tvCountry, tvCases,tvRecovered,tvActive,tvTodayCases,tvTodayDeaths,tvDeaths,tvTotalDeaths,tvTodayRecovered;
    private static final String TAG = "Ronney";

    public CountryDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_country_details, container, false);
         positionCountry = getArguments().getInt("position");
        Log.d(TAG, ""+positionCountry);

//        Intent intent = getActivity().getIntent();
//        positionCountry = intent.getIntExtra("position",0);
        tvCases=  view.findViewById(R.id.tvCases);
        tvTodayCases = view.findViewById(R.id.tvTodayCases);
        tvTodayDeaths = view.findViewById(R.id.todayDeaths);
        tvTodayRecovered = view.findViewById(R.id.todayRecovered);
        flag = view.findViewById(R.id.imageFlag);
        tvCountry = view.findViewById(R.id.tvCountryName);
        tvRecovered = view.findViewById(R.id.tvRecovered);
        tvActive = view.findViewById(R.id.tvActive);
        tvTodayCases = view.findViewById(R.id.tvTodayCases);
        tvDeaths = view.findViewById(R.id.tvDeath);

        tvCountry.setText(CountriesFragment.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(CountriesFragment.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(CountriesFragment.countryModelList.get(positionCountry).getRecovered());
        tvActive.setText(CountriesFragment.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(CountriesFragment.countryModelList.get(positionCountry).getTodayCases());
        tvDeaths.setText(CountriesFragment.countryModelList.get(positionCountry).getDeaths());
        tvTodayCases.setText(CountriesFragment.countryModelList.get(positionCountry).getTodayCases());
        tvTodayDeaths.setText(CountriesFragment.countryModelList.get(positionCountry).getTodayDeaths());
        tvTodayRecovered.setText(CountriesFragment.countryModelList.get(positionCountry).getTodayRecovered());


        Glide.with(getActivity()).load(CountriesFragment.countryModelList.get(positionCountry).getCountryInfo().getFlag()).into(flag);






        return view;
    }
}
