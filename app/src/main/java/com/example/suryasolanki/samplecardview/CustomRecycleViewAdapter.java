package com.example.suryasolanki.samplecardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.suryasolanki.samplecardview.MyViewHolder;
import com.like.LikeButton;
import com.like.OnLikeListener;

import java.util.ArrayList;

/**
 * Created by surya.solanki on 16-11-2016.
 */

public class CustomRecycleViewAdapter extends RecyclerView.Adapter<CustomRecycleViewAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Player> playerList;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        protected TextView playerName;
        protected ImageView realImage, likeImage;
        protected LikeButton likeButton;

        public MyViewHolder(View view){
            super(view);

            playerName=(TextView) view.findViewById(R.id.txtTitle);
            realImage=(ImageView) view.findViewById(R.id.realImage);
           // likeImage=(ImageView) view.findViewById(R.id.likeImage);
            likeButton=(LikeButton)view.findViewById(R.id.star_button);
        }

    }

    public CustomRecycleViewAdapter(Context context, ArrayList<Player> playerList) {
        this.context = context;
        this.playerList = playerList;
    }

    @Override
    public CustomRecycleViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).
                inflate(R.layout.layoout_card_view,parent,false);

       // View itemView=getSys
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CustomRecycleViewAdapter.MyViewHolder holder, int position) {

        Player player=playerList.get(position);
        holder.playerName.setText(player.getPlayerName());


        Glide.with(context).load(player.getRealImage()).into(holder.realImage);

//        holder.likeImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            //    holder.likeImage.setImageDrawable();
//            }
//        });

        holder.likeButton.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }
}
