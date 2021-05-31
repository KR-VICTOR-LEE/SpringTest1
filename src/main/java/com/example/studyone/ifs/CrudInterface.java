package com.example.studyone.ifs;

import com.example.studyone.model.network.Header;

public interface CrudInterface<Req, Res> {

    Header<Res> create(Header <Req> request); // todo request dbject 추가

    Header<Res> read(Long id);

    Header<Res> update(Header <Req> request);

    Header delete(Long id);


}
