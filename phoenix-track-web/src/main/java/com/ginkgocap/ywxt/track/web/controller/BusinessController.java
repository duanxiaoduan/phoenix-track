package com.ginkgocap.ywxt.track.web.controller;

import com.ginkgocap.ywxt.track.entity.constant.BusinessModelEnum;
import com.ginkgocap.ywxt.track.web.model.TbBusinessTrack;
import com.ginkgocap.ywxt.track.web.model.vo.TbBusinessTrackVO;
import com.ginkgocap.ywxt.track.web.service.TrackRepositoryService;
import com.gintong.frame.util.dto.CommonResultCode;
import com.gintong.frame.util.dto.InterfaceResult;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by gintong on 2017/8/21.
 */
@RestController
@RequestMapping("/v1/business")
public class BusinessController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessController.class);

    @Resource
    private TrackRepositoryService trackRepositoryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public InterfaceResult getOne(@PathVariable Long id) {
        LOGGER.info("id:{}", id);
        TbBusinessTrack businessTrack = trackRepositoryService.getOne(id);
        LOGGER.info("businessTrack:{}", businessTrack.toString());
        if (null != businessTrack) {
            return InterfaceResult.getSuccessInterfaceResultInstance(businessTrack);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }

    @RequestMapping(value = "/vo/{id}", method = RequestMethod.GET)
    public InterfaceResult getOneVO(@PathVariable Long id) {
        LOGGER.info("id:{}", id);
        TbBusinessTrackVO oneVO = trackRepositoryService.getOneVO(id);
        LOGGER.info("businessTrack:{}", oneVO.toString());
        if (null !=oneVO) {
            return InterfaceResult.getSuccessInterfaceResultInstance(oneVO);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }

    @RequestMapping(value = "/day", method = RequestMethod.GET)
    public InterfaceResult getBusinessTrackByDay() {
        long start = new DateTime(2017, 8, 1, 0, 0).getMillis();
        long end = new DateTime(2017, 8, 31, 0, 0).getMillis();
        List businessTrackByDay = trackRepositoryService.getBusinessTrackByDay(new Timestamp(start), new Timestamp(end), BusinessModelEnum.BUSINESS_VIDEO.getKey());
        LOGGER.info("businessTrack:{}", businessTrackByDay.toString());
        if (null != businessTrackByDay) {
            return InterfaceResult.getSuccessInterfaceResultInstance(businessTrackByDay);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }

    @RequestMapping(value = "/addTrack.json", method = RequestMethod.PUT)
    public InterfaceResult saveAndFlush(@RequestBody TbBusinessTrack tbBusinessTrack) {
        LOGGER.info("tbBusinessTrack:{}", tbBusinessTrack.toString());
        TbBusinessTrack businessTrack = trackRepositoryService.saveAndFlush(tbBusinessTrack);
        LOGGER.info("businessTrack:{}", tbBusinessTrack.toString());
        if (null != businessTrack) {
            return InterfaceResult.getSuccessInterfaceResultInstance(businessTrack);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }
}
