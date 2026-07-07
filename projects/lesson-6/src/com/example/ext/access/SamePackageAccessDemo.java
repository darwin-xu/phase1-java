package com.example.ext.access;

public class SamePackageAccessDemo {
    public static void main(String[] args) {
        AccessBase base = new AccessBase(
                "Rover",
                2,
                "same package",
                "PIN-42");

        // System.out.println("public: " + base.publicName);
        // System.out.println("protected: " + base.protectedLevel);
        // System.out.println("package-private: " + base.packageNote);
        // System.out.println("private: " + base.secretCode);
        // System.out.println("private via getter: " + base.getSecretCode());
        AccessBase ab1 = new AccessBase("Rover", 2, "same package", "PIN-42");
        AccessBase ab2 = new AccessBase("Rover2", 2, "same package", "PIN-42");
        System.out.println("public: " + ab1.publicName);
        System.out.println("public: " + ab2.publicName);
    }
}