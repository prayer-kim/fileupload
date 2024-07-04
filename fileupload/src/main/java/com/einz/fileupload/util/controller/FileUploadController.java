package com.einz.fileupload.util.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einz.fileupload.util.model.Todo;
import com.einz.fileupload.util.service.FileUploadService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FileUploadController {
	//public static final Logger log = LoggerFactory.getLogger(new Object(){}.getClass().getEnclosingClass().getName());
	
	public final FileUploadService fileUploadService;

    public FileUploadController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    // 전체보기
    @GetMapping("/todos")
    public List<Todo> todos() {
        //log.debug("methodName:" + new Object(){}.getClass().getEnclosingMethod().getName());
        //log.debug("전체보기");

        return fileUploadService.getAllTodos();
    }
}
