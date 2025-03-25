package org.GiannePesana;

public class Hunter extends Tribemen{
    String weapon;
    int skillLevel;

    public Hunter() {
    }

    public Hunter(String weapon, int skillLevel) {
        this.weapon = weapon;
        this.skillLevel = skillLevel;
    }

    public Hunter(String name, String tribe, String weapon, int skillLevel) {
        super(name, tribe);
        this.weapon = weapon;
        this.skillLevel = skillLevel;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = Displays.toProperCase(weapon);
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String introduction() {
        return "I am a hunter named " + name + " I belong to a tribe " + tribe +
                "\nI have a weapon of " + weapon + " and my skill level is " + skillLevel;
    }
}
