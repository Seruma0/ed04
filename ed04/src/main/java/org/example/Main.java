package org.example;


public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        AgendaInterface agendaInterfaceContactos = new Agenda();
        //Inicia la agenda.
        initAgenda(agendaInterfaceContactos);

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Persona c : agendaInterfaceContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agendaInterfaceContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agendaInterfaceContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agendaInterfaceContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : agendaInterfaceContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    private static void initAgenda(AgendaInterface agendaInterfaceContactos) {
        // Añadir contactos a la agenda.
        agendaInterfaceContactos.addContact("John Doe", "1234567890");
        agendaInterfaceContactos.addContact("Jane Doe", "9876543210");
        agendaInterfaceContactos.addContact("Mary Jane", "1122334455");
    }

}