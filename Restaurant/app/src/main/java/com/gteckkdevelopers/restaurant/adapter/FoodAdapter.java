package com.gteckkdevelopers.restaurant.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gteckkdevelopers.restaurant.R;
import com.gteckkdevelopers.restaurant.model.Model;

import java.util.ArrayList;

/**
 *
 * Created by Ifeanyichuku on 5/22/2018.
 */

public class FoodAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Model> models;

    public FoodAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            convertView= View.inflate(context, R.layout.list_restaurant, null);

        }

        ImageView images = (ImageView) convertView.findViewById(R.id.restImg);
        TextView title = (TextView) convertView.findViewById(R.id.restName);
        TextView about = (TextView) convertView.findViewById(R.id.restDesc);
        Model model = models.get(position);
        images.setImageResource(model.getRestImage());
        title.setText(model.getResaurantTitle());
        about.setText(model.getRestaurantDet());

        return convertView;
    }
}
