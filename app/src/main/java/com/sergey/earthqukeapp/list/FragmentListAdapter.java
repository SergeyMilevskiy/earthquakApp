package com.sergey.earthqukeapp.list;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sergey.earthqukeapp.R;

/**
 * Created by smilevkiy on 18.08.17.
 */

public class FragmentListAdapter extends RecyclerView.Adapter {

    private final Context context;

    public FragmentListAdapter(Context context) {
        this.context = context;
    }


    static class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        CustomViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            imageView = (ImageView)itemView.findViewById(R.id.circle);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.lits_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        String text = position + " where is occur?";

        CustomViewHolder customViewHolder = (CustomViewHolder)holder;
        customViewHolder.textView.setText(text);
        final Drawable circle = AppCompatResources.getDrawable(context, R.drawable.circle);
        int color = position % 2 == 0 ? R.color.red : R.color.green;
        if(circle != null) {
            circle.setColorFilter(ContextCompat.getColor(context, color), PorterDuff.Mode.SRC_ATOP);
            customViewHolder.imageView.setImageDrawable(circle);
        }

    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
