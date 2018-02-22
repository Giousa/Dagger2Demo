package com.zmm.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zmm.dagger2demo.componet.DaggerApiComponet;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerApiComponet.builder().build().inject(this);

        mApiService.register();
    }
}
