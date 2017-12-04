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
* @author cinderella
* @version 2017/12/1
*/
@Service("TrackRepositoryService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class TrackRepositoryServiceImpl extends BaseServiceImpl implements TrackRepositoryService{

    @Resource
    private TrackRepository trackRepository;

    @Override
    public TbBusinessTrack getOne(Long id) {
        return trackRepository.getOne(id);
    }

    @Override
    public TbBusinessTrackVO getOneVO(Long id) {
        return convert(trackRepository.getOne(id), TbBusinessTrackVO.class);
    }

    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public TbBusinessTrack saveAndFlush(TbBusinessTrack tbBusinessTrack) {
        return trackRepository.saveAndFlush(tbBusinessTrack);
    }

    @Override
    public List getBusinessTrackByDay(Timestamp start, Timestamp end, Integer businessModel, Integer optType) {
        return trackRepository.getBusinessTrackByDay(start, end, businessModel, optType);
    }
}
