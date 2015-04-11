
package org.acappelli.myseries.bean.show;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Show {

    @Expose
    private String title;
    @Expose
    private long year;
    @Expose
    private Ids ids;
    @Expose
    private String overview;
    @SerializedName("first_aired")
    @Expose
    private String firstAired;
    @Expose
    private Airs airs;
    @Expose
    private long runtime;
    @Expose
    private String certification;
    @Expose
    private String network;
    @Expose
    private String country;
    @Expose
    private String trailer;
    @Expose
    private Object homepage;
    @Expose
    private String status;
    @Expose
    private float rating;
    @Expose
    private long votes;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @Expose
    private String language;
    @SerializedName("available_translations")
    @Expose
    private List<String> availableTranslations = new ArrayList<String>();
    @Expose
    private List<String> genres = new ArrayList<String>();
    @SerializedName("aired_episodes")
    @Expose
    private long airedEpisodes;
    @Expose
    private Images images;

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

    public Show withFirstAired(String firstAired) {
        this.firstAired = firstAired;
        return this;
    }

    /**
     * 
     * @return
     *     The airs
     */
    public Airs getAirs() {
        return airs;
    }

    /**
     * 
     * @param airs
     *     The airs
     */
    public void setAirs(Airs airs) {
        this.airs = airs;
    }

    public Show withAirs(Airs airs) {
        this.airs = airs;
        return this;
    }

    /**
     * 
     * @return
     *     The runtime
     */
    public long getRuntime() {
        return runtime;
    }

    /**
     * 
     * @param runtime
     *     The runtime
     */
    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    public Show withRuntime(long runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 
     * @return
     *     The certification
     */
    public String getCertification() {
        return certification;
    }

    /**
     * 
     * @param certification
     *     The certification
     */
    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Show withCertification(String certification) {
        this.certification = certification;
        return this;
    }

    /**
     * 
     * @return
     *     The network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * 
     * @param network
     *     The network
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    public Show withNetwork(String network) {
        this.network = network;
        return this;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public Show withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 
     * @return
     *     The trailer
     */
    public String getTrailer() {
        return trailer;
    }

    /**
     * 
     * @param trailer
     *     The trailer
     */
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public Show withTrailer(String trailer) {
        this.trailer = trailer;
        return this;
    }

    /**
     * 
     * @return
     *     The homepage
     */
    public Object getHomepage() {
        return homepage;
    }

    /**
     * 
     * @param homepage
     *     The homepage
     */
    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Show withHomepage(Object homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Show withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public float getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(float rating) {
        this.rating = rating;
    }

    public Show withRating(float rating) {
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

    public Show withVotes(long votes) {
        this.votes = votes;
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

    public Show withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    public Show withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 
     * @return
     *     The availableTranslations
     */
    public List<String> getAvailableTranslations() {
        return availableTranslations;
    }

    /**
     * 
     * @param availableTranslations
     *     The available_translations
     */
    public void setAvailableTranslations(List<String> availableTranslations) {
        this.availableTranslations = availableTranslations;
    }

    public Show withAvailableTranslations(List<String> availableTranslations) {
        this.availableTranslations = availableTranslations;
        return this;
    }

    /**
     * 
     * @return
     *     The genres
     */
    public List<String> getGenres() {
        return genres;
    }

    /**
     * 
     * @param genres
     *     The genres
     */
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Show withGenres(List<String> genres) {
        this.genres = genres;
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

    public Show withAiredEpisodes(long airedEpisodes) {
        this.airedEpisodes = airedEpisodes;
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

}
