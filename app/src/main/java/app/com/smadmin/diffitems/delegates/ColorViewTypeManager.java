package app.com.smadmin.diffitems.delegates;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import app.com.smadmin.diffitems.ItemData;

import static app.com.smadmin.diffitems.Const.BLUE;
import static app.com.smadmin.diffitems.Const.GREEN;
import static app.com.smadmin.diffitems.Const.RED;

public class ColorViewTypeManager implements IViewTypeManager<ItemData> {

    private IAdapterItem redItem;
    private IAdapterItem greenItem;
    private IAdapterItem blueItem;

    public ColorViewTypeManager() {
        // TODO inject this objects
        redItem = new RedItem();
        greenItem = new GreenItem();
        blueItem = new BlueItem();
    }

    @Override
    public int getItemViewType(@NonNull ItemData data, int position) {
        return data.getColor();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return getAdapterItem(viewType).onCreateViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemData itemData, int position, @NonNull RecyclerView.ViewHolder viewHolder) {
        final int viewType = viewHolder.getItemViewType();
        getAdapterItem(viewType).onBindViewHolder(itemData, position, viewHolder);
    }

    private IAdapterItem getAdapterItem(int viewType) {
        switch (viewType) {
            case RED:
                return redItem;
            case GREEN:
                return greenItem;
            case BLUE:
                return blueItem;
            default:
                return new EmptyItemDelegate();
        }
    }
}
