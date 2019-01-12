package com.winowicz.CastleSpring;

import com.winowicz.CastleSpring.Domain.Repository.KnightRepositoryImpl;
import com.winowicz.CastleSpring.Domain.Repository.QuestRepository;
import com.winowicz.CastleSpring.Services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepositoryImpl knightRepositoryImpl;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... strings) throws Exception {

        questRepository.createRandomQuest();
        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        questService.assignRandomQuest("Lancelot");
        questService.assignRandomQuest("Percival");

        System.out.println(knightRepositoryImpl.getKnight("Lancelot"));
        System.out.println(knightRepositoryImpl.getKnight("Percival"));

    }

}
