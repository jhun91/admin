package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.controller.CrudController;
import com.tistory.fonercis.admin.model.entity.Item;
import com.tistory.fonercis.admin.model.network.request.ItemApiRequest;
import com.tistory.fonercis.admin.model.network.response.ItemApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {



}
