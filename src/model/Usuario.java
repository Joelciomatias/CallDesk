/*
 * Nessa classe tem todos os atributos referentes a classe usuario
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model;

public class Usuario {
    private int id;
    private String nome;
    private String setor;
    private String email;
    private int ramal;
    private String senha;
    private int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
 

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

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

    public Usuario(String nome, String setor, String email, int ramal, String senha, int tipo) {
        super();
        this.nome = nome;
        this.setor = setor;
        this.email = email;
        this.ramal = ramal;
        this.senha = senha;
        this.tipo = tipo;
    }
    

 
    
}
