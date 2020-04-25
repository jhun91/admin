package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.controller.CrudController;
import com.tistory.fonercis.admin.model.entity.User;
import com.tistory.fonercis.admin.model.network.Header;
import com.tistory.fonercis.admin.model.network.request.UserApiRequest;
import com.tistory.fonercis.admin.model.network.response.UserApiResponse;
import com.tistory.fonercis.admin.model.network.response.UserOrderInfoApiResponse;
import com.tistory.fonercis.admin.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

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

    @GetMapping("/{id}/orderInfo")
    public Header<UserOrderInfoApiResponse> orderInfo(@PathVariable Long id) {
        return userApiLogicService.orderInfo(id);
    }

    @GetMapping("")
    public Header<List<UserApiResponse>> search(@PageableDefault(sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        log.info("{}", pageable);
        return userApiLogicService.search(pageable);
    }
}
