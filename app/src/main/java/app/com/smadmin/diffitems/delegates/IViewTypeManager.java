package app.com.smadmin.diffitems.delegates;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public interface IViewTypeManager<T> {

   int getItemViewType(@NonNull T data, int position);

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(@NonNull T item, int position, @NonNull RecyclerView.ViewHolder viewHolder);
}
