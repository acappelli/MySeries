
package org.acappelli.myseries.bean.episode;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Screenshot {

    @Expose
    private String full;
    @Expose
    private String medium;
    @Expose
    private String thumb;

    /**
     * 
     * @return
     *     The full
     */
    public String getFull() {
        return full;
    }

    /**
     * 
     * @param full
     *     The full
     */
    public void setFull(String full) {
        this.full = full;
    }

    public Screenshot withFull(String full) {
        this.full = full;
        return this;
    }

    /**
     * 
     * @return
     *     The medium
     */
    public String getMedium() {
        return medium;
    }

    /**
     * 
     * @param medium
     *     The medium
     */
    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Screenshot withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * 
     * @return
     *     The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * 
     * @param thumb
     *     The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Screenshot withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }

}
