package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0019\u0010 \"\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(`)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*RW\u00101\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-0'j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-`)8FX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005028F¢\u0006\u0006\u001a\u0004\b.\u0010\u001c¨\u00066"}, mo44877d2 = {"Landroidx/compose/runtime/Pending;", "", "", "key", "dataKey", "Lpa3;", "d", "keyInfo", "", "h", "from", "to", "Lr37;", "k", "count", "j", "insertIndex", "i", "group", "newCount", "n", "m", "g", "o", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "keyInfos", "I", "e", "()I", "startIndex", "c", "l", "(I)V", "groupIndex", "usedKeys", "Ljava/util/HashMap;", "Lsj2;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "groupInfos", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "Lef3;", "()Ljava/util/HashMap;", "keyMap", "", "used", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class Pending {

    /* renamed from: a */
    public final List<pa3> f1522a;

    /* renamed from: b */
    public final int f1523b;

    /* renamed from: c */
    public int f1524c;

    /* renamed from: d */
    public final List<pa3> f1525d;

    /* renamed from: e */
    public final HashMap<Integer, sj2> f1526e;

    /* renamed from: f */
    public final ef3 f1527f;

    public Pending(List<pa3> list, int i) {
        boolean z;
        vx2.m53591g(list, "keyInfos");
        this.f1522a = list;
        this.f1523b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1525d = new ArrayList();
            HashMap<Integer, sj2> hashMap = new HashMap<>();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                pa3 pa3 = this.f1522a.get(i3);
                hashMap.put(Integer.valueOf(pa3.mo24509b()), new sj2(i3, i2, pa3.mo24510c()));
                i2 += pa3.mo24510c();
            }
            this.f1526e = hashMap;
            this.f1527f = C6169a.m47232a(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    /* renamed from: a */
    public final int mo3044a() {
        return this.f1524c;
    }

    /* renamed from: b */
    public final List<pa3> mo3045b() {
        return this.f1522a;
    }

    /* renamed from: c */
    public final HashMap<Object, LinkedHashSet<pa3>> mo3046c() {
        return (HashMap) this.f1527f.getValue();
    }

    /* renamed from: d */
    public final pa3 mo3047d(int i, Object obj) {
        Object obj2;
        if (obj != null) {
            obj2 = new v33(Integer.valueOf(i), obj);
        } else {
            obj2 = Integer.valueOf(i);
        }
        return (pa3) ComposerKt.m2000R(mo3046c(), obj2);
    }

    /* renamed from: e */
    public final int mo3048e() {
        return this.f1523b;
    }

    /* renamed from: f */
    public final List<pa3> mo3049f() {
        return this.f1525d;
    }

    /* renamed from: g */
    public final int mo3050g(pa3 pa3) {
        vx2.m53591g(pa3, "keyInfo");
        sj2 sj2 = this.f1526e.get(Integer.valueOf(pa3.mo24509b()));
        if (sj2 != null) {
            return sj2.mo25785b();
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean mo3051h(pa3 pa3) {
        vx2.m53591g(pa3, "keyInfo");
        return this.f1525d.add(pa3);
    }

    /* renamed from: i */
    public final void mo3052i(pa3 pa3, int i) {
        vx2.m53591g(pa3, "keyInfo");
        this.f1526e.put(Integer.valueOf(pa3.mo24509b()), new sj2(-1, i, 0));
    }

    /* renamed from: j */
    public final void mo3053j(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i > i2) {
            Collection<sj2> values = this.f1526e.values();
            vx2.m53590f(values, "groupInfos.values");
            for (sj2 sj2 : values) {
                int b = sj2.mo25785b();
                if (i > b || b >= i + i3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    sj2.mo25788e((b - i) + i2);
                } else {
                    if (i2 > b || b >= i) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        sj2.mo25788e(b + i3);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<sj2> values2 = this.f1526e.values();
            vx2.m53590f(values2, "groupInfos.values");
            for (sj2 sj22 : values2) {
                int b2 = sj22.mo25785b();
                if (i > b2 || b2 >= i + i3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    sj22.mo25788e((b2 - i) + i2);
                } else {
                    if (i + 1 > b2 || b2 >= i2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        sj22.mo25788e(b2 - i3);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo3054k(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > i2) {
            Collection<sj2> values = this.f1526e.values();
            vx2.m53590f(values, "groupInfos.values");
            for (sj2 sj2 : values) {
                int c = sj2.mo25786c();
                if (c == i) {
                    sj2.mo25789f(i2);
                } else {
                    if (i2 > c || c >= i) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        sj2.mo25789f(c + 1);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<sj2> values2 = this.f1526e.values();
            vx2.m53590f(values2, "groupInfos.values");
            for (sj2 sj22 : values2) {
                int c2 = sj22.mo25786c();
                if (c2 == i) {
                    sj22.mo25789f(i2);
                } else {
                    if (i + 1 > c2 || c2 >= i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        sj22.mo25789f(c2 - 1);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo3055l(int i) {
        this.f1524c = i;
    }

    /* renamed from: m */
    public final int mo3056m(pa3 pa3) {
        vx2.m53591g(pa3, "keyInfo");
        sj2 sj2 = this.f1526e.get(Integer.valueOf(pa3.mo24509b()));
        if (sj2 != null) {
            return sj2.mo25786c();
        }
        return -1;
    }

    /* renamed from: n */
    public final boolean mo3057n(int i, int i2) {
        int b;
        sj2 sj2 = this.f1526e.get(Integer.valueOf(i));
        if (sj2 == null) {
            return false;
        }
        int b2 = sj2.mo25785b();
        int a = i2 - sj2.mo25784a();
        sj2.mo25787d(i2);
        if (a == 0) {
            return true;
        }
        Collection<sj2> values = this.f1526e.values();
        vx2.m53590f(values, "groupInfos.values");
        for (sj2 sj22 : values) {
            if (sj22.mo25785b() >= b2 && !vx2.m53586b(sj22, sj2) && (b = sj22.mo25785b() + a) >= 0) {
                sj22.mo25788e(b);
            }
        }
        return true;
    }

    /* renamed from: o */
    public final int mo3058o(pa3 pa3) {
        vx2.m53591g(pa3, "keyInfo");
        sj2 sj2 = this.f1526e.get(Integer.valueOf(pa3.mo24509b()));
        if (sj2 != null) {
            return sj2.mo25784a();
        }
        return pa3.mo24510c();
    }
}
