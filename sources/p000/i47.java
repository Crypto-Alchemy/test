package p000;

import android.content.Context;
import android.os.StrictMode;
import com.facebook.soloader.C1968a;
import com.facebook.soloader.SysUtil;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i47 */
/* compiled from: UnpackingSoSource */
public abstract class i47 extends C1968a {

    /* renamed from: c */
    public final Context f13153c;

    /* renamed from: d */
    public String f13154d;

    /* renamed from: e */
    public String[] f13155e;

    /* renamed from: f */
    public final Map<String, Object> f13156f = new HashMap();

    /* renamed from: i47$a */
    /* compiled from: UnpackingSoSource */
    public class C2523a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f13157a;

        /* renamed from: d */
        public final /* synthetic */ byte[] f13158d;

        /* renamed from: e */
        public final /* synthetic */ C2525c f13159e;

        /* renamed from: g */
        public final /* synthetic */ File f13160g;

        /* renamed from: k */
        public final /* synthetic */ t02 f13161k;

        public C2523a(File file, byte[] bArr, C2525c cVar, File file2, t02 t02) {
            this.f13157a = file;
            this.f13158d = bArr;
            this.f13159e = cVar;
            this.f13160g = file2;
            this.f13161k = t02;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
            throw r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
            throw r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " (from syncer thread)"
                java.lang.String r1 = "releasing dso store lock for "
                java.lang.String r2 = "rw"
                java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0071 }
                java.io.File r4 = r6.f13157a     // Catch:{ all -> 0x0071 }
                r3.<init>(r4, r2)     // Catch:{ all -> 0x0071 }
                byte[] r4 = r6.f13158d     // Catch:{ all -> 0x0065 }
                r3.write(r4)     // Catch:{ all -> 0x0065 }
                long r4 = r3.getFilePointer()     // Catch:{ all -> 0x0065 }
                r3.setLength(r4)     // Catch:{ all -> 0x0065 }
                r3.close()     // Catch:{ all -> 0x0071 }
                java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0071 }
                i47 r4 = p000.i47.this     // Catch:{ all -> 0x0071 }
                java.io.File r4 = r4.f9783a     // Catch:{ all -> 0x0071 }
                java.lang.String r5 = "dso_manifest"
                r3.<init>(r4, r5)     // Catch:{ all -> 0x0071 }
                java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0071 }
                r4.<init>(r3, r2)     // Catch:{ all -> 0x0071 }
                i47$c r2 = r6.f13159e     // Catch:{ all -> 0x0059 }
                r2.mo21464b(r4)     // Catch:{ all -> 0x0059 }
                r4.close()     // Catch:{ all -> 0x0071 }
                i47 r2 = p000.i47.this     // Catch:{ all -> 0x0071 }
                java.io.File r2 = r2.f9783a     // Catch:{ all -> 0x0071 }
                com.facebook.soloader.SysUtil.m13739f(r2)     // Catch:{ all -> 0x0071 }
                java.io.File r2 = r6.f13160g     // Catch:{ all -> 0x0071 }
                r3 = 1
                p000.i47.m19392r(r2, r3)     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008a }
                r2.<init>()     // Catch:{ IOException -> 0x008a }
                r2.append(r1)     // Catch:{ IOException -> 0x008a }
                i47 r1 = p000.i47.this     // Catch:{ IOException -> 0x008a }
                java.io.File r1 = r1.f9783a     // Catch:{ IOException -> 0x008a }
                r2.append(r1)     // Catch:{ IOException -> 0x008a }
                r2.append(r0)     // Catch:{ IOException -> 0x008a }
                t02 r0 = r6.f13161k     // Catch:{ IOException -> 0x008a }
                r0.close()     // Catch:{ IOException -> 0x008a }
                return
            L_0x0059:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x005b }
            L_0x005b:
                r3 = move-exception
                r4.close()     // Catch:{ all -> 0x0060 }
                goto L_0x0064
            L_0x0060:
                r4 = move-exception
                r2.addSuppressed(r4)     // Catch:{ all -> 0x0071 }
            L_0x0064:
                throw r3     // Catch:{ all -> 0x0071 }
            L_0x0065:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0067 }
            L_0x0067:
                r4 = move-exception
                r3.close()     // Catch:{ all -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r3 = move-exception
                r2.addSuppressed(r3)     // Catch:{ all -> 0x0071 }
            L_0x0070:
                throw r4     // Catch:{ all -> 0x0071 }
            L_0x0071:
                r2 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008a }
                r3.<init>()     // Catch:{ IOException -> 0x008a }
                r3.append(r1)     // Catch:{ IOException -> 0x008a }
                i47 r1 = p000.i47.this     // Catch:{ IOException -> 0x008a }
                java.io.File r1 = r1.f9783a     // Catch:{ IOException -> 0x008a }
                r3.append(r1)     // Catch:{ IOException -> 0x008a }
                r3.append(r0)     // Catch:{ IOException -> 0x008a }
                t02 r0 = r6.f13161k     // Catch:{ IOException -> 0x008a }
                r0.close()     // Catch:{ IOException -> 0x008a }
                throw r2     // Catch:{ IOException -> 0x008a }
            L_0x008a:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.i47.C2523a.run():void");
        }
    }

    /* renamed from: i47$b */
    /* compiled from: UnpackingSoSource */
    public static class C2524b {

        /* renamed from: a */
        public final String f13163a;

        /* renamed from: d */
        public final String f13164d;

        public C2524b(String str, String str2) {
            this.f13163a = str;
            this.f13164d = str2;
        }
    }

    /* renamed from: i47$c */
    /* compiled from: UnpackingSoSource */
    public static final class C2525c {

        /* renamed from: a */
        public final C2524b[] f13165a;

        public C2525c(C2524b[] bVarArr) {
            this.f13165a = bVarArr;
        }

        /* renamed from: a */
        public static final C2525c m19405a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C2524b[] bVarArr = new C2524b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new C2524b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C2525c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: b */
        public final void mo21464b(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f13165a.length);
            int i = 0;
            while (true) {
                C2524b[] bVarArr = this.f13165a;
                if (i < bVarArr.length) {
                    dataOutput.writeUTF(bVarArr[i].f13163a);
                    dataOutput.writeUTF(this.f13165a[i].f13164d);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i47$d */
    /* compiled from: UnpackingSoSource */
    public static final class C2526d implements Closeable {

        /* renamed from: a */
        public final C2524b f13166a;

        /* renamed from: d */
        public final InputStream f13167d;

        public C2526d(C2524b bVar, InputStream inputStream) {
            this.f13166a = bVar;
            this.f13167d = inputStream;
        }

        public void close() throws IOException {
            this.f13167d.close();
        }
    }

    /* renamed from: i47$e */
    /* compiled from: UnpackingSoSource */
    public static abstract class C2527e implements Closeable {
        /* renamed from: a */
        public abstract boolean mo11926a();

        /* renamed from: b */
        public abstract C2526d mo11927b() throws IOException;

        public void close() throws IOException {
        }
    }

    /* renamed from: i47$f */
    /* compiled from: UnpackingSoSource */
    public static abstract class C2528f implements Closeable {
        /* renamed from: a */
        public abstract C2525c mo11924a() throws IOException;

        /* renamed from: b */
        public abstract C2527e mo11925b() throws IOException;

        public void close() throws IOException {
        }
    }

    public i47(Context context, String str) {
        super(m19391l(context, str), 1);
        this.f13153c = context;
    }

    /* renamed from: l */
    public static File m19391l(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = move-exception;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19392r(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0021 }
            r0.write(r4)     // Catch:{ all -> 0x0021 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0021 }
            r0.setLength(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0021 }
            r3.sync()     // Catch:{ all -> 0x0021 }
            r0.close()
            return
        L_0x0021:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i47.m19392r(java.io.File, byte):void");
    }

    /* renamed from: a */
    public int mo13505a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int e;
        synchronized (mo21458k(str)) {
            e = mo13506e(str, i, this.f9783a, threadPolicy);
        }
        return e;
    }

    /* renamed from: b */
    public void mo21453b(int i) throws IOException {
        SysUtil.m13743j(this.f9783a);
        t02 a = t02.m27234a(new File(this.f9783a, "dso_lock"));
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("locked dso store ");
            sb.append(this.f9783a);
            if (mo21460o(a, i, mo21457j())) {
                a = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dso store is up-to-date: ");
                sb2.append(this.f9783a);
            }
            if (a == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("not releasing dso store lock for ");
                sb3.append(this.f9783a);
                sb3.append(" (syncer thread started)");
            }
        } finally {
            if (a != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("releasing dso store lock for ");
                sb4.append(this.f9783a);
                a.close();
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("not releasing dso store lock for ");
                sb5.append(this.f9783a);
                sb5.append(" (syncer thread started)");
            }
        }
    }

    /* renamed from: g */
    public final void mo21454g(C2524b[] bVarArr) throws IOException {
        String[] list = this.f9783a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < bVarArr.length) {
                        if (bVarArr[i].f13163a.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.f9783a, str);
                        StringBuilder sb = new StringBuilder();
                        sb.append("deleting unaccounted-for file ");
                        sb.append(file);
                        SysUtil.m13736c(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f9783a);
    }

    /* renamed from: h */
    public final void mo21455h(C2526d dVar, byte[] bArr) throws IOException {
        boolean writable;
        StringBuilder sb = new StringBuilder();
        sb.append("extracting DSO ");
        sb.append(dVar.f13166a.f13163a);
        try {
            if (this.f9783a.setWritable(true)) {
                mo21456i(dVar, bArr);
                if (writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.f9783a);
        } finally {
            if (!this.f9783a.setWritable(false)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error removing ");
                sb2.append(this.f9783a.getCanonicalPath());
                sb2.append(" write permission");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("error overwriting ");
        r6.append(r3);
        r6.append(" trying to delete and start over");
        com.facebook.soloader.SysUtil.m13736c(r3);
        r6 = new java.io.RandomAccessFile(r3, "rw");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21456i(p000.i47.C2526d r11, byte[] r12) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "rw"
            java.lang.String r1 = " write permission"
            java.lang.String r2 = "error removing "
            java.io.File r3 = new java.io.File
            java.io.File r4 = r10.f9783a
            i47$b r5 = r11.f13166a
            java.lang.String r5 = r5.f13163a
            r3.<init>(r4, r5)
            r4 = 0
            r5 = 0
            boolean r6 = r3.exists()     // Catch:{ IOException -> 0x00a5 }
            r7 = 1
            if (r6 == 0) goto L_0x002d
            boolean r6 = r3.setWritable(r7)     // Catch:{ IOException -> 0x00a5 }
            if (r6 != 0) goto L_0x002d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a5 }
            r6.<init>()     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r8 = "error adding write permission to: "
            r6.append(r8)     // Catch:{ IOException -> 0x00a5 }
            r6.append(r3)     // Catch:{ IOException -> 0x00a5 }
        L_0x002d:
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0034 }
            r6.<init>(r3, r0)     // Catch:{ IOException -> 0x0034 }
        L_0x0032:
            r5 = r6
            goto L_0x004f
        L_0x0034:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a5 }
            r6.<init>()     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r8 = "error overwriting "
            r6.append(r8)     // Catch:{ IOException -> 0x00a5 }
            r6.append(r3)     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r8 = " trying to delete and start over"
            r6.append(r8)     // Catch:{ IOException -> 0x00a5 }
            com.facebook.soloader.SysUtil.m13736c(r3)     // Catch:{ IOException -> 0x00a5 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00a5 }
            r6.<init>(r3, r0)     // Catch:{ IOException -> 0x00a5 }
            goto L_0x0032
        L_0x004f:
            java.io.InputStream r0 = r11.f13167d     // Catch:{ IOException -> 0x00a5 }
            int r0 = r0.available()     // Catch:{ IOException -> 0x00a5 }
            if (r0 <= r7) goto L_0x005f
            java.io.FileDescriptor r6 = r5.getFD()     // Catch:{ IOException -> 0x00a5 }
            long r8 = (long) r0     // Catch:{ IOException -> 0x00a5 }
            com.facebook.soloader.SysUtil.m13737d(r6, r8)     // Catch:{ IOException -> 0x00a5 }
        L_0x005f:
            java.io.InputStream r11 = r11.f13167d     // Catch:{ IOException -> 0x00a5 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            com.facebook.soloader.SysUtil.m13734a(r5, r11, r0, r12)     // Catch:{ IOException -> 0x00a5 }
            long r11 = r5.getFilePointer()     // Catch:{ IOException -> 0x00a5 }
            r5.setLength(r11)     // Catch:{ IOException -> 0x00a5 }
            boolean r11 = r3.setExecutable(r7, r4)     // Catch:{ IOException -> 0x00a5 }
            if (r11 == 0) goto L_0x008c
            boolean r11 = r3.setWritable(r4)
            if (r11 != 0) goto L_0x0088
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r3)
            r11.append(r1)
        L_0x0088:
            r5.close()
            return
        L_0x008c:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ IOException -> 0x00a5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a5 }
            r12.<init>()     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r0 = "cannot make file executable: "
            r12.append(r0)     // Catch:{ IOException -> 0x00a5 }
            r12.append(r3)     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x00a5 }
            r11.<init>(r12)     // Catch:{ IOException -> 0x00a5 }
            throw r11     // Catch:{ IOException -> 0x00a5 }
        L_0x00a3:
            r11 = move-exception
            goto L_0x00aa
        L_0x00a5:
            r11 = move-exception
            com.facebook.soloader.SysUtil.m13736c(r3)     // Catch:{ all -> 0x00a3 }
            throw r11     // Catch:{ all -> 0x00a3 }
        L_0x00aa:
            boolean r12 = r3.setWritable(r4)
            if (r12 != 0) goto L_0x00be
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            r12.append(r3)
            r12.append(r1)
        L_0x00be:
            if (r5 == 0) goto L_0x00c3
            r5.close()
        L_0x00c3:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i47.mo21456i(i47$d, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        throw r2;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo21457j() throws java.io.IOException {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            i47$f r1 = r5.mo11923m()
            i47$c r2 = r1.mo11924a()     // Catch:{ all -> 0x0036 }
            i47$b[] r2 = r2.f13165a     // Catch:{ all -> 0x0036 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0036 }
            int r3 = r2.length     // Catch:{ all -> 0x0036 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0036 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0036 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f13163a     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f13164d     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            r1.close()
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r2 = move-exception
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0043:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i47.mo21457j():byte[]");
    }

    /* renamed from: k */
    public final Object mo21458k(String str) {
        Object obj;
        synchronized (this.f13156f) {
            obj = this.f13156f.get(str);
            if (obj == null) {
                obj = new Object();
                this.f13156f.put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: m */
    public abstract C2528f mo11923m() throws IOException;

    /* renamed from: n */
    public synchronized void mo21459n(String str) throws IOException {
        synchronized (mo21458k(str)) {
            this.f13154d = str;
            mo21453b(2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c1, code lost:
        if (r8 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cb, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ce, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cf, code lost:
        if (r0 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d5, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d9, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00dc, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00e1, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e2, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e5, code lost:
        throw r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21460o(p000.t02 r11, int r12, byte[] r13) throws java.io.IOException {
        /*
            r10 = this;
            java.io.File r5 = new java.io.File
            java.io.File r0 = r10.f9783a
            java.lang.String r1 = "dso_state"
            r5.<init>(r0, r1)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r7 = 1
            r2 = 0
            byte r3 = r0.readByte()     // Catch:{ EOFException -> 0x002c, all -> 0x002e }
            if (r3 == r7) goto L_0x003a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x002c, all -> 0x002e }
            r3.<init>()     // Catch:{ EOFException -> 0x002c, all -> 0x002e }
            java.lang.String r4 = "dso store "
            r3.append(r4)     // Catch:{ EOFException -> 0x002c, all -> 0x002e }
            java.io.File r4 = r10.f9783a     // Catch:{ EOFException -> 0x002c, all -> 0x002e }
            r3.append(r4)     // Catch:{ EOFException -> 0x002c, all -> 0x002e }
            java.lang.String r4 = " regeneration interrupted: wiping clean"
            r3.append(r4)     // Catch:{ EOFException -> 0x002c, all -> 0x002e }
        L_0x002c:
            r3 = r2
            goto L_0x003a
        L_0x002e:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r12 = move-exception
            r0.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r13 = move-exception
            r11.addSuppressed(r13)
        L_0x0039:
            throw r12
        L_0x003a:
            r0.close()
            java.io.File r4 = new java.io.File
            java.io.File r0 = r10.f9783a
            java.lang.String r6 = "dso_deps"
            r4.<init>(r0, r6)
            r0 = 0
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            r6.<init>(r4, r1)
            long r8 = r6.length()     // Catch:{ all -> 0x00da }
            int r1 = (int) r8     // Catch:{ all -> 0x00da }
            byte[] r8 = new byte[r1]     // Catch:{ all -> 0x00da }
            int r9 = r6.read(r8)     // Catch:{ all -> 0x00da }
            if (r9 == r1) goto L_0x005a
            r3 = r2
        L_0x005a:
            boolean r1 = java.util.Arrays.equals(r8, r13)     // Catch:{ all -> 0x00da }
            if (r1 != 0) goto L_0x0061
            r3 = r2
        L_0x0061:
            if (r3 == 0) goto L_0x006a
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r8 = r0
            goto L_0x0085
        L_0x006a:
            m19392r(r5, r2)     // Catch:{ all -> 0x00da }
            i47$f r0 = r10.mo11923m()     // Catch:{ all -> 0x00da }
            i47$c r1 = r0.mo11924a()     // Catch:{ all -> 0x00cc }
            i47$e r8 = r0.mo11925b()     // Catch:{ all -> 0x00cc }
            r10.mo21461p(r3, r1, r8)     // Catch:{ all -> 0x00be }
            if (r8 == 0) goto L_0x0081
            r8.close()     // Catch:{ all -> 0x00cc }
        L_0x0081:
            r0.close()     // Catch:{ all -> 0x00da }
            r8 = r1
        L_0x0085:
            r6.close()
            if (r8 != 0) goto L_0x008b
            return r2
        L_0x008b:
            i47$a r9 = new i47$a
            r0 = r9
            r1 = r10
            r2 = r4
            r3 = r13
            r4 = r8
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            r11 = r12 & 1
            if (r11 == 0) goto L_0x00ba
            java.lang.Thread r11 = new java.lang.Thread
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "SoSync:"
            r12.append(r13)
            java.io.File r13 = r10.f9783a
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r9, r12)
            r11.start()
            goto L_0x00bd
        L_0x00ba:
            r9.run()
        L_0x00bd:
            return r7
        L_0x00be:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r12 = move-exception
            if (r8 == 0) goto L_0x00cb
            r8.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r13 = move-exception
            r11.addSuppressed(r13)     // Catch:{ all -> 0x00cc }
        L_0x00cb:
            throw r12     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r12 = move-exception
            if (r0 == 0) goto L_0x00d9
            r0.close()     // Catch:{ all -> 0x00d5 }
            goto L_0x00d9
        L_0x00d5:
            r13 = move-exception
            r11.addSuppressed(r13)     // Catch:{ all -> 0x00da }
        L_0x00d9:
            throw r12     // Catch:{ all -> 0x00da }
        L_0x00da:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r12 = move-exception
            r6.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e5
        L_0x00e1:
            r13 = move-exception
            r11.addSuppressed(r13)
        L_0x00e5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i47.mo21460o(t02, int, byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b A[Catch:{ all -> 0x008a, all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21461p(byte r9, p000.i47.C2525c r10, p000.i47.C2527e r11) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.f9783a
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 1
            if (r9 != r0) goto L_0x0030
            i47$c r9 = p000.i47.C2525c.m19405a(r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0031
        L_0x002d:
            r9 = move-exception
            goto L_0x00ae
        L_0x0030:
            r9 = 0
        L_0x0031:
            r2 = 0
            if (r9 != 0) goto L_0x003b
            i47$c r9 = new i47$c     // Catch:{ all -> 0x002d }
            i47$b[] r3 = new p000.i47.C2524b[r2]     // Catch:{ all -> 0x002d }
            r9.<init>(r3)     // Catch:{ all -> 0x002d }
        L_0x003b:
            i47$b[] r10 = r10.f13165a     // Catch:{ all -> 0x002d }
            r8.mo21454g(r10)     // Catch:{ all -> 0x002d }
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x002d }
        L_0x0045:
            boolean r3 = r11.mo11926a()     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0095
            i47$d r3 = r11.mo11927b()     // Catch:{ all -> 0x002d }
            r4 = r0
            r5 = r2
        L_0x0051:
            if (r4 == 0) goto L_0x007c
            i47$b[] r6 = r9.f13165a     // Catch:{ all -> 0x007a }
            int r7 = r6.length     // Catch:{ all -> 0x007a }
            if (r5 >= r7) goto L_0x007c
            r6 = r6[r5]     // Catch:{ all -> 0x007a }
            java.lang.String r6 = r6.f13163a     // Catch:{ all -> 0x007a }
            i47$b r7 = r3.f13166a     // Catch:{ all -> 0x007a }
            java.lang.String r7 = r7.f13163a     // Catch:{ all -> 0x007a }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x0077
            i47$b[] r6 = r9.f13165a     // Catch:{ all -> 0x007a }
            r6 = r6[r5]     // Catch:{ all -> 0x007a }
            java.lang.String r6 = r6.f13164d     // Catch:{ all -> 0x007a }
            i47$b r7 = r3.f13166a     // Catch:{ all -> 0x007a }
            java.lang.String r7 = r7.f13164d     // Catch:{ all -> 0x007a }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x0077
            r4 = r2
        L_0x0077:
            int r5 = r5 + 1
            goto L_0x0051
        L_0x007a:
            r9 = move-exception
            goto L_0x0082
        L_0x007c:
            if (r4 == 0) goto L_0x008f
            r8.mo21455h(r3, r10)     // Catch:{ all -> 0x007a }
            goto L_0x008f
        L_0x0082:
            throw r9     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r10 = move-exception
            if (r3 == 0) goto L_0x008e
            r3.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r11 = move-exception
            r9.addSuppressed(r11)     // Catch:{ all -> 0x002d }
        L_0x008e:
            throw r10     // Catch:{ all -> 0x002d }
        L_0x008f:
            if (r3 == 0) goto L_0x0045
            r3.close()     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x0095:
            r1.close()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Finished regenerating DSO store "
            r9.append(r10)
            java.lang.Class r10 = r8.getClass()
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            return
        L_0x00ae:
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00af:
            r10 = move-exception
            r1.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r11 = move-exception
            r9.addSuppressed(r11)
        L_0x00b8:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i47.mo21461p(byte, i47$c, i47$e):void");
    }

    /* renamed from: q */
    public void mo21462q(String[] strArr) {
        this.f13155e = strArr;
    }
}
