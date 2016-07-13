package net.enygma.mtgmatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String someURL = "http://charm.enygma.net";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(someURL).build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    if(response.isSuccessful()){
                        Log.v(TAG, response.body().string());
                    }
                } catch (IOException e) {
                    Log.e(TAG,"Exception caught: calling reponse", e);
                }
            }
        });

        Log.d(TAG, "Main UI code running");

    }

    //We'll want to show recent match information
    //This could eventually save to the 'net, and show other's games

    //We could eventually have a future to do list of matches: "Destroy Riley w/Reaper King"... for example.
}
