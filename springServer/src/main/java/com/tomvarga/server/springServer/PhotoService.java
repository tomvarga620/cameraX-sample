package com.tomvarga.server.springServer;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRep;

    public String addPhoto(String name, MultipartFile file) throws IOException {
        Photo photo = new Photo(name);
        photo.setImage(
               new Binary(BsonBinarySubType.BINARY,file.getBytes()));
        photo = photoRep.insert(photo); return photo.getId();
    }

    public Photo getPhoto(String id){
        return photoRep.findById(id).get();
    }

}
