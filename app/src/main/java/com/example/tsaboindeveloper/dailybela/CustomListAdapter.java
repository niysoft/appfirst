package com.example.tsaboindeveloper.dailybela;

import android.graphics.Color;
import android.widget.ArrayAdapter;

//package androidinterview.com.customlistviewimagetext;

        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

import java.util.Random;
import java.util.regex.Pattern;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    //private final String[] itemname;
    private final String[] itemAll;
    private final Integer[] imgid;
    private int r, lower = 1, upper = 8;
    private int smallCount = 6;
    private boolean layoutFlag = false;
    public CustomListAdapter(Activity context, Integer[] imgid, String[] itemAll) {
        super(context, R.layout.mylist, itemAll);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemAll=itemAll;
       // this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        View rowView;
        String[] parts = Pattern.compile("-", Pattern.LITERAL).split(itemAll[position]);
        LayoutInflater inflater = context.getLayoutInflater();

        if(position == 0 || position%smallCount == 0){//display big image layout after ever 5 small layout
             rowView = inflater.inflate(R.layout.bigitem, null, true);
        } else {
            if((position-1)%smallCount == 0){//display 2 small layouts side-by-side
                rowView = inflater.inflate(R.layout.two_small_items, null, true);
            } else {//display 5 small layouts linearly
             rowView = inflater.inflate(R.layout.mylist, null, true);
            }
        }
        //View rowView=inflater.inflate(R.layout.mylist, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
        TextView item_date = (TextView) rowView.findViewById(R.id.item_date);


        //txtTitle.setText(parts[1].toUpperCase());
        //txtTitle.setBackgroundColor(Color.parseColor(parts[2]));//setBackgroundColor//setTextColor
        Random R = new Random();
        r =R.nextInt(upper-lower) + lower;
        txtTitle.setText(parts[1].toUpperCase().trim());
        //txtTitle.setBackgroundColor(Color.parseColor(parts[2]));
        txtTitle.setBackgroundColor(Color.parseColor(parts[2].toUpperCase().trim()));//#e57b34
        imageView.setImageResource(imgid[r]);
        extratxt.setText(parts[3].trim());
        item_date.setText("Today");
        return rowView;

    };
}