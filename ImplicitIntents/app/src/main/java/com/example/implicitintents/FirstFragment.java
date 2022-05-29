package com.example.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.implicitintents.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    Button button;
    EditText url;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        button=view.findViewById(R.id.button);
        url=view.findViewById(R.id.url);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlText = url.getText().toString();
                Toast.makeText(getActivity(), urlText, Toast.LENGTH_SHORT).show();

                // implicit intent to open a webpage
                Uri webpage = Uri.parse(urlText);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null);
                 startActivity(intent);

                // implicit intent to open a email sending app
//                String[] addresses = {"am27sp@gmail.com" , "shubham@amceducation.in"};
//
//                Intent intent2 = new Intent(Intent.ACTION_SEND);
//                intent2.setType("*/*");
//                intent2.putExtra(Intent.EXTRA_EMAIL, addresses);
//                intent2.putExtra(Intent.EXTRA_SUBJECT, "Shubham subject");
//                intent2.putExtra(Intent.EXTRA_TEXT, urlText);
//                // intent2.putExtra(Intent.EXTRA_STREAM, attachment);
//                if (intent2.resolveActivity(getActivity().getPackageManager()) != null) {
//                    startActivity(intent2);
//                }

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}