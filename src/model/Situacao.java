/*
 * Nessa classe tem todos os atributos referentes a classe situação
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model;

import Model.DB.SituacaoDB;

/**
 *
 * @author K
 */
public class Situacao {
    private int idSituacao;
    private String descricao;

    public  Situacao() {
        
      
    }

    public int getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(int idSituacao) {
        this.idSituacao = idSituacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Situacao(String descricao) {
        
        this.descricao = descricao;
    }
    
   public String toString() {
        return getDescricao();
    }
    
}
