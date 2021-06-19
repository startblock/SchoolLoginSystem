package com.Nigel.Model;

public class Bulletin {
    private static String bulletin;

    public static String getBulletin() {
        return bulletin;
    }

    public static void setBulletin(String bulletin) {
        Bulletin.bulletin = bulletin;
    }
}
