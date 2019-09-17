package oncreate.apps.ramoptimizationdemo.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import oncreate.apps.ramoptimizationdemo.R;

public class customListViewAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] weapons;
    private final Integer[] imageId;

    public customListViewAdapter(Activity context,
                                 String[] web, Integer[] imageId) {
        super(context, R.layout.listitem, web);
        this.context = context;
        this.weapons = web;
        this.imageId = imageId;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listitem, null, true);
        TextView txtTitle = rowView.findViewById(R.id.list_txt);

        ImageView imageView = rowView.findViewById(R.id.list_imgview);
        txtTitle.setText(weapons[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }


}
