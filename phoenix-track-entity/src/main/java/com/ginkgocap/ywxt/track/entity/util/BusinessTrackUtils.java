package com.ginkgocap.ywxt.track.entity.util;

import com.ginkgocap.ywxt.track.entity.constant.BusinessModelEnum;
import com.ginkgocap.ywxt.track.entity.constant.MethodTypeEnum;
import com.ginkgocap.ywxt.track.entity.constant.OptTypeEnum;
import com.ginkgocap.ywxt.track.entity.constant.ServerTypeEnum;
import com.ginkgocap.ywxt.track.entity.model.TbBusinessTrack;
import org.slf4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by gintong on 2017/9/15.
 */
public class BusinessTrackUtils {

    private static TbBusinessTrack getTbBusinessTrack(final HttpServletRequest request) {
        TbBusinessTrack tbBusinessTrack = new TbBusinessTrack();
        tbBusinessTrack.setClientIp(IPUtils.getRemoteAddr(request));
        tbBusinessTrack.setUrl(request.getRequestURL().toString() + (request.getQueryString() == null ? "" : ("?" + request.getQueryString())));
        tbBusinessTrack.setUserAgent(request.getHeader("User-Agent"));
        tbBusinessTrack.setGmtCreate(new Timestamp(System.currentTimeMillis()));
        tbBusinessTrack.setMethodType(RequestUtils.getBusinessRequestMethod(request));
        return tbBusinessTrack;
    }

    public static void addTbBusinessTrackLog(final Logger logger, final Logger trackLogger,final Integer businessModel,
            final Long businessModelId,final Integer modelFunction, final Integer optType,
            final HttpServletRequest request,final Long userId, final String userName) {
        try {
            TbBusinessTrack tbBusinessTrack = getTbBusinessTrack(request);
            tbBusinessTrack.setBusinessModel(businessModel);
            tbBusinessTrack.setBusinessModelId(businessModelId);
            tbBusinessTrack.setModelFunction(modelFunction);
            tbBusinessTrack.setOptType(optType);
            tbBusinessTrack.setServerType(ServerTypeEnum.SERVICE_INTERFACE.getKey());
            tbBusinessTrack.setParameter(null);
            tbBusinessTrack.setUserId(userId);
            tbBusinessTrack.setUserName(userName);
            trackLogger.info(tbBusinessTrack.toString());
        }catch (Exception e){
            logger.error("GET TRACK_LOGGER EXCEPTION, {},{}", e.getMessage(), e);
        }
    }

    public static void addTbBusinessTrackLog4AddOpt(final Logger logger, final Logger trackLogger,final Integer businessModel,
            final Long businessModelId,final Integer modelFunction, final Integer optType,
            final HttpServletRequest request,final Long userId, final String userName) {
        addTbBusinessTrackLog(logger, trackLogger, businessModel, businessModelId, modelFunction, OptTypeEnum.OPT_ADD.getKey(), request, userId, userName);
    }

    public static void addTbBusinessTrackLog4ViewOpt(final Logger logger, final Logger trackLogger,final Integer businessModel,
                                                    final Long businessModelId,final Integer modelFunction, final Integer optType,
                                                    final HttpServletRequest request,final Long userId, final String userName) {
        addTbBusinessTrackLog(logger, trackLogger, businessModel, businessModelId, modelFunction, OptTypeEnum.OPT_VIEW.getKey(), request, userId, userName);
    }

    public static void addTbBusinessTrackLog4CollectOpt(final Logger logger, final Logger trackLogger,final Integer businessModel,
                                                     final Long businessModelId,final Integer modelFunction, final Integer optType,
                                                     final HttpServletRequest request,final Long userId, final String userName) {
        addTbBusinessTrackLog(logger, trackLogger, businessModel, businessModelId, modelFunction, OptTypeEnum.OPT_COLLECT.getKey(), request, userId, userName);
    }

    public static void addTbBusinessTrackLog4AnswersOpt(final Logger logger, final Logger trackLogger,final Integer businessModel,
                                                     final Long businessModelId,final Integer modelFunction, final Integer optType,
                                                     final HttpServletRequest request,final Long userId, final String userName) {
        addTbBusinessTrackLog(logger, trackLogger, businessModel, businessModelId, modelFunction, OptTypeEnum.OPT_ANSWERS.getKey(), request, userId, userName);
    }

    public static void addTbBusinessTrackLog4PlayOpt(final Logger logger, final Logger trackLogger,final Integer businessModel,
                                                     final Long businessModelId,final Integer modelFunction, final Integer optType,
                                                     final HttpServletRequest request,final Long userId, final String userName) {
        addTbBusinessTrackLog(logger, trackLogger, businessModel, businessModelId, modelFunction, OptTypeEnum.OPT_PLAY.getKey(), request, userId, userName);
    }

}
