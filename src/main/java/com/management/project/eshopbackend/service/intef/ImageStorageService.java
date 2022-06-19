package com.management.project.eshopbackend.service.intef;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageStorageService {
  void init();

  int saveNewImage(MultipartFile file, Long productId);

  Resource load(String filename);

  List<String> getNumberOfImagesForProductId(Long productId);
}