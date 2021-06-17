package oxtcode_dev.trefind.video;

import java.util.List;

public interface VideoDAO {
    public boolean insert(Video video);

    public boolean update(Video video);

    public boolean delete(Video video);

    public Video getByChannelId(String channelId);

    public Video getSpecificData(String title);

    public List<Video> getAll();
}
