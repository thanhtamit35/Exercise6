package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (TextUtils.isEmpty(Objects.requireNonNull(email.getText()).toString())) {
                    email.setError("This field is required!");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(Objects.requireNonNull(email.getText()).toString())) {
                    email.setError("This field is required!");
                }
            }
        });
    }

    private void mapping() {
        email = findViewById(R.id.edt_email);
    }
}