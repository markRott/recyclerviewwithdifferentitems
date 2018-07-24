package app.com.smadmin.diffitems.holders;

import android.util.Log;
import android.view.View;

import java.util.logging.Logger;

import app.com.smadmin.diffitems.ItemData;

public class RedViewHolder extends BaseViewHolder implements PrepareItem<ItemData> {

    private static final String TAG = RedViewHolder.class.getSimpleName();

    public RedViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void fillData(ItemData itemData) {
        Log.d(TAG, "red item");
    }
}
