
package org.acappelli.myseries.bean.show;

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
    private String imdb;
    @Expose
    private long tmdb;
    @Expose
    private long tvrage;

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
    public String getImdb() {
        return imdb;
    }

    /**
     * 
     * @param imdb
     *     The imdb
     */
    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Ids withImdb(String imdb) {
        this.imdb = imdb;
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
    public long getTvrage() {
        return tvrage;
    }

    /**
     * 
     * @param tvrage
     *     The tvrage
     */
    public void setTvrage(long tvrage) {
        this.tvrage = tvrage;
    }

    public Ids withTvrage(long tvrage) {
        this.tvrage = tvrage;
        return this;
    }

}
