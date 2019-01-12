package com.winowicz.CastleSpring.Domain;

public class Knight {

    private String name;

    private int age;

    private Quest quest;


    public Knight() {
        this.name = "Lancelot";
        this.age = 29;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", quest=" + quest +
                '}';
    }
}
