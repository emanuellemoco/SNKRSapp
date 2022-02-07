package com.ibm.snkrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import com.ibm.snkrs.activity.activity.CalendarActivity;
import com.ibm.snkrs.activityFeed.FeedActivity;

public class FeedNikeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_nike);
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

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox)view).isChecked();

//         Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxFem:
                if (checked)
                    Log.d("STATE", "checkFEM" );
                else
                    Log.d("STATE", "UNcheckFEM" );
                break;
            case R.id.checkBoxMas:
                if (checked)
                    Log.d("STATE", "checkMAS" );
                else
                    Log.d("STATE", "UNcheckMAS" );

                break;
        }
    }

}