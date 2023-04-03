package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, mo44877d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lr37;", "publish", "flush", "close", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: AndroidLog.kt */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        vx2.m53591g(logRecord, "record");
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = logRecord.getLoggerName();
        vx2.m53590f(loggerName, "record.loggerName");
        int access$getAndroidLevel = AndroidLogKt.getAndroidLevel(logRecord);
        String message = logRecord.getMessage();
        vx2.m53590f(message, "record.message");
        androidLog.androidLog$okhttp(loggerName, access$getAndroidLevel, message, logRecord.getThrown());
    }
}
