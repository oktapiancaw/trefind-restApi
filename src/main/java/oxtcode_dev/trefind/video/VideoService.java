package oxtcode_dev.trefind.video;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    public ResponseEntity<List<Video>> GetAllVideo() {
        return new ResponseEntity<>(videoRepository.getAll(), HttpStatus.OK);
    }

    public ResponseEntity<Video> GetVideoById(String channelId) {
        Video data = videoRepository.getByChannelId(channelId);
        if(data != null){
            return new ResponseEntity<>(data, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public void AddVideo(Video video) {
        videoRepository.insert(video);
    }

    public ResponseEntity<Video> UpdateVideo(String channelId, Video video) {
        boolean isSuccess = videoRepository.update(video, channelId);
        if(isSuccess){
            return new ResponseEntity<>(videoRepository.getByChannelId(channelId), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<HttpStatus> DeleteVideo(String channelId){
        boolean isSuccess = videoRepository.delete(channelId);
        if(!isSuccess){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
    }
}
