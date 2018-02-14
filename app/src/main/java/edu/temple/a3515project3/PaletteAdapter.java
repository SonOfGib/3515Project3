package edu.temple.a3515project3;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Custom adapter that changes the TextView background to the color of the text it contains.
 * Created by Sean Gibson on 2/13/2018.
 */

public class PaletteAdapter extends BaseAdapter{
    private String[] colors;
    private Context context;
    PaletteAdapter(@NonNull Context context, @NonNull String[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount(){
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        if (view == null) {
            view = inflater.inflate(R.layout.palette_item, viewGroup, false);
        }
        TextView textView = (TextView) view;
        textView.setText(colors[i]);
        textView.setBackgroundColor(Color.parseColor(colors[i]));
        return textView;
    }
}
