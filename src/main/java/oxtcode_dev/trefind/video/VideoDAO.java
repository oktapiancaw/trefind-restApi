package oxtcode_dev.trefind.video;

import java.util.List;

public interface VideoDAO {
    public boolean insert(Video video);

    public Boolean update(Video video, String channelId);

    public boolean delete(String channelId);

    public Video getByChannelId(String channelId);

    public List<Video> getSpecificData();

    public List<Video> getAll();
}
