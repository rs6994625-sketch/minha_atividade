public void listarLivros() {

    for (Livro livro : livros) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println();
    }

}

void main() {
}