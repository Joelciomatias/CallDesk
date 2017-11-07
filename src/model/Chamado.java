/*
 * Nessa classe são realizadas todas operações em realação ao model do chamado
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model;

public class Chamado {

    private int id;
    private String titulo;
    private String descricao;
    private Categoria categoria;
    private int status;
    private Usuario usuario;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

  
    public Chamado() {
    }

    public Chamado(String titulo, String descricao, Categoria categoria, int status, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.status = status;
        this.usuario = usuario;
    }

}
