package p000;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: d81 */
/* compiled from: DefaultExtractorsFactory */
public final class d81 implements ny1 {

    /* renamed from: n */
    public static final int[] f10535n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: o */
    public static final C2139a f10536o = new C2139a(new b81());

    /* renamed from: p */
    public static final C2139a f10537p = new C2139a(new c81());

    /* renamed from: b */
    public boolean f10538b;

    /* renamed from: c */
    public boolean f10539c;

    /* renamed from: d */
    public int f10540d;

    /* renamed from: e */
    public int f10541e;

    /* renamed from: f */
    public int f10542f;

    /* renamed from: g */
    public int f10543g;

    /* renamed from: h */
    public int f10544h;

    /* renamed from: i */
    public int f10545i;

    /* renamed from: j */
    public int f10546j;

    /* renamed from: k */
    public int f10547k = 1;

    /* renamed from: l */
    public int f10548l;

    /* renamed from: m */
    public int f10549m = 112800;

    /* renamed from: d81$a */
    /* compiled from: DefaultExtractorsFactory */
    public static final class C2139a {

        /* renamed from: a */
        public final C2140a f10550a;

        /* renamed from: b */
        public final AtomicBoolean f10551b = new AtomicBoolean(false);

        /* renamed from: c */
        public Constructor<? extends hy1> f10552c;

        /* renamed from: d81$a$a */
        /* compiled from: DefaultExtractorsFactory */
        public interface C2140a {
            /* renamed from: a */
            Constructor<? extends hy1> mo11433a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public C2139a(C2140a aVar) {
            this.f10550a = aVar;
        }

        /* renamed from: a */
        public hy1 mo18568a(Object... objArr) {
            Constructor<? extends hy1> b = mo18569b();
            if (b == null) {
                return null;
            }
            try {
                return (hy1) b.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        /* renamed from: b */
        public final Constructor<? extends hy1> mo18569b() {
            synchronized (this.f10551b) {
                if (this.f10551b.get()) {
                    Constructor<? extends hy1> constructor = this.f10552c;
                    return constructor;
                }
                try {
                    Constructor<? extends hy1> a = this.f10550a.mo11433a();
                    return a;
                } catch (ClassNotFoundException unused) {
                    this.f10551b.set(true);
                    return this.f10552c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }

    /* renamed from: f */
    public static Constructor<? extends hy1> m14835f() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(hy1.class).getConstructor(new Class[]{Integer.TYPE});
    }

    /* renamed from: g */
    public static Constructor<? extends hy1> m14836g() throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(hy1.class).getConstructor(new Class[0]);
    }

    /* renamed from: a */
    public synchronized hy1[] mo111a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f10535n;
        arrayList = new ArrayList(iArr.length);
        int b = d12.m14632b(map);
        if (b != -1) {
            mo18567e(b, arrayList);
        }
        int c = d12.m14633c(uri);
        if (!(c == -1 || c == b)) {
            mo18567e(c, arrayList);
        }
        for (int i : iArr) {
            if (!(i == b || i == c)) {
                mo18567e(i, arrayList);
            }
        }
        return (hy1[]) arrayList.toArray(new hy1[arrayList.size()]);
    }

    /* renamed from: b */
    public synchronized hy1[] mo112b() {
        return mo111a(Uri.EMPTY, new HashMap());
    }

    /* renamed from: e */
    public final void mo18567e(int i, List<hy1> list) {
        int i2 = 2;
        switch (i) {
            case 0:
                list.add(new C3042p7());
                return;
            case 1:
                list.add(new C3334t7());
                return;
            case 2:
                boolean z = this.f10540d | this.f10538b;
                if (!this.f10539c) {
                    i2 = 0;
                }
                list.add(new C2288fd(i2 | z ? 1 : 0));
                return;
            case 3:
                boolean z2 = this.f10541e | this.f10538b;
                if (!this.f10539c) {
                    i2 = 0;
                }
                list.add(new C3052pf(i2 | z2 ? 1 : 0));
                return;
            case 4:
                hy1 a = f10536o.mo18568a(Integer.valueOf(this.f10542f));
                if (a != null) {
                    list.add(a);
                    return;
                } else {
                    list.add(new s32(this.f10542f));
                    return;
                }
            case 5:
                list.add(new f62());
                return;
            case 6:
                list.add(new mp3(this.f10543g));
                return;
            case 7:
                boolean z3 = this.f10546j | this.f10538b;
                if (!this.f10539c) {
                    i2 = 0;
                }
                list.add(new dz3(i2 | z3 ? 1 : 0));
                return;
            case 8:
                list.add(new sb2(this.f10545i));
                list.add(new gz3(this.f10544h));
                return;
            case 9:
                list.add(new yf4());
                return;
            case 10:
                list.add(new ry4());
                return;
            case 11:
                list.add(new hy6(this.f10547k, this.f10548l, this.f10549m));
                return;
            case 12:
                list.add(new kj7());
                return;
            case 14:
                list.add(new w33());
                return;
            case 15:
                hy1 a2 = f10537p.mo18568a(new Object[0]);
                if (a2 != null) {
                    list.add(a2);
                    return;
                }
                return;
            case 16:
                list.add(new C1583aw());
                return;
            default:
                return;
        }
    }
}
