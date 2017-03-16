package com.example.recyclerravin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
   // ArrayList<HashMap<String,String>> arrayList;
    ArrayList arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        arrayList=new ArrayList<>();

        arrayList.add("ravin");
        arrayList.add("ravina");
        arrayList.add("ravinass");
      /*  HashMap<String,String> hashMap=new HashMap();
        hashMap.put("name","ravin");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","patel");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","jasoliya");
        arrayList.add(hashMap);*/
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);


        apdt adapter=new apdt(arrayList);
        recyclerView.setAdapter(adapter);
        registerForContextMenu(recyclerView);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hi="+v.getId(), Toast.LENGTH_SHORT).show();

            }


        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("update");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, "selected="+item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
}
