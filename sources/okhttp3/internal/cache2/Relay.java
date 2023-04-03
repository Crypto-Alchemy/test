package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 C2\u00020\u0001:\u0002CDB5\b\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u00107\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\"\u0010:\u001a\u0002098\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0011\u0010@\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b@\u00104¨\u0006E"}, mo44877d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Lokio/ByteString;", "prefix", "", "upstreamSize", "metadataSize", "Lr37;", "writeHeader", "writeMetadata", "commit", "metadata", "Lz56;", "newSource", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "upstream", "Lz56;", "getUpstream", "()Lz56;", "setUpstream", "(Lz56;)V", "upstreamPos", "J", "getUpstreamPos", "()J", "setUpstreamPos", "(J)V", "Lokio/ByteString;", "bufferMaxSize", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lm40;", "upstreamBuffer", "Lm40;", "getUpstreamBuffer", "()Lm40;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lz56;JLokio/ByteString;J)V", "Companion", "RelaySource", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Relay.kt */
public final class Relay {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final m40 buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private z56 upstream;
    private final m40 upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "Ljava/io/File;", "file", "Lz56;", "upstream", "Lokio/ByteString;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "read", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Relay.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Relay edit(File file, z56 z56, ByteString byteString, long j) throws IOException {
            vx2.m53591g(file, "file");
            vx2.m53591g(z56, "upstream");
            vx2.m53591g(byteString, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, z56, 0, byteString, j, (DefaultConstructorMarker) null);
            randomAccessFile.setLength(0);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            vx2.m53591g(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            vx2.m53590f(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            m40 m40 = new m40();
            fileOperator.read(0, m40, Relay.FILE_HEADER_SIZE);
            ByteString byteString = Relay.PREFIX_CLEAN;
            if (vx2.m53586b(m40.mo56106z0((long) byteString.size()), byteString)) {
                long readLong = m40.readLong();
                long readLong2 = m40.readLong();
                m40 m402 = new m40();
                fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, m402, readLong2);
                return new Relay(randomAccessFile, (z56) null, readLong, m402.mo56042V0(), 0, (DefaultConstructorMarker) null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo44877d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "Lqq6;", "timeout", "Lr37;", "close", "Lqq6;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Relay.kt */
    public final class RelaySource implements z56 {
        private FileOperator fileOperator;
        private long sourcePos;
        public final /* synthetic */ Relay this$0;
        private final qq6 timeout = new qq6();

        public RelaySource(Relay relay) {
            vx2.m53591g(relay, "this$0");
            this.this$0 = relay;
            RandomAccessFile file = relay.getFile();
            vx2.m53588d(file);
            FileChannel channel = file.getChannel();
            vx2.m53590f(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = this.this$0;
                synchronized (relay) {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile((RandomAccessFile) null);
                        randomAccessFile = file;
                    }
                    r37 r37 = r37.f33317a;
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
            if (r4 != true) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
            r8 = java.lang.Math.min(r2, r1.this$0.getUpstreamPos() - r1.sourcePos);
            r2 = r1.fileOperator;
            p000.vx2.m53588d(r2);
            r2.read(r1.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r8);
            r1.sourcePos += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r0 = r1.this$0.getUpstream();
            p000.vx2.m53588d(r0);
            r14 = r0.read(r1.this$0.getUpstreamBuffer(), r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
            if (r14 != -1) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
            r0 = r1.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r2.setUpstreamReader((java.lang.Thread) null);
            r2.notifyAll();
            r0 = p000.r37.f33317a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r9 = java.lang.Math.min(r14, r2);
            r1.this$0.getUpstreamBuffer().mo56058g(r20, 0, r9);
            r1.sourcePos += r9;
            r13 = r1.fileOperator;
            p000.vx2.m53588d(r13);
            r4 = r14;
            r13.write(r1.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r1.this$0.getUpstreamBuffer().clone(), r4);
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x010a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r2.getBuffer().write(r2.getUpstreamBuffer(), r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0124, code lost:
            if (r2.getBuffer().size() <= r2.getBufferMaxSize()) goto L_0x013a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
            r2.getBuffer().skip(r2.getBuffer().size() - r2.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
            r2.setUpstreamPos(r2.getUpstreamPos() + r4);
            r0 = p000.r37.f33317a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0147, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            r2.setUpstreamReader((java.lang.Thread) null);
            r2.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x014f, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0156, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0159, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r2.setUpstreamReader((java.lang.Thread) null);
            r2.notifyAll();
            r3 = p000.r37.f33317a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0163, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(p000.m40 r20, long r21) throws java.io.IOException {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                java.lang.String r0 = "sink"
                r5 = r20
                p000.vx2.m53591g(r5, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L_0x0012
                r0 = r4
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 == 0) goto L_0x016a
                okhttp3.internal.cache2.Relay r8 = r1.this$0
                monitor-enter(r8)
            L_0x0018:
                long r6 = r8.getUpstreamPos()     // Catch:{ all -> 0x0167 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                r6 = 2
                r9 = -1
                if (r0 == 0) goto L_0x005b
                long r11 = r8.getUpstreamPos()     // Catch:{ all -> 0x0167 }
                m40 r0 = r8.getBuffer()     // Catch:{ all -> 0x0167 }
                long r13 = r0.size()     // Catch:{ all -> 0x0167 }
                long r11 = r11 - r13
                long r13 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x003a
                r4 = r6
                goto L_0x0076
            L_0x003a:
                long r6 = r8.getUpstreamPos()     // Catch:{ all -> 0x0167 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                long r6 = r6 - r9
                long r9 = java.lang.Math.min(r2, r6)     // Catch:{ all -> 0x0167 }
                m40 r2 = r8.getBuffer()     // Catch:{ all -> 0x0167 }
                long r3 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                long r6 = r3 - r11
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo56058g(r3, r4, r6)     // Catch:{ all -> 0x0167 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x0167 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x0167 }
                monitor-exit(r8)
                return r9
            L_0x005b:
                boolean r0 = r8.getComplete()     // Catch:{ all -> 0x0167 }
                if (r0 == 0) goto L_0x0063
                monitor-exit(r8)
                return r9
            L_0x0063:
                java.lang.Thread r0 = r8.getUpstreamReader()     // Catch:{ all -> 0x0167 }
                if (r0 == 0) goto L_0x006f
                qq6 r0 = r1.timeout     // Catch:{ all -> 0x0167 }
                r0.waitUntilNotified(r8)     // Catch:{ all -> 0x0167 }
                goto L_0x0018
            L_0x006f:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0167 }
                r8.setUpstreamReader(r0)     // Catch:{ all -> 0x0167 }
            L_0x0076:
                monitor-exit(r8)
                r11 = 32
                if (r4 != r6) goto L_0x009c
                okhttp3.internal.cache2.Relay r0 = r1.this$0
                long r6 = r0.getUpstreamPos()
                long r8 = r1.sourcePos
                long r6 = r6 - r8
                long r8 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.fileOperator
                p000.vx2.m53588d(r2)
                long r3 = r1.sourcePos
                long r3 = r3 + r11
                r5 = r20
                r6 = r8
                r2.read(r3, r5, r6)
                long r2 = r1.sourcePos
                long r2 = r2 + r8
                r1.sourcePos = r2
                return r8
            L_0x009c:
                r8 = 0
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                z56 r0 = r0.getUpstream()     // Catch:{ all -> 0x0156 }
                p000.vx2.m53588d(r0)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch:{ all -> 0x0156 }
                m40 r4 = r4.getUpstreamBuffer()     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r6 = r1.this$0     // Catch:{ all -> 0x0156 }
                long r6 = r6.getBufferMaxSize()     // Catch:{ all -> 0x0156 }
                long r14 = r0.read(r4, r6)     // Catch:{ all -> 0x0156 }
                int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x00d3
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0156 }
                r0.commit(r2)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r8)     // Catch:{ all -> 0x00d0 }
                r2.notifyAll()     // Catch:{ all -> 0x00d0 }
                r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x00d0 }
                monitor-exit(r2)
                return r9
            L_0x00d0:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00d3:
                long r9 = java.lang.Math.min(r14, r2)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                m40 r2 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0156 }
                r6 = 0
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo56058g(r3, r4, r6)     // Catch:{ all -> 0x0156 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x0156 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch:{ all -> 0x0156 }
                p000.vx2.m53588d(r13)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x0156 }
                long r2 = r2 + r11
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch:{ all -> 0x0156 }
                m40 r0 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x0156 }
                m40 r16 = r0.clone()     // Catch:{ all -> 0x0156 }
                r4 = r14
                r14 = r2
                r17 = r4
                r13.write(r14, r16, r17)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r2 = r1.this$0     // Catch:{ all -> 0x0156 }
                monitor-enter(r2)     // Catch:{ all -> 0x0156 }
                m40 r0 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                m40 r3 = r2.getUpstreamBuffer()     // Catch:{ all -> 0x0153 }
                r0.write(r3, r4)     // Catch:{ all -> 0x0153 }
                m40 r0 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                long r6 = r0.size()     // Catch:{ all -> 0x0153 }
                long r11 = r2.getBufferMaxSize()     // Catch:{ all -> 0x0153 }
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x013a
                m40 r0 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                m40 r3 = r2.getBuffer()     // Catch:{ all -> 0x0153 }
                long r6 = r3.size()     // Catch:{ all -> 0x0153 }
                long r11 = r2.getBufferMaxSize()     // Catch:{ all -> 0x0153 }
                long r6 = r6 - r11
                r0.skip(r6)     // Catch:{ all -> 0x0153 }
            L_0x013a:
                long r6 = r2.getUpstreamPos()     // Catch:{ all -> 0x0153 }
                long r6 = r6 + r4
                r2.setUpstreamPos(r6)     // Catch:{ all -> 0x0153 }
                r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0153 }
                monitor-exit(r2)     // Catch:{ all -> 0x0156 }
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r8)     // Catch:{ all -> 0x0150 }
                r2.notifyAll()     // Catch:{ all -> 0x0150 }
                monitor-exit(r2)
                return r9
            L_0x0150:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0153:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0156 }
                throw r0     // Catch:{ all -> 0x0156 }
            L_0x0156:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r8)     // Catch:{ all -> 0x0164 }
                r2.notifyAll()     // Catch:{ all -> 0x0164 }
                r37 r3 = p000.r37.f33317a     // Catch:{ all -> 0x0164 }
                monitor-exit(r2)
                throw r0
            L_0x0164:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0167:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            L_0x016a:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(m40, long):long");
        }

        public qq6 timeout() {
            return this.timeout;
        }
    }

    static {
        ByteString.C9034a aVar = ByteString.Companion;
        PREFIX_CLEAN = aVar.mo64480d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.mo64480d("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, z56 z56, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = z56;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new m40();
        this.complete = this.upstream == null;
        this.buffer = new m40();
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, z56 z56, long j, ByteString byteString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, z56, j, byteString, j2);
    }

    /* access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        boolean z;
        m40 m40 = new m40();
        m40.mo56054e1(byteString);
        m40.mo56067j0(j);
        m40.mo56067j0(j2);
        if (m40.size() == FILE_HEADER_SIZE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RandomAccessFile randomAccessFile = this.file;
            vx2.m53588d(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            vx2.m53590f(channel, "file!!.channel");
            new FileOperator(channel).write(0, m40, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) throws IOException {
        m40 m40 = new m40();
        m40.mo56054e1(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        vx2.m53588d(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        vx2.m53590f(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j, m40, (long) this.metadata.size());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        vx2.m53588d(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        vx2.m53588d(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            setComplete(true);
            r37 r37 = r37.f33317a;
        }
        z56 z56 = this.upstream;
        if (z56 != null) {
            Util.closeQuietly((Closeable) z56);
        }
        this.upstream = null;
    }

    public final m40 getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final z56 getUpstream() {
        return this.upstream;
    }

    public final m40 getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public final ByteString metadata() {
        return this.metadata;
    }

    public final z56 newSource() {
        synchronized (this) {
            if (getFile() == null) {
                return null;
            }
            setSourceCount(getSourceCount() + 1);
            return new RelaySource(this);
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(z56 z56) {
        this.upstream = z56;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }
}
