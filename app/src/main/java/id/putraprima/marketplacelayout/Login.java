package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Register (View view) {
        Intent iten = new Intent(Login.this, Register.class);
        startActivity(iten);
    }
    public void Profile (View view) {
        Intent iten = new Intent(Login.this, Profile.class);
        startActivity(iten);
    }
    public void PrevLog (View view) {
        Intent iten = new Intent(Login.this, MainActivity.class);
        startActivity(iten);
    }
}
