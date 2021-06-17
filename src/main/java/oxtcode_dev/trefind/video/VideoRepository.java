package oxtcode_dev.trefind.video;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class VideoRepository extends JdbcDaoSupport implements VideoDAO{
    private final String INSERT = "INSERT INTO videos (channelId, title, channelName, publishedAt)"
            + "VALUES (?,?,?,?)";
    private final String UPDATE = "UPDATE videos SET title=?, channelName=?, publishedAt=? WHERE channelId=?";
    private final String DELETE = "DELETE FROM videos WHERE channelId=?";
    private final String SELECT_BY_ID = "SELECT channelId, title, channelName, publishedAt FROM videos WHERE channelId=?";
    private final String SELECT_ALL = "SELECT channelId, title, channelName, publishedAt FROM videos";

    private static Logger LOGGER = LoggerFactory.getLogger(VideoRepository.class.getName());

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        setDataSource(dataSource);
    }
    @Override
    public boolean insert(Video video) {
        return getJdbcTemplate().update(INSERT, video.getChannelId(), video.getTitle(), video.getChannelName(), video.getPublishedAt()) > 0;
    }

    @Override
    public Boolean update(Video video, String channelId) {
        return getJdbcTemplate().update(UPDATE, video.getTitle(), video.getChannelName(), video.getPublishedAt(), channelId) > 0;
    }

    @Override
    public Video getByChannelId(String channelid) {
        return getJdbcTemplate().queryForObject(SELECT_BY_ID, new Object[]{channelid}, new VideoRowMapper());
    }

    @Override
    public List<Video> getAll() {
        return getJdbcTemplate().query(SELECT_ALL, new VideoRowMapper());
    }

    @Override
    public boolean delete(String channelId) {
        return getJdbcTemplate().update(DELETE, channelId) > 0;
    }

    @Override
    public Video getSpecificData(String title) {
        return null;
    }

    private class VideoRowMapper implements RowMapper<Video> {
        @Override
        public Video mapRow(ResultSet resultSet, int i) throws SQLException {
            Video video = new Video();
            video.setChannelId(resultSet.getNString("channelId"));
            video.setTitle(resultSet.getNString("title"));
            video.setChannelName(resultSet.getNString("channelName"));
            video.setPublishedAt(resultSet.getNString("publishedAt"));
            return video;
        }
    }
}
