package com.algaworks.algasensors.device.management;

import com.algaworks.algasensors.device.management.common.IdGenerator;
import io.hypersistence.tsid.TSID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class TSIDTest {

    @Test
    public void shouldGenerateTSID(){

        TSID tsid1 = IdGenerator.generate();

        Assertions.assertNotEquals(tsid1.getInstant(), Instant.now());
        System.out.println(tsid1);
        System.out.println(tsid1.toLong());
        System.out.println(tsid1.getInstant());


    }
}
