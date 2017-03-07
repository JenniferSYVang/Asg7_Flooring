package jvang.cs.cis3334.asg7_flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    EditText width;
    EditText length;
    Button showResult;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtain user input
        width = (EditText) findViewById(R.id.editTextWidth);
        length = (EditText) findViewById(R.id.editTextLength);
        showResult = (Button) findViewById(R.id.buttonResult);
        show = (TextView) findViewById(R.id.textViewsamp);

        // When the button is pressed put the width and length into the bundle then start the result activity
        showResult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultActIntent = new Intent(MainActivity.this, ResultActivity.class);
                resultActIntent.putExtra("Width", width.getText().toString());
                resultActIntent.putExtra("Length", length.getText().toString());
                startActivity(resultActIntent);
            }
        });

    }
}
