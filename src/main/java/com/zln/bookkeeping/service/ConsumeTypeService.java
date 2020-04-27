package com.zln.bookkeeping.service;

import com.zln.bookkeeping.bean.ConsumeTypeBean;
import com.zln.bookkeeping.mapper.ConsumeTypeMapper;
import com.zln.bookkeeping.serviceImpl.ConsumeTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsumeTypeService implements ConsumeTypeServiceImpl {

   @Autowired
    private ConsumeTypeMapper consumeTypeMapper;

    @Override
    public List<ConsumeTypeBean> getConsumeTypeBean() {
        List<ConsumeTypeBean> consumeTypeBeans = consumeTypeMapper.getInfo();
        return consumeTypeBeans;
    }
}
