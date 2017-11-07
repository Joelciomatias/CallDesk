/*
 * Nessa classe são realizadas todas operações em realação ao model do usuario
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model;

public class Usuario {
    private int id;
    private String nome;
    private String setor;
    private String email;
    private String ramal;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }


    public Usuario(String nome, String email, String ramal, String setor) {
        
        this.nome = nome;
        this.setor = setor;
        this.email = email;
        this.ramal = ramal;
    }
    

 
    
}
