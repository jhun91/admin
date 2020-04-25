package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.controller.CrudController;
import com.tistory.fonercis.admin.ifs.CrudInterface;
import com.tistory.fonercis.admin.model.entity.User;
import com.tistory.fonercis.admin.model.network.Header;
import com.tistory.fonercis.admin.model.network.request.UserApiRequest;
import com.tistory.fonercis.admin.model.network.response.UserApiResponse;
import com.tistory.fonercis.admin.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {

    @Autowired
    private UserApiLogicService userApiLogicService;

    @PostConstruct
    public void init() {
        this.baseService = userApiLogicService;
    }
}
