package com.winowicz.CastleSpring.Domain.Repository;

import com.winowicz.CastleSpring.Domain.Quest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {
    List<Quest> questList = new ArrayList<>();

    public void createQuest(String description) {
        questList.add(new Quest(description));
    }

    public List<Quest> getAll() {
        return questList;
    }

    public void deleteQuest(Quest quest) {
        questList.remove(quest);
    }

    Random random = new Random();

    @PostConstruct
    public void init() {
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Save princess");
        descriptions.add("Go to tournament");
        descriptions.add("Kill 4 Goblins");
        descriptions.add("Kill dragon");
        descriptions.add("Find Wizzard");

        String description = descriptions.get(random.nextInt(descriptions.size()));
        createQuest(description);

    }
}
