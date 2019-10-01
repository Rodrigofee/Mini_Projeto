package initial.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;



public class ListaDados extends AppCompatActivity {

    ListView lista;
    ArrayAdapter<String> adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_dados);

        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getIntent().getStringArrayExtra("message_key"));
           lista = (ListView) findViewById(R.id.lista);

            lista.setAdapter(adaptador);


        Button vButton = findViewById(R.id.voltar);

        vButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });
    }
}
