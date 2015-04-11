
package org.acappelli.myseries.bean.season;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Season {

    @Expose
    private long number;
    @Expose
    private Ids ids;
    @Expose
    private double rating;
    @Expose
    private long votes;
    @SerializedName("episode_count")
    @Expose
    private long episodeCount;
    @SerializedName("aired_episodes")
    @Expose
    private long airedEpisodes;
    @Expose
    private String overview;
    @Expose
    private Images images;

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

    public Season withNumber(long number) {
        this.number = number;
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

    public Season withIds(Ids ids) {
        this.ids = ids;
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

    public Season withRating(double rating) {
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

    public Season withVotes(long votes) {
        this.votes = votes;
        return this;
    }

    /**
     * 
     * @return
     *     The episodeCount
     */
    public long getEpisodeCount() {
        return episodeCount;
    }

    /**
     * 
     * @param episodeCount
     *     The episode_count
     */
    public void setEpisodeCount(long episodeCount) {
        this.episodeCount = episodeCount;
    }

    public Season withEpisodeCount(long episodeCount) {
        this.episodeCount = episodeCount;
        return this;
    }

    /**
     * 
     * @return
     *     The airedEpisodes
     */
    public long getAiredEpisodes() {
        return airedEpisodes;
    }

    /**
     * 
     * @param airedEpisodes
     *     The aired_episodes
     */
    public void setAiredEpisodes(long airedEpisodes) {
        this.airedEpisodes = airedEpisodes;
    }

    public Season withAiredEpisodes(long airedEpisodes) {
        this.airedEpisodes = airedEpisodes;
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

    public Season withOverview(String overview) {
        this.overview = overview;
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

    public Season withImages(Images images) {
        this.images = images;
        return this;
    }

}
