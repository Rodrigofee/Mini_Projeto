
package initial.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarForm extends AppCompatActivity {

        String nome;
        String sobrenome;
        String telefone;
        String mesagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_form);

        mesagem = "Cadastrado";
        Button cButton = findViewById(R.id.BottonCadastrar);



        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast message = Toast.makeText(getApplicationContext(), mesagem, Toast.LENGTH_LONG);
                message.show();
                nome = ((EditText) findViewById(R.id.text_nome)).getText().toString();
                sobrenome = ((EditText) findViewById(R.id.text_sobrenome)).getText().toString();
                telefone = ((EditText) findViewById(R.id.text_telefone)).getText().toString();

                Objeto objeto = new Objeto();

                objeto.setNome(nome);
                objeto.setSobrenome(sobrenome);
                objeto.setTelefone(telefone);

                Intent intent=new Intent();
                intent.putExtra("MESSAGE",objeto);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
