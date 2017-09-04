package com.ginkgocap.ywxt.track.web.controller;

import com.ginkgocap.ywxt.excel.export.ColumnSettingImpl;
import com.ginkgocap.ywxt.excel.export.ExcelExport;
import com.ginkgocap.ywxt.excel.export.ExportSetting;
import com.ginkgocap.ywxt.track.web.model.TbBusinessTrack;
import com.ginkgocap.ywxt.track.web.model.vo.TbBusinessTrackVO;
import com.ginkgocap.ywxt.track.web.service.TrackRepositoryService;
import com.gintong.frame.util.dto.CommonResultCode;
import com.gintong.frame.util.dto.InterfaceResult;
import org.apache.poi.ss.usermodel.Workbook;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    private ExcelExport excelExport;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public InterfaceResult getOne(@PathVariable Long id) {
        try {
            LOGGER.info("id : {}", id);
            TbBusinessTrack businessTrack = trackRepositoryService.getOne(id);
            LOGGER.info("businessTrack : {}", null == businessTrack ? "null" : businessTrack.toString());
            return InterfaceResult.getSuccessInterfaceResultInstance(businessTrack);
        } catch (Exception e) {
            LOGGER.error("{}, {}", e.getMessage(), e);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }

    @RequestMapping(value = "/vo/{id}", method = RequestMethod.GET)
    public InterfaceResult getOneVO(@PathVariable Long id) {
        try {
            LOGGER.info("id : {}", id);
            TbBusinessTrackVO oneVO = trackRepositoryService.getOneVO(id);
            LOGGER.info("businessTrack : {}", null == oneVO ? "null" : oneVO.toString());
            return InterfaceResult.getSuccessInterfaceResultInstance(oneVO);
        } catch (Exception e) {
            LOGGER.error("{}, {}", e.getMessage(), e);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }

    @RequestMapping(value = "/day/{businessModel}/{optType}/{year}/{month}", method = RequestMethod.GET)
    public InterfaceResult getBusinessTrackByDay(
            @PathVariable Integer businessModel,
            @PathVariable Integer optType,
            @PathVariable int year,
            @PathVariable int month) {
        try {
            int year_ = year, month_ = month + 1;
            if ( 12 == month) {
                year_ += 1;
                month_ = 1;
            }
            long start = new DateTime(year, month, 1, 0, 0).getMillis();
            long end = new DateTime(year_, month_, 1, 0, 0).getMillis();
            List businessTrackByDay = trackRepositoryService.getBusinessTrackByDay(new Timestamp(start), new Timestamp(end), businessModel, optType);
            LOGGER.info("businessTrack : {}", null == businessTrackByDay ? "null" : businessTrackByDay.toString());
            return InterfaceResult.getSuccessInterfaceResultInstance(businessTrackByDay);
        } catch (Exception e) {
            LOGGER.error("{}, {}", e.getMessage(), e);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }

    @RequestMapping(value = "/addTrack.json", method = RequestMethod.PUT)
    public InterfaceResult saveAndFlush(@RequestBody TbBusinessTrack tbBusinessTrack) {
        try {
            LOGGER.info("tbBusinessTrack:{}", tbBusinessTrack.toString());
            TbBusinessTrack businessTrack = trackRepositoryService.saveAndFlush(tbBusinessTrack);
            LOGGER.info("businessTrack:{}", null == businessTrack ? "null" : businessTrack.toString());
            return InterfaceResult.getSuccessInterfaceResultInstance(businessTrack);
        } catch (Exception e) {
            LOGGER.error("{}, {}", e.getMessage(), e);
        }
        return InterfaceResult.getInterfaceResultInstance(CommonResultCode.SYSTEM_EXCEPTION);
    }

    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void export(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        String fileName = null;
        Workbook webHook = null;

        List<TbBusinessTrack> list = new ArrayList<TbBusinessTrack>(1);
        list.add(trackRepositoryService.getOne(29L));

        String[] title = {"serverType", "businessModel", "businessModelId", "optType", "shareType",
                "userId", "userName", "remarks", "clientIp", "methodType",
                "url", "parameter", "useragent", "gmtCreate"};

        ExportSetting setting = new ExportSetting(title, ColumnSettingImpl.build(TbBusinessTrack.class,
                "serverType", "businessModel", "businessModelId", "optType", "shareType",
                "userId", "userName", "remarks", "clientIp", "methodType",
                "url", "parameter", "useragent", "gmtCreate"));
        webHook = excelExport.export(list, setting);

        fileName = "expert_labour_" + new Date().getTime() + ".xlsx";
        response.setContentType("application/octet-stream; charset=utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        ServletOutputStream out = response.getOutputStream();
        webHook.write(out);
        out.flush();
        out.close();
    }
}
