package com.example.ext.external;

import com.example.ext.access.AccessBase;

public class DifferentPackageObserver {
    public static void main(String[] args) {
        AccessBase base = new AccessBase(
                "Scout",
                3,
                "hidden outside package",
                "PIN-99");

        System.out.println("public: " + base.publicName);
        // protected int protectedLevel;
        // String packageNote;
        // private String secretCode;

        System.out.println("private via getter: " + base.getSecretCode());
    }
}