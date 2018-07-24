package app.com.smadmin.diffitems;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import app.com.smadmin.diffitems.delegates.ColorViewTypeManager;
import app.com.smadmin.diffitems.delegates.IViewTypeManager;

public class ColorItemAdapter extends BaseRecyclerAdapter<ItemData> {

    private IViewTypeManager viewTypeManager;

    public ColorItemAdapter() {
        // TODO inject this objects
        viewTypeManager = new ColorViewTypeManager();
    }

    @Override
    public int getItemViewType(int position) {
        return viewTypeManager.getItemViewType(getItemByPosition(position), position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return viewTypeManager.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        viewTypeManager.onBindViewHolder(getItemByPosition(position), position, holder);
    }
}
