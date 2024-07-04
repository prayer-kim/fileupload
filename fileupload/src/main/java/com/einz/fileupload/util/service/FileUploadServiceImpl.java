package com.einz.fileupload.util.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einz.fileupload.util.model.Todo;
import com.einz.fileupload.util.repository.FileUploadRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    FileUploadRepository fileUploadRepository;

    @Override
    public List<Todo> getAllTodos() {
        /* FIXME: 의도적으로 ArithmeticException 발생*/
        Random random = new Random();
        int randomNum = random.nextInt(0,4);
        log.debug("randomNum: {}", 3/randomNum);
           	   
        return fileUploadRepository.selectAllTodos();
    }    
}
