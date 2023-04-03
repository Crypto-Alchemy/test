package p000;

import java.util.Locale;

/* renamed from: in6 */
/* compiled from: TextDirectionHeuristicsCompat */
public final class in6 {

    /* renamed from: a */
    public static final hn6 f13324a = new C2559e((C2557c) null, false);

    /* renamed from: b */
    public static final hn6 f13325b = new C2559e((C2557c) null, true);

    /* renamed from: c */
    public static final hn6 f13326c;

    /* renamed from: d */
    public static final hn6 f13327d;

    /* renamed from: e */
    public static final hn6 f13328e = new C2559e(C2555a.f13330b, false);

    /* renamed from: f */
    public static final hn6 f13329f = C2560f.f13335b;

    /* renamed from: in6$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static class C2555a implements C2557c {

        /* renamed from: b */
        public static final C2555a f13330b = new C2555a(true);

        /* renamed from: a */
        public final boolean f13331a;

        public C2555a(boolean z) {
            this.f13331a = z;
        }

        /* renamed from: a */
        public int mo21576a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = in6.m19719a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f13331a) {
                        return 1;
                    }
                } else if (this.f13331a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f13331a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: in6$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static class C2556b implements C2557c {

        /* renamed from: a */
        public static final C2556b f13332a = new C2556b();

        /* renamed from: a */
        public int mo21576a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = in6.m19720b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: in6$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    public interface C2557c {
        /* renamed from: a */
        int mo21576a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: in6$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static abstract class C2558d implements hn6 {

        /* renamed from: a */
        public final C2557c f13333a;

        public C2558d(C2557c cVar) {
            this.f13333a = cVar;
        }

        /* renamed from: a */
        public abstract boolean mo21577a();

        /* renamed from: b */
        public final boolean mo21578b(CharSequence charSequence, int i, int i2) {
            int a = this.f13333a.mo21576a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo21577a();
            }
            return false;
        }

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f13333a == null) {
                return mo21577a();
            } else {
                return mo21578b(charSequence, i, i2);
            }
        }
    }

    /* renamed from: in6$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static class C2559e extends C2558d {

        /* renamed from: b */
        public final boolean f13334b;

        public C2559e(C2557c cVar, boolean z) {
            super(cVar);
            this.f13334b = z;
        }

        /* renamed from: a */
        public boolean mo21577a() {
            return this.f13334b;
        }
    }

    /* renamed from: in6$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static class C2560f extends C2558d {

        /* renamed from: b */
        public static final C2560f f13335b = new C2560f();

        public C2560f() {
            super((C2557c) null);
        }

        /* renamed from: a */
        public boolean mo21577a() {
            if (jo6.m20327a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        C2556b bVar = C2556b.f13332a;
        f13326c = new C2559e(bVar, false);
        f13327d = new C2559e(bVar, true);
    }

    /* renamed from: a */
    public static int m19719a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m19720b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
