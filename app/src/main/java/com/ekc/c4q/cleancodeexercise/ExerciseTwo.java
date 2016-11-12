package com.ekc.c4q.cleancodeexercise;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    // Clean up the code below
    public class Answer extends AppCompatActivity {
        List<String> PreviousFunctions;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            PreviousFunctions = new ArrayList<>();
        }

        private void showAlpha() {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new Alpha());
            fragmentTransaction.commit();
        }

        private void showBeta() {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new Beta());
            fragmentTransaction.commit();
        }

        private void showGamma() {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new Gamma());
            fragmentTransaction.commit();
        }

        private void showDelta() {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new delta());
            fragmentTransaction.commit();
        }

        private void showEpsilon() {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new EPSILON());
            fragmentTransaction.commit();
        }
    }

    public static class Alpha extends Fragment {

    }

    public static class Beta extends Fragment {

    }

    public static class Gamma extends Fragment {

    }

    public static class delta extends Fragment {

    }

    public static class EPSILON extends Fragment {

    }
}
