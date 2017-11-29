package mx.udg.cuvalles.tequila;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import mx.udg.cuvalles.adapter.Tequila;

public class detalle extends AppCompatActivity {

    Tequila Tequila;
    ImageView fondo,imageView2;
    TextView Nombre, descripcion;
    Button btnDetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Tequila = getIntent().getParcelableExtra("Tequila");
        fondo = (ImageView) findViewById(R.id.fondo);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        Nombre = (TextView) findViewById(R.id.Nombre);
        btnDetalle = (Button) findViewById(R.id.btnDetalle);
        descripcion = findViewById(R.id.tvDescripcion);
        descripcion.setText(Tequila.getDescripcion());
        Picasso.with(this).load(Tequila.getFoto()).into(fondo);
        Nombre.setText(Tequila.getNombre());
        btnDetalle.setText(Tequila.getDescripcion());
        btnDetalle =(Button) findViewById(R.id.btnDetalle);
        btnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent bttDetalle = new Intent(detalle.this , compra.class);
             startActivity(bttDetalle);
            }
        });
        }
    }
