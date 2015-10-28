package sample.example.com.sampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{
//hai from shambhi
    Button button1;
int duration=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Toast.makeText(this,"Hai from second app",Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v)
    {
        Toast.makeText(this, "Hai from second app", Toast.LENGTH_SHORT).show();
    }
}
