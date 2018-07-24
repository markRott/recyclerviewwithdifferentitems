package app.com.smadmin.diffitems;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public abstract class BaseRecyclerAdapter<Item> extends RecyclerView.Adapter {

    private List<Item> data;

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public void setData(@NonNull List<Item> itemList) {
        data = itemList;
        notifyDataSetChanged();
    }

    public void addData(Item newItem) {
        data.add(newItem);
        notifyDataSetChanged();
    }

    public void addAllData(@NonNull List<Item> newDataList) {
        data.addAll(newDataList);
    }

    public List<Item> getData() {
        return data;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    Item getItemByPosition(int position) {
        return data.get(position);
    }

    public void clear() {
        data.clear();
    }
}
