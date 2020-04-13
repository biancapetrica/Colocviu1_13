package ro.pub.cs.systems.eim.colocviu1_13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Colocviu1_13MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button northButton, southButton, eastButton, westButton;
    private Button navigateToSecondaryActivityButton;
    String newCoordinates, oldText;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()) {

                case R.id.north_button:
                    oldText = textView.getText().toString();
                    if (oldText == "") {
                        newCoordinates = "North";
                    } else {
                        newCoordinates = oldText + ", " + "North";
                    }
                    textView.setText(newCoordinates);
                    break;
                case R.id.south_button:
                    oldText = textView.getText().toString();
                    if (oldText == "") {
                        newCoordinates = "South";
                    } else {
                        newCoordinates = oldText + ", " + "South";
                    }
                    textView.setText(newCoordinates);
                    break;
                case R.id.west_button:
                    oldText = textView.getText().toString();
                    if (oldText == "") {
                        newCoordinates = "West";
                    } else {
                        newCoordinates = oldText + ", " + "West";
                    }
                    textView.setText(newCoordinates);
                    break;
                case R.id.east_button:
                    oldText = textView.getText().toString();
                    if (oldText == "") {
                        newCoordinates = "East";
                    } else {
                        newCoordinates = oldText + ", " + "East";
                    }
                    textView.setText(newCoordinates);
                    break;
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocviu1_13_main);

        northButton = (Button)findViewById(R.id.north_button);
        northButton.setOnClickListener(buttonClickListener);
        eastButton = (Button)findViewById(R.id.east_button);
        eastButton.setOnClickListener(buttonClickListener);
        southButton = (Button)findViewById(R.id.south_button);
        southButton.setOnClickListener(buttonClickListener);
        westButton = (Button)findViewById(R.id.west_button);
        westButton.setOnClickListener(buttonClickListener);
        textView = (TextView)findViewById(R.id.text_view);

    }
}
