package p000;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: ch1 */
/* compiled from: DiskLruCache */
public final class ch1 implements Closeable {

    /* renamed from: L */
    public static final Pattern f21750L = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: M */
    public static final OutputStream f21751M = new C3939b();

    /* renamed from: A */
    public final LinkedHashMap<String, C3942d> f21752A = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: B */
    public int f21753B;

    /* renamed from: C */
    public long f21754C = 0;

    /* renamed from: H */
    public final ThreadPoolExecutor f21755H = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: I */
    public final Callable<Void> f21756I = new C3938a();

    /* renamed from: a */
    public final File f21757a;

    /* renamed from: d */
    public final File f21758d;

    /* renamed from: e */
    public final File f21759e;

    /* renamed from: g */
    public final File f21760g;

    /* renamed from: k */
    public final int f21761k;

    /* renamed from: r */
    public long f21762r;

    /* renamed from: s */
    public final int f21763s;

    /* renamed from: x */
    public long f21764x = 0;

    /* renamed from: y */
    public Writer f21765y;

    /* renamed from: ch1$a */
    /* compiled from: DiskLruCache */
    public class C3938a implements Callable<Void> {
        public C3938a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                ch1 r0 = p000.ch1.this
                monitor-enter(r0)
                ch1 r1 = p000.ch1.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f21765y     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                ch1 r1 = p000.ch1.this     // Catch:{ all -> 0x0028 }
                r1.mo29978J()     // Catch:{ all -> 0x0028 }
                ch1 r1 = p000.ch1.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.mo29988v()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                ch1 r1 = p000.ch1.this     // Catch:{ all -> 0x0028 }
                r1.mo29976C()     // Catch:{ all -> 0x0028 }
                ch1 r1 = p000.ch1.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f21753B = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ch1.C3938a.call():java.lang.Void");
        }
    }

    /* renamed from: ch1$b */
    /* compiled from: DiskLruCache */
    public static class C3939b extends OutputStream {
        public void write(int i) throws IOException {
        }
    }

    /* renamed from: ch1$c */
    /* compiled from: DiskLruCache */
    public final class C3940c {

        /* renamed from: a */
        public final C3942d f21767a;

        /* renamed from: b */
        public final boolean[] f21768b;

        /* renamed from: c */
        public boolean f21769c;

        /* renamed from: d */
        public boolean f21770d;

        /* renamed from: ch1$c$a */
        /* compiled from: DiskLruCache */
        public class C3941a extends FilterOutputStream {
            public /* synthetic */ C3941a(C3940c cVar, OutputStream outputStream, C3938a aVar) {
                this(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C3940c.this.f21769c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C3940c.this.f21769c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C3940c.this.f21769c = true;
                }
            }

            public C3941a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C3940c.this.f21769c = true;
                }
            }
        }

        public /* synthetic */ C3940c(ch1 ch1, C3942d dVar, C3938a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo29994a() throws IOException {
            ch1.this.mo29982k(this, false);
        }

        /* renamed from: e */
        public void mo29995e() throws IOException {
            if (this.f21769c) {
                ch1.this.mo29982k(this, false);
                ch1.this.mo29977G(this.f21767a.f21773a);
            } else {
                ch1.this.mo29982k(this, true);
            }
            this.f21770d = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo29996f(int r4) throws java.io.IOException {
            /*
                r3 = this;
                ch1 r0 = p000.ch1.this
                monitor-enter(r0)
                ch1$d r1 = r3.f21767a     // Catch:{ all -> 0x0046 }
                ch1$c r1 = r1.f21776d     // Catch:{ all -> 0x0046 }
                if (r1 != r3) goto L_0x0040
                ch1$d r1 = r3.f21767a     // Catch:{ all -> 0x0046 }
                boolean r1 = r1.f21775c     // Catch:{ all -> 0x0046 }
                if (r1 != 0) goto L_0x0018
                boolean[] r1 = r3.f21768b     // Catch:{ all -> 0x0046 }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x0046 }
            L_0x0018:
                ch1$d r1 = r3.f21767a     // Catch:{ all -> 0x0046 }
                java.io.File r4 = r1.mo30002k(r4)     // Catch:{ all -> 0x0046 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0024 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0024 }
                goto L_0x0032
            L_0x0024:
                ch1 r1 = p000.ch1.this     // Catch:{ all -> 0x0046 }
                java.io.File r1 = r1.f21757a     // Catch:{ all -> 0x0046 }
                r1.mkdirs()     // Catch:{ all -> 0x0046 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003a }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003a }
            L_0x0032:
                ch1$c$a r4 = new ch1$c$a     // Catch:{ all -> 0x0046 }
                r2 = 0
                r4.<init>(r3, r1, r2)     // Catch:{ all -> 0x0046 }
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                return r4
            L_0x003a:
                java.io.OutputStream r4 = p000.ch1.f21751M     // Catch:{ all -> 0x0046 }
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                return r4
            L_0x0040:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0046 }
                r4.<init>()     // Catch:{ all -> 0x0046 }
                throw r4     // Catch:{ all -> 0x0046 }
            L_0x0046:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ch1.C3940c.mo29996f(int):java.io.OutputStream");
        }

        public C3940c(C3942d dVar) {
            this.f21767a = dVar;
            this.f21768b = dVar.f21775c ? null : new boolean[ch1.this.f21763s];
        }
    }

    /* renamed from: ch1$d */
    /* compiled from: DiskLruCache */
    public final class C3942d {

        /* renamed from: a */
        public final String f21773a;

        /* renamed from: b */
        public final long[] f21774b;

        /* renamed from: c */
        public boolean f21775c;

        /* renamed from: d */
        public C3940c f21776d;

        /* renamed from: e */
        public long f21777e;

        public /* synthetic */ C3942d(ch1 ch1, String str, C3938a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File mo30001j(int i) {
            File d = ch1.this.f21757a;
            return new File(d, this.f21773a + "." + i);
        }

        /* renamed from: k */
        public File mo30002k(int i) {
            File d = ch1.this.f21757a;
            return new File(d, this.f21773a + "." + i + ".tmp");
        }

        /* renamed from: l */
        public String mo30003l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f21774b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException mo30004m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void mo30005n(String[] strArr) throws IOException {
            if (strArr.length == ch1.this.f21763s) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f21774b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw mo30004m(strArr);
                    }
                }
                return;
            }
            throw mo30004m(strArr);
        }

        public C3942d(String str) {
            this.f21773a = str;
            this.f21774b = new long[ch1.this.f21763s];
        }
    }

    /* renamed from: ch1$e */
    /* compiled from: DiskLruCache */
    public final class C3943e implements Closeable {

        /* renamed from: a */
        public final String f21779a;

        /* renamed from: d */
        public final long f21780d;

        /* renamed from: e */
        public final InputStream[] f21781e;

        /* renamed from: g */
        public final long[] f21782g;

        public /* synthetic */ C3943e(ch1 ch1, String str, long j, InputStream[] inputStreamArr, long[] jArr, C3938a aVar) {
            this(str, j, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream mo30006a(int i) {
            return this.f21781e[i];
        }

        /* renamed from: b */
        public long mo30007b(int i) {
            return this.f21782g[i];
        }

        public void close() {
            for (InputStream a : this.f21781e) {
                s67.m51611a(a);
            }
        }

        public C3943e(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f21779a = str;
            this.f21780d = j;
            this.f21781e = inputStreamArr;
            this.f21782g = jArr;
        }
    }

    public ch1(File file, int i, int i2, long j) {
        File file2 = file;
        this.f21757a = file2;
        this.f21761k = i;
        this.f21758d = new File(file2, "journal");
        this.f21759e = new File(file2, "journal.tmp");
        this.f21760g = new File(file2, "journal.bkp");
        this.f21763s = i2;
        this.f21762r = j;
    }

    /* renamed from: I */
    public static void m32991I(File file, File file2, boolean z) throws IOException {
        if (z) {
            m33001m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: m */
    public static void m33001m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: x */
    public static ch1 m33002x(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m32991I(file2, file3, false);
                }
            }
            ch1 ch1 = new ch1(file, i, i2, j);
            if (ch1.f21758d.exists()) {
                try {
                    ch1.mo29990z();
                    ch1.mo29989y();
                    ch1.f21765y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ch1.f21758d, true), s67.f33754a));
                    return ch1;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    ch1.mo29983l();
                }
            }
            file.mkdirs();
            ch1 ch12 = new ch1(file, i, i2, j);
            ch12.mo29976C();
            return ch12;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: A */
    public final void mo29975A(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f21752A.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C3942d dVar = this.f21752A.get(str2);
            if (dVar == null) {
                dVar = new C3942d(this, str2, (C3938a) null);
                this.f21752A.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f21775c = true;
                C3940c unused2 = dVar.f21776d = null;
                dVar.mo30005n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C3940c unused3 = dVar.f21776d = new C3940c(this, dVar, (C3938a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C */
    public final synchronized void mo29976C() throws IOException {
        Writer writer = this.f21765y;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21759e), s67.f33754a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f21761k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f21763s));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C3942d next : this.f21752A.values()) {
                if (next.f21776d != null) {
                    bufferedWriter.write("DIRTY " + next.f21773a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f21773a + next.mo30003l() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f21758d.exists()) {
                m32991I(this.f21758d, this.f21760g, true);
            }
            m32991I(this.f21759e, this.f21758d, false);
            this.f21760g.delete();
            this.f21765y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21758d, true), s67.f33754a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        return false;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo29977G(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.mo29981j()     // Catch:{ all -> 0x0093 }
            r7.mo29979K(r8)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, ch1$d> r0 = r7.f21752A     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0093 }
            ch1$d r0 = (p000.ch1.C3942d) r0     // Catch:{ all -> 0x0093 }
            r1 = 0
            if (r0 == 0) goto L_0x0091
            ch1$c r2 = r0.f21776d     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x001a
            goto L_0x0091
        L_0x001a:
            int r2 = r7.f21763s     // Catch:{ all -> 0x0093 }
            if (r1 >= r2) goto L_0x005c
            java.io.File r2 = r0.mo30001j(r1)     // Catch:{ all -> 0x0093 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x0046
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0093 }
            r8.<init>(r0)     // Catch:{ all -> 0x0093 }
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x0046:
            long r2 = r7.f21764x     // Catch:{ all -> 0x0093 }
            long[] r4 = r0.f21774b     // Catch:{ all -> 0x0093 }
            r5 = r4[r1]     // Catch:{ all -> 0x0093 }
            long r2 = r2 - r5
            r7.f21764x = r2     // Catch:{ all -> 0x0093 }
            long[] r2 = r0.f21774b     // Catch:{ all -> 0x0093 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0093 }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005c:
            int r0 = r7.f21753B     // Catch:{ all -> 0x0093 }
            r1 = 1
            int r0 = r0 + r1
            r7.f21753B = r0     // Catch:{ all -> 0x0093 }
            java.io.Writer r0 = r7.f21765y     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r2.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            r2.append(r8)     // Catch:{ all -> 0x0093 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, ch1$d> r0 = r7.f21752A     // Catch:{ all -> 0x0093 }
            r0.remove(r8)     // Catch:{ all -> 0x0093 }
            boolean r8 = r7.mo29988v()     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x008f
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f21755H     // Catch:{ all -> 0x0093 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f21756I     // Catch:{ all -> 0x0093 }
            r8.submit(r0)     // Catch:{ all -> 0x0093 }
        L_0x008f:
            monitor-exit(r7)
            return r1
        L_0x0091:
            monitor-exit(r7)
            return r1
        L_0x0093:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ch1.mo29977G(java.lang.String):boolean");
    }

    /* renamed from: J */
    public final void mo29978J() throws IOException {
        while (this.f21764x > this.f21762r) {
            mo29977G((String) this.f21752A.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: K */
    public final void mo29979K(String str) {
        if (!f21750L.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
    }

    public synchronized void close() throws IOException {
        if (this.f21765y != null) {
            Iterator it = new ArrayList(this.f21752A.values()).iterator();
            while (it.hasNext()) {
                C3942d dVar = (C3942d) it.next();
                if (dVar.f21776d != null) {
                    dVar.f21776d.mo29994a();
                }
            }
            mo29978J();
            this.f21765y.close();
            this.f21765y = null;
        }
    }

    /* renamed from: j */
    public final void mo29981j() {
        if (this.f21765y == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo29982k(p000.ch1.C3940c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            ch1$d r0 = r10.f21767a     // Catch:{ all -> 0x0110 }
            ch1$c r1 = r0.f21776d     // Catch:{ all -> 0x0110 }
            if (r1 != r10) goto L_0x010a
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f21775c     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.f21763s     // Catch:{ all -> 0x0110 }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f21768b     // Catch:{ all -> 0x0110 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0110 }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo30002k(r2)     // Catch:{ all -> 0x0110 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x0030
            r10.mo29994a()     // Catch:{ all -> 0x0110 }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo29994a()     // Catch:{ all -> 0x0110 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.<init>(r11)     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x004d:
            int r10 = r9.f21763s     // Catch:{ all -> 0x0110 }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo30002k(r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo30001j(r1)     // Catch:{ all -> 0x0110 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f21774b     // Catch:{ all -> 0x0110 }
            r3 = r10[r1]     // Catch:{ all -> 0x0110 }
            long r5 = r2.length()     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f21774b     // Catch:{ all -> 0x0110 }
            r10[r1] = r5     // Catch:{ all -> 0x0110 }
            long r7 = r9.f21764x     // Catch:{ all -> 0x0110 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f21764x = r7     // Catch:{ all -> 0x0110 }
            goto L_0x007e
        L_0x007b:
            m33001m(r10)     // Catch:{ all -> 0x0110 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f21753B     // Catch:{ all -> 0x0110 }
            r1 = 1
            int r10 = r10 + r1
            r9.f21753B = r10     // Catch:{ all -> 0x0110 }
            r10 = 0
            p000.ch1.C3940c unused = r0.f21776d = r10     // Catch:{ all -> 0x0110 }
            boolean r10 = r0.f21775c     // Catch:{ all -> 0x0110 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00c8
            boolean unused = r0.f21775c = r1     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f21765y     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r1.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.f21773a     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.mo30003l()     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            r1.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00ee
            long r10 = r9.f21754C     // Catch:{ all -> 0x0110 }
            r1 = 1
            long r1 = r1 + r10
            r9.f21754C = r1     // Catch:{ all -> 0x0110 }
            long unused = r0.f21777e = r10     // Catch:{ all -> 0x0110 }
            goto L_0x00ee
        L_0x00c8:
            java.util.LinkedHashMap<java.lang.String, ch1$d> r10 = r9.f21752A     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r0.f21773a     // Catch:{ all -> 0x0110 }
            r10.remove(r11)     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f21765y     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.f21773a     // Catch:{ all -> 0x0110 }
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r11)     // Catch:{ all -> 0x0110 }
        L_0x00ee:
            java.io.Writer r10 = r9.f21765y     // Catch:{ all -> 0x0110 }
            r10.flush()     // Catch:{ all -> 0x0110 }
            long r10 = r9.f21764x     // Catch:{ all -> 0x0110 }
            long r0 = r9.f21762r     // Catch:{ all -> 0x0110 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0101
            boolean r10 = r9.mo29988v()     // Catch:{ all -> 0x0110 }
            if (r10 == 0) goto L_0x0108
        L_0x0101:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f21755H     // Catch:{ all -> 0x0110 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f21756I     // Catch:{ all -> 0x0110 }
            r10.submit(r11)     // Catch:{ all -> 0x0110 }
        L_0x0108:
            monitor-exit(r9)
            return
        L_0x010a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            r10.<init>()     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ch1.mo29982k(ch1$c, boolean):void");
    }

    /* renamed from: l */
    public void mo29983l() throws IOException {
        close();
        s67.m51612b(this.f21757a);
    }

    /* renamed from: n */
    public C3940c mo29984n(String str) throws IOException {
        return mo29985p(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p000.ch1.C3940c mo29985p(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo29981j()     // Catch:{ all -> 0x0061 }
            r5.mo29979K(r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, ch1$d> r0 = r5.f21752A     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0061 }
            ch1$d r0 = (p000.ch1.C3942d) r0     // Catch:{ all -> 0x0061 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r3 = r0.f21777e     // Catch:{ all -> 0x0061 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r5)
            return r2
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            ch1$d r0 = new ch1$d     // Catch:{ all -> 0x0061 }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, ch1$d> r7 = r5.f21752A     // Catch:{ all -> 0x0061 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x002f:
            ch1$c r7 = r0.f21776d     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r2
        L_0x0037:
            ch1$c r7 = new ch1$c     // Catch:{ all -> 0x0061 }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x0061 }
            p000.ch1.C3940c unused = r0.f21776d = r7     // Catch:{ all -> 0x0061 }
            java.io.Writer r8 = r5.f21765y     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r0.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0061 }
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0061 }
            r8.write(r6)     // Catch:{ all -> 0x0061 }
            java.io.Writer r6 = r5.f21765y     // Catch:{ all -> 0x0061 }
            r6.flush()     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)
            return r7
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ch1.mo29985p(java.lang.String, long):ch1$c");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f21753B++;
        r11.f21765y.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (mo29988v() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r11.f21755H.submit(r11.f21756I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        return new p000.ch1.C3943e(r11, r12, p000.ch1.C3942d.m33027c(r0), r8, p000.ch1.C3942d.m33025a(r0), (p000.ch1.C3938a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p000.ch1.C3943e mo29986q(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.mo29981j()     // Catch:{ all -> 0x0085 }
            r11.mo29979K(r12)     // Catch:{ all -> 0x0085 }
            java.util.LinkedHashMap<java.lang.String, ch1$d> r0 = r11.f21752A     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0085 }
            ch1$d r0 = (p000.ch1.C3942d) r0     // Catch:{ all -> 0x0085 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f21775c     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r11)
            return r1
        L_0x001c:
            int r2 = r11.f21763s     // Catch:{ all -> 0x0085 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0085 }
            r2 = 0
            r3 = r2
        L_0x0022:
            int r4 = r11.f21763s     // Catch:{ FileNotFoundException -> 0x0075 }
            if (r3 >= r4) goto L_0x0034
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0075 }
            java.io.File r5 = r0.mo30001j(r3)     // Catch:{ FileNotFoundException -> 0x0075 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0075 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0075 }
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0034:
            int r1 = r11.f21753B     // Catch:{ all -> 0x0085 }
            int r1 = r1 + 1
            r11.f21753B = r1     // Catch:{ all -> 0x0085 }
            java.io.Writer r1 = r11.f21765y     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            r2.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x0085 }
            r2.append(r12)     // Catch:{ all -> 0x0085 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0085 }
            r1.append(r2)     // Catch:{ all -> 0x0085 }
            boolean r1 = r11.mo29988v()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0062
            java.util.concurrent.ThreadPoolExecutor r1 = r11.f21755H     // Catch:{ all -> 0x0085 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f21756I     // Catch:{ all -> 0x0085 }
            r1.submit(r2)     // Catch:{ all -> 0x0085 }
        L_0x0062:
            ch1$e r1 = new ch1$e     // Catch:{ all -> 0x0085 }
            long r6 = r0.f21777e     // Catch:{ all -> 0x0085 }
            long[] r9 = r0.f21774b     // Catch:{ all -> 0x0085 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0085 }
            monitor-exit(r11)
            return r1
        L_0x0075:
            int r12 = r11.f21763s     // Catch:{ all -> 0x0085 }
            if (r2 >= r12) goto L_0x0083
            r12 = r8[r2]     // Catch:{ all -> 0x0085 }
            if (r12 == 0) goto L_0x0083
            p000.s67.m51611a(r12)     // Catch:{ all -> 0x0085 }
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0083:
            monitor-exit(r11)
            return r1
        L_0x0085:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ch1.mo29986q(java.lang.String):ch1$e");
    }

    /* renamed from: s */
    public File mo29987s() {
        return this.f21757a;
    }

    /* renamed from: v */
    public final boolean mo29988v() {
        int i = this.f21753B;
        if (i < 2000 || i < this.f21752A.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final void mo29989y() throws IOException {
        m33001m(this.f21759e);
        Iterator<C3942d> it = this.f21752A.values().iterator();
        while (it.hasNext()) {
            C3942d next = it.next();
            int i = 0;
            if (next.f21776d == null) {
                while (i < this.f21763s) {
                    this.f21764x += next.f21774b[i];
                    i++;
                }
            } else {
                C3940c unused = next.f21776d = null;
                while (i < this.f21763s) {
                    m33001m(next.mo30001j(i));
                    m33001m(next.mo30002k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f21753B = r0 - r9.f21752A.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x006c=Splitter:B:20:0x006c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29990z() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            ab6 r1 = new ab6
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f21758d
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p000.s67.f33754a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo28908c()     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r1.mo28908c()     // Catch:{ all -> 0x009a }
            java.lang.String r4 = r1.mo28908c()     // Catch:{ all -> 0x009a }
            java.lang.String r5 = r1.mo28908c()     // Catch:{ all -> 0x009a }
            java.lang.String r6 = r1.mo28908c()     // Catch:{ all -> 0x009a }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x006c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x006c
            int r7 = r9.f21761k     // Catch:{ all -> 0x009a }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x009a }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            int r4 = r9.f21763s     // Catch:{ all -> 0x009a }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x009a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo28908c()     // Catch:{ EOFException -> 0x005f }
            r9.mo29975A(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, ch1$d> r2 = r9.f21752A     // Catch:{ all -> 0x009a }
            int r2 = r2.size()     // Catch:{ all -> 0x009a }
            int r0 = r0 - r2
            r9.f21753B = r0     // Catch:{ all -> 0x009a }
            p000.s67.m51611a(r1)
            return
        L_0x006c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r7.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x009a }
            r7.append(r2)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r3)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r5)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r6)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x009a }
            r4.<init>(r0)     // Catch:{ all -> 0x009a }
            throw r4     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            p000.s67.m51611a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ch1.mo29990z():void");
    }
}
