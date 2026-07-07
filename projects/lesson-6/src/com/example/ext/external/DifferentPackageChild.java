package com.example.ext.external;

import com.example.ext.access.AccessBase;

public class DifferentPackageChild extends AccessBase {
    public DifferentPackageChild() {
        super("Scout", 3, "hidden outside package", "PIN-99");
    }

    public void printInheritedAccess() {
        System.out.println("public: " + publicName);
        System.out.println("protected: " + protectedLevel);
    }

    public static void main(String[] args) {
        DifferentPackageChild child = new DifferentPackageChild();
        child.printInheritedAccess();
    }
}