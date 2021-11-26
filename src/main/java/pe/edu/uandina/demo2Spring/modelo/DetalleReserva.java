package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "DetalleReserva")
public class DetalleReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "ingreso")
    private LocalDate ingreso;
    @Column(name = "salida")
    private LocalDate salida;
    @Column(name = "precio")
    private float precio;
    @Column(name = "adelanto")
    private float adelanto;
    @Column(name = "dias")
    private int dias;

   // cliente
    @ManyToOne
    @JoinColumn(name = "tieneDetalleReserva", referencedColumnName = "id")
    @JsonBackReference(value = "tieneDetalleReserva")
    private Cliente tieneDetalleReserva;


    @OneToMany(mappedBy = "tieneRestaurante")
    @JsonManagedReference(value = "tieneRestaurante")
    private List<Restaurante> restaurantes;

    @ManyToOne
    @JoinColumn(name = "tieneHabitacion", referencedColumnName = "id")
    @JsonBackReference(value = "tieneHabitacion")
    private Habitacion tieneHabitacion;


    public DetalleReserva() {
    }

    public DetalleReserva(LocalDate ingreso, LocalDate salida, float precio, float adelanto, Integer dias) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.precio = precio;
        this.adelanto = adelanto;
        this.dias = dias;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(float adelanto) {
        this.adelanto = adelanto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Habitacion getTieneHabitacion() {
        return tieneHabitacion;
    }

    public void setTieneHabitacion(Habitacion tieneHabitacion) {
        this.tieneHabitacion = tieneHabitacion;
    }

    public Cliente getTieneDetalleReserva() {
        return tieneDetalleReserva;
    }

    public void setTieneDetalleReserva(Cliente tieneDetalleReserva) {
        this.tieneDetalleReserva = tieneDetalleReserva;
    }

    public List<Restaurante> getDetalleReservas() {
        return restaurantes;
    }

    public void setDetalleReservas(List<Restaurante> detalleReservas) {
        this.restaurantes = detalleReservas;
    }
}
