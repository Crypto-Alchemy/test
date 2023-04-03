package okhttp3.internal.concurrent;

import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0012"}, mo44877d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lr37;", "taskLog", "T", "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lpc2;)Ljava/lang/Object;", "message", "log", "", "ns", "formatDuration", "okhttp"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: TaskLogger.kt */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        cb6 cb6 = cb6.f21669a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        vx2.m53590f(format, "format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        cb6 cb6 = cb6.f21669a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        vx2.m53590f(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, pc2<? extends T> pc2) {
        long j;
        vx2.m53591g(task, "task");
        vx2.m53591g(taskQueue, "queue");
        vx2.m53591g(pc2, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T invoke = pc2.invoke();
            pu2.m50113b(1);
            if (isLoggable) {
                log(task, taskQueue, vx2.m53598n("finished run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j)));
            }
            pu2.m50112a(1);
            return invoke;
        } catch (Throwable th) {
            pu2.m50113b(1);
            if (isLoggable) {
                log(task, taskQueue, vx2.m53598n("failed a run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j)));
            }
            pu2.m50112a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, pc2<String> pc2) {
        vx2.m53591g(task, "task");
        vx2.m53591g(taskQueue, "queue");
        vx2.m53591g(pc2, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, pc2.invoke());
        }
    }
}
