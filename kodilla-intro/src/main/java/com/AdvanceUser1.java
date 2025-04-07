package com;

public class AdvanceUser1 extends User1 {
    private String profession;

    public AdvanceUser1(String name, double age, double height, String profession) {
        super(name, age, height);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}