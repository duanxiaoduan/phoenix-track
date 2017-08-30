package com.ginkgocap.ywxt.track.web.repository;

import com.ginkgocap.ywxt.track.web.model.TbBusinessTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;


/**
 * Created by gintong on 2017/8/21.
 */
@Repository
public interface TrackRepository extends JpaRepository<TbBusinessTrack, Long> {

    @Query("select a from TbBusinessTrack a where a.id = ?1")
    TbBusinessTrack getOne(Long id);

    @Query(value = "SELECT DATE_FORMAT(gmt_create,'%Y%m%d') days,count(id) count FROM tb_business_track " +
            "WHERE  ?1 < gmt_create AND gmt_create < ?2 AND business_model = ?3 AND opt_type = ?4 group by days", nativeQuery = true)
    List getBusinessTrackByDay(Timestamp start, Timestamp end, Integer businessModel, Integer optType);

    TbBusinessTrack saveAndFlush(TbBusinessTrack tbBusinessTrack);



}
