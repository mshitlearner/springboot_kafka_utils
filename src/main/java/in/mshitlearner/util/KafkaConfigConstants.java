package in.mshitlearner.util;

public class KafkaConfigConstants {
	public static final String topicName = "myCusts-topic";
	public static final String consumerGroupName = "myCusts-group";
	public static final String bootStrapServerConfig= "localhost:9092";
	public static final String ackModeValue = "all"; 
	public static final Integer topicPartitions=1;
	public static final Integer topicReplicas=1;
	public static final String trustedPackages = "in.mshitlearner.binding";
	public static final String retryableTopicAttempts="4"; // 3 times it will retryable i.e., N-1 one times it will be retryable
	
	
	//Validation
	public static final Integer age = 3;
}
