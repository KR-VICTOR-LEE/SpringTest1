package com.example.studyone.controller.api;

import com.example.studyone.controller.CrudController;
import com.example.studyone.model.entity.Partner;
import com.example.studyone.model.network.request.PartnerApiRequest;
import com.example.studyone.model.network.response.PartnerApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partner")
public class PartnerApiController extends CrudController<PartnerApiRequest, PartnerApiResponse, Partner> {
}
