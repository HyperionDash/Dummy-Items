package net.hyper.dummyitems.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class DummyItemsConfig extends MidnightConfig {
    @Entry(min = 1, max = Integer.MAX_VALUE) public static int dummyItemsCount = 9999;
}
