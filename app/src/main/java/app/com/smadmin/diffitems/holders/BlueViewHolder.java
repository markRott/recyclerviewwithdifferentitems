package app.com.smadmin.diffitems.holders;

import android.util.Log;
import android.view.View;

import app.com.smadmin.diffitems.ItemData;

public class BlueViewHolder extends BaseViewHolder implements PrepareItem<ItemData> {

    private static final String TAG = BlueViewHolder.class.getSimpleName();

    public BlueViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void fillData(ItemData itemData) {
        Log.d(TAG, "blue item");
    }
}
