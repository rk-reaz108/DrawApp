package com.educareappsltd.testapp;

import android.app.Fragment;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.educareappsltd.testapp.drawing.PanelMapping;

/**
 * Created by RAFI on 8/30/2016.
 */

public class FragClass extends Fragment {
    RelativeLayout content_main;
    PanelMapping panel;
    public static int screenheight, screenwidth;
    private double density;

    public static int galleryBitmapSize, mappingLettersize, mappingPicSize;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main,
                container, false);

        content_main=(RelativeLayout)view.findViewById(R.id.content_main);
        calculateDisplaySize();
        panel = new PanelMapping(getActivity(),screenheight,screenwidth);

        content_main.addView(panel);
//        new DataLoader().execute();

        return view;
    }


    public void calculateDisplaySize() {
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        screenheight = metrics.heightPixels;
        screenwidth = metrics.widthPixels;
        density = getDensity(metrics.density);
        double x = Math.pow(metrics.widthPixels / density, 2);
        double y = Math.pow(metrics.heightPixels / density, 2);
        double screenInches = Math.sqrt(x + y);
//        setBitmapSampleSize(screenInches);


    }

    public double getDensity(double density) {

        double densityy = density * 160;

        // if (density < 1) {
        // densityy = density * 120;
        // } else if (density >= 1 && density < 1.5) {
        // densityy = density * 160;
        // } else if (density >= 1.5 && density < 2) {
        // densityy = density * 145;
        // } else if (density >= 2 && density < 3) {
        // densityy = density * 155;
        // } else if (density >= 3 && density < 4) {
        // densityy = density * 130;
        // } else if (density >= 4) {
        // densityy = density * 90;
        // }else{
        // densityy = density * 160;
        // }

        return densityy;

    }

    public void setBitmapSampleSize(Double screensizeInch) {
        if (screensizeInch > 6) {
            galleryBitmapSize = 1;
            mappingLettersize = 1;
            mappingPicSize = 1;
        } else if (screensizeInch < 6 && screensizeInch > 4.9) {
            galleryBitmapSize = 2;
            mappingLettersize = 1;
            mappingPicSize = 2;
        } else if (screensizeInch < 4.9) {
            galleryBitmapSize = 3;
            mappingLettersize = 2;
            mappingPicSize = 3;
        } else {
            galleryBitmapSize = 1;
            mappingLettersize = 1;
            mappingPicSize = 1;
        }
    }


















    public class DataLoader extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

        }

        @Override
        protected Void doInBackground(Void... params) {
            // TODO Auto-generated method stub
         /*   runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    System.out.println("I am called");

                    content_main.addView(panel);



                }
            });*/

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);
        }
    }

}
