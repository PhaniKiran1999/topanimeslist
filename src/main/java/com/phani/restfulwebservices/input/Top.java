package com.phani.restfulwebservices.input;

public class Top {

    private Long mal_id;
    private Long rank;
    private String title;
    private String url;
    private String image_url;
    private String type;
    private Long episodes;
    private String start_date;
    private String end_date;
    private Long members;
    private Double score;

    public Long getMal_id() {
        return mal_id;
    }

    public void setMal_id(Long mal_id) {
        this.mal_id = mal_id;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Long episodes) {
        this.episodes = episodes;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Long getMembers() {
        return members;
    }

    public void setMembers(Long members) {
        this.members = members;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Top.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("mal_id");
        sb.append('=');
        sb.append(((this.mal_id == null) ? "<null>" : this.mal_id));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null) ? "<null>" : this.rank));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null) ? "<null>" : this.title));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("image_url");
        sb.append('=');
        sb.append(((this.image_url == null) ? "<null>" : this.image_url));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("episodes");
        sb.append('=');
        sb.append(((this.episodes == null) ? "<null>" : this.episodes));
        sb.append(',');
        sb.append("start_date");
        sb.append('=');
        sb.append(((this.start_date == null) ? "<null>" : this.start_date));
        sb.append(',');
        sb.append("end_date");
        sb.append('=');
        sb.append(((this.end_date == null) ? "<null>" : this.end_date));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null) ? "<null>" : this.members));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null) ? "<null>" : this.score));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
