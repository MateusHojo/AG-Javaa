public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean disponivel;


    public Livro() {
        this.titulo = "Sem Título";
        this.autor = "Anônimo";
        this.paginas = 0;
        this.disponivel = true;
    }

    public Livro(String titulo, String autor, int paginas) {
        setTitulo(titulo); 
        this.autor = autor;
        setPaginas(paginas);
        this.disponivel = true;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro '" + titulo + "' foi emprestado com sucesso!");
        } else {
            System.out.println("Este livro já está emprestado.");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            this.titulo = "Título Inválido";
        }
    }

    public void setPaginas(int paginas) {
        if (paginas > 0) {
            this.paginas = paginas;
        } else {
            this.paginas = 1;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
    public boolean isDisponivel() { return disponivel; }

    @Override
    public String toString() {
        return String.format("Livro: %s | Autor: %s | Páginas: %d | Status: %s",
                titulo, autor, paginas, (disponivel ? "Disponível" : "Emprestado"));
    }
}