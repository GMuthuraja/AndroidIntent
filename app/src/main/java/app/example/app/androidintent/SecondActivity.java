package app.example.app.androidintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String name;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle param = getIntent().getExtras();
        if(param != null) {
            name = param.getString("name");
            id = param.getInt("id");
        }

        TextView userDetails = (TextView) findViewById(R.id.textView);
        userDetails.setText("Name: "+name+"\n"+"Id: "+id);

    }
}
