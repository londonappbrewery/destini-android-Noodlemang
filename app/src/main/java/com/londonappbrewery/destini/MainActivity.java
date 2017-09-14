package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mBotButton;
    TextView mStory;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBotButton = (Button) findViewById(R.id.buttonBottom);
        mStoryIndex = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2){
                    mStory.setText(R.string.T3_Story);
                    mBotButton.setText(R.string.T3_Ans2);
                    mTopButton.setText(R.string.T3_Ans1);
                    mStoryIndex = 3;
            }
            else if (mStoryIndex == 3){
                    mStory.setText(R.string.T6_End);
                    mBotButton.setVisibility(View.INVISIBLE);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mStoryIndex = 6;
                }
        }});

        mBotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1){
                    mStory.setText(R.string.T2_Story);
                    mBotButton.setText(R.string.T2_Ans2);
                    mTopButton.setText(R.string.T2_Ans1);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2){
                    mStory.setText(R.string.T4_End);
                    mBotButton.setVisibility(View.INVISIBLE);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mStoryIndex = 4;
                }
                else if (mStoryIndex == 3){
                    mStory.setText(R.string.T5_End);
                    mBotButton.setVisibility(View.INVISIBLE);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mStoryIndex = 5;
                }
            }
        }
    );

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
