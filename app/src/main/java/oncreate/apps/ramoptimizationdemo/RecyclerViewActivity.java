package oncreate.apps.ramoptimizationdemo;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import oncreate.apps.ramoptimizationdemo.Adapters.customRecyclerViewAdapter;

public class RecyclerViewActivity extends AppCompatActivity {
    Integer[] imageId = {
            R.drawable.thorn,
            R.drawable.lastword,
            R.drawable.cerebrus,
            R.drawable.lemon,
            R.drawable.low,
            R.drawable.outbreak,
            R.drawable.chap,
            R.drawable.truth,
            R.drawable.sleeper,
            R.drawable.tarrab,
            R.drawable.crimson,
            R.drawable.prolens,
            R.drawable.colony,
            R.drawable.telesto

    };
    private RecyclerView recyclerView;
    private customRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerviewlayout);

        recyclerView = findViewById(R.id.m_recyclerview);

        Resources res = getResources();
        String[] wepNames = res.getStringArray(R.array.weaponsD2);

        mAdapter = new customRecyclerViewAdapter(wepNames, imageId);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }
}
