package app.com.smadmin.diffitems.holders;

import android.util.Log;
import android.view.View;

import app.com.smadmin.diffitems.ItemData;

public class GreenViewHolder extends BaseViewHolder implements PrepareItem<ItemData> {

    private static final String TAG = GreenViewHolder.class.getSimpleName();

    public GreenViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void fillData(ItemData itemData) {
        Log.d(TAG, "green item");
    }
}
