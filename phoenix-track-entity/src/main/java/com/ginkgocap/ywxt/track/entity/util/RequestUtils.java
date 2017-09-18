package com.ginkgocap.ywxt.track.entity.util;

import com.ginkgocap.ywxt.track.entity.constant.MethodTypeEnum;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gintong on 2017/9/18.
 */
public class RequestUtils {

    public static String getRequestMethod(final HttpServletRequest request) {
        if (null == request) {
            return null;
        }
        return request.getMethod();
    }

    public static Integer getBusinessRequestMethod(final HttpServletRequest request) {
        if (null == request) {
            return -1;
        }
        if (MethodTypeEnum.REQUEST_METHOD_GET.getValue().equals(getRequestMethod(request))) {
            return MethodTypeEnum.REQUEST_METHOD_GET.getKey();
        } else if (MethodTypeEnum.REQUEST_METHOD_POST.getValue().equals(getRequestMethod(request))) {
            return MethodTypeEnum.REQUEST_METHOD_POST.getKey();
        } else if (MethodTypeEnum.REQUEST_METHOD_PUT.getValue().equals(getRequestMethod(request))) {
            return MethodTypeEnum.REQUEST_METHOD_PUT.getKey();
        } else if (MethodTypeEnum.REQUEST_METHOD_DELETE.getValue().equals(getRequestMethod(request))) {
            return MethodTypeEnum.REQUEST_METHOD_DELETE.getKey();
        } else {
            return -1;
        }
    }
}
