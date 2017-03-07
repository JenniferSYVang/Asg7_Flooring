package jvang.cs.cis3334.asg7_flooring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    // Declaring variables
    TextView totalFlooring;
    TextView displayWidth;
    TextView displayLength;
    String wid;
    Double width;
    String len;
    Double length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // link variable w/screen components
        totalFlooring = (TextView) findViewById(R.id.textViewFlooringNeeded);
        displayWidth = (TextView) findViewById(R.id.textViewDisplayWidth);
        displayLength = (TextView) findViewById(R.id.textViewDisplayLength);

        // set bundle up and get contents
        Bundle extras = getIntent().getExtras();
        wid = extras.getString("Width");
        len = extras.getString("Length");

        // turn string to double
        width = Double.parseDouble(wid);
        length = Double.parseDouble(len);

        // display info
        displayWidth.setText("Width = " + wid);
        displayLength.setText("Length = " + len);
        totalFlooring.setText("Flooring needed: " + width*length);
    }
}
