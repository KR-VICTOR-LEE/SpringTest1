package com.example.studyone.service;


import com.example.studyone.model.entity.Item;
import com.example.studyone.model.network.Header;
import com.example.studyone.model.network.request.ItemApiRequest;
import com.example.studyone.model.network.response.ItemApiResponse;
import com.example.studyone.repository.PartnerRepository;
import jdk.vm.ci.meta.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ItemApiLogicService extends BaseService<ItemApiRequest, ItemApiResponse, Item> {

    @Autowired
    private PartnerRepository partnerRepository;

    @Override
    public Header<ItemApiResponse> create(Header<ItemApiRequest> request) {

        return Optional.ofNullable(request.getData())Optional<itemApiRespones>
                .map(body->{
                    Item item = Item.builder()
                            .status(body.getStatus())
                            .name(body.getName())
                            .title(body.getTitle())
                            .content(body.getContent())
                            .price(body.getPrice())
                            .brandName(body.getBrandName())
                            .registeredAt(LocalDateTime.now())
                            .partner(partnerRepository.getOne(body.getPartnerId()))
                            .build();

                    return item;
                })Optional<Item>
                .map(newItem -> baseRepository.save(newItem))Optional<Object>
                .map(newItem -> response(newItem))Optional<Header<itemApiRespones>>
                .ofElseGet(()->Header.ERROR("데이터없음"));


    }

    @Override
    public Header<ItemApiResponse> read(Long id) {

        return baseRepository.findById(id)
                .map(item -> response(item))
                .orElseGet(()-> Header.ERROR("데이터없음"));
    }

    @Override
    public Header<ItemApiResponse> update(Header<ItemApiRequest> request) {

        ItemApiRequest body = request.getData();
        baseRepository.findById(body.getId())
                .map(entityItem->{
                    entityItem
                            .setStatus(body.getStatus())
                            .setName(body.getName())
                            .setTitle(body.getTitle())
                            .setContent(body.getContent())
                            .setBrandName(body.getBrandName())
                            .setRegisteredAt(body.getRegisteredAt())
                            .setUnregisteredAd(body.getUnregisteredAt())
                            ;
                    return entityItem;
                })
                .map(newEntityItem -> baseRepository.save(newEntityItem))
                .map(item -> response(item))
                .orElseGet(()->Header.ERROR("데이터없음"));


        return null;
    }

    @Override
    public Header delete(Long id) {

        return baseRepository.findById(id)
                .map(item -> {
                    baseRepository.delete(item);
                    return Header.OK();
                })
                .orElseGet(()->Header.EREER("데이터없음"));

    }

    private Header<ItemApiResponse> response(Item item){

        ItemApiResponse body = ItemApiResponse.builder()
                .id(item.getId())
                .status(item.getStatus())
                .name(item.getName())
                .title(item.getTitle())
                .content(item.getContent())
                .partnerId(item.getId())
                .brandName(item.getBrandName())
                .registeredAt(item.getRegisteredAt())
                .unregisteredAt(item.getRegisteredAt())
                .partnerId(item.getPartner().getId())
                .build();

        return Header.OK(body);
    }
}
