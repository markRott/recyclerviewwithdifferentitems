package app.com.smadmin.diffitems.delegates;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.com.smadmin.diffitems.ItemData;
import app.com.smadmin.diffitems.R;
import app.com.smadmin.diffitems.holders.BlueViewHolder;

public class BlueItem implements IAdapterItem<ItemData> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        final View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_blue, parent, false);
        return new BlueViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemData itemData, int position, @NonNull RecyclerView.ViewHolder holder) {
        BlueViewHolder blueViewHolder = (BlueViewHolder) holder;
        blueViewHolder.fillData(itemData);
    }
}
