package oxtcode_dev.trefind.video;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/videos/")
public class VideoController {
    private final VideoService videoService;

//    @GetMapping
//    public ResponseEntity<List<Video>> getData() {
//        return videoService.GetAllVideo();
//    }
//
//    @GetMapping(path = "{channelid}")
//    public ResponseEntity<Video> getDataById(@PathVariable("channelid") String channelId) {
//        return videoService.GetVideoById(channelId);
//    }

    @PostMapping(consumes = "application/json")
    public void addData(@RequestBody Video video) {
        videoService.AddVideo(video);
    }
//
//    @PutMapping(path = "{channelid}")
//    public ResponseEntity<Video> updateData(@PathVariable("channelid") String channelId, @RequestBody Video video){
//        return videoService.UpdateVideo(channelId, video);
//    }
//
//    @DeleteMapping(path = "{channelid}")
//    public ResponseEntity<HttpStatus> deleteData(@PathVariable("channelid") String channelId) {
//        return videoService.DeleteVideo(channelId);
//    }
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String, String> handleValidationExceptions(
//            MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        errors.put("status", "Failed");
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }

}