package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * @author Serena
 * @version 1.0
 * Clase para gestionar una agenda de contactos.
 * Pueden agregarse, eliminarse y modificarse los telefonos de los contactos
 * @see Persona
 * @see Main
 */

public class Agenda {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor que inicializa la lista de contactos vacia.
     */
    public Agenda() {
        this.contacts = new ArrayList<>(); // Se crea la lista
    }

    /**
     * Añade un contacto con nombre y número de teléfono
     * Si el nombre del contacto ya existe permite añadir un número de teléfono, sino, crea un contacto nuevo.
     * @param name Nombre del contacto
     * @param phone Teléfono del contacto
     */
    public void addContact(String name, String phone) {
        boolean exists = false; // Variable para comprobar la existencia del contacto
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) { // Comprueba si el nombre del contacto existe
                exists = true;
                c.getPhones().add(phone); // Añade el número de teléfono
                break;
            }
        }

        if (!exists) { // Si el contacto no existe
            Persona newContact = new Persona(name, phone); // Crea un nuevo contacto
            contacts.add(newContact); // Añade el contacto
        }
    }

    /**
     * Elimina un contacto existente de la agenda.
     * @param name Nombre del contacto
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator(); //Recorre la lista de contactos

        while (it.hasNext()) { // Bucle para iterar sobre los contactos
            Persona c = it.next(); // Obtiene el siguiente contacto

            if (c.getName().equalsIgnoreCase(name)) { //Encuentra el contacto
                it.remove(); //Elimina el contato de la lista
            }
        }
    }

    /**
     * Modifica un número de teléfono de un contacto existente
     * @param name Nombre del contacto
     * @param oldPhone El número de teléfono que queremos modificar
     * @param newPhone El nuevo número de teléfono
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) { //Comprueba la lista de contactos
            if (c.getName().equalsIgnoreCase(name)) { //Encuentra un contacto con el mismo nombre
                List<String> phones = c.getPhones(); // Obtiene la lista de los teléfonos del contacto

                int index = phones.indexOf(oldPhone); 

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de los cntactos de la agenda
     * @return Devuelve la lista de los objeto contacto
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}