package initial.project;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import java.util.ArrayList;
        import java.util.List;

public class LayoutHome extends AppCompatActivity {

    ArrayList<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_home);

        Button cButton = findViewById(R.id.Homecadastrar);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), CadastrarForm.class);
                startActivityForResult(intent, RESULT_OK);
            }
        });
        Button lButton = findViewById(R.id.Homelistar);

        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ListaDados.class);
                intent.putStringArrayListExtra("message_key", lista);
                startActivity(intent);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        // Verfica se o requestCode é o mesmo que foi passado
        if(requestCode==1 && resultCode == RESULT_OK)
        {
            String objeto = data.getStringExtra("MESSAGE");
            lista.add(objeto);
        }
    }
}
