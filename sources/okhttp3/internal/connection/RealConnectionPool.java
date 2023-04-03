package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001 \u0018\u0000 -2\u00020\u0001:\u0001-B'\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J.\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006."}, mo44877d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Lokhttp3/internal/connection/RealConnection;", "connection", "", "now", "", "pruneAndGetAllocationCount", "idleConnectionCount", "connectionCount", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", "call", "", "Lokhttp3/Route;", "routes", "", "requireMultiplexed", "callAcquirePooledConnection", "Lr37;", "put", "connectionBecameIdle", "evictAll", "cleanup", "maxIdleConnections", "I", "keepAliveDurationNs", "J", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: RealConnectionPool.kt */
public final class RealConnectionPool {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask = new RealConnectionPool$cleanupTask$1(this, vx2.m53598n(Util.okHttpName, " ConnectionPool"));
    private final ConcurrentLinkedQueue<RealConnection> connections = new ConcurrentLinkedQueue<>();
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo44877d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: RealConnectionPool.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            vx2.m53591g(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }

    public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit) {
        boolean z;
        vx2.m53591g(taskRunner, "taskRunner");
        vx2.m53591g(timeUnit, "timeUnit");
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = taskRunner.newQueue();
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(vx2.m53598n("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            List<Reference<RealCall>> calls = realConnection.getCalls();
            int i = 0;
            while (i < calls.size()) {
                Reference reference = calls.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    Platform.Companion.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                    calls.remove(i);
                    realConnection.setNoNewExchanges(true);
                    if (calls.isEmpty()) {
                        realConnection.setIdleAtNs$okhttp(j - this.keepAliveDurationNs);
                        return 0;
                    }
                }
            }
            return calls.size();
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }

    public final boolean callAcquirePooledConnection(Address address, RealCall realCall, List<Route> list, boolean z) {
        vx2.m53591g(address, org.web3j.abi.datatypes.Address.TYPE_NAME);
        vx2.m53591g(realCall, "call");
        Iterator<RealConnection> it = this.connections.iterator();
        while (it.hasNext()) {
            RealConnection next = it.next();
            vx2.m53590f(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.isMultiplexed$okhttp()) {
                        r37 r37 = r37.f33317a;
                    }
                }
                if (next.isEligible$okhttp(address, list)) {
                    realCall.acquireConnectionNoEvents(next);
                    return true;
                }
                r37 r372 = r37.f33317a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        okhttp3.internal.Util.closeQuietly(r3.socket());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        if (r10.connections.isEmpty() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        r10.cleanupQueue.cancelAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008e, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long cleanup(long r11) {
        /*
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r10.connections
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r0.next()
            okhttp3.internal.connection.RealConnection r6 = (okhttp3.internal.connection.RealConnection) r6
            java.lang.String r7 = "connection"
            p000.vx2.m53590f(r6, r7)
            monitor-enter(r6)
            int r7 = r10.pruneAndGetAllocationCount(r6, r11)     // Catch:{ all -> 0x003a }
            if (r7 <= 0) goto L_0x0028
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0028:
            int r1 = r1 + 1
            long r7 = r6.getIdleAtNs$okhttp()     // Catch:{ all -> 0x003a }
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0036
            r3 = r6
            r4 = r7
        L_0x0036:
            r37 r7 = p000.r37.f33317a     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r6)
            goto L_0x000d
        L_0x003a:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L_0x003d:
            long r6 = r10.keepAliveDurationNs
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            int r0 = r10.maxIdleConnections
            if (r1 <= r0) goto L_0x0048
            goto L_0x0052
        L_0x0048:
            if (r1 <= 0) goto L_0x004c
            long r6 = r6 - r4
            return r6
        L_0x004c:
            if (r2 <= 0) goto L_0x004f
            return r6
        L_0x004f:
            r11 = -1
            return r11
        L_0x0052:
            p000.vx2.m53588d(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.getCalls()     // Catch:{ all -> 0x008f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008f }
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L_0x0066
            monitor-exit(r3)
            return r6
        L_0x0066:
            long r8 = r3.getIdleAtNs$okhttp()     // Catch:{ all -> 0x008f }
            long r8 = r8 + r4
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0071
            monitor-exit(r3)
            return r6
        L_0x0071:
            r3.setNoNewExchanges(r1)     // Catch:{ all -> 0x008f }
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r11 = r10.connections     // Catch:{ all -> 0x008f }
            r11.remove(r3)     // Catch:{ all -> 0x008f }
            monitor-exit(r3)
            java.net.Socket r11 = r3.socket()
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r11)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r11 = r10.connections
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x008e
            okhttp3.internal.concurrent.TaskQueue r11 = r10.cleanupQueue
            r11.cancelAll()
        L_0x008e:
            return r6
        L_0x008f:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.cleanup(long):long");
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        vx2.m53591g(realConnection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        } else if (realConnection.getNoNewExchanges() || this.maxIdleConnections == 0) {
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            if (!this.connections.isEmpty()) {
                return true;
            }
            this.cleanupQueue.cancelAll();
            return true;
        } else {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
            return false;
        }
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        vx2.m53590f(it, "connections.iterator()");
        while (it.hasNext()) {
            RealConnection next = it.next();
            vx2.m53590f(next, "connection");
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean isEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (RealConnection realConnection : concurrentLinkedQueue) {
                vx2.m53590f(realConnection, "it");
                synchronized (realConnection) {
                    isEmpty = realConnection.getCalls().isEmpty();
                }
                if (isEmpty && (i = i + 1) < 0) {
                    ck0.m33071s();
                }
            }
        }
        return i;
    }

    public final void put(RealConnection realConnection) {
        vx2.m53591g(realConnection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            this.connections.add(realConnection);
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }
}
