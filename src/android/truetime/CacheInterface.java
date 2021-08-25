package com.totalpave.tpdate.truetime;

public interface CacheInterface {

    String KEY_CACHED_BOOT_TIME = "com.totalpave.tpdate.truetime.cached_boot_time";
    String KEY_CACHED_DEVICE_UPTIME = "com.totalpave.tpdate.truetime.cached_device_uptime";
    String KEY_CACHED_SNTP_TIME = "com.totalpave.tpdate.truetime.cached_sntp_time";

    void put(String key, long value);

    long get(String key, long defaultValue);

    void clear();


}
