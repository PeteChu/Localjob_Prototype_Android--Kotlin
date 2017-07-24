package com.example.localjob.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.localjob.R;

/**
 * Created by schecterza on 7/24/2017 AD.
 */

public class SearchTagAdapter extends RecyclerView.Adapter<SearchTagAdapter.ViewHolder> {

    Context mContext;
    EditText mEdittext;
    public SearchTagAdapter(Context mContext, EditText mEdittext) {
        this.mContext = mContext;
        this.mEdittext = mEdittext;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(onClickListener);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_tag, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "Click", Toast.LENGTH_SHORT).show();
        }
    };

}
