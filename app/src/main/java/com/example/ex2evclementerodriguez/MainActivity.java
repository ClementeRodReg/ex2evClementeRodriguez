package com.example.ex2evclementerodriguez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llamarMapa();
    }

    //Metodo para meter el fragment mapa en el container
    public void llamarMapa(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragment = fragmentManager.findFragmentById(R.id.fragmentCV);
        Fragment nuevoFragment1 = new MapFragment();

        fragmentTransaction.replace(R.id.fragmentCV, nuevoFragment1);

        fragmentTransaction.commit();
    }

    //Metodo para meter el fragment contenido en el container
    public void llamarContenido(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragment = fragmentManager.findFragmentById(R.id.fragmentCV);
        Fragment nuevoFragment1 = new FragmentContenido();

        fragmentTransaction.replace(R.id.fragmentCV, nuevoFragment1);

        fragmentTransaction.commit();
    }
}