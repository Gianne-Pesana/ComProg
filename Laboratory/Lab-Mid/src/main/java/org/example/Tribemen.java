package org.GiannePesana;

public abstract class Tribemen {
    String name;
    String tribe;
    static int rolesCount;

    public Tribemen() {
        rolesCount++;
    }

    public Tribemen(String name, String tribe) {
        rolesCount++;
        this.name = name;
        this.tribe = tribe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Displays.toProperCase(name);
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = Displays.toProperCase(tribe);
    }

    public static int getRolesCount() {
        return rolesCount;
    }

    public static void setRolesCount(int rolesCount) {
        Tribemen.rolesCount = rolesCount;
    }

    public abstract String introduction();
}
