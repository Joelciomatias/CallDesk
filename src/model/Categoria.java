/*
 * Nessa classe são realizadas todas operações em realação ao model da categoria
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model;

public class Categoria {
    private int id;
    private String descricao;

    public Categoria() {
    }

    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
