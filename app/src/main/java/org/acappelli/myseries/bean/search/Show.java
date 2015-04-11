
package org.acappelli.myseries.bean.search;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Show {

    @Expose
    private String title;
    @Expose
    private String overview;
    @Expose
    private long year;
    @Expose
    @Valid
    private Images images;
    @Expose
    @Valid
    private Ids ids;

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Show withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     * 
     * @param overview
     *     The overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Show withOverview(String overview) {
        this.overview = overview;
        return this;
    }

    /**
     * 
     * @return
     *     The year
     */
    public long getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(long year) {
        this.year = year;
    }

    public Show withYear(long year) {
        this.year = year;
        return this;
    }

    /**
     * 
     * @return
     *     The images
     */
    public Images getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(Images images) {
        this.images = images;
    }

    public Show withImages(Images images) {
        this.images = images;
        return this;
    }

    /**
     * 
     * @return
     *     The ids
     */
    public Ids getIds() {
        return ids;
    }

    /**
     * 
     * @param ids
     *     The ids
     */
    public void setIds(Ids ids) {
        this.ids = ids;
    }

    public Show withIds(Ids ids) {
        this.ids = ids;
        return this;
    }

}
