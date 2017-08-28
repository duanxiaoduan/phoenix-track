package com.ginkgocap.ywxt.track.web.service;

import com.ginkgocap.ywxt.track.web.model.TbBusinessTrack;
import com.ginkgocap.ywxt.track.web.model.vo.TbBusinessTrackVO;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by gintong on 2017/8/23.
 */
public interface TrackRepositoryService {

    TbBusinessTrack getOne(Long id);

    TbBusinessTrackVO getOneVO(Long id);

    TbBusinessTrack saveAndFlush(TbBusinessTrack tbBusinessTrack);

    List getBusinessTrackByDay(Timestamp start, Timestamp end, Integer businessModel);
}
