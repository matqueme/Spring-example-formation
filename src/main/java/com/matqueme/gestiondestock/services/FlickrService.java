package com.matqueme.gestiondestock.services;

import java.io.InputStream;

public interface FlickrService {

  String savePhoto(InputStream photo, String title);

}
