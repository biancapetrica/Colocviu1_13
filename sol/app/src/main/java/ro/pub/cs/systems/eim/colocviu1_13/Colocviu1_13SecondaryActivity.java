package ro.pub.cs.systems.eim.colocviu1_13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Colocviu1_13SecondaryActivity extends AppCompatActivity {
    private TextView textView;
    private Button registerButton, cancelButton;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.register_button:
                    setResult(1, null);
                    break;
                case R.id.cancel_button:
                    setResult(0, null);
                    break;
            }
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocviu1_13_secondary);

        registerButton = (Button)findViewById(R.id.register_button);
        registerButton.setOnClickListener(buttonClickListener);
        cancelButton = (Button)findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(buttonClickListener);
        textView = (TextView)findViewById(R.id.text_view);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("instructions")) {
            String instructions = intent.getStringExtra("instructions");
            textView.setText(String.valueOf(instructions));
        }
    }
}
