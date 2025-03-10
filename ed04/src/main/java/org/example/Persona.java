package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para crear un contacto para la agenda, con nombre y número de teléfono.
 * @author Serena
 * @version 1.0
 * @see Agenda
 * @see Main
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor de Persona.
     * @param name Nombre del contacto
     * @param phone Número de teléfono
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Obtiene el nombre del contacto
     * @return Nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la Arraylist de los números de teléfono
     * @return La Arraylist con los números de teléfono
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}