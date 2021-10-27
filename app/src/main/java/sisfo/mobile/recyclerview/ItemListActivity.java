package sisfo.mobile.recyclerview;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static sisfo.mobile.recyclerview.Datavalues.casts;
import static sisfo.mobile.recyclerview.Datavalues.detailfilm;
import static sisfo.mobile.recyclerview.Datavalues.gambarfilm;
import static sisfo.mobile.recyclerview.Datavalues.namafilm;

public class ItemListActivity extends AppCompatActivity {

    ListView listView;
    private DataAdapter adapter;
    private ArrayList<DataFilm> dataFilmsmain;
    private String[] dataDetil;
    private String[] dataJudul;
    private int[] dataPhoto;
    private String[] dataAktor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Catalog Movie");

        //TO DO 1
    }

    //TO DO 2
    private void prepare(){


    }

    //TO DO 3
    private void additem(){

    }

}
