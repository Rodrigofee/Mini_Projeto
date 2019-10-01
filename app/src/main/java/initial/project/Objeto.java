package initial.project;

import java.io.Serializable;

public class Objeto implements Serializable {

        private String Nome;
        private String Sobrenome;
        private String Telefone;


    public String getNome() {

        return Nome;
    }

    public void setNome(String nome) {

        Nome = nome;
    }

    public String getSobrenome() {

        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        Sobrenome = sobrenome;
    }

    public String getTelefone() {

        return Telefone;
    }

    public void setTelefone(String telefone) {

        Telefone = telefone;
    }
}
