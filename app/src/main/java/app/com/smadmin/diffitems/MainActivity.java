package app.com.smadmin.diffitems;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ColorItemAdapter colorItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcv);
        initAdapter();
    }


    private void initAdapter() {

        // TODO inject this object
        colorItemAdapter = new ColorItemAdapter();

        recyclerView.setLayoutManager(getLinearLayoutManager());
        recyclerView.setAdapter(colorItemAdapter);
        recyclerView.addItemDecoration(getDividerItemDecoration());
        colorItemAdapter.setData(prepareStubList());
    }

    private LinearLayoutManager getLinearLayoutManager() {
        return new LinearLayoutManager(this);
    }

    private DividerItemDecoration getDividerItemDecoration() {
        return new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
    }

    private List<ItemData> prepareStubList() {
        List<ItemData> itemDataList = new ArrayList<>();

        itemDataList.add(new ItemData(Const.RED));
        itemDataList.add(new ItemData(Const.GREEN));
        itemDataList.add(new ItemData(Const.BLUE));

        itemDataList.add(new ItemData(Const.RED));
        itemDataList.add(new ItemData(Const.GREEN));
        itemDataList.add(new ItemData(Const.BLUE));

        itemDataList.add(new ItemData(Const.RED));
        itemDataList.add(new ItemData(Const.GREEN));
        itemDataList.add(new ItemData(Const.BLUE));

        itemDataList.add(new ItemData(Const.RED));
        itemDataList.add(new ItemData(Const.GREEN));
        itemDataList.add(new ItemData(Const.BLUE));

        return itemDataList;
    }
}
