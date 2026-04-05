package krittameth.project.kd5fbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import krittameth.project.kd5fbackend.model.Image;
import krittameth.project.kd5fbackend.model.Video;
import krittameth.project.kd5fbackend.repository.ImageRepository;
import krittameth.project.kd5fbackend.repository.VideoRepository;

@Service
public class MediaService {
    
    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private VideoRepository videoRepository;

    public List<Image> getImagesByProductId(int id) {
        return imageRepository.findByProductId(id);
    }

    public List<Video> getVideosByProductId(int id) {
        return videoRepository.findByProductId(id);
    }
}
