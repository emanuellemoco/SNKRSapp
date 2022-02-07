package com.ibm.snkrs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ibm.snkrs.activity.activity.CalendarActivity;
import com.ibm.snkrs.activityFeed.FeedActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void startFeedNikeActivity(View view) {
        Intent feedNikeActivity = new Intent(this, FeedNikeActivity.class);
        startActivity(feedNikeActivity);
    }

    public void showAlertDialog(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("E-mail");
            alert.setMessage("Você aceita os termos de uso?");
            alert.setIcon(android.R.drawable.ic_dialog_info);

            alert.setPositiveButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Pense bem :)", Toast.LENGTH_SHORT).show();

            }
        });
            alert.setNegativeButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "E-mail cadastrado", Toast.LENGTH_SHORT).show();
            }
        });
        alert.create().show();

    }

//    public void sendEmail(View view){
//        EditText campoEmail = findViewById(R.id.editEmail);
//
//        String email = campoEmail.getText().toString();
//
//        campoEmail.setText(" ");
////        campoEmail.setHint("Digite o seu E-mail"); //nao funciona
//    }





}