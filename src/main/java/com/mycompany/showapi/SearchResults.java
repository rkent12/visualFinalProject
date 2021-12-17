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
public class SearchResults {
    
    public static SearchResults fill(String urlString) throws Exception {
        InputStreamReader is = null;
        Gson gson = new Gson();
        try {
            URL url = new URL(urlString);
            is = new InputStreamReader(url.openStream());
            return gson.fromJson(is, SearchResults.class);
        } finally {
            if (is != null)
                is.close();
            }
     }
    
    private int total;
    private int page;
    private int pages;
    private ArrayList<ShowResults> tv_shows;
    
    public SearchResults(int total,int page,int pages) {
        this.total = total;
        this.page = page;
        this.pages = pages;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return the pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * @return the tv_show
     */
    public ArrayList<ShowResults> getTV_shows() {
        return tv_shows;
    }

    /**
     * @param tv_show the tv_show to set
     */
    public void setTv_show(ArrayList<ShowResults> tv_show) {
        this.tv_shows = tv_show;
    }
    
    public void dump(){
        System.out.println(total);
        System.out.println(page);
        System.out.println(pages);
        for(int i = 0; i < tv_shows.size(); i++){
            tv_shows.get(i).dump();
        }
    }
    
}
