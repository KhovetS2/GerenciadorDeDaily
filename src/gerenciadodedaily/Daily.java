/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadodedaily;

/**
 *
 * @author isaqu
 */
import java.util.Date;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Daily {
    private int id;
    private String conteudo;
    private Date data;
    private int usuarios_id;
    
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

    public void setData(Date data) {
        this.data = data;
    }

    public int getUsuarios_id() {
        return this.usuarios_id;
    }

    public void setUsuarios_id(int usuarios_id) {
        this.usuarios_id = usuarios_id;
    }
    
    
    public void getDados() {
        Calendar c = Calendar.getInstance();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id: "));
        String conteudo = JOptionPane.showInputDialog("Digite o conteúdo da Daily: ");
        int usuarios_id = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu id de Usuário: "));
        this.id=id;
        this.conteudo=conteudo;
        this.data=c.getTime();
        this.usuarios_id=usuarios_id;
    }
    public void mostrarConteudo() {
        JOptionPane.showMessageDialog(null, "Id: "+id+"\nConteudo: "+conteudo+"\nData:"+data+" \nUsuarios_id:"+usuarios_id+" \n","Sua daily", JOptionPane.INFORMATION_MESSAGE);
    }
}
