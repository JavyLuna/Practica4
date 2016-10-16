package com.itchihuahuaii.ejemplo4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    EditText txt;
    TextView bill100;
    TextView bill50;
    TextView bill20;
    TextView mon10;
    TextView mon5;
    TextView mon2;
    TextView mon1;
    TextView cen50;
    TextView cen20;
    TextView cen10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn=(Button)findViewById(R.id.button);
        txt=(EditText)findViewById(R.id.editText);
        bill100=(TextView)findViewById(R.id.textView3);
        bill50=(TextView)findViewById(R.id.textView5);
        bill20=(TextView)findViewById(R.id.textView6);
        mon10=(TextView)findViewById(R.id.textView7);
        mon5=(TextView)findViewById(R.id.textView9);
        mon2=(TextView)findViewById(R.id.textView10);
        mon1=(TextView)findViewById(R.id.textView11);
        cen50=(TextView)findViewById(R.id.textView12);
        cen20=(TextView)findViewById(R.id.textView13);
        cen10=(TextView)findViewById(R.id.textView14);
        btn.setOnClickListener(this);


    }
    public void onClick(View v){
        if(v.getId()==R.id.button){
            double aux = Double.parseDouble(txt.getText().toString());
            int num =(int)(aux*100);
            bill100.setText((num/10000)+" billetes de 100");
            num = num%10000;
            bill50.setText(" "+(num/5000)+" billetes de 50");
            num = num%5000;
            bill20.setText(" "+(num/2000)+" billetes de 20");
            num = num%2000;
            mon10.setText(" "+(num/1000)+" monedas de 10");
            num = num%1000;
            mon5.setText(" "+(num/500)+" monedas de 5");
            num = num%500;
            mon2.setText(" "+(num/200)+" monedas de 2");
            num = num%200;
            mon1.setText(" "+(num/100)+" monedas de 1");
            num = num%100;
            cen50.setText(" "+(num/50)+" monedas de .50");
            num = num%50;
            cen20.setText(" "+(num/20)+" monedas de .20");
            num = num%20;
            cen10.setText(" "+(num/10)+" monedas de .10");
            num = num%10;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
