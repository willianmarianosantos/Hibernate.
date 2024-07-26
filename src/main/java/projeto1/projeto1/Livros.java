package projeto1.projeto1;


import jakarta.persistence.*;
import jakarta.servlet.http.HttpServlet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Livros")

public class Livros extends HttpServlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nome;

    private String categoria;

    private int QUANTIDADE;


    public int getQUANTIDADE() {
        return QUANTIDADE;
    }

    public void setQUANTIDADE(int QUANTIDADE) {
        this.QUANTIDADE = QUANTIDADE;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
