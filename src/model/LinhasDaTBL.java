/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author lucas
 */
public class LinhasDaTBL {
    private int chamadoID;
    private String chamadoTitulo;
    private String situacaoChamado;
    private String categoriaChamado;
    private String dataAbertura;
    private String requerente;
    private String tecnico;

    public int getChamadoID() {
        return chamadoID;
    }

    public void setChamadoID(int chamadoID) {
        this.chamadoID = chamadoID;
    }

    public String getChamadoTitulo() {
        return chamadoTitulo;
    }

    public void setChamadoTitulo(String chamadoTitulo) {
        this.chamadoTitulo = chamadoTitulo;
    }

    public String getSituacaoChamado() {
        return situacaoChamado;
    }

    public void setSituacaoChamado(String situacaoChamado) {
        this.situacaoChamado = situacaoChamado;
    }

    public String getCategoriaChamado() {
        return categoriaChamado;
    }

    public void setCategoriaChamado(String categoriaChamado) {
        this.categoriaChamado = categoriaChamado;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getRequerente() {
        return requerente;
    }

    public void setRequerente(String requerente) {
        this.requerente = requerente;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    
    
}
