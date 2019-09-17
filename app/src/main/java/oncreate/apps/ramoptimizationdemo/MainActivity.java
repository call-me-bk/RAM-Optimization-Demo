package oncreate.apps.ramoptimizationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void showList(View v){
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }

    public void showRecycler(View v){
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
