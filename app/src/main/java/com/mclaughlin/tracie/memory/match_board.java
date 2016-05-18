package com.mclaughlin.tracie.memory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by Tracie on 5/7/2016.
 */
public class match_board extends AppCompatActivity {
    private ImageButton[] matchBoardCards = new ImageButton[16];
    private MatchingGrid.Animal[] MatchGrid = new MatchingGrid.Animal[16];
    private boolean gameOver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_board);


        matchBoardCards[0] = (ImageButton) findViewById(R.id.match0);
        matchBoardCards[1] = (ImageButton) findViewById(R.id.match1);
        matchBoardCards[2] = (ImageButton) findViewById(R.id.match2);
        matchBoardCards[3] = (ImageButton) findViewById(R.id.match3);
        matchBoardCards[4] = (ImageButton) findViewById(R.id.match4);
        matchBoardCards[5] = (ImageButton) findViewById(R.id.match5);
        matchBoardCards[6] = (ImageButton) findViewById(R.id.match6);
        matchBoardCards[7] = (ImageButton) findViewById(R.id.match7);
        matchBoardCards[8] = (ImageButton) findViewById(R.id.match8);
        matchBoardCards[9] = (ImageButton) findViewById(R.id.match9);
        matchBoardCards[10] = (ImageButton) findViewById(R.id.match10);
        matchBoardCards[11] = (ImageButton) findViewById(R.id.match11);
        matchBoardCards[12] = (ImageButton) findViewById(R.id.match12);
        matchBoardCards[13] = (ImageButton) findViewById(R.id.match13);
        matchBoardCards[14] = (ImageButton) findViewById(R.id.match14);
        matchBoardCards[15] = (ImageButton) findViewById(R.id.match15);

        MatchGrid[0] = MatchingGrid.Animal.PIG;
        MatchGrid[1] = MatchingGrid.Animal.CHICKEN;
        MatchGrid[2] = MatchingGrid.Animal.DOG;
        MatchGrid[3] = MatchingGrid.Animal.SHEEP;
        MatchGrid[4] = MatchingGrid.Animal.CHICKEN;
        MatchGrid[5] = MatchingGrid.Animal.HORSE;
        MatchGrid[6] = MatchingGrid.Animal.ROOSTER;
        MatchGrid[7] = MatchingGrid.Animal.CAT;
        MatchGrid[8] = MatchingGrid.Animal.PIG;
        MatchGrid[9] = MatchingGrid.Animal.CHICKEN;
        MatchGrid[10] = MatchingGrid.Animal.DOG;
        MatchGrid[11] = MatchingGrid.Animal.SHEEP;
        MatchGrid[12] = MatchingGrid.Animal.CHICKEN;
        MatchGrid[13] = MatchingGrid.Animal.HORSE;
        MatchGrid[14] = MatchingGrid.Animal.ROOSTER;
        MatchGrid[15] = MatchingGrid.Animal.CAT;

        assignImageArray();

        for (int imageIndex = 0; imageIndex < matchBoardCards.length; imageIndex++) {
            matchBoardCards[imageIndex].setTag(imageIndex);
            matchBoardCards[imageIndex].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //setResource
                    setImageResource(v.getTag().toString());
                    //only call check match if I have selected two cards and not the same card
                    //checkMatch(MatchingGrid.Animal[0], MatchingGrid.Animal[2]);
                }
            });
        }
    }

    private void assignImageArray() {
        //Assign Image Enums Randomly eventually not have more than two of each type
        //for(){
        // MatchGrid[index] = Random Enum
        // }
        

    }

    private void setImageResource(String tag) {
        int intTag = Integer.parseInt(tag);

        //matchBoardCards[intTag].setImageResource(MatchingGrid.AssignImage(MatchingGrid.Animal.CAT));
        matchBoardCards[intTag].setImageResource(MatchingGrid.AssignImage(MatchGrid[intTag]));
    }
}
