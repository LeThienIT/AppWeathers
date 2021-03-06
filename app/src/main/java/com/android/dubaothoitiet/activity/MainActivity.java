package com.android.dubaothoitiet.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;

import com.android.dubaothoitiet.R;
import com.android.dubaothoitiet.adapter.MyAdapter;
import com.android.dubaothoitiet.model.Item;
import com.android.dubaothoitiet.model.Item_View1;
import com.android.dubaothoitiet.model.Item_View2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Item> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        lists = new ArrayList<>();

        SetAcitonBar();

        Item_View1 item_view1 = new Item_View1(R.drawable.art_clear, "Today, April 21", "16°", "4°", "London, UK", "Clear");
        lists.add(new Item(0, item_view1));

        Item_View2 item_view2 = new Item_View2(R.drawable.ic_clear, "Tomorrow", "Clear", "16°", "3°");
        lists.add(new Item(1, item_view2));

        Item_View2 item_view3 = new Item_View2(R.drawable.ic_clear, "Wednesday", "Clear", "17°", "4°");
        lists.add(new Item(1, item_view3));

        Item_View2 item_view4 = new Item_View2(R.drawable.ic_cloudy, "Thursday", "Clear", "16°", "6°");
        lists.add(new Item(1, item_view4));

        Item_View2 item_view5 = new Item_View2(R.drawable.ic_rain, "Friday", "Rain", "15°", "10°");
        lists.add(new Item(1, item_view5));

        Item_View2 item_view6 = new Item_View2(R.drawable.ic_rain, "Saturday", "Rain", "15°", "10°");
        lists.add(new Item(1, item_view6));

        Item_View2 item_view7 = new Item_View2(R.drawable.ic_storm, "Sunday", "Storm", "13°", "2°");
        lists.add(new Item(1, item_view7));

        MyAdapter adapter = new MyAdapter(lists);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void SetAcitonBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setLogo(R.drawable.ic_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#42A6F6")));
        actionBar.setDisplayUseLogoEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}