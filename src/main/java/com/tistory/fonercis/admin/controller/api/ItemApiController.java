package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.ifs.CrudInterface;
import com.tistory.fonercis.admin.model.network.Header;
import com.tistory.fonercis.admin.model.network.request.ItemApiRequest;
import com.tistory.fonercis.admin.model.network.response.ItemApiResponse;
import com.tistory.fonercis.admin.service.ItemApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/item")
public class ItemApiController implements CrudInterface<ItemApiRequest, ItemApiResponse> {

    @Autowired
    private ItemApiLogicService itemApiLogicService;

    @Override
    @PostMapping("")        // /api/item
    public Header<ItemApiResponse> create(@RequestBody Header<ItemApiRequest> request) {
        return itemApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")     // /api/item/1 ...
    public Header<ItemApiResponse> read(@PathVariable Long id) {
        return itemApiLogicService.read(id);
    }

    @Override
    @PutMapping("")         // /api/item
    public Header<ItemApiResponse> update(@RequestBody Header<ItemApiRequest> request) {
        return itemApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")  // /api/item/1 ...
    public Header delete(@PathVariable Long id) {
        return itemApiLogicService.delete(id);
    }
}
