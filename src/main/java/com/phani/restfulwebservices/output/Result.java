package com.phani.restfulwebservices.output;

public class Result {
    private Long rank;
    private String title;
    private String image_url;
    private String program_type;
    private Long number_of_episodes;
    private Boolean isAiring;
    private Double score;
    
    public Result() {

    }

    public Result(Long rank, String title, String image_url, String program_type, Long number_of_episodes,
            Boolean isAiring, Double score) {
        this.rank = rank;
        this.title = title;
        this.image_url = image_url;
        this.program_type = program_type;
        this.number_of_episodes = number_of_episodes;
        this.isAiring = isAiring;
        this.score = score;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getProgram_type() {
        return program_type;
    }

    public void setProgram_type(String program_type) {
        this.program_type = program_type;
    }

    public Long getNumber_of_episodes() {
        return number_of_episodes;
    }

    public void setNumber_of_episodes(Long number_of_episodes) {
        this.number_of_episodes = number_of_episodes;
    }

    public Boolean getIsAiring() {
        return isAiring;
    }

    public void setIsAiring(Boolean isAiring) {
        this.isAiring = isAiring;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Result [image_url=" + image_url + ", isAiring=" + isAiring + ", number_of_episodes="
                + number_of_episodes + ", program_type=" + program_type + ", rank=" + rank + ", score=" + score
                + ", title=" + title + "]";
    }
    
}
