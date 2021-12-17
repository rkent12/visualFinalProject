/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.showapi;

/**
 *
 * @author ryankent
 */

public class Episode {
    
    private int season;
    private int episode;
    private String name;
    private String air_date;

    /**
     * @return the season
     */
    public int getSeason() {
        return season;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(int season) {
        this.season = season;
    }

    /**
     * @return the episode
     */
    public int getEpisode() {
        return episode;
    }

    /**
     * @param episode the episode to set
     */
    public void setEpisode(int episode) {
        this.episode = episode;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the air_date
     */
    public String getAir_date() {
        return air_date;
    }

    /**
     * @param air_date the air_date to set
     */
    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }
    
    
}
