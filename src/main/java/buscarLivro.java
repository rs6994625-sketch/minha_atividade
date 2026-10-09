public Livro buscarLivro(String titulo) {

    for (Livro livro : livros) {

        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
            return livro;
        }

    }

    return null;
}

void main() {
}