/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author isaqu
 */
import java.sql.Date;



public class Daily {
    private int id;
    private String conteudo;
    private Date data;
    private int usuarios_id;
    private String nome;
    private String cargo;
    
    public Daily() {
    }

    public Daily(int id, String conteudo, Date data, int usuarios_id) {
        this.id = id;
        this.conteudo = conteudo;
        this.data = data;
        this.usuarios_id = usuarios_id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getData() {
        return this.data;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public void setData(Date data) {
        this.data = data;
    }

    public int getUsuarios_id() {
        return this.usuarios_id;
    }

    public void setUsuarios_id(int usuarios_id) {
        this.usuarios_id = usuarios_id;
    }
    

    public static void main(String[] args) {
  }
}
    
