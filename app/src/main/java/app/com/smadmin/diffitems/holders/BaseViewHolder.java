package app.com.smadmin.diffitems.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseViewHolder extends RecyclerView.ViewHolder {

    protected View rootView;

    BaseViewHolder(View itemView) {
        super(itemView);
        rootView = itemView;
    }
}
