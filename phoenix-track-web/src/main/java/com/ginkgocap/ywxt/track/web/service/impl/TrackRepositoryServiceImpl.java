package com.ginkgocap.ywxt.track.web.service.impl;

import com.ginkgocap.ywxt.track.web.model.TbBusinessTrack;
import com.ginkgocap.ywxt.track.web.model.vo.TbBusinessTrackVO;
import com.ginkgocap.ywxt.track.web.repository.TrackRepository;
import com.ginkgocap.ywxt.track.web.service.TrackRepositoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by gintong on 2017/8/23.
 */
@Service("TrackRepositoryService")
@Transactional(readOnly=true)
public class TrackRepositoryServiceImpl extends BaseServiceImpl implements TrackRepositoryService{

    @Resource
    private TrackRepository trackRepository;

    public TbBusinessTrack getOne(Long id) {
        return trackRepository.getOne(id);
    }

    public TbBusinessTrackVO getOneVO(Long id) {
        return convert(trackRepository.getOne(id), TbBusinessTrackVO.class);
    }

    @Transactional(readOnly=false)
    public TbBusinessTrack saveAndFlush(TbBusinessTrack tbBusinessTrack) {
        return trackRepository.saveAndFlush(tbBusinessTrack);
    }

    public List getBusinessTrackByDay(Timestamp start, Timestamp end, Integer businessModel, Integer optType) {
        return trackRepository.getBusinessTrackByDay(start, end, businessModel, optType);
    }
}
