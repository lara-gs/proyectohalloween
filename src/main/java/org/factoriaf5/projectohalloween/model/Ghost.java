package org.factoriaf5.projectohalloween.model;

import jakarta.persistence.Entity;

@Entity
public class Ghost extends Villains {
    public Ghost() {
        super(15, 7);
    }

    @Override
    public void defeated(Aiden jugador) {
        jugador.setScore(jugador.getScore() + 15);
    }
}