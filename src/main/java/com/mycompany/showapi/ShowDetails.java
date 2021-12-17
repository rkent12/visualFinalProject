/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.showapi;

import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author ryankent
 */
public class ShowDetails {
    
    public static ShowDetails fill(String urlString) throws Exception {
        InputStreamReader is = null;
        Gson gson = new Gson();
        try {
            URL url = new URL(urlString);
            
            is = new InputStreamReader(url.openStream());
            Attempt temp = gson.fromJson(is, Attempt.class);
            return temp.tvShow;
        } finally {
            if (is != null)
                is.close();
            }
     }
    
    private int id;
    private String name;
    private String permalink;
    private String url;
    private String description;
    private String start_date;
    private String end_date;
    private String country;
    private String status;
    private String network;
    private String youtube_link;
    private String image_path;
    private String image_thumbnail_path;
    private String rating;
    private ArrayList<String> genres;
    private ArrayList<String> pictures;
    private ArrayList<Episode> episodes;
    
    public void dump() {
        System.out.println(id);
        System.out.println(name);
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * @param permalink the permalink to set
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the start_date
     */
    public String getStart_date() {
        return start_date;
    }

    /**
     * @param start_date the start_date to set
     */
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    /**
     * @return the end_date
     */
    public String getEnd_date() {
        return end_date;
    }

    /**
     * @param end_date the end_date to set
     */
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * @param network the network to set
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * @return the youtube_link
     */
    public String getYoutube_link() {
        return youtube_link;
    }

    /**
     * @param youtube_link the youtube_link to set
     */
    public void setYoutube_link(String youtube_link) {
        this.youtube_link = youtube_link;
    }

    /**
     * @return the image_path
     */
    public String getImage_path() {
        return image_path;
    }

    /**
     * @param image_path the image_path to set
     */
    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    /**
     * @return the image_thumbnail_path
     */
    public String getImage_thumbnail_path() {
        return image_thumbnail_path;
    }

    /**
     * @param image_thumbnail_path the image_thumbnail_path to set
     */
    public void setImage_thumbnail_path(String image_thumbnail_path) {
        this.image_thumbnail_path = image_thumbnail_path;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return the genres
     */
    public ArrayList<String> getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    /**
     * @return the pictures
     */
    public ArrayList<String> getPictures() {
        return pictures;
    }

    /**
     * @param pictures the pictures to set
     */
    public void setPictures(ArrayList<String> pictures) {
        this.pictures = pictures;
    }

    /**
     * @return the episodes
     */
    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    /**
     * @param episodes the episodes to set
     */
    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }
    
    
    
}
