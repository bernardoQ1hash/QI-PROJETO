package model;

import database.UsuarioDAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;


public class Usuario {
    private int cod;
    private String tipo;
    private String nome;
    private String maezinha;
    private String sexo;
    private Date nascimento;
    private String cpf;
    private String cnh;
    private String fone;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String senha;
    
    public Usuario() {}

    public Usuario(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public Usuario(String tipo, String nome, String cpf) {
        this.tipo = tipo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Usuario(String tipo, String nome, String maezinha, String sexo, Date nascimento, String cpf, String cnh, String fone, String logradouro, int numero, String complemento, String bairro, String senha) {
        this.tipo = tipo;
        this.nome = nome;
        this.maezinha = maezinha;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.cnh = cnh;
        this.fone = fone;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.senha = senha;
    }
   

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaezinha() {
        return this.maezinha;
    }

    public void setMaezinha(String maezinha) {
        this.maezinha = maezinha;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean login() throws ClassNotFoundException, SQLException {
        boolean key = false;
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList<Usuario> list = dao.getAllUsers();
        
        for(Usuario u : list) {
            if( u.getCpf().equals(this.cpf) ) {
                if( u.getSenha().equals(this.senha) ) {
                    key = true;
                }
            }
        }       
        return key;
    }
    
    @Override
    public String toString() {
        return "{" +
            " cod='" + getCod() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", nome='" + getNome() + "'" +
            ", maezinha='" + getMaezinha() + "'" +
            ", sexo='" + getSexo() + "'" +
            ", nascimento='" + getNascimento() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", cnh='" + getCnh() + "'" +
            ", fone='" + getFone() + "'" +
            ", logradouro='" + getLogradouro() + "'" +
            ", numero='" + getNumero() + "'" +
            ", complemento='" + getComplemento() + "'" +
            ", bairro='" + getBairro() + "'" +
            ", senha='" + getSenha() + "'" +
            "}";
    }

}