package com.flinkhackathon.datagenerator.pravega;

import com.flinkhackathon.datagenerator.constants.PravegaConstants;
import io.pravega.client.ClientConfig;
import io.pravega.client.EventStreamClientFactory;
import io.pravega.client.admin.StreamManager;
import io.pravega.client.stream.EventStreamWriter;
import io.pravega.client.stream.EventWriterConfig;
import io.pravega.client.stream.ScalingPolicy;
import io.pravega.client.stream.StreamConfiguration;

import io.pravega.client.stream.impl.UTF8StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 业务数据生产者 Pravega
 *
 * @author Defu Li
 * @since 2022/1/2 15:23
 */
public class BusinessDataPravegaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessDataPravegaProducer.class);

    private static final EventStreamWriter<String> WRITER;

    static {
        WRITER = initProducer();
    }

    private static EventStreamWriter<String> initProducer() {
        StreamManager streamManager = StreamManager.create(URI.create(PravegaConstants.CONTROLLER_URI));

        final boolean scopeCreation = streamManager.createScope(PravegaConstants.SCOPE);
        StreamConfiguration streamConfig = StreamConfiguration.builder()
                .scalingPolicy(ScalingPolicy.fixed(1))
                .build();
        if (scopeCreation) {
            LOGGER.info("create scope success!");
        }
        final boolean streamCreation = streamManager.createStream(PravegaConstants.SCOPE, PravegaConstants.STREAM_NAME, streamConfig);
        if (streamCreation) {
            LOGGER.info("create stream success!");
        }
        EventStreamClientFactory clientFactory = EventStreamClientFactory.withScope(PravegaConstants.SCOPE,
                ClientConfig.builder().controllerURI(URI.create(PravegaConstants.CONTROLLER_URI)).build());
        EventStreamWriter<String> writer = clientFactory.createEventWriter(PravegaConstants.STREAM_NAME,
                new UTF8StringSerializer(),
                EventWriterConfig.builder().build());

        return writer;
    }

    public static void doWrite(String message) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> writeFuture = WRITER.writeEvent(message);
//            writeFuture.get();
        LOGGER.info("write message success! message:{}", message);

    }

}
