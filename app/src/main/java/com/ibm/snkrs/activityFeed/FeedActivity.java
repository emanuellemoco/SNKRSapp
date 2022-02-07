package com.ibm.snkrs.activityFeed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ibm.snkrs.MainActivity;
import com.ibm.snkrs.R;
import com.ibm.snkrs.activity.activity.CalendarActivity;
import com.ibm.snkrs.activityFeed.adapter.PostagemAdapter;
import com.ibm.snkrs.activityFeed.model.Postagem;

import java.util.ArrayList;
import java.util.List;


public class FeedActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;

    private List<Postagem> postagens = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerPostagem = findViewById(R.id.recyclerAdidas);

        // Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager( layoutManager );

        // define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter( adapter );
    }


    public void prepararPostagens(){
        Postagem p = new Postagem("Mocha", "R$ 1.000,00", "40", R.drawable.jordanmocha);
        this.postagens.add(p);

        p = new Postagem("Outro tenis", "R$ 2.000,00", "40", R.drawable.feed1);
        this.postagens.add( p );

        p = new Postagem("Mais um tenis legal", "R$ 1.500,00", "41", R.drawable.feed2);
        this.postagens.add( p );
        p = new Postagem("la la la ala ", "R$ 2.000,00", "40", R.drawable.feed3);
        this.postagens.add( p );
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