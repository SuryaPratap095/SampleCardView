package com.example.suryasolanki.samplecardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Player> playerList;
    private CustomRecycleViewAdapter customRecycleViewAdapter;

    private void playerdata(){
        int []covers=new int[]{
                R.drawable.album1,
                R.drawable.album2,
                R.drawable.album3,
                R.drawable.album4,
                R.drawable.album5,
                R.drawable.album6,
                R.drawable.album7,
                R.drawable.album8,
                R.drawable.album9,
                R.drawable.album10,
                R.drawable.album11
        };

        Player player=new Player("Eminem",covers[0]);
        playerList.add(player);

        player=new Player("Maroon 5",covers[1]);
        playerList.add(player);

        player=new Player("Xscape",covers[2]);
        playerList.add(player);

        player=new Player("Born to die",covers[3]);
        playerList.add(player);

        player=new Player("I need a doctor",covers[4]);
        playerList.add(player);

        player=new Player("Cheap Thrills",covers[5]);
        playerList.add(player);

        player=new Player("Maroon 5",covers[6]);
        playerList.add(player);

        player=new Player("Xscape",covers[7]);
        playerList.add(player);

        player=new Player("Born to die",covers[8]);
        playerList.add(player);

        player=new Player("I need a doctor",covers[9]);
        playerList.add(player);


        player=new Player("Xscape",covers[10]);
        playerList.add(player);

        customRecycleViewAdapter.notifyDataSetChanged();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)(findViewById(R.id.recyclerView));
        recyclerView.setHasFixedSize(true);

        playerList=new ArrayList<>();
        customRecycleViewAdapter=new CustomRecycleViewAdapter(this,playerList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(customRecycleViewAdapter);

        playerdata();

//        try{
//            Glide.with(this).load(R.drawable.cover).into(findViewById(R.id.))
//        }


    }
}
