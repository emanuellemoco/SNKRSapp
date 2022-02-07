package com.ibm.snkrs.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.ibm.snkrs.activityFeed.FeedActivity;
import com.ibm.snkrs.MainActivity;
import com.ibm.snkrs.R;
import com.ibm.snkrs.activity.adapter.Adapter;
import com.ibm.snkrs.activity.model.Calendario;

import java.util.ArrayList;
import java.util.List;

public class CalendarActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Calendario> listaCalendario = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        recyclerView = findViewById(R.id.recyclerView);

        // Listagem do calendario
        this.criarCalendario();


        // Configurar adapter
        Adapter adapter = new Adapter( listaCalendario );

        // Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration( this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter); //recebe os dados, formata e msotra
    }


    public void criarCalendario(){
        Calendario calendario = new Calendario("Nike Dunk Low Light Violet", "7", "fev/22", R.drawable.airmax1);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("NBA x Nike Dunk Low Chicago", "8", "fev/22", R.drawable.imagem1);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("Nike Air Max 90 Siempre Familia", "15", "fev/22", R.drawable.imagem2);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("NBA x Nike Dunk Low Chicago", "17", "fev/22", R.drawable.imagem3);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("Tênis legal", "18", "fev/22", R.drawable.image4);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("Adidas Yeezy", "25", "fev/22", R.drawable.image6);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("Nike Dunk Low Light Violet", "7", "mar/22", R.drawable.airmax1);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("NBA x Nike Dunk Low Chicago", "8", "mar/22", R.drawable.imagem1);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("Nike Air Max 90 Siempre Familia", "15", "mar/22", R.drawable.imagem2);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("NBA x Nike Dunk Low Chicago", "18", "mar/22", R.drawable.imagem3);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("Tênis legal", "23", "mar/22", R.drawable.image4);
        this.listaCalendario.add( calendario );

        calendario = new Calendario("Adidas Yeezy", "8", "fev/22", R.drawable.image6);
        this.listaCalendario.add( calendario );

    }



    public void startHomeActivity(View view) {
        Intent homeActivity = new Intent(this, MainActivity.class);
        startActivity(homeActivity);
    }

    public void startCalendarActivity(View view) {
        Intent calendarActivity = new Intent(this, CalendarActivity.class);
        startActivity(calendarActivity);
    }
    public void startFeedActivity(View view) {
        Intent feedActivity = new Intent(this, FeedActivity.class);
        startActivity(feedActivity);
    }
}