package mx.udg.cuvalles.tequila;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.udg.cuvalles.adapter.Tequila;
import mx.udg.cuvalles.adapter.TequilaAdapter;

public class MainActivity extends AppCompatActivity {

    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrar = (Button)findViewById(R.id.btnEntrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent entrar;
                entrar = new Intent(MainActivity.this ,Main2Activity.class);
                startActivity(entrar);

            }
        });
    }
}
