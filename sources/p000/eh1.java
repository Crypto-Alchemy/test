package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p000.bh1;
import p000.tg1;

/* renamed from: eh1 */
/* compiled from: DiskLruCacheWrapper */
public class eh1 implements tg1 {

    /* renamed from: a */
    public final pk5 f11154a;

    /* renamed from: b */
    public final File f11155b;

    /* renamed from: c */
    public final long f11156c;

    /* renamed from: d */
    public final yg1 f11157d = new yg1();

    /* renamed from: e */
    public bh1 f11158e;

    @Deprecated
    public eh1(File file, long j) {
        this.f11155b = file;
        this.f11156c = j;
        this.f11154a = new pk5();
    }

    /* renamed from: c */
    public static tg1 m16095c(File file, long j) {
        return new eh1(file, j);
    }

    /* renamed from: a */
    public File mo19243a(z93 z93) {
        String b = this.f11154a.mo24631b(z93);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(b);
            sb.append(" for for Key: ");
            sb.append(z93);
        }
        try {
            bh1.C1633e s = mo19245d().mo11658s(b);
            if (s != null) {
                return s.mo11674a(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo19244b(z93 z93, tg1.C3363b bVar) {
        bh1.C1631c n;
        String b = this.f11154a.mo24631b(z93);
        this.f11157d.mo28056a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(b);
                sb.append(" for for Key: ");
                sb.append(z93);
            }
            try {
                bh1 d = mo19245d();
                if (d.mo11658s(b) == null) {
                    n = d.mo11656n(b);
                    if (n != null) {
                        if (bVar.mo22622a(n.mo11668f(0))) {
                            n.mo11667e();
                        }
                        n.mo11666b();
                        this.f11157d.mo28057b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable("DiskLruCacheWrapper", 5);
            } catch (Throwable th) {
                n.mo11666b();
                throw th;
            }
        } finally {
            this.f11157d.mo28057b(b);
        }
    }

    /* renamed from: d */
    public final synchronized bh1 mo19245d() throws IOException {
        if (this.f11158e == null) {
            this.f11158e = bh1.m11373x(this.f11155b, 1, 1, this.f11156c);
        }
        return this.f11158e;
    }
}
