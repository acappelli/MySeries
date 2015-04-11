
package org.acappelli.myseries.bean.search;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Poster {

    @Expose
    private Object full;
    @Expose
    private Object medium;
    @Expose
    private Object thumb;

    /**
     * 
     * @return
     *     The full
     */
    public Object getFull() {
        return full;
    }

    /**
     * 
     * @param full
     *     The full
     */
    public void setFull(Object full) {
        this.full = full;
    }

    public Poster withFull(Object full) {
        this.full = full;
        return this;
    }

    /**
     * 
     * @return
     *     The medium
     */
    public Object getMedium() {
        return medium;
    }

    /**
     * 
     * @param medium
     *     The medium
     */
    public void setMedium(Object medium) {
        this.medium = medium;
    }

    public Poster withMedium(Object medium) {
        this.medium = medium;
        return this;
    }

    /**
     * 
     * @return
     *     The thumb
     */
    public Object getThumb() {
        return thumb;
    }

    /**
     * 
     * @param thumb
     *     The thumb
     */
    public void setThumb(Object thumb) {
        this.thumb = thumb;
    }

    public Poster withThumb(Object thumb) {
        this.thumb = thumb;
        return this;
    }

}
