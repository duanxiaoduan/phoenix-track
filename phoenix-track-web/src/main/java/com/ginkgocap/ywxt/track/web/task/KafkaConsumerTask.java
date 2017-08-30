package com.ginkgocap.ywxt.track.web.task;


import com.ginkgocap.ywxt.track.web.util.kafka.JavaKafkaSimpleConsumerAPI;
import com.ginkgocap.ywxt.track.web.util.kafka.bean.KafkaBrokerInfo;
import com.ginkgocap.ywxt.track.web.util.kafka.bean.KafkaTopicPartitionInfo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by gintong on 2017/8/28.
 */
@Component
public class KafkaConsumerTask implements ApplicationListener<ContextRefreshedEvent> {

    private final int MAX_THREAD_POOL = 2;
    private final long MAX_READS = 300;
    private final String TOPIC = "temp_log_kafka";
    private final int PARTITION_ID = 0;

    public void onApplicationEvent(ContextRefreshedEvent event) {
        ScheduledExecutorService service = Executors
                .newScheduledThreadPool(MAX_THREAD_POOL);

        final JavaKafkaSimpleConsumerAPI example = new JavaKafkaSimpleConsumerAPI();

        final KafkaTopicPartitionInfo topicPartitionInfo = new KafkaTopicPartitionInfo(TOPIC, PARTITION_ID);
        List<KafkaBrokerInfo> seeds = new ArrayList<KafkaBrokerInfo>();
        seeds.add(new KafkaBrokerInfo("192.168.101.15", 9092));
        final List<KafkaBrokerInfo> seed = seeds;
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    example.run(MAX_READS, topicPartitionInfo, seed);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        if(event.getApplicationContext().getParent() == null) {
            service.scheduleAtFixedRate(runnable, 30, 60, TimeUnit.SECONDS);
        }
    }
}
