/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.showapi;

import java.awt.Color;


/**
 *
 * @author ryankent
 */
public class ShowResults {
    
    /**
     * @param args the command line arguments
     */
    
    public static final Color selectionColor = new Color(99,140,255);
    public static final Color nonSelectionColor = new Color(255,255,255);
    private int id;
    private String name;
    private String permalink;
    private String start_date;
    private String end_date;
    private String country;
    private String network;
    private String status;
    private String image_thumbnail_path;
    
    private String comments;
    private String rating;
    
    public ShowResults(int id, String name,String permalink,String start_date,String end_date,String country,String network,String status,String image_thumbnail_path) {
        this.id = id;
        this.name = name;
        this.permalink = permalink;
        this.start_date = start_date;
        this.end_date = end_date;
        this.country = country;
        this.network = network;
        this.status = status;
        this.image_thumbnail_path = image_thumbnail_path;
        
    }
    
    public void dump() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(permalink);
        System.out.println(start_date);
        System.out.println(end_date);
        System.out.println(country);
        System.out.println(network);
        System.out.println(status);
        System.out.println(image_thumbnail_path); 
        
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
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }
    
}
