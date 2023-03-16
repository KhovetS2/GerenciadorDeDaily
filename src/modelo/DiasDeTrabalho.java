package modelo;


public class DiasDeTrabalho {
    private int id;
    private int usuarios_id;
    private int dias;


    public DiasDeTrabalho() {
    }

    public DiasDeTrabalho(int id, int usuarios_id, int dias) {
        this.id = id;
        this.usuarios_id = usuarios_id;
        this.dias = dias;
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

   

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", usuarios_id='" + getUsuarios_id() + "'" +
            ", dias='" + getDias() + "'" +
            "}";
    }

}
