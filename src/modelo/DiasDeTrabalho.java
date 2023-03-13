package modelo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DiasDeTrabalho {
    private int id;
    private int usuarios_id;
    private int dias;
    private String hora_de_inicio;
    private String hora_de_termino;


    public DiasDeTrabalho() {
    }

    public DiasDeTrabalho(int id, int usuarios_id, int dias, String hora_de_inicio, String hora_de_termino) {
        this.id = id;
        this.usuarios_id = usuarios_id;
        this.dias = dias;
        this.hora_de_inicio = hora_de_inicio;
        this.hora_de_termino = hora_de_termino;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarios_id() {
        return this.usuarios_id;
    }

    public void setUsuarios_id(int usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getHora_de_inicio() {
        return this.hora_de_inicio;
    }

    public void setHora_de_inicio(String hora_de_inicio) {
        this.hora_de_inicio = hora_de_inicio;
    }

    public String getHora_de_termino() {
        return this.hora_de_termino;
    }

    public void setHora_de_termino(String hora_de_termino) {
        this.hora_de_termino = hora_de_termino;
    }

    public DiasDeTrabalho id(int id) {
        setId(id);
        return this;
    }

    public DiasDeTrabalho usuarios_id(int usuarios_id) {
        setUsuarios_id(usuarios_id);
        return this;
    }

    public DiasDeTrabalho dias(int dias) {
        setDias(dias);
        return this;
    }

    public DiasDeTrabalho hora_de_inicio(String hora_de_inicio) {
        setHora_de_inicio(hora_de_inicio);
        return this;
    }

    public DiasDeTrabalho hora_de_termino(String hora_de_termino) {
        setHora_de_termino(hora_de_termino);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", usuarios_id='" + getUsuarios_id() + "'" +
            ", dias='" + getDias() + "'" +
            ", hora_de_inicio='" + getHora_de_inicio() + "'" +
            ", hora_de_termino='" + getHora_de_termino() + "'" +
            "}";
    }

}
