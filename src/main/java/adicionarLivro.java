import java.util.ArrayList;

public class adicionarLivro {

    private ArrayList<Livro> livros;

    public adicionarLivro() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

}