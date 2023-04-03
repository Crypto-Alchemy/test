package p000;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bh1 */
/* compiled from: DiskLruCache */
public final class bh1 implements Closeable {

    /* renamed from: A */
    public final LinkedHashMap<String, C1632d> f8134A = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: B */
    public int f8135B;

    /* renamed from: C */
    public long f8136C = 0;

    /* renamed from: H */
    public final ThreadPoolExecutor f8137H = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1630b((C1629a) null));

    /* renamed from: I */
    public final Callable<Void> f8138I = new C1629a();

    /* renamed from: a */
    public final File f8139a;

    /* renamed from: d */
    public final File f8140d;

    /* renamed from: e */
    public final File f8141e;

    /* renamed from: g */
    public final File f8142g;

    /* renamed from: k */
    public final int f8143k;

    /* renamed from: r */
    public long f8144r;

    /* renamed from: s */
    public final int f8145s;

    /* renamed from: x */
    public long f8146x = 0;

    /* renamed from: y */
    public Writer f8147y;

    /* renamed from: bh1$a */
    /* compiled from: DiskLruCache */
    public class C1629a implements Callable<Void> {
        public C1629a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                bh1 r0 = p000.bh1.this
                monitor-enter(r0)
                bh1 r1 = p000.bh1.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f8147y     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                bh1 r1 = p000.bh1.this     // Catch:{ all -> 0x0028 }
                r1.mo11651J()     // Catch:{ all -> 0x0028 }
                bh1 r1 = p000.bh1.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.mo11659v()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                bh1 r1 = p000.bh1.this     // Catch:{ all -> 0x0028 }
                r1.mo11649C()     // Catch:{ all -> 0x0028 }
                bh1 r1 = p000.bh1.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f8135B = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bh1.C1629a.call():java.lang.Void");
        }
    }

    /* renamed from: bh1$b */
    /* compiled from: DiskLruCache */
    public static final class C1630b implements ThreadFactory {
        public C1630b() {
        }

        public /* synthetic */ C1630b(C1629a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: bh1$c */
    /* compiled from: DiskLruCache */
    public final class C1631c {

        /* renamed from: a */
        public final C1632d f8149a;

        /* renamed from: b */
        public final boolean[] f8150b;

        /* renamed from: c */
        public boolean f8151c;

        public /* synthetic */ C1631c(bh1 bh1, C1632d dVar, C1629a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo11665a() throws IOException {
            bh1.this.mo11654k(this, false);
        }

        /* renamed from: b */
        public void mo11666b() {
            if (!this.f8151c) {
                try {
                    mo11665a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo11667e() throws IOException {
            bh1.this.mo11654k(this, true);
            this.f8151c = true;
        }

        /* renamed from: f */
        public File mo11668f(int i) throws IOException {
            File k;
            synchronized (bh1.this) {
                if (this.f8149a.f8158f == this) {
                    if (!this.f8149a.f8157e) {
                        this.f8150b[i] = true;
                    }
                    k = this.f8149a.mo11670k(i);
                    bh1.this.f8139a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        public C1631c(C1632d dVar) {
            this.f8149a = dVar;
            this.f8150b = dVar.f8157e ? null : new boolean[bh1.this.f8145s];
        }
    }

    /* renamed from: bh1$d */
    /* compiled from: DiskLruCache */
    public final class C1632d {

        /* renamed from: a */
        public final String f8153a;

        /* renamed from: b */
        public final long[] f8154b;

        /* renamed from: c */
        public File[] f8155c;

        /* renamed from: d */
        public File[] f8156d;

        /* renamed from: e */
        public boolean f8157e;

        /* renamed from: f */
        public C1631c f8158f;

        /* renamed from: g */
        public long f8159g;

        public /* synthetic */ C1632d(bh1 bh1, String str, C1629a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File mo11669j(int i) {
            return this.f8155c[i];
        }

        /* renamed from: k */
        public File mo11670k(int i) {
            return this.f8156d[i];
        }

        /* renamed from: l */
        public String mo11671l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f8154b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException mo11672m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void mo11673n(String[] strArr) throws IOException {
            if (strArr.length == bh1.this.f8145s) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f8154b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw mo11672m(strArr);
                    }
                }
                return;
            }
            throw mo11672m(strArr);
        }

        public C1632d(String str) {
            this.f8153a = str;
            this.f8154b = new long[bh1.this.f8145s];
            this.f8155c = new File[bh1.this.f8145s];
            this.f8156d = new File[bh1.this.f8145s];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < bh1.this.f8145s; i++) {
                sb.append(i);
                this.f8155c[i] = new File(bh1.this.f8139a, sb.toString());
                sb.append(".tmp");
                this.f8156d[i] = new File(bh1.this.f8139a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: bh1$e */
    /* compiled from: DiskLruCache */
    public final class C1633e {

        /* renamed from: a */
        public final String f8161a;

        /* renamed from: b */
        public final long f8162b;

        /* renamed from: c */
        public final long[] f8163c;

        /* renamed from: d */
        public final File[] f8164d;

        public /* synthetic */ C1633e(bh1 bh1, String str, long j, File[] fileArr, long[] jArr, C1629a aVar) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo11674a(int i) {
            return this.f8164d[i];
        }

        public C1633e(String str, long j, File[] fileArr, long[] jArr) {
            this.f8161a = str;
            this.f8162b = j;
            this.f8164d = fileArr;
            this.f8163c = jArr;
        }
    }

    public bh1(File file, int i, int i2, long j) {
        File file2 = file;
        this.f8139a = file2;
        this.f8143k = i;
        this.f8140d = new File(file2, "journal");
        this.f8141e = new File(file2, "journal.tmp");
        this.f8142g = new File(file2, "journal.bkp");
        this.f8145s = i2;
        this.f8144r = j;
    }

    /* renamed from: I */
    public static void m11361I(File file, File file2, boolean z) throws IOException {
        if (z) {
            m11371m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: j */
    public static void m11370j(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: m */
    public static void m11371m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: q */
    public static void m11372q(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: x */
    public static bh1 m11373x(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m11361I(file2, file3, false);
                }
            }
            bh1 bh1 = new bh1(file, i, i2, j);
            if (bh1.f8140d.exists()) {
                try {
                    bh1.mo11661z();
                    bh1.mo11660y();
                    return bh1;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    bh1.mo11655l();
                }
            }
            file.mkdirs();
            bh1 bh12 = new bh1(file, i, i2, j);
            bh12.mo11649C();
            return bh12;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: A */
    public final void mo11648A(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f8134A.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1632d dVar = this.f8134A.get(str2);
            if (dVar == null) {
                dVar = new C1632d(this, str2, (C1629a) null);
                this.f8134A.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f8157e = true;
                C1631c unused2 = dVar.f8158f = null;
                dVar.mo11673n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C1631c unused3 = dVar.f8158f = new C1631c(this, dVar, (C1629a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C */
    public final synchronized void mo11649C() throws IOException {
        Writer writer = this.f8147y;
        if (writer != null) {
            m11370j(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8141e), o67.f15824a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8143k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8145s));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1632d next : this.f8134A.values()) {
                if (next.f8158f != null) {
                    bufferedWriter.write("DIRTY " + next.f8153a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f8153a + next.mo11671l() + 10);
                }
            }
            m11370j(bufferedWriter);
            if (this.f8140d.exists()) {
                m11361I(this.f8140d, this.f8142g, true);
            }
            m11361I(this.f8141e, this.f8140d, false);
            this.f8142g.delete();
            this.f8147y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8140d, true), o67.f15824a));
        } catch (Throwable th) {
            m11370j(bufferedWriter);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo11650G(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.mo11653i()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, bh1$d> r0 = r7.f8134A     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            bh1$d r0 = (p000.bh1.C1632d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            bh1$c r2 = r0.f8158f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f8145s     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo11669j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f8146x     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f8154b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f8146x = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f8154b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f8135B     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f8135B = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8147y     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8147y     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8147y     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8147y     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, bh1$d> r0 = r7.f8134A     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.mo11659v()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f8137H     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f8138I     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bh1.mo11650G(java.lang.String):boolean");
    }

    /* renamed from: J */
    public final void mo11651J() throws IOException {
        while (this.f8146x > this.f8144r) {
            mo11650G((String) this.f8134A.entrySet().iterator().next().getKey());
        }
    }

    public synchronized void close() throws IOException {
        if (this.f8147y != null) {
            Iterator it = new ArrayList(this.f8134A.values()).iterator();
            while (it.hasNext()) {
                C1632d dVar = (C1632d) it.next();
                if (dVar.f8158f != null) {
                    dVar.f8158f.mo11665a();
                }
            }
            mo11651J();
            m11370j(this.f8147y);
            this.f8147y = null;
        }
    }

    /* renamed from: i */
    public final void mo11653i() {
        if (this.f8147y == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11654k(p000.bh1.C1631c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            bh1$d r0 = r10.f8149a     // Catch:{ all -> 0x010e }
            bh1$c r1 = r0.f8158f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f8157e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.f8145s     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f8150b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo11670k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo11665a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo11665a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f8145s     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo11670k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo11669j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f8154b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f8154b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f8146x     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f8146x = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m11371m(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f8135B     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f8135B = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            p000.bh1.C1631c unused = r0.f8158f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f8157e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f8157e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f8153a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo11671l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f8136C     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f8136C = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f8159g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, bh1$d> r10 = r9.f8134A     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f8153a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f8153a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f8147y     // Catch:{ all -> 0x010e }
            m11372q(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f8146x     // Catch:{ all -> 0x010e }
            long r0 = r9.f8144r     // Catch:{ all -> 0x010e }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ff
            boolean r10 = r9.mo11659v()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f8137H     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f8138I     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bh1.mo11654k(bh1$c, boolean):void");
    }

    /* renamed from: l */
    public void mo11655l() throws IOException {
        close();
        o67.m23690b(this.f8139a);
    }

    /* renamed from: n */
    public C1631c mo11656n(String str) throws IOException {
        return mo11657p(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p000.bh1.C1631c mo11657p(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo11653i()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, bh1$d> r0 = r5.f8134A     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            bh1$d r0 = (p000.bh1.C1632d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r3 = r0.f8159g     // Catch:{ all -> 0x005d }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r2
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            bh1$d r0 = new bh1$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, bh1$d> r7 = r5.f8134A     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            bh1$c r7 = r0.f8158f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r2
        L_0x0034:
            bh1$c r7 = new bh1$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x005d }
            p000.bh1.C1631c unused = r0.f8158f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f8147y     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f8147y     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f8147y     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f8147y     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f8147y     // Catch:{ all -> 0x005d }
            m11372q(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bh1.mo11657p(java.lang.String, long):bh1$c");
    }

    /* renamed from: s */
    public synchronized C1633e mo11658s(String str) throws IOException {
        mo11653i();
        C1632d dVar = this.f8134A.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f8157e) {
            return null;
        }
        for (File exists : dVar.f8155c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f8135B++;
        this.f8147y.append("READ");
        this.f8147y.append(' ');
        this.f8147y.append(str);
        this.f8147y.append(10);
        if (mo11659v()) {
            this.f8137H.submit(this.f8138I);
        }
        return new C1633e(this, str, dVar.f8159g, dVar.f8155c, dVar.f8154b, (C1629a) null);
    }

    /* renamed from: v */
    public final boolean mo11659v() {
        int i = this.f8135B;
        if (i < 2000 || i < this.f8134A.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final void mo11660y() throws IOException {
        m11371m(this.f8141e);
        Iterator<C1632d> it = this.f8134A.values().iterator();
        while (it.hasNext()) {
            C1632d next = it.next();
            int i = 0;
            if (next.f8158f == null) {
                while (i < this.f8145s) {
                    this.f8146x += next.f8154b[i];
                    i++;
                }
            } else {
                C1631c unused = next.f8158f = null;
                while (i < this.f8145s) {
                    m11371m(next.mo11669j(i));
                    m11371m(next.mo11670k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f8135B = r0 - r9.f8134A.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo11471c() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        mo11649C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f8147y = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f8140d, true), p000.o67.f15824a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11661z() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            bb6 r1 = new bb6
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f8140d
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p000.o67.f15824a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo11473d()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo11473d()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo11473d()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo11473d()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo11473d()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f8143k     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f8145s     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo11473d()     // Catch:{ EOFException -> 0x005f }
            r9.mo11648A(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, bh1$d> r2 = r9.f8134A     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f8135B = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo11471c()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.mo11649C()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f8140d     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p000.o67.f15824a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f8147y = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p000.o67.m23689a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p000.o67.m23689a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bh1.mo11661z():void");
    }
}
