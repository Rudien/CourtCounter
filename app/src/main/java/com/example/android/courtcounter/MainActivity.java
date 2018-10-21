package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pointsa = 0;
    int pointsb = 0;
    /**
     * This method is called when the +3 button is clicked.
     */
    public void plussTreePointsA(View view) {
        pointsa = pointsa + 3;
        displayA(pointsa);
    }
    /**
     * This method is called when the +2 button is clicked.
     */
    public void plussTwoPointsA(View view) {
        pointsa = pointsa + 2;
        displayA(pointsa);
    }
    /**
     * This method is called when the +1 button is clicked.
     */
    public void plussOnePointA(View view) {
        pointsa = pointsa + 1;
        displayA(pointsa);
    }
    /**
     * This method is called when the reset button is clicked.
     */
    public void resetA(View view) {
        pointsa = 0;
        displayA(pointsa);
    }
    /**
     * This method displayAs the given point value on the screen
     */
    private void displayA(int number) {
        TextView quantityTextView = findViewById(R.id.goal_pointsa);
        quantityTextView.setText("" + number);
    }
    /**
     * This method is called when the +3 button is clicked.
     */
    public void plussTreePointsB(View view) {
        pointsb = pointsb + 3;
        displayB(pointsb);
    }
    /**
     * This method is called when the +2 button is clicked.
     */
    public void plussTwoPointsB(View view) {
        pointsb = pointsb + 2;
        displayB(pointsb);
    }
    /**
     * This method is called when the +1 button is clicked.
     */
    public void plussOnePointB(View view) {
        pointsb = pointsb + 1;
        displayB(pointsb);
    }
    /**
     * This method is called when the reset button is clicked.
     */
    public void Reset(View view) {
        pointsa = 0;
        pointsb = 0;
        displayA(pointsa);
        displayB(pointsb);
    }
    /**
     * This method displayBs the given point value on the screen
     */
    private void displayB(int number) {
        TextView quantityTextView = findViewById(R.id.goal_pointsb);
        quantityTextView.setText("" + number);
    }
}