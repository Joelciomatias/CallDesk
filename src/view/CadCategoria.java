/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author K
 */
@Entity
@Table(name = "cad_categoria", catalog = "calldesk", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadCategoria.findAll", query = "SELECT c FROM CadCategoria c")
    , @NamedQuery(name = "CadCategoria.findByCategoriaId", query = "SELECT c FROM CadCategoria c WHERE c.categoriaId = :categoriaId")
    , @NamedQuery(name = "CadCategoria.findByNome", query = "SELECT c FROM CadCategoria c WHERE c.nome = :nome")
    , @NamedQuery(name = "CadCategoria.findByDescricao", query = "SELECT c FROM CadCategoria c WHERE c.descricao = :descricao")})
public class CadCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categoria_id")
    private Integer categoriaId;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;

    public CadCategoria() {
    }

    public CadCategoria(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaId != null ? categoriaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadCategoria)) {
            return false;
        }
        CadCategoria other = (CadCategoria) object;
        if ((this.categoriaId == null && other.categoriaId != null) || (this.categoriaId != null && !this.categoriaId.equals(other.categoriaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.CadCategoria[ categoriaId=" + categoriaId + " ]";
    }
    
}
