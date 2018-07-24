package app.com.smadmin.diffitems.delegates;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.com.smadmin.diffitems.ItemData;
import app.com.smadmin.diffitems.R;
import app.com.smadmin.diffitems.holders.EmptyViewHolder;

public class EmptyItemDelegate implements IAdapterItem<Object> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        final View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_empty, parent, false);
        return new EmptyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Object item, int position, @NonNull RecyclerView.ViewHolder holder) {

    }
}
