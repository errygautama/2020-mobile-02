package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Next (View view) {
        Intent iten = new Intent(MainActivity.this, Login.class);
        startActivity(iten);
    }


}
