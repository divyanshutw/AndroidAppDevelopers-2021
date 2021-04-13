package com.android.internshipprogram.ui.browse;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.android.internshipprogram.R;
import com.android.internshipprogram.databinding.FragmentBrowseBinding;

public class BrowseFragment extends Fragment {

    private BrowseViewModel browseViewModel;
    private FragmentBrowseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        browseViewModel =
                new ViewModelProvider(this).get(BrowseViewModel.class);

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_browse, container, false);
        inflateHorizontal("DigiLocker uses Aadhaar to verify identity of the user and also enable authentic document. DigiLocker uses Aadhaar to verify identity of the user and also enable authentic document. DigiLocker uses Aadhaar to verify identity of the user and also enable authentic document.");
        inflateHorizontal("Karnataka State Police have successfully utilized the academic certificates verification services via #Digilocker and have #transformed the #recruitment process by minimizing the recruitment duration. Karnataka State Police have successfully utilized the academic certificates verification services via #Digilocker and have #transformed the #recruitment process by minimizing the recruitment duration.");
        inflateHorizontal("DigiLocker is an Indian digitization online service provided by Ministry of Electronics and Information Technology (MeitY), Government of India under its Digital India initiative. DigiLocker provides an account in cloud to every Aadhaar holder to access authentic documents/certificates such as driving license, vehicle registration, academic mark sheet in digital format from the original issuers of these certificates. It also provides 1GB storage space to each account to upload scanned copies of legacy documents.");
        inflateHorizontal("Users need to possess an Aadhaar number to use DigiLocker. For sign-up, the Aadhaar number and the one-time password sent to the Aadhaar-registered mobile number, need to be entered.[1]");

        inflateVertical("The beta version of the service was rolled out in February 2015,[2] and launched by Prime Minister Narendra Modi on 1 July 2015.[3][4] The storage space provided was 100 MB initially, and was later increased to 1 GB.[5] The individual file size for upload cannot exceed 10 MB.");
        inflateVertical("In July 2016, DigiLocker recorded 20.13 lakh users with a repository of 24.13 lakh documents. The number of users saw a large jump of 7.53 lakh in April when the government had urged all municipal bodies to use DigiLocker to make their administration paperless.[6]");
        inflateVertical("As of December 2019, DigiLocker provides access to over 372+ crore authentic documents from 149 issuers. Over 3.3 crore users are registered on DigiLocker. 43 requester organisations are accepting documents from DigiLocker.[10]");
        inflateVertical("DigiLocker uses Aadhaar to verify identity of the user and also enable authentic document. DigiLocker uses Aadhaar to verify identity of the user and also enable authentic document. DigiLocker uses Aadhaar to verify identity of the user and also enable authentic document.");
        inflateVertical("Karnataka State Police have successfully utilized the academic certificates verification services via #Digilocker and have #transformed the #recruitment process by minimizing the recruitment duration. Karnataka State Police have successfully utilized the academic certificates verification services via #Digilocker and have #transformed the #recruitment process by minimizing the recruitment duration.");
        inflateVertical("DigiLocker is an Indian digitization online service provided by Ministry of Electronics and Information Technology (MeitY), Government of India under its Digital India initiative. DigiLocker provides an account in cloud to every Aadhaar holder to access authentic documents/certificates such as driving license, vehicle registration, academic mark sheet in digital format from the original issuers of these certificates. It also provides 1GB storage space to each account to upload scanned copies of legacy documents.");
        inflateVertical("Users need to possess an Aadhaar number to use DigiLocker. For sign-up, the Aadhaar number and the one-time password sent to the Aadhaar-registered mobile number, need to be entered.[1]");

        return binding.getRoot();
    }

    private void inflateVertical(String text) {
        LayoutInflater inflater=(LayoutInflater)(requireContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        View childView=inflater.inflate(R.layout.browse_lower_list_item,null);

        TextView textView=childView.findViewById(R.id.textView);
        textView.setText(text.substring(0,120));
        childView.findViewById(R.id.textViewReadMore).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(requireContext(),text,Toast.LENGTH_LONG).show();
            }
        });

        binding.wholeLinearLayout.addView(childView);
    }

    private void inflateHorizontal( String text) {
        LayoutInflater inflater=(LayoutInflater)(requireContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        View childView=inflater.inflate(R.layout.browse_list_item,null);

        TextView textView=childView.findViewById(R.id.textView);
        textView.setText(text.substring(0,120));
        childView.findViewById(R.id.textViewReadMore).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(requireContext(),text,Toast.LENGTH_LONG).show();
            }
        });

        binding.topLinearLayout.addView(childView);
    }
}