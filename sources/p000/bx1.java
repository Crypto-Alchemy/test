package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p000.i47;

/* renamed from: bx1 */
/* compiled from: ExoSoSource */
public final class bx1 extends i47 {

    /* renamed from: bx1$b */
    /* compiled from: ExoSoSource */
    public final class C1660b extends i47.C2528f {

        /* renamed from: a */
        public final C1662c[] f8286a;

        /* renamed from: d */
        public final /* synthetic */ bx1 f8287d;

        /* renamed from: bx1$b$a */
        /* compiled from: ExoSoSource */
        public final class C1661a extends i47.C2527e {

            /* renamed from: a */
            public int f8288a;

            public C1661a() {
            }

            /* renamed from: a */
            public boolean mo11926a() {
                if (this.f8288a < C1660b.this.f8286a.length) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public i47.C2526d mo11927b() throws IOException {
                C1662c[] c = C1660b.this.f8286a;
                int i = this.f8288a;
                this.f8288a = i + 1;
                C1662c cVar = c[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f8290e);
                try {
                    return new i47.C2526d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e8, code lost:
            r10.close();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1660b(p000.bx1 r18, p000.i47 r19) throws java.io.IOException {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r1.f8287d = r0
                r17.<init>()
                android.content.Context r0 = r0.f13153c
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "/data/local/tmp/exopackage/"
                r3.append(r4)
                java.lang.String r0 = r0.getPackageName()
                r3.append(r0)
                java.lang.String r0 = "/native-libs/"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
                r3.<init>()
                java.lang.String[] r4 = com.facebook.soloader.SysUtil.m13741h()
                int r5 = r4.length
                r6 = 0
                r7 = r6
            L_0x003b:
                if (r7 >= r5) goto L_0x010e
                r8 = r4[r7]
                java.io.File r9 = new java.io.File
                r9.<init>(r2, r8)
                boolean r10 = r9.isDirectory()
                if (r10 != 0) goto L_0x004c
                goto L_0x00eb
            L_0x004c:
                r3.add(r8)
                java.io.File r8 = new java.io.File
                java.lang.String r10 = "metadata.txt"
                r8.<init>(r9, r10)
                boolean r10 = r8.isFile()
                if (r10 != 0) goto L_0x005e
                goto L_0x00eb
            L_0x005e:
                java.io.FileReader r10 = new java.io.FileReader
                r10.<init>(r8)
                java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x00ff }
                r8.<init>(r10)     // Catch:{ all -> 0x00ff }
            L_0x0068:
                java.lang.String r11 = r8.readLine()     // Catch:{ all -> 0x00f0 }
                if (r11 == 0) goto L_0x00e5
                int r12 = r11.length()     // Catch:{ all -> 0x00f0 }
                if (r12 != 0) goto L_0x0075
                goto L_0x0068
            L_0x0075:
                r12 = 32
                int r12 = r11.indexOf(r12)     // Catch:{ all -> 0x00f0 }
                r13 = -1
                if (r12 == r13) goto L_0x00c9
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r13.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r14 = r11.substring(r6, r12)     // Catch:{ all -> 0x00f0 }
                r13.append(r14)     // Catch:{ all -> 0x00f0 }
                java.lang.String r14 = ".so"
                r13.append(r14)     // Catch:{ all -> 0x00f0 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00f0 }
                int r14 = r0.size()     // Catch:{ all -> 0x00f0 }
                r15 = r6
            L_0x0098:
                if (r15 >= r14) goto L_0x00b0
                java.lang.Object r16 = r0.get(r15)     // Catch:{ all -> 0x00f0 }
                r6 = r16
                bx1$c r6 = (p000.bx1.C1662c) r6     // Catch:{ all -> 0x00f0 }
                java.lang.String r6 = r6.f13163a     // Catch:{ all -> 0x00f0 }
                boolean r6 = r6.equals(r13)     // Catch:{ all -> 0x00f0 }
                if (r6 == 0) goto L_0x00ac
                r6 = 1
                goto L_0x00b1
            L_0x00ac:
                int r15 = r15 + 1
                r6 = 0
                goto L_0x0098
            L_0x00b0:
                r6 = 0
            L_0x00b1:
                if (r6 == 0) goto L_0x00b5
            L_0x00b3:
                r6 = 0
                goto L_0x0068
            L_0x00b5:
                int r12 = r12 + 1
                java.lang.String r6 = r11.substring(r12)     // Catch:{ all -> 0x00f0 }
                bx1$c r11 = new bx1$c     // Catch:{ all -> 0x00f0 }
                java.io.File r12 = new java.io.File     // Catch:{ all -> 0x00f0 }
                r12.<init>(r9, r6)     // Catch:{ all -> 0x00f0 }
                r11.<init>(r13, r6, r12)     // Catch:{ all -> 0x00f0 }
                r0.add(r11)     // Catch:{ all -> 0x00f0 }
                goto L_0x00b3
            L_0x00c9:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f0 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r2.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "illegal line in exopackage metadata: ["
                r2.append(r3)     // Catch:{ all -> 0x00f0 }
                r2.append(r11)     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "]"
                r2.append(r3)     // Catch:{ all -> 0x00f0 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00f0 }
                r0.<init>(r2)     // Catch:{ all -> 0x00f0 }
                throw r0     // Catch:{ all -> 0x00f0 }
            L_0x00e5:
                r8.close()     // Catch:{ all -> 0x00ff }
                r10.close()
            L_0x00eb:
                int r7 = r7 + 1
                r6 = 0
                goto L_0x003b
            L_0x00f0:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x00f3 }
            L_0x00f3:
                r0 = move-exception
                r3 = r0
                r8.close()     // Catch:{ all -> 0x00f9 }
                goto L_0x00fe
            L_0x00f9:
                r0 = move-exception
                r4 = r0
                r2.addSuppressed(r4)     // Catch:{ all -> 0x00ff }
            L_0x00fe:
                throw r3     // Catch:{ all -> 0x00ff }
            L_0x00ff:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x0102 }
            L_0x0102:
                r0 = move-exception
                r3 = r0
                r10.close()     // Catch:{ all -> 0x0108 }
                goto L_0x010d
            L_0x0108:
                r0 = move-exception
                r4 = r0
                r2.addSuppressed(r4)
            L_0x010d:
                throw r3
            L_0x010e:
                int r2 = r3.size()
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r2 = r3.toArray(r2)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r3 = r19
                r3.mo21462q(r2)
                int r2 = r0.size()
                bx1$c[] r2 = new p000.bx1.C1662c[r2]
                java.lang.Object[] r0 = r0.toArray(r2)
                bx1$c[] r0 = (p000.bx1.C1662c[]) r0
                r1.f8286a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bx1.C1660b.<init>(bx1, i47):void");
        }

        /* renamed from: a */
        public i47.C2525c mo11924a() throws IOException {
            return new i47.C2525c(this.f8286a);
        }

        /* renamed from: b */
        public i47.C2527e mo11925b() throws IOException {
            return new C1661a();
        }
    }

    /* renamed from: bx1$c */
    /* compiled from: ExoSoSource */
    public static final class C1662c extends i47.C2524b {

        /* renamed from: e */
        public final File f8290e;

        public C1662c(String str, String str2, File file) {
            super(str, str2);
            this.f8290e = file;
        }
    }

    public bx1(Context context, String str) {
        super(context, str);
    }

    /* renamed from: m */
    public i47.C2528f mo11923m() throws IOException {
        return new C1660b(this, this);
    }
}
