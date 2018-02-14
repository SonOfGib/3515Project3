package edu.temple.a3515project3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Custom adapter that changes the TextView background to the color of the text it contains.
 * Created by Sean Gibson on 2/13/2018.
 */

public class PaletteAdapter extends BaseAdapter{
    String[] colors;
    public PaletteAdapter(String[] colors) {
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if(view == null){
            view = new TextView();
        }
        textView.setText(colors[i]);
        textView.setBackgroundColor(Color.parseColor(colors[i]));
        return view;
    }
}
