package p000;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: v62 */
/* compiled from: FocusStrategy */
public class v62 {

    /* renamed from: v62$a */
    /* compiled from: FocusStrategy */
    public interface C3463a<T> {
        /* renamed from: a */
        void mo24257a(T t, Rect rect);
    }

    /* renamed from: v62$b */
    /* compiled from: FocusStrategy */
    public interface C3464b<T, V> {
        /* renamed from: a */
        V mo24259a(T t, int i);

        /* renamed from: b */
        int mo24260b(T t);
    }

    /* renamed from: v62$c */
    /* compiled from: FocusStrategy */
    public static class C3465c<T> implements Comparator<T> {

        /* renamed from: a */
        public final Rect f18686a = new Rect();

        /* renamed from: d */
        public final Rect f18687d = new Rect();

        /* renamed from: e */
        public final boolean f18688e;

        /* renamed from: g */
        public final C3463a<T> f18689g;

        public C3465c(boolean z, C3463a<T> aVar) {
            this.f18688e = z;
            this.f18689g = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f18686a;
            Rect rect2 = this.f18687d;
            this.f18689g.mo24257a(t, rect);
            this.f18689g.mo24257a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.f18688e) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.f18688e) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f18688e) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f18688e) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: a */
    public static boolean m28649a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b = m28650b(i, rect, rect2);
        if (m28650b(i, rect, rect3) || !b) {
            return false;
        }
        if (!m28658j(i, rect, rect3) || i == 17 || i == 66) {
            return true;
        }
        if (m28659k(i, rect, rect2) < m28661m(i, rect, rect3)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m28650b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static <L, T> T m28651c(L l, C3464b<L, T> bVar, C3463a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int b = bVar.mo24260b(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < b; i2++) {
            T a = bVar.mo24259a(l, i2);
            if (a != t) {
                aVar.mo24257a(a, rect3);
                if (m28656h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m28652d(L l, C3464b<L, T> bVar, C3463a<T> aVar, T t, int i, boolean z, boolean z2) {
        int b = bVar.mo24260b(l);
        ArrayList arrayList = new ArrayList(b);
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(bVar.mo24259a(l, i2));
        }
        Collections.sort(arrayList, new C3465c(z, aVar));
        if (i == 1) {
            return m28654f(t, arrayList, z2);
        }
        if (i == 2) {
            return m28653e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    public static <T> T m28653e(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    public static <T> T m28654f(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    public static int m28655g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    public static boolean m28656h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m28657i(rect, rect2, i)) {
            return false;
        }
        if (!m28657i(rect, rect3, i) || m28649a(i, rect, rect2, rect3)) {
            return true;
        }
        if (!m28649a(i, rect, rect3, rect2) && m28655g(m28659k(i, rect, rect2), m28663o(i, rect, rect2)) < m28655g(m28659k(i, rect, rect3), m28663o(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m28657i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    public static boolean m28658j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if (rect.bottom <= rect2.top) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public static int m28659k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m28660l(i, rect, rect2));
    }

    /* renamed from: l */
    public static int m28660l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    public static int m28661m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m28662n(i, rect, rect2));
    }

    /* renamed from: n */
    public static int m28662n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    public static int m28663o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
