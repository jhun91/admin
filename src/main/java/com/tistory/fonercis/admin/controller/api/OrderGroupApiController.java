package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.controller.CrudController;
import com.tistory.fonercis.admin.model.entity.OrderGroup;
import com.tistory.fonercis.admin.model.network.request.OrderGroupApiRequest;
import com.tistory.fonercis.admin.model.network.response.OrderGroupApiResponse;
import com.tistory.fonercis.admin.service.OrderGroupApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse, OrderGroup> {


}
