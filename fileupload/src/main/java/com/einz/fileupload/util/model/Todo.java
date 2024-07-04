package com.einz.fileupload.util.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    long todoId;
    String content;
    boolean completed;

    public Todo() {

    }
}
