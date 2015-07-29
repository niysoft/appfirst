package com.example.tsaboindeveloper.dailybela;

import android.app.ActionBar;
import android.content.ContentProvider;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;

import com.example.tsaboindeveloper.dailybela.contentProvider.*;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

//package androidinterview.com.customlistviewimagetext;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity{

    ListView list;
    Spinner spinner;
    String[] itemAll;
    String[] spinnerStr;
    Integer[] imgId;
    TextView selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        itemAll = contentProvider.getNews();
        imgId = contentProvider.getImages();
        spinnerStr = contentProvider.getSpinnerStr();
        //setContentView(getLayoutResource());
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.material_toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }*/
         setContentView(R.layout.activity_main);


        /*selection = (TextView)findViewById(R.id.selection);

        Spinner spin = (Spinner)findViewById(R.id.select_spinner);
        //spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerStr);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);*/


         //Object provider = new contentProvider();


        CustomListAdapter listAdapter = new CustomListAdapter(this, imgId, itemAll);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(listAdapter);


        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                //String Slecteditem= itemname[+position];
                String Slecteditem = itemAll[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        getMenuInflater().inflate(R.menu.menu_items, menu);

       /* View v = (View) menu.findItem(R.id.search).getActionView();

        *//** Get the edit text from the action view *//*
        EditText txtSearch = ( EditText ) v.findViewById(R.id.txt_search);

        *//** Setting an action listener *//*
        txtSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                Toast.makeText(getBaseContext(), "Search : " + v.getText(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });*/
        //inflater.inflate(R.menu.menu_main, menu);

       // spinner = (Spinner) findViewById(R.id.spinnerm);
// Create an ArrayAdapter using the string array and a default spinner layout
        //ArrayAdapter<CharSequence> sadapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
       // sadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        //try {
            //spinner.setAdapter(sadapter);



        return super.onCreateOptionsMenu(menu);
    }
}