package p000;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: lr7 */
public final class lr7 implements cv7 {

    /* renamed from: a */
    public final Context f31383a;

    /* renamed from: b */
    public final ot7 f31384b;

    /* renamed from: c */
    public final pr7 f31385c;

    /* renamed from: d */
    public final Executor f31386d;

    /* renamed from: e */
    public final lw7 f31387e;

    public lr7(Context context, Executor executor, pr7 pr7, ot7 ot7, lw7 lw7) {
        this.f31383a = context;
        this.f31384b = ot7;
        this.f31385c = pr7;
        this.f31386d = executor;
        this.f31387e = lw7;
    }

    /* renamed from: c */
    public static /* synthetic */ void m47915c(lr7 lr7, qu7 qu7) {
        try {
            if (!w66.m53741a(lw7.m47962c(lr7.f31383a))) {
                qu7.mo47280c(-12);
            } else {
                qu7.mo47278a();
            }
        } catch (Exception unused) {
            qu7.mo47280c(-12);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m47916d(lr7 lr7, List list, qu7 qu7) {
        Integer e = lr7.mo45496e(list);
        if (e != null) {
            if (e.intValue() == 0) {
                qu7.mo47279b();
            } else {
                qu7.mo47280c(e.intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo41736a(List<Intent> list, qu7 qu7) {
        if (w66.m53742b()) {
            this.f31386d.execute(new jr7(this, list, qu7));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo45496e(java.util.List<android.content.Intent> r13) {
        /*
            r12 = this;
            r0 = -13
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00fe }
            ot7 r2 = r12.f31384b     // Catch:{ Exception -> 0x00fe }
            java.io.File r2 = r2.mo46523f()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r3 = "rw"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x00fe }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ Exception -> 0x00fe }
            r2 = 0
            java.nio.channels.FileLock r3 = r1.tryLock()     // Catch:{ OverlappingFileLockException -> 0x001c }
            goto L_0x001d
        L_0x0019:
            r13 = move-exception
            goto L_0x00ed
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 == 0) goto L_0x00f8
            r2 = 0
            r4 = -11
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x00e4 }
        L_0x0026:
            boolean r5 = r13.hasNext()     // Catch:{ Exception -> 0x00e4 }
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r5 = r13.next()     // Catch:{ Exception -> 0x00e4 }
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r6 = "split_id"
            java.lang.String r6 = r5.getStringExtra(r6)     // Catch:{ Exception -> 0x00e4 }
            android.content.Context r7 = r12.f31383a     // Catch:{ Exception -> 0x00e4 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x00e4 }
            android.net.Uri r5 = r5.getData()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r8 = "r"
            android.content.res.AssetFileDescriptor r5 = r7.openAssetFileDescriptor(r5, r8)     // Catch:{ Exception -> 0x00e4 }
            ot7 r7 = r12.f31384b     // Catch:{ Exception -> 0x00e4 }
            java.io.File r7 = r7.mo46519b(r6)     // Catch:{ Exception -> 0x00e4 }
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x00e4 }
            if (r8 == 0) goto L_0x0061
            long r8 = r7.length()     // Catch:{ Exception -> 0x00e4 }
            long r10 = r5.getLength()     // Catch:{ Exception -> 0x00e4 }
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x00e4 }
            if (r8 != 0) goto L_0x0026
        L_0x0067:
            ot7 r8 = r12.f31384b     // Catch:{ Exception -> 0x00e4 }
            java.io.File r6 = r8.mo46520c(r6)     // Catch:{ Exception -> 0x00e4 }
            boolean r6 = r6.exists()     // Catch:{ Exception -> 0x00e4 }
            if (r6 != 0) goto L_0x0026
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e4 }
            java.io.FileInputStream r5 = r5.createInputStream()     // Catch:{ Exception -> 0x00e4 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00e4 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a0 }
            r5.<init>(r7)     // Catch:{ all -> 0x00a0 }
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0096 }
        L_0x0085:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0096 }
            if (r8 <= 0) goto L_0x008f
            r5.write(r7, r2, r8)     // Catch:{ all -> 0x0096 }
            goto L_0x0085
        L_0x008f:
            r5.close()     // Catch:{ all -> 0x00a0 }
            r6.close()     // Catch:{ Exception -> 0x00e4 }
            goto L_0x0026
        L_0x0096:
            r13 = move-exception
            r5.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r2 = move-exception
            p000.mt7.m48481a(r13, r2)     // Catch:{ all -> 0x00a0 }
        L_0x009f:
            throw r13     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r13 = move-exception
            r6.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r2 = move-exception
            p000.mt7.m48481a(r13, r2)     // Catch:{ Exception -> 0x00e4 }
        L_0x00a9:
            throw r13     // Catch:{ Exception -> 0x00e4 }
        L_0x00aa:
            ot7 r13 = r12.f31384b     // Catch:{  }
            java.io.File r13 = r13.mo46524g()     // Catch:{  }
            java.io.File[] r13 = r13.listFiles()     // Catch:{  }
            pr7 r5 = r12.f31385c     // Catch:{ Exception -> 0x00e2 }
            boolean r5 = r5.mo46858a(r13)     // Catch:{ Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x00e2
            pr7 r5 = r12.f31385c     // Catch:{ Exception -> 0x00e2 }
            boolean r13 = r5.mo46859b(r13)     // Catch:{ Exception -> 0x00e2 }
            if (r13 == 0) goto L_0x00e2
            ot7 r13 = r12.f31384b     // Catch:{  }
            java.io.File r13 = r13.mo46524g()     // Catch:{  }
            java.io.File[] r13 = r13.listFiles()     // Catch:{  }
            java.util.Arrays.sort(r13)     // Catch:{  }
            int r4 = r13.length     // Catch:{  }
        L_0x00d2:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x00e5
            r5 = r13[r4]     // Catch:{  }
            ot7 r6 = r12.f31384b     // Catch:{  }
            java.io.File r6 = r6.mo46521d(r5)     // Catch:{  }
            r5.renameTo(r6)     // Catch:{  }
            goto L_0x00d2
        L_0x00e2:
            r2 = r4
            goto L_0x00e5
        L_0x00e4:
            r2 = r0
        L_0x00e5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0019 }
            r3.release()     // Catch:{ all -> 0x0019 }
            goto L_0x00f8
        L_0x00ed:
            if (r1 == 0) goto L_0x00f7
            r1.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00f7
        L_0x00f3:
            r1 = move-exception
            p000.mt7.m48481a(r13, r1)     // Catch:{ Exception -> 0x00fe }
        L_0x00f7:
            throw r13     // Catch:{ Exception -> 0x00fe }
        L_0x00f8:
            if (r1 == 0) goto L_0x00fd
            r1.close()     // Catch:{ Exception -> 0x00fe }
        L_0x00fd:
            return r2
        L_0x00fe:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lr7.mo45496e(java.util.List):java.lang.Integer");
    }
}
