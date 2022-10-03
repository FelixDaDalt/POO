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
@Table(name = "tortilla")
@NamedQueries({
    @NamedQuery(name = "Tortilla.findAll", query = "SELECT t FROM Tortilla t"),
    @NamedQuery(name = "Tortilla.findById", query = "SELECT t FROM Tortilla t WHERE t.id = :id"),
    @NamedQuery(name = "Tortilla.findByNombre", query = "SELECT t FROM Tortilla t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tortilla.findByDescripcion", query = "SELECT t FROM Tortilla t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tortilla.findByDisponible", query = "SELECT t FROM Tortilla t WHERE t.disponible = :disponible")})
public class Tortilla implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTortilla")
    private Collection<Tacos> tacosCollection;

    public Tortilla() {
    }

    /* public Tortilla(Integer id) {
        this.id = id;
    } 

    public Tortilla(Integer id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }*/

    public Integer getId() {
        return id;
    }

    /* public void setId(Integer id) {
        this.id = id;
    } */

    public String getNombre() {
        return nombre;
    }

    /* public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

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

   /* public Collection<Tacos> getTacosCollection() {
        return tacosCollection;
    }

    public void setTacosCollection(Collection<Tacos> tacosCollection) {
        this.tacosCollection = tacosCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tortilla)) {
            return false;
        }
        Tortilla other = (Tortilla) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tortilla{Id: ["+this.id+"] - Nombre: ["+this.nombre+"] - Descripcion: ["+this.descripcion+"]";
    }
    
}
