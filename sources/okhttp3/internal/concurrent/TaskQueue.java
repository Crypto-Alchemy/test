package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.internal.Util;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001:B\u0019\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b8\u00109J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\bø\u0001\u0000J8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\bø\u0001\u0000J\u0006\u0010\u0010\u001a\u00020\u000fJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\bH\u0016R\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0016\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0000X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00102\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010&R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00101\u0002\u0007\n\u0005\b20\u0001¨\u0006;"}, mo44877d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "Lokhttp3/internal/concurrent/Task;", "task", "", "delayNanos", "Lr37;", "schedule", "", "name", "Lkotlin/Function0;", "block", "", "cancelable", "execute", "Ljava/util/concurrent/CountDownLatch;", "idleLatch", "recurrence", "scheduleAndDecide$okhttp", "(Lokhttp3/internal/concurrent/Task;JZ)Z", "scheduleAndDecide", "cancelAll", "shutdown", "cancelAllAndDecide$okhttp", "()Z", "cancelAllAndDecide", "toString", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/lang/String;", "getName$okhttp", "()Ljava/lang/String;", "Z", "getShutdown$okhttp", "setShutdown$okhttp", "(Z)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "", "futureTasks", "Ljava/util/List;", "getFutureTasks$okhttp", "()Ljava/util/List;", "cancelActiveTask", "getCancelActiveTask$okhttp", "setCancelActiveTask$okhttp", "", "getScheduledTasks", "scheduledTasks", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "AwaitIdleTask", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: TaskQueue.kt */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks = new ArrayList();
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    @Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "runOnce", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: TaskQueue.kt */
    public static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch = new CountDownLatch(1);

        public AwaitIdleTask() {
            super(vx2.m53598n(Util.okHttpName, " awaitIdle"), false);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        public long runOnce() {
            this.latch.countDown();
            return -1;
        }
    }

    public TaskQueue(TaskRunner taskRunner2, String str) {
        vx2.m53591g(taskRunner2, "taskRunner");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        this.taskRunner = taskRunner2;
        this.name = str;
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j, boolean z, pc2 pc2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(pc2, "block");
        taskQueue.schedule(new TaskQueue$execute$1(str, z, pc2), j);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.schedule(task, j);
    }

    public final void cancelAll() {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this.taskRunner) {
                if (cancelAllAndDecide$okhttp()) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
                r37 r37 = r37.f33317a;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            vx2.m53588d(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z = false;
        int size = this.futureTasks.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (this.futureTasks.get(size).getCancelable()) {
                    Task task2 = this.futureTasks.get(size);
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.log(task2, this, "canceled");
                    }
                    this.futureTasks.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final void execute(String str, long j, boolean z, pc2<r37> pc2) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(pc2, "block");
        schedule(new TaskQueue$execute$1(str, z, pc2), j);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> K0;
        synchronized (this.taskRunner) {
            K0 = CollectionsKt___CollectionsKt.m47311K0(getFutureTasks$okhttp());
        }
        return K0;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (getActiveTask$okhttp() != null || !getFutureTasks$okhttp().isEmpty()) {
                Task activeTask$okhttp = getActiveTask$okhttp();
                if (activeTask$okhttp instanceof AwaitIdleTask) {
                    CountDownLatch latch = ((AwaitIdleTask) activeTask$okhttp).getLatch();
                    return latch;
                }
                for (Task next : getFutureTasks$okhttp()) {
                    if (next instanceof AwaitIdleTask) {
                        CountDownLatch latch2 = ((AwaitIdleTask) next).getLatch();
                        return latch2;
                    }
                }
                AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
                if (scheduleAndDecide$okhttp(awaitIdleTask, 0, false)) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
                CountDownLatch latch3 = awaitIdleTask.getLatch();
                return latch3;
            }
            CountDownLatch countDownLatch = new CountDownLatch(0);
            return countDownLatch;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void schedule(okhttp3.internal.concurrent.Task r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            p000.vx2.m53591g(r3, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            boolean r1 = r2.getShutdown$okhttp()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0042
            boolean r4 = r3.getCancelable()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0029
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch:{ all -> 0x0054 }
            java.util.logging.Logger r4 = r4.getLogger()     // Catch:{ all -> 0x0054 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0054 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0027
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.log(r3, r2, r4)     // Catch:{ all -> 0x0054 }
        L_0x0027:
            monitor-exit(r0)
            return
        L_0x0029:
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch:{ all -> 0x0054 }
            java.util.logging.Logger r4 = r4.getLogger()     // Catch:{ all -> 0x0054 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0054 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.log(r3, r2, r4)     // Catch:{ all -> 0x0054 }
        L_0x003c:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0042:
            r1 = 0
            boolean r3 = r2.scheduleAndDecide$okhttp(r3, r4, r1)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0050
            okhttp3.internal.concurrent.TaskRunner r3 = r2.getTaskRunner$okhttp()     // Catch:{ all -> 0x0054 }
            r3.kickCoordinator$okhttp(r2)     // Catch:{ all -> 0x0054 }
        L_0x0050:
            r37 r3 = p000.r37.f33317a     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)
            return
        L_0x0054:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.schedule(okhttp3.internal.concurrent.Task, long):void");
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j, boolean z) {
        boolean z2;
        String str;
        vx2.m53591g(task, "task");
        task.initQueue$okhttp(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j2) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j2);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z) {
                str = vx2.m53598n("run again after ", TaskLoggerKt.formatDuration(j2 - nanoTime));
            } else {
                str = vx2.m53598n("scheduled after ", TaskLoggerKt.formatDuration(j2 - nanoTime));
            }
            TaskLoggerKt.log(task, this, str);
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - nanoTime > j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.futureTasks.size();
        }
        this.futureTasks.add(i, task);
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
        this.cancelActiveTask = z;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.shutdown = z;
    }

    public final void shutdown() {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this.taskRunner) {
                setShutdown$okhttp(true);
                if (cancelAllAndDecide$okhttp()) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
                r37 r37 = r37.f33317a;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j, pc2 pc2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(pc2, "block");
        taskQueue.schedule(new TaskQueue$schedule$2(str, pc2), j);
    }

    public final void schedule(String str, long j, pc2<Long> pc2) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(pc2, "block");
        schedule(new TaskQueue$schedule$2(str, pc2), j);
    }
}
