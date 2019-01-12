package com.winowicz.CastleSpring.Domain;

import org.springframework.stereotype.Component;

public class Quest {

    private String description;

    public Quest() {

    }

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
