package zendesk.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.zendesk.logger.Logger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class DeviceInfo {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "DeviceInfo";
    private static final String PLATFORM_ANDROID = "Android";
    private final ActivityManager activityManager;
    private final Context context;

    public DeviceInfo(Context context2) {
        this.context = context2;
        this.activityManager = (ActivityManager) context2.getSystemService("activity");
    }

    private long getAvailableInternalDiskMemory() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    private String getBytesInMb(long j) {
        return String.valueOf(j / 1048576);
    }

    public static Locale getCurrentLocale(Context context2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context2.getResources().getConfiguration().getLocales().get(0);
        }
        return context2.getResources().getConfiguration().locale;
    }

    private long getDiskSize() {
        return getTotalInternalDiskSize();
    }

    private String getManufacturer() {
        boolean z;
        String str = Build.MANUFACTURER;
        if ("unknown".equals(str) || kb6.m46951d(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        return str;
    }

    private String getOS() {
        String str = Build.VERSION.RELEASE;
        if ("unknown".equals(str) || kb6.m46951d(str)) {
        }
        int i = Build.VERSION.SDK_INT;
        return String.format(Locale.US, "%s/%s", new Object[]{str, Integer.valueOf(i)});
    }

    private long getTotalInternalDiskSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    private long getTotalMemory() {
        Logger.m43078b(LOG_TAG, "Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private long getUsedDiskSpace() {
        return getDiskSize() - getAvailableInternalDiskMemory();
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    public Map<String, String> getInfo() {
        HashMap hashMap = new HashMap();
        String os = getOS();
        String model = getModel();
        long usedMemory = getUsedMemory();
        long totalMemory = getTotalMemory();
        long diskSize = getDiskSize();
        long usedDiskSpace = getUsedDiskSpace();
        int batteryLevel = getBatteryLevel();
        String locale = getLocale();
        String manufacturer = getManufacturer();
        if (!kb6.m46951d(os)) {
            hashMap.put("os", os);
        }
        if (!kb6.m46951d(model)) {
            hashMap.put("model", model);
        }
        if (usedMemory != -1) {
            hashMap.put("memory_used", getBytesInMb(usedMemory));
        }
        if (totalMemory != -1) {
            hashMap.put("memory_total", getBytesInMb(totalMemory));
        }
        if (diskSize != -1) {
            hashMap.put("disk_total", getBytesInMb(diskSize));
        }
        if (usedDiskSpace != -1) {
            hashMap.put("disk_used", getBytesInMb(usedDiskSpace));
        }
        if (batteryLevel != -1) {
            hashMap.put("battery_level", String.valueOf(batteryLevel));
        }
        if (!kb6.m46951d(locale)) {
            hashMap.put("sys_locale", locale);
        }
        if (!kb6.m46951d(manufacturer)) {
            hashMap.put("manufacturer", manufacturer);
        }
        hashMap.put("platform", PLATFORM_ANDROID);
        return hashMap;
    }

    public String getLocale() {
        return zj3.m55133d(Locale.getDefault());
    }

    public String getModel() {
        boolean z;
        boolean z2;
        String str = Build.MODEL;
        if ("unknown".equals(str) || kb6.m46951d(str)) {
            z = true;
        } else {
            z = false;
        }
        String str2 = Build.DEVICE;
        if ("unknown".equals(str2) || kb6.m46951d(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return "";
        }
        if (str.equals(str2)) {
            return str;
        }
        return String.format(Locale.US, "%s/%s", new Object[]{str, str2});
    }
}
