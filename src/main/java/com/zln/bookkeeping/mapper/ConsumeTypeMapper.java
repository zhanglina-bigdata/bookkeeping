package com.zln.bookkeeping.mapper;

import com.zln.bookkeeping.bean.ConsumeTypeBean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ConsumeTypeMapper {
        List<ConsumeTypeBean> getInfo();
}
