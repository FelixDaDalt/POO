/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author trabajo
 */
@Entity
@Table(name = "relleno")
@NamedQueries({
    @NamedQuery(name = "Relleno.findAll", query = "SELECT r FROM Relleno r"),
    @NamedQuery(name = "Relleno.findById", query = "SELECT r FROM Relleno r WHERE r.id = :id"),
    @NamedQuery(name = "Relleno.findByNombre", query = "SELECT r FROM Relleno r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Relleno.findByDescripcion", query = "SELECT r FROM Relleno r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Relleno.findByDisponible", query = "SELECT r FROM Relleno r WHERE r.disponible = :disponible")})
public class Relleno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "disponible")
    private boolean disponible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRelleno1")
    private Collection<Tacos> tacosCollection;
    @OneToMany(mappedBy = "idRelleno2")
    private Collection<Tacos> tacosCollection1;
    @OneToMany(mappedBy = "idRelleno3")
    private Collection<Tacos> tacosCollection2;

    public Relleno() {
    }

    public Relleno(Integer id) {
        this.id = id;
    }

    public Relleno(Integer id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Collection<Tacos> getTacosCollection() {
        return tacosCollection;
    }

    public void setTacosCollection(Collection<Tacos> tacosCollection) {
        this.tacosCollection = tacosCollection;
    }

    public Collection<Tacos> getTacosCollection1() {
        return tacosCollection1;
    }

    public void setTacosCollection1(Collection<Tacos> tacosCollection1) {
        this.tacosCollection1 = tacosCollection1;
    }

    public Collection<Tacos> getTacosCollection2() {
        return tacosCollection2;
    }

    public void setTacosCollection2(Collection<Tacos> tacosCollection2) {
        this.tacosCollection2 = tacosCollection2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relleno)) {
            return false;
        }
        Relleno other = (Relleno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.Relleno[ id=" + id + " ]";
    }
    
}
