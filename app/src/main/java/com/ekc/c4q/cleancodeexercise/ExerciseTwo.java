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
    public class AnswerActivity extends AppCompatActivity {
        List<String> previousFunctions; // or mPreviousFunctions

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            previousFunctions = new ArrayList<>();
        }

        /**
         * We didn't need all of those methods: it was a lot of repeat code and all that changed
         * was the fragment.
         */
        private void showFragment(Fragment fragment) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, fragment);
            fragmentTransaction.commit();
        }

        private void showAlpha() {
            showFragment(new AlphaFragment());
        }

        private void showBeta() {
            showFragment(new BetaFragment());
        }

        private void showGamma() {
            showFragment(new GammaFragment());
        }

        private void showDelta() {
            showFragment(new DeltaFragment());
        }

        private void showEpsilon() {
            showFragment(new EpsilonFragment());
        }
    }

    public static class AlphaFragment extends Fragment {

    }

    public static class BetaFragment extends Fragment {

    }

    public static class GammaFragment extends Fragment {

    }

    public static class DeltaFragment extends Fragment {

    }

    public static class EpsilonFragment extends Fragment {

    }
}
