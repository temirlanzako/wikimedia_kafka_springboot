package kafka_springboot;

import kafka_springboot.entity.WikimediaData;
import kafka_springboot.repository.WikiMediaDataRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private WikiMediaDataRepo wikiMediaDataRepo;

    public KafkaDatabaseConsumer(WikiMediaDataRepo wikiMediaDataRepo) {
        this.wikiMediaDataRepo = wikiMediaDataRepo;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "myGroup"
    )
    public void consume(String eventMessage) {

        LOGGER.info(String.format("Event message received: %s", eventMessage));

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);

        wikiMediaDataRepo.save(wikimediaData);

    }
}
