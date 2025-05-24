package com.ipl.backend.model;

public class IPLTeam {
    private String name;
    private String logoUrl; // this will be just filename
    private String tagline;

    public IPLTeam(String name, String logoUrl, String tagline) {
        this.name = name;
        this.logoUrl = logoUrl;
        this.tagline = tagline;
    }

    public String getName() {
        return name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getTagline() {
        return tagline;
    }
}
