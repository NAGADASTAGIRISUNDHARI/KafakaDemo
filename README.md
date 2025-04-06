Kafka_Prereqisites :
--------------------

Key Points
Kafka 2.8.0 and Later: You can run Kafka without ZooKeeper using the KRaft mode.
ZooKeeper Mode: Prior to Kafka 2.8.0, ZooKeeper was required to manage the Kafka brokers and topics.
Migration: If you're using an older version, you will need ZooKeeper. For new installations, it's recommended to use Kafka 2.8.0 or later to take advantage of the KRaft mode.

Below is the steps to start zookeeper and kafka server :
---------------------------------------------------------

First Start with Zookeper : bin/zookeeper-server-start.sh config/zookeeper.properties
Next start with server : bin/kafka-server-start.sh config/server.properties
