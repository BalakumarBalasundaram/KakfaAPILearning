package org.bk.kafkalearnapi.kafkaadmins;


import kafka.admin.AdminUtils;
import kafka.admin.RackAwareMode;
import kafka.admin.RackAwareMode$;
import kafka.utils.ZKStringSerializer$;
import kafka.utils.ZkUtils;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class CreateTopic {


    public static final Logger logger = LogManager.getLogger(CreateTopic.class);

    public static void main(String[] args) {

        int sessionTimeoutMs = 10 * 1000;
        int connTimeoutMs = 8 * 1000;
        
        ZkClient zkclient = new ZkClient( Commons.ZOOKEEPER_SERVER_URL,  sessionTimeoutMs,
                connTimeoutMs, ZKStringSerializer$.MODULE$);
        
        boolean isSecureKafkaCluster = false;

        ZkConnection zkconn = new ZkConnection(Commons.ZOOKEEPER_SERVER_URL);
        
        ZkUtils zkutils = new ZkUtils(zkclient, zkconn, isSecureKafkaCluster);

        Properties topicConfig = new Properties();
        if (AdminUtils.topicExists(zkutils, Commons.RAW_KAFKA_TOPIC)) {
            logger.info("topic {} already exists", Commons.RAW_KAFKA_TOPIC);
        } else {
            AdminUtils.createTopic(zkutils, Commons.RAW_KAFKA_TOPIC,1,1, topicConfig, RackAwareMode.Safe$.MODULE$);
        }
        
        zkclient.close();

    }
}
