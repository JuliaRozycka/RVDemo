package edu.ib.rvdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] names = getResources().getStringArray(R.array.names);
        TenisPlayer [] players = new TenisPlayer[]{

            new TenisPlayer(names[0], R.drawable.barty),
            new TenisPlayer(names[1], R.drawable.sabalenka),
            new TenisPlayer(names[2], R.drawable.muguruza),
            new TenisPlayer(names[3], R.drawable.krejcikova),
            new TenisPlayer(names[4], R.drawable.pliskova),
            new TenisPlayer(names[5], R.drawable.sakkari),
            new TenisPlayer(names[6], R.drawable.kontaveit),
            new TenisPlayer(names[7], R.drawable.swiatek),
            new TenisPlayer(names[8], R.drawable.badosa),
            new TenisPlayer(names[9], R.drawable.jabeur)

        };


        RecyclerView rvPlayers = findViewById(R.id.RVPlayers);
        PlayerAdapter adapter = new PlayerAdapter(players);
        rvPlayers.setHasFixedSize(true);
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        rvPlayers.setAdapter(adapter);

    }
}