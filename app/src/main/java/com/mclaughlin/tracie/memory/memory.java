package com.mclaughlin.tracie.memory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class memory extends AppCompatActivity {
    public Button mPlayButton;
    public Button mQuitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);


    mPlayButton = (Button)findViewById(R.id.play_button);
    mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(memory.this, match_board.class);
                startActivity(intent);
            }

        });

    }


}
