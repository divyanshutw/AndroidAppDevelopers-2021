package com.android.internshipprogram.ui.home;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.android.internshipprogram.R;
import com.android.internshipprogram.databinding.FragmentHomeBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.M)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);

        setUpViewPager();

        setUpPdfs(getString(R.string.aadhaar_card),R.drawable.aadhar_card);
        setUpPdfs(getString(R.string.driving_license),R.drawable.govt_of_ind_logo);
        setUpPdfs(getString(R.string.pan_card),R.drawable.govt_of_ind_logo);
        setUpPdfs(getString(R.string.vehicle_registration),R.drawable.govt_of_ind_logo);
        setUpPdfs(getString(R.string.voter_id_card),R.drawable.govt_of_ind_logo);
        setUpPdfs(getString(R.string.passport),R.drawable.govt_of_ind_logo);
        setUpPdfs(getString(R.string.domicile_certificate),R.drawable.govt_of_ind_logo);

        return binding.getRoot();
    }

    private void setUpViewPager() {
        HomeModel[] list={new HomeModel(R.drawable.image1,getString(R.string.digilocker_issues_original_digital_document_as_per_it_act_2000)),
                new HomeModel(R.drawable.image2,getString(R.string.digilocker_is_the_best)),
                new HomeModel(R.drawable.image1,getString(R.string.digilocker_is_valid_everywhere)),
                new HomeModel(R.drawable.image2,getString(R.string.digilocker_issues_original_digital_document_as_per_it_act_2000))};

        HomeViewPagerAdapter adapter=new HomeViewPagerAdapter(list,requireContext());
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager,true);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setUpPdfs(String heading,int imageRes) {
        LinearLayout layout=binding.linearLayoutPdfs;
        View childView;
        LayoutInflater inflater =(LayoutInflater)(requireContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        childView = inflater.inflate(R.layout.pdf_list_item,null);

        TextView textViewHeading=childView.findViewById(R.id.textView_heading);
        TextView textViewPreview=childView.findViewById(R.id.textView_preview);
        ImageView imageView=childView.findViewById(R.id.imageView);

        textViewHeading.setText(heading);
        imageView.setImageResource(imageRes);
        textViewPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(requireContext(),heading,Toast.LENGTH_LONG).show();
            }
        });

        layout.addView(childView);
    }
}