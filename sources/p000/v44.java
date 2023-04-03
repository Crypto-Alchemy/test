package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: v44 */
/* compiled from: NavigationBarObserver */
public final class v44 extends ContentObserver {

    /* renamed from: a */
    public ArrayList<lh4> f18668a;

    /* renamed from: b */
    public Context f18669b;

    /* renamed from: c */
    public Context f18670c;

    /* renamed from: d */
    public Boolean f18671d;

    /* renamed from: v44$b */
    /* compiled from: NavigationBarObserver */
    public static class C3458b {

        /* renamed from: a */
        public static final v44 f18672a = new v44();
    }

    /* renamed from: c */
    public static v44 m28614c() {
        return C3458b.f18672a;
    }

    /* renamed from: d */
    public static boolean m28615d() {
        if (re4.m26167g() || re4.m26163c()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m28616e(android.content.Context r3) {
        /*
            android.content.Context r3 = r3.getApplicationContext()
            boolean r0 = m28615d()
            r1 = 0
            if (r0 == 0) goto L_0x0044
            if (r3 == 0) goto L_0x0044
            android.content.ContentResolver r0 = r3.getContentResolver()
            if (r0 == 0) goto L_0x0044
            boolean r0 = p000.re4.m26167g()
            if (r0 == 0) goto L_0x0024
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r0 = "force_fsg_nav_bar"
            int r3 = android.provider.Settings.Global.getInt(r3, r0, r1)
            goto L_0x0045
        L_0x0024:
            boolean r0 = p000.re4.m26163c()
            if (r0 == 0) goto L_0x0044
            boolean r0 = p000.re4.m26166f()
            java.lang.String r2 = "navigationbar_is_min"
            if (r0 != 0) goto L_0x003b
            android.content.ContentResolver r3 = r3.getContentResolver()
            int r3 = android.provider.Settings.Global.getInt(r3, r2, r1)
            goto L_0x0045
        L_0x003b:
            android.content.ContentResolver r3 = r3.getContentResolver()
            int r3 = android.provider.Settings.System.getInt(r3, r2, r1)
            goto L_0x0045
        L_0x0044:
            r3 = r1
        L_0x0045:
            if (r3 == 0) goto L_0x0048
            r1 = 1
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v44.m28616e(android.content.Context):boolean");
    }

    /* renamed from: a */
    public void mo27053a(lh4 lh4) {
        if (lh4 != null) {
            if (this.f18668a == null) {
                this.f18668a = new ArrayList<>();
            }
            if (!this.f18668a.contains(lh4)) {
                this.f18668a.add(lh4);
            }
        }
    }

    /* renamed from: b */
    public Context mo27054b() {
        return this.f18669b;
    }

    /* renamed from: f */
    public void mo27055f(Context context) {
        this.f18669b = context;
        this.f18670c = context.getApplicationContext();
        if (context.getContentResolver() != null && !this.f18671d.booleanValue()) {
            Uri uri = null;
            if (re4.m26167g()) {
                uri = Settings.Global.getUriFor("force_fsg_nav_bar");
            } else if (re4.m26163c()) {
                if (!re4.m26166f()) {
                    uri = Settings.Global.getUriFor("navigationbar_is_min");
                } else {
                    uri = Settings.System.getUriFor("navigationbar_is_min");
                }
            }
            if (uri != null) {
                context.getContentResolver().registerContentObserver(uri, true, this);
                this.f18671d = Boolean.TRUE;
            }
        }
    }

    /* renamed from: g */
    public void mo27056g(lh4 lh4) {
        ArrayList<lh4> arrayList;
        if (this.f18671d.booleanValue()) {
            this.f18670c.getContentResolver().unregisterContentObserver(this);
            this.f18671d = Boolean.FALSE;
        }
        this.f18670c = null;
        if (lh4 != null && (arrayList = this.f18668a) != null) {
            arrayList.remove(lh4);
        }
    }

    /* renamed from: h */
    public void mo27057h() {
        this.f18670c.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        ArrayList<lh4> arrayList = this.f18668a;
        if (arrayList != null && !arrayList.isEmpty()) {
            boolean e = m28616e(this.f18670c);
            Iterator<lh4> it = this.f18668a.iterator();
            while (it.hasNext()) {
                it.next().mo22684a(e);
            }
        }
    }

    public v44() {
        super(new Handler(Looper.getMainLooper()));
        this.f18671d = Boolean.FALSE;
    }
}
