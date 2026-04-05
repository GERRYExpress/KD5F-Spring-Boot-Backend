package krittameth.project.kd5fbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import krittameth.project.kd5fbackend.model.Image;
import krittameth.project.kd5fbackend.model.Video;
import krittameth.project.kd5fbackend.service.MediaService;

@RestController
@RequestMapping("/product")
public class MediaController {
    
    @Autowired
    private MediaService mediaService;

    @GetMapping("/video/{id}")
    public List<Video> getVideoByProductId(@PathVariable int id) {
        return mediaService.getVideosByProductId(id);
    }

    @GetMapping("/image/{id}")
    public List<Image> getImageByProductId(@PathVariable int id) {
        return mediaService.getImagesByProductId(id);
    }
}
