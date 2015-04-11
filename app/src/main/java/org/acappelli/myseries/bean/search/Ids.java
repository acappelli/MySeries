
package org.acappelli.myseries.bean.search;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Ids {

    @Expose
    private long trakt;
    @Expose
    private String slug;
    @Expose
    private long tvdb;
    @Expose
    private Object imdb;
    @Expose
    private Object tmdb;
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
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Ids withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 
     * @return
     *     The tvdb
     */
    public long getTvdb() {
        return tvdb;
    }

    /**
     * 
     * @param tvdb
     *     The tvdb
     */
    public void setTvdb(long tvdb) {
        this.tvdb = tvdb;
    }

    public Ids withTvdb(long tvdb) {
        this.tvdb = tvdb;
        return this;
    }

    /**
     * 
     * @return
     *     The imdb
     */
    public Object getImdb() {
        return imdb;
    }

    /**
     * 
     * @param imdb
     *     The imdb
     */
    public void setImdb(Object imdb) {
        this.imdb = imdb;
    }

    public Ids withImdb(Object imdb) {
        this.imdb = imdb;
        return this;
    }

    /**
     * 
     * @return
     *     The tmdb
     */
    public Object getTmdb() {
        return tmdb;
    }

    /**
     * 
     * @param tmdb
     *     The tmdb
     */
    public void setTmdb(Object tmdb) {
        this.tmdb = tmdb;
    }

    public Ids withTmdb(Object tmdb) {
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
