package com.google.android.play.core.assetpacks;

import java.io.File;

/* renamed from: com.google.android.play.core.assetpacks.f */
public final class C4474f {

    /* renamed from: f */
    public static final pq7 f24723f = new pq7("ExtractChunkTaskHandler");

    /* renamed from: a */
    public final byte[] f24724a = new byte[8192];

    /* renamed from: b */
    public final C4469b f24725b;

    /* renamed from: c */
    public final rt7<yw7> f24726c;

    /* renamed from: d */
    public final rt7<hr7> f24727d;

    /* renamed from: e */
    public final rs7 f24728e;

    public C4474f(C4469b bVar, rt7<yw7> rt7, rt7<hr7> rt72, rs7 rs7) {
        this.f24725b = bVar;
        this.f24726c = rt7;
        this.f24727d = rt72;
        this.f24728e = rs7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017d A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a2 A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d6 A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0291 A[SYNTHETIC, Splitter:B:93:0x0291] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34198a(p000.os7 r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.n r0 = new com.google.android.play.core.assetpacks.n
            com.google.android.play.core.assetpacks.b r4 = r1.f24725b
            java.lang.String r5 = r2.f34708b
            int r6 = r2.f32425c
            long r7 = r2.f32426d
            java.lang.String r9 = r2.f32427e
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.core.assetpacks.b r10 = r1.f24725b
            java.lang.String r11 = r2.f34708b
            int r12 = r2.f32425c
            long r13 = r2.f32426d
            java.lang.String r15 = r2.f32427e
            java.io.File r3 = r10.mo34155C(r11, r12, r13, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.f32433k     // Catch:{ IOException -> 0x0339 }
            int r4 = r2.f32428f     // Catch:{ IOException -> 0x0339 }
            if (r4 == r13) goto L_0x0037
            r15 = r3
            goto L_0x003f
        L_0x0037:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0339 }
            r5 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x0339 }
            r15 = r4
        L_0x003f:
            int r3 = r2.f32429g     // Catch:{ all -> 0x032d }
            r16 = 0
            if (r3 <= 0) goto L_0x017a
            nu7 r3 = r0.mo34231e()     // Catch:{ all -> 0x032d }
            int r4 = r3.mo46229e()     // Catch:{ all -> 0x032d }
            int r5 = r2.f32429g     // Catch:{ all -> 0x032d }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x015a
            int r4 = r3.mo46225a()     // Catch:{ all -> 0x032d }
            if (r4 == r13) goto L_0x00d8
            if (r4 == r12) goto L_0x009b
            if (r4 != r11) goto L_0x0081
            pq7 r4 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo46852a(r5, r6)     // Catch:{ all -> 0x032d }
            long r3 = r3.mo46227c()     // Catch:{ all -> 0x032d }
            r0.mo34232f(r15, r3)     // Catch:{ all -> 0x032d }
            boolean r3 = r23.mo46517a()     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x0077
        L_0x0073:
            r4 = r16
            goto L_0x017b
        L_0x0077:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f34707a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0081:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x032d }
            int r3 = r3.mo46225a()     // Catch:{ all -> 0x032d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032d }
            r4[r14] = r3     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x032d }
            int r4 = r2.f34707a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x009b:
            pq7 r3 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo46852a(r4, r5)     // Catch:{ all -> 0x032d }
            com.google.android.play.core.assetpacks.b r3 = r1.f24725b     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r2.f34708b     // Catch:{ all -> 0x032d }
            int r5 = r2.f32425c     // Catch:{ all -> 0x032d }
            long r6 = r2.f32426d     // Catch:{ all -> 0x032d }
            java.lang.String r8 = r2.f32427e     // Catch:{ all -> 0x032d }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.mo34154B(r17, r18, r19, r21)     // Catch:{ all -> 0x032d }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x00ce
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x032d }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x032d }
            r5.<init>(r3)     // Catch:{ all -> 0x032d }
            r4.<init>(r5, r15)     // Catch:{ all -> 0x032d }
            goto L_0x017b
        L_0x00ce:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f34707a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x00d8:
            pq7 r4 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x032d }
            java.lang.String r6 = r3.mo46226b()     // Catch:{ all -> 0x032d }
            r5[r14] = r6     // Catch:{ all -> 0x032d }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo46852a(r6, r5)     // Catch:{ all -> 0x032d }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032d }
            java.lang.String r5 = r3.mo46226b()     // Catch:{ all -> 0x032d }
            r4.<init>(r5)     // Catch:{ all -> 0x032d }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x0150
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032d }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x032d }
            long r6 = r3.mo46227c()     // Catch:{ all -> 0x032d }
            r5.seek(r6)     // Catch:{ all -> 0x032d }
            long r6 = r3.mo46228d()     // Catch:{ all -> 0x032d }
        L_0x0108:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x032d }
            int r3 = (int) r8     // Catch:{ all -> 0x032d }
            byte[] r8 = r1.f24724a     // Catch:{ all -> 0x032d }
            int r8 = r15.read(r8, r14, r3)     // Catch:{ all -> 0x032d }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x032d }
            if (r8 <= 0) goto L_0x0120
            byte[] r9 = r1.f24724a     // Catch:{ all -> 0x032d }
            r5.write(r9, r14, r8)     // Catch:{ all -> 0x032d }
        L_0x0120:
            long r10 = (long) r8     // Catch:{ all -> 0x032d }
            long r9 = r6 - r10
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x012f
            if (r8 > 0) goto L_0x012c
            goto L_0x012f
        L_0x012c:
            r6 = r9
            r11 = 3
            goto L_0x0108
        L_0x012f:
            long r6 = r5.length()     // Catch:{ all -> 0x032d }
            r5.close()     // Catch:{ all -> 0x032d }
            if (r8 == r3) goto L_0x017a
            pq7 r3 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo46852a(r5, r8)     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032d }
            int r11 = r2.f32429g     // Catch:{ all -> 0x032d }
            r3 = r0
            r5 = r6
            r7 = r9
            r9 = r11
            r3.mo34227a(r4, r5, r7, r9)     // Catch:{ all -> 0x032d }
            goto L_0x0073
        L_0x0150:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f34707a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x015a:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x032d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x032d }
            r6[r14] = r5     // Catch:{ all -> 0x032d }
            int r3 = r3.mo46229e()     // Catch:{ all -> 0x032d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032d }
            r6[r13] = r3     // Catch:{ all -> 0x032d }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x032d }
            int r4 = r2.f34707a     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x017a:
            r4 = r15
        L_0x017b:
            if (r4 == 0) goto L_0x0288
            com.google.android.play.core.assetpacks.e r3 = new com.google.android.play.core.assetpacks.e     // Catch:{ all -> 0x032d }
            r3.<init>(r4)     // Catch:{ all -> 0x032d }
            java.io.File r5 = r22.mo34199b(r23)     // Catch:{ all -> 0x032d }
        L_0x0186:
            vu7 r6 = r3.mo34190a()     // Catch:{ all -> 0x032d }
            boolean r7 = r6.mo48834g()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r3.mo34192c()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r6.mo48829c()     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x01d6
            boolean r7 = r6.mo48828b()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01d6
            byte[] r7 = r6.mo48837i()     // Catch:{ all -> 0x032d }
            r0.mo34233g(r7)     // Catch:{ all -> 0x032d }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x032d }
            java.lang.String r8 = r6.mo48830d()     // Catch:{ all -> 0x032d }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x032d }
            java.io.File r8 = r7.getParentFile()     // Catch:{ all -> 0x032d }
            r8.mkdirs()     // Catch:{ all -> 0x032d }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x032d }
            r8.<init>(r7)     // Catch:{ all -> 0x032d }
            byte[] r7 = r1.f24724a     // Catch:{ all -> 0x032d }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032d }
        L_0x01c4:
            if (r7 <= 0) goto L_0x01d2
            byte[] r9 = r1.f24724a     // Catch:{ all -> 0x032d }
            r8.write(r9, r14, r7)     // Catch:{ all -> 0x032d }
            byte[] r7 = r1.f24724a     // Catch:{ all -> 0x032d }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032d }
            goto L_0x01c4
        L_0x01d2:
            r8.close()     // Catch:{ all -> 0x032d }
            goto L_0x01dd
        L_0x01d6:
            byte[] r7 = r6.mo48837i()     // Catch:{ all -> 0x032d }
            r0.mo34234h(r7, r3)     // Catch:{ all -> 0x032d }
        L_0x01dd:
            boolean r7 = r3.mo34191b()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01e9
            boolean r7 = r3.mo34192c()     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x0186
        L_0x01e9:
            boolean r5 = r3.mo34192c()     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01ff
            pq7 r5 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r7 = "Writing central directory metadata."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r5.mo46852a(r7, r8)     // Catch:{ all -> 0x032d }
            byte[] r5 = r6.mo48837i()     // Catch:{ all -> 0x032d }
            r0.mo34234h(r5, r4)     // Catch:{ all -> 0x032d }
        L_0x01ff:
            boolean r4 = r23.mo46517a()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x0288
            boolean r4 = r6.mo48834g()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x021e
            pq7 r3 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo46852a(r4, r5)     // Catch:{ all -> 0x032d }
            byte[] r3 = r6.mo48837i()     // Catch:{ all -> 0x032d }
            int r4 = r2.f32429g     // Catch:{ all -> 0x032d }
            r0.mo34228b(r3, r4)     // Catch:{ all -> 0x032d }
            goto L_0x0288
        L_0x021e:
            boolean r4 = r3.mo34192c()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x0233
            pq7 r3 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo46852a(r4, r5)     // Catch:{ all -> 0x032d }
            int r3 = r2.f32429g     // Catch:{ all -> 0x032d }
            r0.mo34229c(r3)     // Catch:{ all -> 0x032d }
            goto L_0x0288
        L_0x0233:
            int r4 = r6.mo48833f()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x0269
            pq7 r4 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo46852a(r5, r7)     // Catch:{ all -> 0x032d }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032d }
            java.io.File r5 = r22.mo34199b(r23)     // Catch:{ all -> 0x032d }
            java.lang.String r7 = r6.mo48830d()     // Catch:{ all -> 0x032d }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x032d }
            long r5 = r6.mo48831e()     // Catch:{ all -> 0x032d }
            long r7 = r3.mo34193d()     // Catch:{ all -> 0x032d }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x032d }
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0261
            goto L_0x027a
        L_0x0261:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0269:
            pq7 r4 = f24723f     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo46852a(r5, r6)     // Catch:{ all -> 0x032d }
            java.io.File r4 = r0.mo34236j()     // Catch:{ all -> 0x032d }
            long r5 = r4.length()     // Catch:{ all -> 0x032d }
        L_0x027a:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032d }
            long r7 = r3.mo34193d()     // Catch:{ all -> 0x032d }
            int r9 = r2.f32429g     // Catch:{ all -> 0x032d }
            r3 = r0
            r3.mo34227a(r4, r5, r7, r9)     // Catch:{ all -> 0x032d }
        L_0x0288:
            r15.close()     // Catch:{ IOException -> 0x0339 }
            boolean r3 = r23.mo46517a()
            if (r3 == 0) goto L_0x02b1
            int r3 = r2.f32429g     // Catch:{ IOException -> 0x0297 }
            r0.mo34230d(r3)     // Catch:{ IOException -> 0x0297 }
            goto L_0x02b1
        L_0x0297:
            r0 = move-exception
            pq7 r3 = f24723f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.mo46853b(r5, r4)
            com.google.android.play.core.assetpacks.bj r3 = new com.google.android.play.core.assetpacks.bj
            int r2 = r2.f34707a
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02b1:
            pq7 r0 = f24723f
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f32429g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f32427e
            r3[r13] = r4
            java.lang.String r4 = r2.f34708b
            r3[r12] = r4
            int r4 = r2.f34707a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo46855d(r4, r3)
            rt7<yw7> r0 = r1.f24726c
            java.lang.Object r0 = r0.mo47486a()
            yw7 r0 = (p000.yw7) r0
            int r3 = r2.f34707a
            java.lang.String r4 = r2.f34708b
            java.lang.String r5 = r2.f32427e
            int r6 = r2.f32429g
            r0.mo29743c(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f32433k     // Catch:{ IOException -> 0x02ed }
            r0.close()     // Catch:{ IOException -> 0x02ed }
            goto L_0x0307
        L_0x02ed:
            pq7 r0 = f24723f
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f32429g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f32427e
            r4[r13] = r3
            java.lang.String r3 = r2.f34708b
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo46856e(r3, r4)
        L_0x0307:
            int r0 = r2.f32432j
            r3 = 3
            if (r0 != r3) goto L_0x032c
            rt7<hr7> r0 = r1.f24727d
            java.lang.Object r0 = r0.mo47486a()
            hr7 r0 = (p000.hr7) r0
            java.lang.String r3 = r2.f34708b
            long r7 = r2.f32431i
            r4 = 3
            r5 = 0
            rs7 r6 = r1.f24728e
            double r9 = r6.mo47477c(r3, r2)
            r11 = 1
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.m36338b(r2, r3, r4, r5, r7, r9, r11)
            r0.mo43370f(r2)
        L_0x032c:
            return
        L_0x032d:
            r0 = move-exception
            r3 = r0
            r15.close()     // Catch:{ all -> 0x0333 }
            goto L_0x0338
        L_0x0333:
            r0 = move-exception
            r4 = r0
            p000.mt7.m48481a(r3, r4)     // Catch:{ IOException -> 0x0339 }
        L_0x0338:
            throw r3     // Catch:{ IOException -> 0x0339 }
        L_0x0339:
            r0 = move-exception
            pq7 r3 = f24723f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo46853b(r5, r4)
            com.google.android.play.core.assetpacks.bj r3 = new com.google.android.play.core.assetpacks.bj
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f32429g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.f32427e
            r4[r13] = r5
            java.lang.String r5 = r2.f34708b
            r4[r12] = r5
            int r5 = r2.f34707a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f34707a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C4474f.mo34198a(os7):void");
    }

    /* renamed from: b */
    public final File mo34199b(os7 os7) {
        File v = this.f24725b.mo34180v(os7.f34708b, os7.f32425c, os7.f32426d, os7.f32427e);
        if (!v.exists()) {
            v.mkdirs();
        }
        return v;
    }
}
