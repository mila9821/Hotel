package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "testimonio")
public class Testimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "contenido")
    private String contenido;
    @Column(name = "estado")
    private int estado;

    @ManyToOne
    @JoinColumn(name = "tieneTestimonio", referencedColumnName = "id")
    @JsonBackReference (value = "tieneTestimonio")
    private Cliente tieneTestimonio;

    public Testimonio() {
    }

    public Testimonio(String contenido, int estado) {
        this.contenido = contenido;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
