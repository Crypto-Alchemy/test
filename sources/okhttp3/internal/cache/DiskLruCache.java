package okhttp3.internal.cache;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p022io.FileSystem;
import okhttp3.internal.platform.Platform;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001`\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004ghijB9\b\u0000\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020\u0017\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J \u0010\u001a\u001a\b\u0018\u00010\u0019R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007J\u0006\u0010\u001b\u001a\u00020\u0017J#\u0010 \u001a\u00020\u00032\n\u0010\u001c\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010&\u001a\u00020\u000b2\n\u0010#\u001a\u00060\"R\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020\u0003H\u0016J\u0006\u0010(\u001a\u00020\u000bJ\b\u0010)\u001a\u00020\u0003H\u0016J\u0006\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020\u0003J\u0006\u0010,\u001a\u00020\u0003J\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000-R\u001a\u00100\u001a\u00020/8\u0000X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\u0002098\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\b=\u0010>R*\u0010@\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00178F@FX\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010F\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u00106R\u0014\u0010G\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u00106R\u0014\u0010H\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u00106R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u0018\u0010I\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\"R\u00020\u00000K8\u0000X\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010P\u001a\u0002098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010;R\u0016\u0010Q\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\"\u0010U\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bU\u0010R\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010RR\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010RR\u0016\u0010\\\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010AR\u0014\u0010^\u001a\u00020]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006k"}, mo44877d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lr37;", "readJournal", "Lv40;", "newJournalWriter", "", "line", "readJournalLine", "processJournal", "", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", "key", "validateKey", "initialize", "rebuildJournal$okhttp", "()V", "rebuildJournal", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "size", "editor", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "close", "trimToSize", "delete", "evictAll", "", "snapshots", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "directory", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "", "appVersion", "I", "valueCount", "getValueCount$okhttp", "()I", "value", "maxSize", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "journalFile", "journalFileTmp", "journalFileBackup", "journalWriter", "Lv40;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "redundantOpCount", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache implements Closeable, Flushable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final String CLEAN = "CLEAN";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DIRTY = "DIRTY";
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String READ = "READ";
    public static final String REMOVE = "REMOVE";
    public static final String VERSION_1 = "1";
    private final int appVersion;
    /* access modifiers changed from: private */
    public boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    /* access modifiers changed from: private */
    public boolean hasJournalErrors;
    /* access modifiers changed from: private */
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    /* access modifiers changed from: private */
    public v40 journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    /* access modifiers changed from: private */
    public boolean mostRecentRebuildFailed;
    /* access modifiers changed from: private */
    public boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    /* access modifiers changed from: private */
    public int redundantOpCount;
    private long size;
    private final int valueCount;

    @Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo44877d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: DiskLruCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001e\u0010\u0010\u001a\u00060\u000eR\u00020\u000f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo44877d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lr37;", "detach$okhttp", "()V", "detach", "", "index", "Lz56;", "newSource", "Ls36;", "newSink", "commit", "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: DiskLruCache.kt */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        public final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry2) {
            boolean[] zArr;
            vx2.m53591g(diskLruCache, "this$0");
            vx2.m53591g(entry2, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry2;
            if (entry2.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (vx2.m53586b(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    r37 r37 = r37.f33317a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (vx2.m53586b(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    r37 r37 = r37.f33317a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (!vx2.m53586b(this.entry.getCurrentEditor$okhttp(), this)) {
                return;
            }
            if (this.this$0.civilizedFileSystem) {
                this.this$0.completeEdit$okhttp(this, false);
            } else {
                this.entry.setZombie$okhttp(true);
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r4 = p000.sg4.m71927b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
            return r4;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p000.s36 newSink(int r4) {
            /*
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch:{ all -> 0x0064 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0058
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.getEntry$okhttp()     // Catch:{ all -> 0x0064 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0064 }
                boolean r1 = p000.vx2.m53586b(r1, r3)     // Catch:{ all -> 0x0064 }
                if (r1 != 0) goto L_0x001d
                s36 r4 = p000.sg4.m71927b()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r4
            L_0x001d:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.getEntry$okhttp()     // Catch:{ all -> 0x0064 }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x0064 }
                if (r1 != 0) goto L_0x0030
                boolean[] r1 = r3.getWritten$okhttp()     // Catch:{ all -> 0x0064 }
                p000.vx2.m53588d(r1)     // Catch:{ all -> 0x0064 }
                r1[r4] = r2     // Catch:{ all -> 0x0064 }
            L_0x0030:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.getEntry$okhttp()     // Catch:{ all -> 0x0064 }
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0064 }
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0064 }
                java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0064 }
                okhttp3.internal.io.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0052 }
                s36 r4 = r1.sink(r4)     // Catch:{ FileNotFoundException -> 0x0052 }
                okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x0064 }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1 r2 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1     // Catch:{ all -> 0x0064 }
                r2.<init>(r0, r3)     // Catch:{ all -> 0x0064 }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r1
            L_0x0052:
                s36 r4 = p000.sg4.m71927b()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r4
            L_0x0058:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0064 }
                r1.<init>(r4)     // Catch:{ all -> 0x0064 }
                throw r1     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSink(int):s36");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p000.z56 newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x0053 }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0047
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.getEntry$okhttp()     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x0053 }
                r2 = 0
                if (r1 == 0) goto L_0x0045
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.getEntry$okhttp()     // Catch:{ all -> 0x0053 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0053 }
                boolean r1 = p000.vx2.m53586b(r1, r4)     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0045
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.getEntry$okhttp()     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.getZombie$okhttp()     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x002d
                goto L_0x0045
            L_0x002d:
                okhttp3.internal.io.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0043 }
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.getEntry$okhttp()     // Catch:{ FileNotFoundException -> 0x0043 }
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch:{ FileNotFoundException -> 0x0043 }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x0043 }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x0043 }
                z56 r2 = r1.source(r5)     // Catch:{ FileNotFoundException -> 0x0043 }
            L_0x0043:
                monitor-exit(r0)
                return r2
            L_0x0045:
                monitor-exit(r0)
                return r2
            L_0x0047:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0053 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0053 }
                r1.<init>(r5)     // Catch:{ all -> 0x0053 }
                throw r1     // Catch:{ all -> 0x0053 }
            L_0x0053:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):z56");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020*8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R(\u00105\u001a\b\u0018\u000104R\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J"}, mo44877d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "invalidLengths", "", "index", "Lz56;", "newSource", "Lr37;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lv40;", "writer", "writeLengths$okhttp", "(Lv40;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "key", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: DiskLruCache.kt */
    public final class Entry {
        private final List<File> cleanFiles = new ArrayList();
        private Editor currentEditor;
        private final List<File> dirtyFiles = new ArrayList();
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        public final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            vx2.m53591g(diskLruCache, "this$0");
            vx2.m53591g(str, "key");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException(vx2.m53598n("unexpected journal line: ", list));
        }

        private final z56 newSource(int i) {
            z56 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            return new DiskLruCache$Entry$newSource$1(source, this.this$0, this);
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            vx2.m53591g(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                int i = 0;
                try {
                    int size = list.size();
                    while (i < size) {
                        int i2 = i + 1;
                        this.lengths[i] = Long.parseLong(list.get(i));
                        i = i2;
                    }
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw new KotlinNothingValueException();
                }
            } else {
                invalidLengths(list);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            } else if (!this.readable) {
                return null;
            } else {
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList<z56> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (z56 closeQuietly : arrayList) {
                        Util.closeQuietly((Closeable) closeQuietly);
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(v40 v40) throws IOException {
            vx2.m53591g(v40, "writer");
            long[] jArr = this.lengths;
            int length = jArr.length;
            int i = 0;
            while (i < length) {
                long j = jArr[i];
                i++;
                v40.writeByte(32).mo56096w0(j);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo44877d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "", "index", "Lz56;", "getSource", "", "getLength", "Lr37;", "close", "Ljava/lang/String;", "sequenceNumber", "J", "", "sources", "Ljava/util/List;", "", "lengths", "[J", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: DiskLruCache.kt */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<z56> sources;
        public final /* synthetic */ DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends z56> list, long[] jArr) {
            vx2.m53591g(diskLruCache, "this$0");
            vx2.m53591g(str, "key");
            vx2.m53591g(list, "sources");
            vx2.m53591g(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public void close() {
            for (z56 closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final z56 getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    public DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, TaskRunner taskRunner) {
        boolean z;
        vx2.m53591g(fileSystem2, "fileSystem");
        vx2.m53591g(file, "directory");
        vx2.m53591g(taskRunner, "taskRunner");
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        boolean z2 = false;
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(this, vx2.m53598n(Util.okHttpName, " Cache"));
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0 ? true : z2) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i < 2000 || i < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    private final v40 newJournalWriter() throws FileNotFoundException {
        return sg4.m71928c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            vx2.m53590f(next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp((Editor) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|(1:22)(1:23)|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.redundantOpCount = r7 - getLruEntries$okhttp().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r1.mo56024I0() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        rebuildJournal$okhttp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        p000.lh0.m47807a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        p000.lh0.m47807a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0062=Splitter:B:19:0x0062, B:27:0x0084=Splitter:B:27:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readJournal() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            z56 r1 = r1.source(r2)
            w40 r1 = p000.sg4.m71929d(r1)
            java.lang.String r2 = r1.mo56072m0()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.mo56072m0()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.mo56072m0()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.mo56072m0()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.mo56072m0()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = MAGIC     // Catch:{ all -> 0x00b2 }
            boolean r7 = p000.vx2.m53586b(r7, r2)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x0084
            java.lang.String r7 = VERSION_1     // Catch:{ all -> 0x00b2 }
            boolean r7 = p000.vx2.m53586b(r7, r3)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x0084
            int r7 = r9.appVersion     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = p000.vx2.m53586b(r7, r4)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0084
            int r4 = r9.getValueCount$okhttp()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = p000.vx2.m53586b(r4, r5)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0055
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = r7
        L_0x0056:
            if (r4 != 0) goto L_0x0084
        L_0x0058:
            java.lang.String r0 = r1.mo56072m0()     // Catch:{ EOFException -> 0x0062 }
            r9.readJournalLine(r0)     // Catch:{ EOFException -> 0x0062 }
            int r7 = r7 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap r0 = r9.getLruEntries$okhttp()     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.redundantOpCount = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.mo56024I0()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.rebuildJournal$okhttp()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            v40 r0 = r9.newJournalWriter()     // Catch:{ all -> 0x00b2 }
            r9.journalWriter = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x00b2 }
            r0 = 0
            p000.lh0.m47807a(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            p000.lh0.m47807a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String str) throws IOException {
        String str2;
        String str3 = str;
        int d0 = StringsKt__StringsKt.m63099d0(str, ' ', 0, false, 6, (Object) null);
        if (d0 != -1) {
            int i = d0 + 1;
            int d02 = StringsKt__StringsKt.m63099d0(str, ' ', i, false, 4, (Object) null);
            if (d02 == -1) {
                str2 = str3.substring(i);
                vx2.m53590f(str2, "this as java.lang.String).substring(startIndex)");
                String str4 = REMOVE;
                if (d0 == str4.length() && yb6.m74336M(str3, str4, false, 2, (Object) null)) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i, d02);
                vx2.m53590f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(this, str2);
                this.lruEntries.put(str2, entry);
            }
            if (d02 != -1) {
                String str5 = CLEAN;
                if (d0 == str5.length() && yb6.m74336M(str3, str5, false, 2, (Object) null)) {
                    String substring = str3.substring(d02 + 1);
                    vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
                    List A0 = StringsKt__StringsKt.m63060A0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp((Editor) null);
                    entry.setLengths$okhttp(A0);
                    return;
                }
            }
            if (d02 == -1) {
                String str6 = DIRTY;
                if (d0 == str6.length() && yb6.m74336M(str3, str6, false, 2, (Object) null)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (d02 == -1) {
                String str7 = READ;
                if (d0 == str7.length() && yb6.m74336M(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException(vx2.m53598n("unexpected journal line: ", str3));
        }
        throw new IOException(vx2.m53598n("unexpected journal line: ", str3));
    }

    private final boolean removeOldestEntry() {
        for (Entry next : this.lruEntries.values()) {
            if (!next.getZombie$okhttp()) {
                vx2.m53590f(next, "toEvict");
                removeEntry$okhttp(next);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matches(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
        }
    }

    public synchronized void close() throws IOException {
        if (this.initialized) {
            if (!this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                vx2.m53590f(values, "lruEntries.values");
                int i = 0;
                Object[] array = values.toArray(new Entry[0]);
                if (array != null) {
                    Entry[] entryArr = (Entry[]) array;
                    int length = entryArr.length;
                    while (i < length) {
                        Entry entry = entryArr[i];
                        i++;
                        if (entry.getCurrentEditor$okhttp() != null) {
                            Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
                            if (currentEditor$okhttp != null) {
                                currentEditor$okhttp.detach$okhttp();
                            }
                        }
                    }
                    trimToSize();
                    v40 v40 = this.journalWriter;
                    vx2.m53588d(v40);
                    v40.close();
                    this.journalWriter = null;
                    this.closed = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        this.closed = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0132, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "editor"
            p000.vx2.m53591g(r10, r0)     // Catch:{ all -> 0x013f }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r10.getEntry$okhttp()     // Catch:{ all -> 0x013f }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x013f }
            boolean r1 = p000.vx2.m53586b(r1, r10)     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x0133
            r1 = 0
            if (r11 == 0) goto L_0x005b
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x013f }
            if (r2 != 0) goto L_0x005b
            int r2 = r9.valueCount     // Catch:{ all -> 0x013f }
            r3 = r1
        L_0x0020:
            if (r3 >= r2) goto L_0x005b
            int r4 = r3 + 1
            boolean[] r5 = r10.getWritten$okhttp()     // Catch:{ all -> 0x013f }
            p000.vx2.m53588d(r5)     // Catch:{ all -> 0x013f }
            boolean r5 = r5[r3]     // Catch:{ all -> 0x013f }
            if (r5 == 0) goto L_0x0048
            okhttp3.internal.io.FileSystem r5 = r9.fileSystem     // Catch:{ all -> 0x013f }
            java.util.List r6 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.Object r3 = r6.get(r3)     // Catch:{ all -> 0x013f }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x013f }
            boolean r3 = r5.exists(r3)     // Catch:{ all -> 0x013f }
            if (r3 != 0) goto L_0x0046
            r10.abort()     // Catch:{ all -> 0x013f }
            monitor-exit(r9)
            return
        L_0x0046:
            r3 = r4
            goto L_0x0020
        L_0x0048:
            r10.abort()     // Catch:{ all -> 0x013f }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013f }
            java.lang.String r11 = "Newly created entry didn't create value for index "
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x013f }
            java.lang.String r11 = p000.vx2.m53598n(r11, r0)     // Catch:{ all -> 0x013f }
            r10.<init>(r11)     // Catch:{ all -> 0x013f }
            throw r10     // Catch:{ all -> 0x013f }
        L_0x005b:
            int r10 = r9.valueCount     // Catch:{ all -> 0x013f }
        L_0x005d:
            if (r1 >= r10) goto L_0x00aa
            int r2 = r1 + 1
            java.util.List r3 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x013f }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x013f }
            if (r11 == 0) goto L_0x00a3
            boolean r4 = r0.getZombie$okhttp()     // Catch:{ all -> 0x013f }
            if (r4 != 0) goto L_0x00a3
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem     // Catch:{ all -> 0x013f }
            boolean r4 = r4.exists(r3)     // Catch:{ all -> 0x013f }
            if (r4 == 0) goto L_0x00a8
            java.util.List r4 = r0.getCleanFiles$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x013f }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x013f }
            okhttp3.internal.io.FileSystem r5 = r9.fileSystem     // Catch:{ all -> 0x013f }
            r5.rename(r3, r4)     // Catch:{ all -> 0x013f }
            long[] r3 = r0.getLengths$okhttp()     // Catch:{ all -> 0x013f }
            r5 = r3[r1]     // Catch:{ all -> 0x013f }
            okhttp3.internal.io.FileSystem r3 = r9.fileSystem     // Catch:{ all -> 0x013f }
            long r3 = r3.size(r4)     // Catch:{ all -> 0x013f }
            long[] r7 = r0.getLengths$okhttp()     // Catch:{ all -> 0x013f }
            r7[r1] = r3     // Catch:{ all -> 0x013f }
            long r7 = r9.size     // Catch:{ all -> 0x013f }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.size = r7     // Catch:{ all -> 0x013f }
            goto L_0x00a8
        L_0x00a3:
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem     // Catch:{ all -> 0x013f }
            r1.delete(r3)     // Catch:{ all -> 0x013f }
        L_0x00a8:
            r1 = r2
            goto L_0x005d
        L_0x00aa:
            r10 = 0
            r0.setCurrentEditor$okhttp(r10)     // Catch:{ all -> 0x013f }
            boolean r10 = r0.getZombie$okhttp()     // Catch:{ all -> 0x013f }
            if (r10 == 0) goto L_0x00b9
            r9.removeEntry$okhttp(r0)     // Catch:{ all -> 0x013f }
            monitor-exit(r9)
            return
        L_0x00b9:
            int r10 = r9.redundantOpCount     // Catch:{ all -> 0x013f }
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch:{ all -> 0x013f }
            v40 r10 = r9.journalWriter     // Catch:{ all -> 0x013f }
            p000.vx2.m53588d(r10)     // Catch:{ all -> 0x013f }
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x013f }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f0
            if (r11 == 0) goto L_0x00d1
            goto L_0x00f0
        L_0x00d1:
            java.util.LinkedHashMap r11 = r9.getLruEntries$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x013f }
            r11.remove(r1)     // Catch:{ all -> 0x013f }
            java.lang.String r11 = REMOVE     // Catch:{ all -> 0x013f }
            v40 r11 = r10.mo56044Z(r11)     // Catch:{ all -> 0x013f }
            r11.writeByte(r4)     // Catch:{ all -> 0x013f }
            java.lang.String r11 = r0.getKey$okhttp()     // Catch:{ all -> 0x013f }
            r10.mo56044Z(r11)     // Catch:{ all -> 0x013f }
            r10.writeByte(r3)     // Catch:{ all -> 0x013f }
            goto L_0x0115
        L_0x00f0:
            r0.setReadable$okhttp(r1)     // Catch:{ all -> 0x013f }
            java.lang.String r1 = CLEAN     // Catch:{ all -> 0x013f }
            v40 r1 = r10.mo56044Z(r1)     // Catch:{ all -> 0x013f }
            r1.writeByte(r4)     // Catch:{ all -> 0x013f }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x013f }
            r10.mo56044Z(r1)     // Catch:{ all -> 0x013f }
            r0.writeLengths$okhttp(r10)     // Catch:{ all -> 0x013f }
            r10.writeByte(r3)     // Catch:{ all -> 0x013f }
            if (r11 == 0) goto L_0x0115
            long r1 = r9.nextSequenceNumber     // Catch:{ all -> 0x013f }
            r3 = 1
            long r3 = r3 + r1
            r9.nextSequenceNumber = r3     // Catch:{ all -> 0x013f }
            r0.setSequenceNumber$okhttp(r1)     // Catch:{ all -> 0x013f }
        L_0x0115:
            r10.flush()     // Catch:{ all -> 0x013f }
            long r10 = r9.size     // Catch:{ all -> 0x013f }
            long r0 = r9.maxSize     // Catch:{ all -> 0x013f }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0126
            boolean r10 = r9.journalRebuildRequired()     // Catch:{ all -> 0x013f }
            if (r10 == 0) goto L_0x0131
        L_0x0126:
            okhttp3.internal.concurrent.TaskQueue r0 = r9.cleanupQueue     // Catch:{ all -> 0x013f }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r9.cleanupTask     // Catch:{ all -> 0x013f }
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x013f }
        L_0x0131:
            monitor-exit(r9)
            return
        L_0x0133:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013f }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x013f }
            r11.<init>(r10)     // Catch:{ all -> 0x013f }
            throw r11     // Catch:{ all -> 0x013f }
        L_0x013f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) throws IOException {
        vx2.m53591g(str, "key");
        return edit$default(this, str, 0, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            p000.vx2.m53591g(r10, r0)     // Catch:{ all -> 0x008f }
            r9.initialize()     // Catch:{ all -> 0x008f }
            r9.checkNotClosed()     // Catch:{ all -> 0x008f }
            r9.validateKey(r10)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x008f }
            long r1 = ANY_SEQUENCE_NUMBER     // Catch:{ all -> 0x008f }
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r3 = r0.getSequenceNumber$okhttp()     // Catch:{ all -> 0x008f }
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r9)
            return r2
        L_0x002a:
            if (r0 != 0) goto L_0x002e
            r11 = r2
            goto L_0x0032
        L_0x002e:
            okhttp3.internal.cache.DiskLruCache$Editor r11 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x008f }
        L_0x0032:
            if (r11 == 0) goto L_0x0036
            monitor-exit(r9)
            return r2
        L_0x0036:
            if (r0 == 0) goto L_0x0040
            int r11 = r0.getLockingSourceCount$okhttp()     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x0040
            monitor-exit(r9)
            return r2
        L_0x0040:
            boolean r11 = r9.mostRecentTrimFailed     // Catch:{ all -> 0x008f }
            if (r11 != 0) goto L_0x0082
            boolean r11 = r9.mostRecentRebuildFailed     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x0049
            goto L_0x0082
        L_0x0049:
            v40 r11 = r9.journalWriter     // Catch:{ all -> 0x008f }
            p000.vx2.m53588d(r11)     // Catch:{ all -> 0x008f }
            java.lang.String r12 = DIRTY     // Catch:{ all -> 0x008f }
            v40 r12 = r11.mo56044Z(r12)     // Catch:{ all -> 0x008f }
            r1 = 32
            v40 r12 = r12.writeByte(r1)     // Catch:{ all -> 0x008f }
            v40 r12 = r12.mo56044Z(r10)     // Catch:{ all -> 0x008f }
            r1 = 10
            r12.writeByte(r1)     // Catch:{ all -> 0x008f }
            r11.flush()     // Catch:{ all -> 0x008f }
            boolean r11 = r9.hasJournalErrors     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x006c
            monitor-exit(r9)
            return r2
        L_0x006c:
            if (r0 != 0) goto L_0x0078
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x008f }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r9.lruEntries     // Catch:{ all -> 0x008f }
            r11.put(r10, r0)     // Catch:{ all -> 0x008f }
        L_0x0078:
            okhttp3.internal.cache.DiskLruCache$Editor r10 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x008f }
            r10.<init>(r9, r0)     // Catch:{ all -> 0x008f }
            r0.setCurrentEditor$okhttp(r10)     // Catch:{ all -> 0x008f }
            monitor-exit(r9)
            return r10
        L_0x0082:
            okhttp3.internal.concurrent.TaskQueue r3 = r9.cleanupQueue     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r4 = r9.cleanupTask     // Catch:{ all -> 0x008f }
            r5 = 0
            r7 = 2
            r8 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x008f }
            monitor-exit(r9)
            return r2
        L_0x008f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        vx2.m53590f(values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            int i = 0;
            while (i < length) {
                Entry entry = entryArr[i];
                i++;
                vx2.m53590f(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            v40 v40 = this.journalWriter;
            vx2.m53588d(v40);
            v40.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            p000.vx2.m53591g(r8, r0)     // Catch:{ all -> 0x0057 }
            r7.initialize()     // Catch:{ all -> 0x0057 }
            r7.checkNotClosed()     // Catch:{ all -> 0x0057 }
            r7.validateKey(r8)     // Catch:{ all -> 0x0057 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch:{ all -> 0x0057 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0057 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0057 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            monitor-exit(r7)
            return r1
        L_0x001c:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r7)
            return r1
        L_0x0024:
            int r1 = r7.redundantOpCount     // Catch:{ all -> 0x0057 }
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch:{ all -> 0x0057 }
            v40 r1 = r7.journalWriter     // Catch:{ all -> 0x0057 }
            p000.vx2.m53588d(r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = READ     // Catch:{ all -> 0x0057 }
            v40 r1 = r1.mo56044Z(r2)     // Catch:{ all -> 0x0057 }
            r2 = 32
            v40 r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0057 }
            v40 r8 = r1.mo56044Z(r8)     // Catch:{ all -> 0x0057 }
            r1 = 10
            r8.writeByte(r1)     // Catch:{ all -> 0x0057 }
            boolean r8 = r7.journalRebuildRequired()     // Catch:{ all -> 0x0057 }
            if (r8 == 0) goto L_0x0055
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch:{ all -> 0x0057 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch:{ all -> 0x0057 }
            r3 = 0
            r5 = 2
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r7)
            return r0
        L_0x0057:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
        }
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.Companion.get();
                    platform.log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        p000.lh0.m47807a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void rebuildJournal$okhttp() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            v40 r0 = r7.journalWriter     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0.close()     // Catch:{ all -> 0x00ca }
        L_0x0009:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00ca }
            s36 r0 = r0.sink(r1)     // Catch:{ all -> 0x00ca }
            v40 r0 = p000.sg4.m71928c(r0)     // Catch:{ all -> 0x00ca }
            r1 = 0
            java.lang.String r2 = MAGIC     // Catch:{ all -> 0x00c3 }
            v40 r2 = r0.mo56044Z(r2)     // Catch:{ all -> 0x00c3 }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = VERSION_1     // Catch:{ all -> 0x00c3 }
            v40 r2 = r0.mo56044Z(r2)     // Catch:{ all -> 0x00c3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00c3 }
            int r2 = r7.appVersion     // Catch:{ all -> 0x00c3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00c3 }
            v40 r2 = r0.mo56096w0(r4)     // Catch:{ all -> 0x00c3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00c3 }
            int r2 = r7.getValueCount$okhttp()     // Catch:{ all -> 0x00c3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00c3 }
            v40 r2 = r0.mo56096w0(r4)     // Catch:{ all -> 0x00c3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00c3 }
            r0.writeByte(r3)     // Catch:{ all -> 0x00c3 }
            java.util.LinkedHashMap r2 = r7.getLruEntries$okhttp()     // Catch:{ all -> 0x00c3 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x004f:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00c3 }
            okhttp3.internal.cache.DiskLruCache$Entry r4 = (okhttp3.internal.cache.DiskLruCache.Entry) r4     // Catch:{ all -> 0x00c3 }
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch:{ all -> 0x00c3 }
            r6 = 32
            if (r5 == 0) goto L_0x0077
            java.lang.String r5 = DIRTY     // Catch:{ all -> 0x00c3 }
            v40 r5 = r0.mo56044Z(r5)     // Catch:{ all -> 0x00c3 }
            r5.writeByte(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = r4.getKey$okhttp()     // Catch:{ all -> 0x00c3 }
            r0.mo56044Z(r4)     // Catch:{ all -> 0x00c3 }
            r0.writeByte(r3)     // Catch:{ all -> 0x00c3 }
            goto L_0x004f
        L_0x0077:
            java.lang.String r5 = CLEAN     // Catch:{ all -> 0x00c3 }
            v40 r5 = r0.mo56044Z(r5)     // Catch:{ all -> 0x00c3 }
            r5.writeByte(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = r4.getKey$okhttp()     // Catch:{ all -> 0x00c3 }
            r0.mo56044Z(r5)     // Catch:{ all -> 0x00c3 }
            r4.writeLengths$okhttp(r0)     // Catch:{ all -> 0x00c3 }
            r0.writeByte(r3)     // Catch:{ all -> 0x00c3 }
            goto L_0x004f
        L_0x008e:
            r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x00c3 }
            p000.lh0.m47807a(r0, r1)     // Catch:{ all -> 0x00ca }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00a6
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00ca }
            java.io.File r2 = r7.journalFileBackup     // Catch:{ all -> 0x00ca }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00ca }
        L_0x00a6:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00ca }
            java.io.File r2 = r7.journalFile     // Catch:{ all -> 0x00ca }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00ca }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r7.journalFileBackup     // Catch:{ all -> 0x00ca }
            r0.delete(r1)     // Catch:{ all -> 0x00ca }
            v40 r0 = r7.newJournalWriter()     // Catch:{ all -> 0x00ca }
            r7.journalWriter = r0     // Catch:{ all -> 0x00ca }
            r0 = 0
            r7.hasJournalErrors = r0     // Catch:{ all -> 0x00ca }
            r7.mostRecentRebuildFailed = r0     // Catch:{ all -> 0x00ca }
            monitor-exit(r7)
            return
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r2 = move-exception
            p000.lh0.m47807a(r0, r1)     // Catch:{ all -> 0x00ca }
            throw r2     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.rebuildJournal$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            p000.vx2.m53591g(r6, r0)     // Catch:{ all -> 0x002e }
            r5.initialize()     // Catch:{ all -> 0x002e }
            r5.checkNotClosed()     // Catch:{ all -> 0x002e }
            r5.validateKey(r6)     // Catch:{ all -> 0x002e }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x002e }
            okhttp3.internal.cache.DiskLruCache$Entry r6 = (okhttp3.internal.cache.DiskLruCache.Entry) r6     // Catch:{ all -> 0x002e }
            r0 = 0
            if (r6 != 0) goto L_0x001c
            monitor-exit(r5)
            return r0
        L_0x001c:
            boolean r6 = r5.removeEntry$okhttp(r6)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x002c
            long r1 = r5.size     // Catch:{ all -> 0x002e }
            long r3 = r5.maxSize     // Catch:{ all -> 0x002e }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002c
            r5.mostRecentTrimFailed = r0     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r5)
            return r6
        L_0x002e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        v40 v40;
        vx2.m53591g(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (v40 = this.journalWriter) != null) {
                v40.mo56044Z(DIRTY);
                v40.writeByte(32);
                v40.mo56044Z(entry.getKey$okhttp());
                v40.writeByte(10);
                v40.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        v40 v402 = this.journalWriter;
        if (v402 != null) {
            v402.mo56044Z(REMOVE);
            v402.writeByte(32);
            v402.mo56044Z(entry.getKey$okhttp());
            v402.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
