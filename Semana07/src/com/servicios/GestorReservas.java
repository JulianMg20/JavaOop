package com.servicios;

public class GestorReservas {

    public void agregarReserva(Reserva r) {
        try {
            if (r == null) throw new IllegalArgumentException("Reserva nula");
            if (r.getCliente() == null) throw new IllegalArgumentException("Cliente inválido");
            if (r.getFecha() == null) throw new IllegalArgumentException("Fecha inválida");

            // lógica...
            System.out.println("Reserva agregada");
        } catch (Exception e) {
            System.out.println("Error al agregar reserva: " + e.getMessage());
        }
    }
}

