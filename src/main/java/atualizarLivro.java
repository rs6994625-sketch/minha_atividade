public void atualizarLivro(String titulo, String novoAutor) {

    Livro livro = buscarLivro(titulo);

    if (livro != null) {
        livro.setAutor(novoAutor);
    }

}

void main() {
}