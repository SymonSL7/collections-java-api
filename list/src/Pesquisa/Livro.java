package Pesquisa;

public class Livro {
     
  //atributos
  private String titulo;
  private String autor;
  private int anoPublicacao;

  public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  @Override
  public String toString() {
    return
        "Titulo: '" + titulo + '\'' +
        ", Autor: '" + autor + '\'' +
        ", Ano de Publicação: " + anoPublicacao;
  }

}
