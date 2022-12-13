package com.iessanalberto.MBG.Clases;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="usuarios")
public class Usuarios {

    private List<Usuario> listaUsuarios;
    @XmlElement(name = "usuario")
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
