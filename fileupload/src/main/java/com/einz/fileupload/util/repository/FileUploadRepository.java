package com.einz.fileupload.util.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.einz.fileupload.util.model.Todo;

@Repository
@Mapper
public interface FileUploadRepository {
    List<Todo> selectAllTodos();
}
