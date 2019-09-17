package oncreate.apps.ramoptimizationdemo.Adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import oncreate.apps.ramoptimizationdemo.R;

public class customRecyclerViewAdapter extends RecyclerView.Adapter<customRecyclerViewAdapter.MyViewHolder> {
    private final String TAG = "RecyclerV";
    private String[] weapons;
    private Integer[] imgIDs;


    public customRecyclerViewAdapter(String[] n, Integer[] i) {
        weapons = n;
        imgIDs = i;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d(TAG, "Position being binded: " + position);
        holder.name.setText(weapons[position]);
        holder.img.setBackgroundResource(imgIDs[position]);
    }

    @Override
    public int getItemCount() {
        return weapons.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView img;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.list_txt);
            img = view.findViewById(R.id.list_imgview);
        }
    }


}

