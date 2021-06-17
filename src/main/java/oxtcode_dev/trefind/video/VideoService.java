package oxtcode_dev.trefind.video;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

//    public ResponseEntity<List<Video>> GetAllVideo() {
//        return new ResponseEntity<>(videoRepository.findAll(), HttpStatus.OK);
//    }
//
//    public ResponseEntity<Video> GetVideoById(String channelId) {
//        Optional<Video> videoData = videoRepository.findById(channelId);
//        if(videoData.isPresent()) {
//            return new ResponseEntity<>(videoData.get(), HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    public void AddVideo(Video video) {
        videoRepository.insert(video);
    }

//    @Transactional
//    public ResponseEntity<Video> UpdateVideo(String channelId, Video video) {
//        Optional<Video> videoData = videoRepository.findById(channelId);
//        if(videoData.isPresent()){
//            Video _video = videoData.get();
//            if(video.getTitle() != null){
//                _video.setTitle(video.getTitle());
//            }if(video.getName() != null){
//                _video.setName(video.getName());
//            }if(video.getPublish() != null){
//                _video.setPublish(video.getPublish());
//            }
//            return new ResponseEntity<>(videoRepository.save(_video), HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    public ResponseEntity<HttpStatus> DeleteVideo(String channelId){
//        boolean exists = videoRepository.existsById(channelId);
//        if(!exists){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        try{
//            videoRepository.deleteById(channelId);
//            return new ResponseEntity<>(HttpStatus.ACCEPTED);
//        }catch(Exception e){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
