package com.tistory.fonercis.admin.controller;

import com.tistory.fonercis.admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML Form Tag
    // json, xml, multipart-form / text-plain

    @PostMapping(value = "/postMethod")  //, produces = {"application-json"}
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        return searchParam;
    }

    @PutMapping
    public void put() {

    }

    @PatchMapping
    public void patch() {

    }
}
