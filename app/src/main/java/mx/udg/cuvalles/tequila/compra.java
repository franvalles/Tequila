package mx.udg.cuvalles.tequila;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import mx.udg.cuvalles.adapter.Tequila;

public class compra extends AppCompatActivity {
    mx.udg.cuvalles.adapter.Tequila Tequila;
    ImageView fondo,imageView2;
    TextView Nombre, descripcion;
    Button btnDetalle;
    EditText etNombre, etDomicilio, etTelefono, etCantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);
        etNombre = (EditText)findViewById(R.id.etNombre);
        etDomicilio = (EditText)findViewById(R.id.etDomicilio);
        etTelefono = (EditText)findViewById(R.id.etTelefono);
        etCantidad = (EditText)findViewById(R.id.etCantidad);



    }

}
