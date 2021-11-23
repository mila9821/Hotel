package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurante")
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nomPlato")
    private String nomPlato;
    @Column(name = "precioPlato")
    private float precioPlato;
    @Column(name = "foto")
    private String foto;

    //    pertenece a un detalleReserva
    @ManyToOne
    @JoinColumn(name = "tieneRestaurante", referencedColumnName = "id")
    @JsonBackReference
    private DetalleReserva tieneRestaurante;

    public Restaurante() {
    }

    public Restaurante(String nomPlato, float precioPlato, String foto) {
        this.nomPlato = nomPlato;
        this.precioPlato = precioPlato;
        this.foto = foto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomPlato() {
        return nomPlato;
    }

    public void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }

    public float getPrecioPlato() {
        return precioPlato;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setPrecioPlato(float precioPlato) {
        this.precioPlato = precioPlato;
    }

    public DetalleReserva getTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(DetalleReserva tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }
}
