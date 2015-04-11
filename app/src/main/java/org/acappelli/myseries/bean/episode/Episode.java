
package org.acappelli.myseries.bean.episode;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Episode {

    @Expose
    private long season;
    @Expose
    private long number;
    @Expose
    private String title;
    @Expose
    private Ids ids;
    @SerializedName("number_abs")
    @Expose
    private Object numberAbs;
    @Expose
    private String overview;
    @Expose
    private double rating;
    @Expose
    private long votes;
    @SerializedName("first_aired")
    @Expose
    private String firstAired;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("available_translations")
    @Expose
    private List<Object> availableTranslations = new ArrayList<Object>();
    @Expose
    private Images images;

    /**
     * 
     * @return
     *     The season
     */
    public long getSeason() {
        return season;
    }

    /**
     * 
     * @param season
     *     The season
     */
    public void setSeason(long season) {
        this.season = season;
    }

    public Episode withSeason(long season) {
        this.season = season;
        return this;
    }

    /**
     * 
     * @return
     *     The number
     */
    public long getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(long number) {
        this.number = number;
    }

    public Episode withNumber(long number) {
        this.number = number;
        return this;
    }

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

    public Episode withTitle(String title) {
        this.title = title;
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

    public Episode withIds(Ids ids) {
        this.ids = ids;
        return this;
    }

    /**
     * 
     * @return
     *     The numberAbs
     */
    public Object getNumberAbs() {
        return numberAbs;
    }

    /**
     * 
     * @param numberAbs
     *     The number_abs
     */
    public void setNumberAbs(Object numberAbs) {
        this.numberAbs = numberAbs;
    }

    public Episode withNumberAbs(Object numberAbs) {
        this.numberAbs = numberAbs;
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

    public Episode withOverview(String overview) {
        this.overview = overview;
        return this;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    public Episode withRating(double rating) {
        this.rating = rating;
        return this;
    }

    /**
     * 
     * @return
     *     The votes
     */
    public long getVotes() {
        return votes;
    }

    /**
     * 
     * @param votes
     *     The votes
     */
    public void setVotes(long votes) {
        this.votes = votes;
    }

    public Episode withVotes(long votes) {
        this.votes = votes;
        return this;
    }

    /**
     * 
     * @return
     *     The firstAired
     */
    public String getFirstAired() {
        return firstAired;
    }

    /**
     * 
     * @param firstAired
     *     The first_aired
     */
    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public Episode withFirstAired(String firstAired) {
        this.firstAired = firstAired;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Episode withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The availableTranslations
     */
    public List<Object> getAvailableTranslations() {
        return availableTranslations;
    }

    /**
     * 
     * @param availableTranslations
     *     The available_translations
     */
    public void setAvailableTranslations(List<Object> availableTranslations) {
        this.availableTranslations = availableTranslations;
    }

    public Episode withAvailableTranslations(List<Object> availableTranslations) {
        this.availableTranslations = availableTranslations;
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

    public Episode withImages(Images images) {
        this.images = images;
        return this;
    }

}
