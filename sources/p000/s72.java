package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: s72 */
/* compiled from: FontsContractCompat */
public class s72 {

    /* renamed from: s72$a */
    /* compiled from: FontsContractCompat */
    public static class C3249a {

        /* renamed from: a */
        public final int f17508a;

        /* renamed from: b */
        public final C3250b[] f17509b;

        @Deprecated
        public C3249a(int i, C3250b[] bVarArr) {
            this.f17508a = i;
            this.f17509b = bVarArr;
        }

        /* renamed from: a */
        public static C3249a m26706a(int i, C3250b[] bVarArr) {
            return new C3249a(i, bVarArr);
        }

        /* renamed from: b */
        public C3250b[] mo25653b() {
            return this.f17509b;
        }

        /* renamed from: c */
        public int mo25654c() {
            return this.f17508a;
        }
    }

    /* renamed from: s72$b */
    /* compiled from: FontsContractCompat */
    public static class C3250b {

        /* renamed from: a */
        public final Uri f17510a;

        /* renamed from: b */
        public final int f17511b;

        /* renamed from: c */
        public final int f17512c;

        /* renamed from: d */
        public final boolean f17513d;

        /* renamed from: e */
        public final int f17514e;

        @Deprecated
        public C3250b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f17510a = (Uri) gu4.m18428f(uri);
            this.f17511b = i;
            this.f17512c = i2;
            this.f17513d = z;
            this.f17514e = i3;
        }

        /* renamed from: a */
        public static C3250b m26709a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C3250b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo25655b() {
            return this.f17514e;
        }

        /* renamed from: c */
        public int mo25656c() {
            return this.f17511b;
        }

        /* renamed from: d */
        public Uri mo25657d() {
            return this.f17510a;
        }

        /* renamed from: e */
        public int mo25658e() {
            return this.f17512c;
        }

        /* renamed from: f */
        public boolean mo25659f() {
            return this.f17513d;
        }
    }

    /* renamed from: s72$c */
    /* compiled from: FontsContractCompat */
    public static class C3251c {
        /* renamed from: a */
        public void mo20335a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo20336b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m26703a(Context context, CancellationSignal cancellationSignal, C3250b[] bVarArr) {
        return g27.m17572b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static C3249a m26704b(Context context, CancellationSignal cancellationSignal, j72 j72) throws PackageManager.NameNotFoundException {
        return i72.m19442e(context, j72, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m26705c(Context context, j72 j72, int i, boolean z, int i2, Handler handler, C3251c cVar) {
        r90 r90 = new r90(cVar, handler);
        if (z) {
            return l72.m21301e(context, j72, r90, i, i2);
        }
        return l72.m21300d(context, j72, i, (Executor) null, r90);
    }
}
