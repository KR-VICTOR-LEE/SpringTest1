package com.example.studyone.service;

import com.example.studyone.model.entity.Partner;
import com.example.studyone.model.network.Header;
import com.example.studyone.model.network.request.PartnerApiRequest;
import com.example.studyone.model.network.response.PartnerApiResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PartnerApiLogicService extends BaseService<PartnerApiRequest, PartnerApiResponse, Partner>{
    @Override
    public Header<PartnerApiResponse> create(Header<PartnerApiRequest> request) {
        return null;
    }

    @Override
    public Header<PartnerApiResponse> read(Long id) {

        return baseRepository.getById(id)
                .map(partner -> response(partner))
                .ofElseGet(()->Header.ERROR("데이터없음"));
    }

    @Override
    public Header<PartnerApiResponse> update(Header<PartnerApiRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
    private Header<PartnerApiResponse> response(Partner partner){

        PartnerApiRequest body = PartnerApiRequest.builder()
                .id(partner.getId())
                .name(partner.getName())
                .status(partner.getStatus())
                .address(partner.getAddress())
                .cellCenter(partner.getCallCenter())
                .partnerNumber(partner.getPartnerNumber())
                .businessNumber(partner.getBusinessNumber())
                .ceoName(partner.getCeoName())
                .registeredAt(partner.getRegisteredAt())
                .unregisteredAt(partner.getRegisteredAt())
                .categoryId(partner.getCategoryId().getId())
                .build();

        return Header.OK(body);
    }
}
