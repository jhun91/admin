package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.ifs.CrudInterface;
import com.tistory.fonercis.admin.model.network.Header;
import com.tistory.fonercis.admin.model.network.request.UserApiRequest;
import com.tistory.fonercis.admin.model.network.response.UserApiResponse;
import com.tistory.fonercis.admin.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;

    @Override
    @PostMapping("")   //   /api/user
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        log.info("{}", request);  //중괄호와 변수가 매핑
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")   //  /api/user/{id}
    public Header<UserApiResponse> read(@PathVariable(name = "id")  Long id) {
        log.info("read : {}", id);
        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping("")     //  /api/user
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")      //  /api/user/{id}
    public Header delete(@PathVariable(name = "id") Long id) {
        return userApiLogicService.delete(id);
    }
}
