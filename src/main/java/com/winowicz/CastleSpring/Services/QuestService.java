package com.winowicz.CastleSpring.Services;

import com.winowicz.CastleSpring.Domain.Quest;
import com.winowicz.CastleSpring.Domain.Repository.KnightRepositoryImpl;
import com.winowicz.CastleSpring.Domain.Repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepositoryImpl knightRepositoryImpl;


    @Autowired
    QuestRepository questRepository;

    final static Random rand= new Random();

    public void assignRandomQuest(String knightName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        knightRepositoryImpl.getKnight(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);
    }

}
