package com.winowicz.CastleSpring.Domain.Repository;

import com.winowicz.CastleSpring.Domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

public class DBKnightRepository implements KnightRepository {

    @Override
    public void createKnight(String name, int age) {
        System.out.println("DB Access");
    }

    @Override
    public Collection<Knight> getAllKnights() {
        System.out.println("DB Access");
        return null;
    }

    @Override
    public Knight getKnight(String name) {
        System.out.println("DB Access");
        return null;
    }

    @Override
    public void deleteKnight(String name) {
        System.out.println("DB Access");
    }

    @Override
    @PostConstruct
    public void build() {

    }
}
