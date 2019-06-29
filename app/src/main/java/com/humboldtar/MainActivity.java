package com.humboldtar;

import android.se.omapi.Session;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.ar.sceneform.ArSceneView;

public class MainActivity extends AppCompatActivity {

    private ArSceneView arView;
    private Session session;
    private boolean shouldConfigureSession=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arView=(ArSceneView)findViewById(R.id.arView);
    }
}
