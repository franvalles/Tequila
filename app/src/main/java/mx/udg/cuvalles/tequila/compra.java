package mx.udg.cuvalles.tequila;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;

import java.lang.reflect.Method;

import mx.udg.cuvalles.adapter.Tequila;

public class compra extends AppCompatActivity implements View.OnClickListener {

    Tequila tequila;
    ImageView fondo,imageView2;
    TextView Nombre, descripcion;
    Button btnDetalle;
    EditText etNombre, etDomicilio, etTelefono, etCantidad;
    String NTequila, DTequila;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etDomicilio = (EditText)findViewById(R.id.etDomicilio);
        etTelefono = (EditText)findViewById(R.id.etTelefono);
        etCantidad = (EditText)findViewById(R.id.etCantidad);
        btnDetalle  =(Button) findViewById(R.id.btnCompra);

       // NTequila = tequila.getNombre();
        //DTequila =tequila.getDescripcion();

        btnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegistroTequila(etNombre.getText().toString(),etDomicilio.getText().toString(),etTelefono.getText().toString(),etCantidad.getText().toString());
            }
        });



    }
private void RegistroTequila(String etNombre, String etDomicilio, String etTelefono, String etCantidad){

    RequestQueue queue = Volley.newRequestQueue(this);
    String url = "http://10.225.218.148/lugar/tequila.php?nombre="+etNombre+"&domicilio="+etDomicilio+"&telefono="+etTelefono+"&id_producto="+""+"&cant="+etCantidad;

    StringRequest request = new StringRequest(com.android.volley.Request.Method.GET,
            url, new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            Toast.makeText(compra.this,""+response, Toast.LENGTH_LONG).show();
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {

            Toast.makeText(compra.this, ""+error.getMessage(), Toast.LENGTH_LONG).show();
        }
    }


    );

    queue.add(request);
}


    @Override
    public void onClick(View view) {

    }
}