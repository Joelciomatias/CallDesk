/*
 * Nessa classe são realizadas todas operações em realação ao model do chamado
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model;


public class Chamado extends Usuario  {

    private int id;
    private String titulo;
    private String descricao;
    private String solucao;
    private int IDCategoria;
    private int situacao;
    private String data;
    private int IDUsuario;
  
    
    
    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

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

 

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

 

    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

 
 

/*
    public Usuario getIdUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    */
  
    public Chamado() {
    }

 
    public Chamado(String titulo, String descricao, int IDCategoria, int situacao_id,String data, int IDUsuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.IDCategoria = IDCategoria;
        this.situacao = situacao_id;
        this.data = data;
        this.IDUsuario = IDUsuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }




}
