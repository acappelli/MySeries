package org.acappelli.myseries.bean.season;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Ids {

    @Expose
    private long trakt;
    @Expose
    private Object tvdb;
    @Expose
    private long tmdb;
    @Expose
    private Object tvrage;

    /**
     * 
     * @return
     *     The trakt
     */
    public long getTrakt() {
        return trakt;
    }

    /**
     * 
     * @param trakt
     *     The trakt
     */
    public void setTrakt(long trakt) {
        this.trakt = trakt;
    }

    public Ids withTrakt(long trakt) {
        this.trakt = trakt;
        return this;
    }

    /**
     * 
     * @return
     *     The tvdb
     */
    public Object getTvdb() {
        return tvdb;
    }

    /**
     * 
     * @param tvdb
     *     The tvdb
     */
    public void setTvdb(Object tvdb) {
        this.tvdb = tvdb;
    }

    public Ids withTvdb(Object tvdb) {
        this.tvdb = tvdb;
        return this;
    }

    /**
     * 
     * @return
     *     The tmdb
     */
    public long getTmdb() {
        return tmdb;
    }

    /**
     * 
     * @param tmdb
     *     The tmdb
     */
    public void setTmdb(long tmdb) {
        this.tmdb = tmdb;
    }

    public Ids withTmdb(long tmdb) {
        this.tmdb = tmdb;
        return this;
    }

    /**
     * 
     * @return
     *     The tvrage
     */
    public Object getTvrage() {
        return tvrage;
    }

    /**
     * 
     * @param tvrage
     *     The tvrage
     */
    public void setTvrage(Object tvrage) {
        this.tvrage = tvrage;
    }

    public Ids withTvrage(Object tvrage) {
        this.tvrage = tvrage;
        return this;
    }

}
