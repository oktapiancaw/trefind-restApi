package oxtcode_dev.trefind.video;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {
    private String channelId;
    private String title;
    private String channelName;
    private String publishedAt;

    public Video() {
    }

    public Video(String channelId, String title, String channelName, String publishedAt) {
        this.channelId = channelId;
        this.title = title;
        this.channelName = channelName;
        this.publishedAt = publishedAt;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
