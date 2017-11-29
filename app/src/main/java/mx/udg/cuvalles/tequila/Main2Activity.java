package mx.udg.cuvalles.tequila;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mx.udg.cuvalles.adapter.Tequila;
import mx.udg.cuvalles.adapter.TequilaAdapter;


public class Main2Activity extends AppCompatActivity {
    ArrayList<Tequila> listaTequilas;
    RecyclerView recyclerView;
    TequilaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerTequilas);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),1));
        recyclerView.setHasFixedSize(true);
        listaTequilas = new ArrayList<>();

        listaTequilas.add(new Tequila("Tequila Reposado","https://www.despensavaldes.com/WebRoot/Store/Shops/despensavaldes/53EB/ADBA/2120/E8D0/5810/55EE/0960/BA69/don-julio-reposado-tequila.jpg","Descripción 1"));
        listaTequilas.add(new Tequila("Tequila Blanco","https://bodegasalianza.vteximg.com.br/arquivos/ids/157081-1000-1000/25239-1.jpg?v=636058315772800000","Descripción 2"));
        listaTequilas.add(new Tequila("Tequila Añejo","http://www.armbev.com/wp-content/uploads/2015/07/don-julio-anejo.jpg","Descripción 3"));

        adapter = new TequilaAdapter(listaTequilas,this);

        recyclerView.setAdapter(adapter);

    }
}
