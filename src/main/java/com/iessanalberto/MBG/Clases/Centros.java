package com.iessanalberto.MBG.Clases;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name="centro")
@XmlType(propOrder= {"nombre","proyectos","web","contacto","profesor","familia_Profesional","alumno"})

public class Centros {

    private String nombre, web, familia_Profesional;
    private int contacto;
    private ListaProyectos proyectos;
    private Profesor profesor;
    private Alumnos alumno;

    public Centros(String nombre, String web, String familia_Profesional, int contacto, ListaProyectos proyecto, Profesor profesor,
                   Alumnos alumno) {
        super();
        this.nombre = nombre;
        this.web = web;
        this.familia_Profesional = familia_Profesional;
        this.contacto = contacto;
        this.profesor = profesor;
        this.alumno = alumno;
        this.proyectos = proyecto;
    }

    public Centros() {
    }

    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @XmlElement(name = "proyectos")
    public ListaProyectos getProyectos() {
        return proyectos;
    }

    public void setlistaProyectos(ListaProyectos proyectos) {
        this.proyectos = proyectos;
    }


    @XmlElement(name = "web")
    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }


    @XmlElement(name = "contacto")
    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    @XmlElement(name = "profesor")
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @XmlElement(name = "familia_Profesional")
    public String getFamilia_Profesional() {
        return familia_Profesional;
    }

    public void setFamilia_Profesional(String familia_Profesional) {
        this.familia_Profesional = familia_Profesional;
    }

    @XmlElement(name = "alumno")
    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }
}

