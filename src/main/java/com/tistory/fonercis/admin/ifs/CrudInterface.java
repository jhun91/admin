package com.tistory.fonercis.admin.ifs;

import com.tistory.fonercis.admin.model.network.Header;

public interface CrudInterface {

    Header create();        //todo request object 추가

    Header read(Long id);

    Header update();

    Header delete(Long id);
}
