
package initial.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarForm extends AppCompatActivity {

    String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_form);


        Button cButton = findViewById(R.id.BottonCadastrar);
        cButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                content = ((EditText) findViewById(R.id.text_nome)).getText().toString();

                Intent intent = new Intent(getApplicationContext(), ListaDados.class);
                intent.putExtra("message_key", content);
                startActivity(intent);
            }
        });
    }


}
