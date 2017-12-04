package com.ginkgocap.ywxt.track.web.service.impl;

import com.ginkgocap.ywxt.track.web.service.BaseService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gintong on 2017/8/23.
 */
@Component
public abstract class BaseServiceImpl implements BaseService{

    @Autowired
    protected Mapper mapper;

    /** 转换非集合数据 */
    @SuppressWarnings("unchecked")
    protected <T> T convert(Object object, Class<T> type) {
        return isDefaultType(type) ? (T) object : mapper.map(object, type);
    }

    /** 转换集合数据 */
    @SuppressWarnings("unchecked")
    protected <T> List<T> convert(List list, Class<T> type) {
        //type为null或者为Map时，返回原值
        if (isDefaultType(type)) {
            return (List<T>) list;
        }

        //将返回的map转换为实体类
        List<T> ts = new ArrayList<T>(list.size());
        for (Object object : list) {
            ts.add(mapper.map(object, type));
        }
        return ts;
    }

    /** 是否默认类型，返回的数据为Map类型，type为null时，使用默认类型 */
    protected <T> boolean isDefaultType(Class<T> type) {return type == null || Map.class.isAssignableFrom(type);}

    @Override
    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    public Mapper getMapper() {
        return mapper;
    }
}
