public void removerLivro(String titulo) {

    Livro livro = buscarLivro(titulo);

    if (livro != null) {
        livro.remover(livro);
    }

}

void main() {
}