package p000;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: v36 */
/* compiled from: SizeConfigStrategy */
public class v36 implements gm3 {

    /* renamed from: d */
    public static final Bitmap.Config[] f18651d;

    /* renamed from: e */
    public static final Bitmap.Config[] f18652e;

    /* renamed from: f */
    public static final Bitmap.Config[] f18653f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    public static final Bitmap.Config[] f18654g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    public static final Bitmap.Config[] f18655h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C3456c f18656a = new C3456c();

    /* renamed from: b */
    public final uj2<C3455b, Bitmap> f18657b = new uj2<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f18658c = new HashMap();

    /* renamed from: v36$a */
    /* compiled from: SizeConfigStrategy */
    public static /* synthetic */ class C3454a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18659a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18659a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18659a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18659a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18659a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v36.C3454a.<clinit>():void");
        }
    }

    /* renamed from: v36$b */
    /* compiled from: SizeConfigStrategy */
    public static final class C3455b implements os4 {

        /* renamed from: a */
        public final C3456c f18660a;

        /* renamed from: b */
        public int f18661b;

        /* renamed from: c */
        public Bitmap.Config f18662c;

        public C3455b(C3456c cVar) {
            this.f18660a = cVar;
        }

        /* renamed from: a */
        public void mo24101a() {
            this.f18660a.mo26940c(this);
        }

        /* renamed from: b */
        public void mo27046b(int i, Bitmap.Config config) {
            this.f18661b = i;
            this.f18662c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3455b)) {
                return false;
            }
            C3455b bVar = (C3455b) obj;
            if (this.f18661b != bVar.f18661b || !p67.m24676d(this.f18662c, bVar.f18662c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f18661b * 31;
            Bitmap.Config config = this.f18662c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return v36.m28597h(this.f18661b, this.f18662c);
        }
    }

    /* renamed from: v36$c */
    /* compiled from: SizeConfigStrategy */
    public static class C3456c extends C3440uy<C3455b> {
        /* renamed from: d */
        public C3455b mo26938a() {
            return new C3455b(this);
        }

        /* renamed from: e */
        public C3455b mo27051e(int i, Bitmap.Config config) {
            C3455b bVar = (C3455b) mo26939b();
            bVar.mo27046b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f18651d = configArr;
        f18652e = configArr;
    }

    /* renamed from: h */
    public static String m28597h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: i */
    public static Bitmap.Config[] m28598i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f18652e;
        }
        int i = C3454a.f18659a[config.ordinal()];
        if (i == 1) {
            return f18651d;
        }
        if (i == 2) {
            return f18653f;
        }
        if (i == 3) {
            return f18654g;
        }
        if (i == 4) {
            return f18655h;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: a */
    public String mo20653a(Bitmap bitmap) {
        return m28597h(p67.m24680h(bitmap), bitmap.getConfig());
    }

    /* renamed from: b */
    public String mo20654b(int i, int i2, Bitmap.Config config) {
        return m28597h(p67.m24679g(i, i2, config), config);
    }

    /* renamed from: c */
    public void mo20655c(Bitmap bitmap) {
        C3455b e = this.f18656a.mo27051e(p67.m24680h(bitmap), bitmap.getConfig());
        this.f18657b.mo26799d(e, bitmap);
        NavigableMap<Integer, Integer> j = mo27044j(bitmap.getConfig());
        Integer num = j.get(Integer.valueOf(e.f18661b));
        Integer valueOf = Integer.valueOf(e.f18661b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        j.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: d */
    public Bitmap mo20656d(int i, int i2, Bitmap.Config config) {
        C3455b g = mo27043g(p67.m24679g(i, i2, config), config);
        Bitmap a = this.f18657b.mo26796a(g);
        if (a != null) {
            mo27042f(Integer.valueOf(g.f18661b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: e */
    public int mo20657e(Bitmap bitmap) {
        return p67.m24680h(bitmap);
    }

    /* renamed from: f */
    public final void mo27042f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j = mo27044j(bitmap.getConfig());
        Integer num2 = j.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo20653a(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j.remove(num);
        } else {
            j.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: g */
    public final C3455b mo27043g(int i, Bitmap.Config config) {
        C3455b e = this.f18656a.mo27051e(i, config);
        Bitmap.Config[] i2 = m28598i(config);
        int length = i2.length;
        int i3 = 0;
        while (i3 < length) {
            Bitmap.Config config2 = i2[i3];
            Integer ceilingKey = mo27044j(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i3++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f18656a.mo26940c(e);
                return this.f18656a.mo27051e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: j */
    public final NavigableMap<Integer, Integer> mo27044j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f18658c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f18658c.put(config, treeMap);
        return treeMap;
    }

    public Bitmap removeLast() {
        Bitmap f = this.f18657b.mo26800f();
        if (f != null) {
            mo27042f(Integer.valueOf(p67.m24680h(f)), f);
        }
        return f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f18657b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f18658c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f18658c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
