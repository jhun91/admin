package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.ifs.CrudInterface;
import com.tistory.fonercis.admin.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface {


    @Override
    @PostMapping("")   //   /api/user
    public Header create() {
        return null;
    }

    @Override
    @GetMapping("{id}")   //  /api/user/{id}
    public Header read(@PathVariable(name = "id")  Long id) {
        return null;
    }

    @Override
    @PutMapping("")     //  /api/user
    public Header update() {
        return null;
    }

    @Override
    @DeleteMapping("{id}")      //  /api/user/{id}
    public Header delete(@PathVariable(name = "id") Long id) {
        return null;
    }
}
