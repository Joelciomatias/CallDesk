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
    @NamedQuery(name = "CadCategoria_1.findAll", query = "SELECT c FROM CadCategoria_1 c")
    , @NamedQuery(name = "CadCategoria_1.findByCategoriaId", query = "SELECT c FROM CadCategoria_1 c WHERE c.categoriaId = :categoriaId")
    , @NamedQuery(name = "CadCategoria_1.findByNome", query = "SELECT c FROM CadCategoria_1 c WHERE c.nome = :nome")
    , @NamedQuery(name = "CadCategoria_1.findByDescricao", query = "SELECT c FROM CadCategoria_1 c WHERE c.descricao = :descricao")})
public class CadCategoria_1 implements Serializable {

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

    public CadCategoria_1() {
    }

    public CadCategoria_1(Integer categoriaId) {
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
        if (!(object instanceof CadCategoria_1)) {
            return false;
        }
        CadCategoria_1 other = (CadCategoria_1) object;
        if ((this.categoriaId == null && other.categoriaId != null) || (this.categoriaId != null && !this.categoriaId.equals(other.categoriaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.CadCategoria_1[ categoriaId=" + categoriaId + " ]";
    }
    
}
