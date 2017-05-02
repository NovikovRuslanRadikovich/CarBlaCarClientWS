package service.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CbcDriverInfo {

    private Long id;

    private int experience;

    private int rating;

    private CbcUserInfo user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public CbcUserInfo getUser() {
        return user;
    }

    public void setUser(CbcUserInfo user) {
        this.user = user;
    }
}
