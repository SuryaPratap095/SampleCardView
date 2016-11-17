package com.example.suryasolanki.samplecardview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by surya.solanki on 16-11-2016.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    protected TextView playerName;
    protected ImageView realImage, likeImage;

    public MyViewHolder(View view){
        super(view);

        playerName=(TextView) view.findViewById(R.id.txtTitle);
        realImage=(ImageView) view.findViewById(R.id.realImage);
        //likeImage=(ImageView) view.findViewById(R.id.likeImage);
    }

}
