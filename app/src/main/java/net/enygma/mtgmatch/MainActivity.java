package net.enygma.mtgmatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //We'll want to show recent match information
    //This could eventually save to the 'net, and show other's games

    //We could eventually have a future to do list of matches: "Destroy Riley w/Reaper King"... for example.
}
