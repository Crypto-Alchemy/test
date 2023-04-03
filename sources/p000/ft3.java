package p000;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ft3 */
/* compiled from: MemorySizeCalculator */
public final class ft3 {

    /* renamed from: a */
    public final int f12050a;

    /* renamed from: b */
    public final int f12051b;

    /* renamed from: c */
    public final Context f12052c;

    /* renamed from: d */
    public final int f12053d;

    /* renamed from: ft3$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C2328a {

        /* renamed from: i */
        public static final int f12054i;

        /* renamed from: a */
        public final Context f12055a;

        /* renamed from: b */
        public ActivityManager f12056b;

        /* renamed from: c */
        public C2330c f12057c;

        /* renamed from: d */
        public float f12058d = 2.0f;

        /* renamed from: e */
        public float f12059e = ((float) f12054i);

        /* renamed from: f */
        public float f12060f = 0.4f;

        /* renamed from: g */
        public float f12061g = 0.33f;

        /* renamed from: h */
        public int f12062h = 4194304;

        static {
            int i;
            if (Build.VERSION.SDK_INT < 26) {
                i = 4;
            } else {
                i = 1;
            }
            f12054i = i;
        }

        public C2328a(Context context) {
            this.f12055a = context;
            this.f12056b = (ActivityManager) context.getSystemService("activity");
            this.f12057c = new C2329b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && ft3.m17390e(this.f12056b)) {
                this.f12059e = Utils.FLOAT_EPSILON;
            }
        }

        /* renamed from: a */
        public ft3 mo20165a() {
            return new ft3(this);
        }
    }

    /* renamed from: ft3$b */
    /* compiled from: MemorySizeCalculator */
    public static final class C2329b implements C2330c {

        /* renamed from: a */
        public final DisplayMetrics f12063a;

        public C2329b(DisplayMetrics displayMetrics) {
            this.f12063a = displayMetrics;
        }

        /* renamed from: a */
        public int mo20166a() {
            return this.f12063a.heightPixels;
        }

        /* renamed from: b */
        public int mo20167b() {
            return this.f12063a.widthPixels;
        }
    }

    /* renamed from: ft3$c */
    /* compiled from: MemorySizeCalculator */
    public interface C2330c {
        /* renamed from: a */
        int mo20166a();

        /* renamed from: b */
        int mo20167b();
    }

    public ft3(C2328a aVar) {
        int i;
        boolean z;
        this.f12052c = aVar.f12055a;
        if (m17390e(aVar.f12056b)) {
            i = aVar.f12062h / 2;
        } else {
            i = aVar.f12062h;
        }
        this.f12053d = i;
        int c = m17389c(aVar.f12056b, aVar.f12060f, aVar.f12061g);
        float b = (float) (aVar.f12057c.mo20167b() * aVar.f12057c.mo20166a() * 4);
        int round = Math.round(aVar.f12059e * b);
        int round2 = Math.round(b * aVar.f12058d);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f12051b = round2;
            this.f12050a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f12059e;
            float f3 = aVar.f12058d;
            float f4 = f / (f2 + f3);
            this.f12051b = Math.round(f3 * f4);
            this.f12050a = Math.round(f4 * aVar.f12059e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(mo20164f(this.f12051b));
            sb.append(", pool size: ");
            sb.append(mo20164f(this.f12050a));
            sb.append(", byte array size: ");
            sb.append(mo20164f(i));
            sb.append(", memory class limited? ");
            if (i3 > c) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(mo20164f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f12056b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m17390e(aVar.f12056b));
        }
    }

    /* renamed from: c */
    public static int m17389c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) (activityManager.getMemoryClass() * RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE * RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
        if (m17390e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    public static boolean m17390e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int mo20161a() {
        return this.f12053d;
    }

    /* renamed from: b */
    public int mo20162b() {
        return this.f12050a;
    }

    /* renamed from: d */
    public int mo20163d() {
        return this.f12051b;
    }

    /* renamed from: f */
    public final String mo20164f(int i) {
        return Formatter.formatFileSize(this.f12052c, (long) i);
    }
}
