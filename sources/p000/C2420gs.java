package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: gs */
/* compiled from: Atom */
public abstract class C2420gs {

    /* renamed from: a */
    public final int f12584a;

    /* renamed from: gs$a */
    /* compiled from: Atom */
    public static final class C2421a extends C2420gs {

        /* renamed from: b */
        public final long f12585b;

        /* renamed from: c */
        public final List<C2422b> f12586c = new ArrayList();

        /* renamed from: d */
        public final List<C2421a> f12587d = new ArrayList();

        public C2421a(int i, long j) {
            super(i);
            this.f12585b = j;
        }

        /* renamed from: d */
        public void mo20823d(C2421a aVar) {
            this.f12587d.add(aVar);
        }

        /* renamed from: e */
        public void mo20824e(C2422b bVar) {
            this.f12586c.add(bVar);
        }

        /* renamed from: f */
        public C2421a mo20825f(int i) {
            int size = this.f12587d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2421a aVar = this.f12587d.get(i2);
                if (aVar.f12584a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public C2422b mo20826g(int i) {
            int size = this.f12586c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2422b bVar = this.f12586c.get(i2);
                if (bVar.f12584a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C2420gs.m18382a(this.f12584a) + " leaves: " + Arrays.toString(this.f12586c.toArray()) + " containers: " + Arrays.toString(this.f12587d.toArray());
        }
    }

    /* renamed from: gs$b */
    /* compiled from: Atom */
    public static final class C2422b extends C2420gs {

        /* renamed from: b */
        public final gm4 f12588b;

        public C2422b(int i, gm4 gm4) {
            super(i);
            this.f12588b = gm4;
        }
    }

    public C2420gs(int i) {
        this.f12584a = i;
    }

    /* renamed from: a */
    public static String m18382a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m18383b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static int m18384c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m18382a(this.f12584a);
    }
}
