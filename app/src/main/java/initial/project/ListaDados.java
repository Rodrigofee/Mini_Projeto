package initial.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaDados extends AppCompatActivity {

    ListView lista;
    List<String> listaDados;
    ArrayAdapter<String> adaptador;
    String newTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_dados);


    lista = (ListView) findViewById(R.id.lista);
    listaDados = new ArrayList<String>();
    adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaDados);

    newTexto = getIntent().getStringExtra("message_key");

    listaDados.add(newTexto);
    adaptador.notifyDataSetChanged();

    lista.setAdapter(adaptador);


        Button vButton = findViewById(R.id.voltar);

        vButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), LayoutHome.class);
                startActivity(intent);
            }
        });
    }
}
