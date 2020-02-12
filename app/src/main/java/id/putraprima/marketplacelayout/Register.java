package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void NextReg (View view) {
        Intent iten = new Intent (Register.this, Login.class);
        startActivity(iten);
    }

    public void PrevReg (View view) {
        Intent iten = new Intent (Register.this, Login.class);
        startActivity(iten);
    }

}

