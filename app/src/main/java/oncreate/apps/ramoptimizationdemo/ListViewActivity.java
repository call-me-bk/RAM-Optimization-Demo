package oncreate.apps.ramoptimizationdemo;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import oncreate.apps.ramoptimizationdemo.Adapters.customListViewAdapter;

public class ListViewActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewlayout);
        Resources res = getResources();
        String[] wepNames = res.getStringArray(R.array.weaponsD2);

        customListViewAdapter LA = new customListViewAdapter(ListViewActivity.this, wepNames, imageId);
        ListView l = findViewById(R.id.m_listview);
        l.setAdapter(LA);

    }
}
