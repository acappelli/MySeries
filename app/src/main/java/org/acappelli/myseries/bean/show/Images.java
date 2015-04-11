
package org.acappelli.myseries.bean.show;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Images {

    @Expose
    private Fanart fanart;
    @Expose
    private Poster poster;
    @Expose
    private Logo logo;
    @Expose
    private Clearart clearart;
    @Expose
    private Banner banner;
    @Expose
    private Thumb thumb;

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
     *     The logo
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     * 
     * @param logo
     *     The logo
     */
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public Images withLogo(Logo logo) {
        this.logo = logo;
        return this;
    }

    /**
     * 
     * @return
     *     The clearart
     */
    public Clearart getClearart() {
        return clearart;
    }

    /**
     * 
     * @param clearart
     *     The clearart
     */
    public void setClearart(Clearart clearart) {
        this.clearart = clearart;
    }

    public Images withClearart(Clearart clearart) {
        this.clearart = clearart;
        return this;
    }

    /**
     * 
     * @return
     *     The banner
     */
    public Banner getBanner() {
        return banner;
    }

    /**
     * 
     * @param banner
     *     The banner
     */
    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public Images withBanner(Banner banner) {
        this.banner = banner;
        return this;
    }

    /**
     * 
     * @return
     *     The thumb
     */
    public Thumb getThumb() {
        return thumb;
    }

    /**
     * 
     * @param thumb
     *     The thumb
     */
    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public Images withThumb(Thumb thumb) {
        this.thumb = thumb;
        return this;
    }

}
