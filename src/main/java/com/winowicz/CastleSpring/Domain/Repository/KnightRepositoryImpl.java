package com.winowicz.CastleSpring.Domain.Repository;

import com.winowicz.CastleSpring.Domain.Knight;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class KnightRepositoryImpl implements KnightRepository {

    Map<String, Knight> knights = new HashMap<>();

    public KnightRepositoryImpl() {

    }

    @Override
    public void createKnight(String name, int age) {
        knights.put(name, new Knight(name, age));
    }

    @Override
    public Collection<Knight> getAllKnights() {
        return knights.values();
    }

    @Override
    public Knight getKnight(String name) {
        return knights.get(name);
    }

    @Override
    public void deleteKnight(String name) {
        knights.remove(name);
    }

    @Override
    @PostConstruct
    public void build() {
        createKnight("Lancelot",24);
        createKnight("Percival",22);
    }






}
