package com.tistory.fonercis.admin.controller.api;

import com.tistory.fonercis.admin.controller.CrudController;
import com.tistory.fonercis.admin.model.entity.Partner;
import com.tistory.fonercis.admin.model.network.request.PartnerApiRequest;
import com.tistory.fonercis.admin.model.network.response.PartnerApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partner")
public class PartnerApiController extends CrudController<PartnerApiRequest, PartnerApiResponse, Partner> {

}
