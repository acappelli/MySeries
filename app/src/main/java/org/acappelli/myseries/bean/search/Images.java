
package org.acappelli.myseries.bean.search;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Images {

    @Expose
    @Valid
    private Poster poster;
    @Expose
    @Valid
    private Fanart fanart;

    /**
     * 
     * @return
     *     The poster
     */
    public Poster getPoster() {
        return poster;
    }

    /**
     * 
     * @param poster
     *     The poster
     */
    public void setPoster(Poster poster) {
        this.poster = poster;
    }

    public Images withPoster(Poster poster) {
        this.poster = poster;
        return this;
    }

    /**
     * 
     * @return
     *     The fanart
     */
    public Fanart getFanart() {
        return fanart;
    }

    /**
     * 
     * @param fanart
     *     The fanart
     */
    public void setFanart(Fanart fanart) {
        this.fanart = fanart;
    }

    public Images withFanart(Fanart fanart) {
        this.fanart = fanart;
        return this;
    }

}
