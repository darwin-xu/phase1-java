package com.example.ext.access;

public class AccessBase {
    public String publicName;
    protected int protectedLevel;
    String packageNote;
    private String secretCode;

    public AccessBase(
        String publicName,
        int protectedLevel,
        String packageNote,
        String secretCode
    ) {
        this.publicName = publicName;
        this.protectedLevel = protectedLevel;
        this.packageNote = packageNote;
        this.secretCode = secretCode;
    }

    public String getSecretCode() {
        return secretCode;
    }
}
