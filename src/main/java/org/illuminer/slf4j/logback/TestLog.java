package org.illuminer.slf4j.logback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLog {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            log.info("This is info: [{}]", i);
            log.error("This is error: [{}]", i);
        }
    }
}
