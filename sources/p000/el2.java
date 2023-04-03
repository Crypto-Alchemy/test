package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: el2 */
/* compiled from: HardwareConfigState */
public final class el2 {

    /* renamed from: g */
    public static final boolean f11240g;

    /* renamed from: h */
    public static final boolean f11241h;

    /* renamed from: i */
    public static final File f11242i = new File("/proc/self/fd");

    /* renamed from: j */
    public static volatile el2 f11243j;

    /* renamed from: k */
    public static volatile int f11244k = -1;

    /* renamed from: a */
    public final boolean f11245a = m16179f();

    /* renamed from: b */
    public final int f11246b;

    /* renamed from: c */
    public final int f11247c;

    /* renamed from: d */
    public int f11248d;

    /* renamed from: e */
    public boolean f11249e = true;

    /* renamed from: f */
    public final AtomicBoolean f11250f = new AtomicBoolean(false);

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        f11240g = z;
        if (i < 26) {
            z2 = false;
        }
        f11241h = z2;
    }

    public el2() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11246b = 20000;
            this.f11247c = 0;
            return;
        }
        this.f11246b = 700;
        this.f11247c = 128;
    }

    /* renamed from: b */
    public static el2 m16178b() {
        if (f11243j == null) {
            synchronized (el2.class) {
                if (f11243j == null) {
                    f11243j = new el2();
                }
            }
        }
        return f11243j;
    }

    /* renamed from: f */
    public static boolean m16179f() {
        if (m16180g() || m16181h()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m16180g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m16181h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    /* renamed from: a */
    public final boolean mo19294a() {
        if (!f11240g || this.f11250f.get()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final int mo19295c() {
        if (f11244k != -1) {
            return f11244k;
        }
        return this.f11246b;
    }

    /* renamed from: d */
    public final synchronized boolean mo19296d() {
        boolean z = true;
        int i = this.f11248d + 1;
        this.f11248d = i;
        if (i >= 50) {
            this.f11248d = 0;
            int length = f11242i.list().length;
            long c = (long) mo19295c();
            if (((long) length) >= c) {
                z = false;
            }
            this.f11249e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(c);
            }
        }
        return this.f11249e;
    }

    /* renamed from: e */
    public boolean mo19297e(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z && this.f11245a && f11241h && !mo19294a() && !z2 && i >= (i3 = this.f11247c) && i2 >= i3 && mo19296d()) {
            return true;
        }
        return false;
    }

    @TargetApi(26)
    /* renamed from: i */
    public boolean mo19298i(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean e = mo19297e(i, i2, z, z2);
        if (e) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return e;
    }
}
