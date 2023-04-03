package androidx.compose.runtime;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.eo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000´\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001aG\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001ak\u0010\u000f\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u00052\u0012\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\f0\u000b2&\u0010\u000e\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\b\u0010\u0011\u001a\u00020\u0007H\u0007\u001a(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\u001a\b\u0010\u0019\u001a\u00020\u0017H\u0007\u001a\u0014\u0010\u001d\u001a\u00020\u0017*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u001aP\u0010$\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001fH\u0002\u001aa\u0010&\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u0001H\u0002¢\u0006\u0004\b&\u0010'\u001ac\u0010\u0000\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0000\u0010(\u001a[\u0010)\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!0 j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010!j\b\u0012\u0004\u0012\u00028\u0001`\"`#2\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001a\u0010.\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u0012H\u0002\u001a\u001a\u0010/\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u0012H\u0002\u001a,\u00103\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u00122\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010\u0003H\u0002\u001a$\u00106\u001a\u0004\u0018\u00010,*\b\u0012\u0004\u0012\u00020,0+2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u001f\u001a\u0004\u0018\u00010,*\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u0012H\u0002\u001a\"\u00107\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020,0+2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0002\u001a(\u00108\u001a\b\u0012\u0004\u0012\u00020,0+*\b\u0012\u0004\u0012\u00020,0+2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0002\u001a\f\u00109\u001a\u00020\u0012*\u00020\u0007H\u0002\u001a\f\u0010:\u001a\u00020\u0007*\u00020\u0012H\u0002\u001a\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>*\u00020;2\u0006\u0010=\u001a\u00020<H\u0002\u001a\u001c\u0010C\u001a\u00020\u0012*\u00020@2\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0002\u001a$\u0010G\u001a\u00020\u0012*\u00020@2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012H\u0002\u001a\u0010\u0010H\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0007H\u0000\u001a\u0010\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020\u0015H\u0000\"\u001e\u0010P\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\bD\u0010M\u0012\u0004\bN\u0010O\"4\u0010U\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170Qj\u0002`S8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010T\"4\u0010W\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170Qj\u0002`S8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010T\"4\u0010Y\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170Qj\u0002`S8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010T\"4\u0010[\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170Qj\u0002`S8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010T\"4\u0010]\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170Qj\u0002`S8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010T\" \u0010c\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\bb\u0010O\u001a\u0004\b`\u0010a\" \u0010g\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\bd\u0010_\u0012\u0004\bf\u0010O\u001a\u0004\be\u0010a\" \u0010k\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\bh\u0010_\u0012\u0004\bj\u0010O\u001a\u0004\bi\u0010a\" \u0010n\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\bl\u0010_\u0012\u0004\bm\u0010O\u001a\u0004\b\u001e\u0010a\" \u0010r\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\bo\u0010_\u0012\u0004\bq\u0010O\u001a\u0004\bp\u0010a\" \u0010v\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\bs\u0010_\u0012\u0004\bu\u0010O\u001a\u0004\bt\u0010a\"\u0018\u0010z\u001a\u00020\u0003*\u00020w8BX\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y*D\b\u0000\u0010{\"\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170Q2\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170Q*D\b\u0000\u0010|\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001¨\u0006}"}, mo44877d2 = {"T", "Leo4;", "Ldo0;", "", "Lr86;", "Landroidx/compose/runtime/CompositionLocalMap;", "key", "", "z", "M", "(Leo4;Ldo0;)Ljava/lang/Object;", "", "Ljy4;", "values", "parentScope", "y", "([Ljy4;Leo4;Lnn0;I)Leo4;", "O", "", "dirty1", "dirty2", "", "info", "Lr37;", "Z", "Y", "Lt46;", "Lmc5;", "rememberManager", "U", "K", "V", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "P", "value", "S", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lr37;", "R", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "", "Ldy2;", "location", "D", "C", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "N", "start", "end", "E", "W", "B", "u", "t", "Lq46;", "Lbg;", "anchor", "", "v", "Lp46;", "index", "root", "A", "a", "b", "common", "Q", "X", "message", "", "x", "Leo0;", "Leo0;", "getCompositionTracer$annotations", "()V", "compositionTracer", "Lkotlin/Function3;", "Ltp;", "Landroidx/compose/runtime/Change;", "Lid2;", "removeCurrentGroupInstance", "c", "skipToGroupEndInstance", "d", "endGroupInstance", "e", "startRootGroup", "f", "resetSlotsInstance", "g", "Ljava/lang/Object;", "G", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "h", "I", "getProvider$annotations", "provider", "i", "F", "getCompositionLocalMap$annotations", "compositionLocalMap", "j", "getProviderValues$annotations", "providerValues", "k", "J", "getProviderMaps$annotations", "providerMaps", "l", "L", "getReference$annotations", "reference", "Lpa3;", "H", "(Lpa3;)Ljava/lang/Object;", "joinedKey", "Change", "CompositionLocalMap", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class ComposerKt {

    /* renamed from: a */
    public static eo0 f1498a;

    /* renamed from: b */
    public static final id2<C3379tp<?>, t46, mc5, r37> f1499b = ComposerKt$removeCurrentGroupInstance$1.INSTANCE;

    /* renamed from: c */
    public static final id2<C3379tp<?>, t46, mc5, r37> f1500c = ComposerKt$skipToGroupEndInstance$1.INSTANCE;

    /* renamed from: d */
    public static final id2<C3379tp<?>, t46, mc5, r37> f1501d = ComposerKt$endGroupInstance$1.INSTANCE;

    /* renamed from: e */
    public static final id2<C3379tp<?>, t46, mc5, r37> f1502e = ComposerKt$startRootGroup$1.INSTANCE;

    /* renamed from: f */
    public static final id2<C3379tp<?>, t46, mc5, r37> f1503f = ComposerKt$resetSlotsInstance$1.INSTANCE;

    /* renamed from: g */
    public static final Object f1504g = new hi4("provider");

    /* renamed from: h */
    public static final Object f1505h = new hi4("provider");

    /* renamed from: i */
    public static final Object f1506i = new hi4("compositionLocalMap");

    /* renamed from: j */
    public static final Object f1507j = new hi4("providerValues");

    /* renamed from: k */
    public static final Object f1508k = new hi4("providers");

    /* renamed from: l */
    public static final Object f1509l = new hi4("reference");

    /* renamed from: A */
    public static final int m1983A(p46 p46, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = p46.mo24404L(i);
            i3++;
        }
        return i3;
    }

    /* renamed from: B */
    public static final List<dy2> m1984B(List<dy2> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int C = m1985C(list, i); C < list.size(); C++) {
            dy2 dy2 = list.get(C);
            if (dy2.mo19009b() >= i2) {
                break;
            }
            arrayList.add(dy2);
        }
        return arrayList;
    }

    /* renamed from: C */
    public static final int m1985C(List<dy2> list, int i) {
        int D = m1986D(list, i);
        if (D < 0) {
            return -(D + 1);
        }
        return D;
    }

    /* renamed from: D */
    public static final int m1986D(List<dy2> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = vx2.m53593i(list.get(i3).mo19009b(), i);
            if (i4 < 0) {
                i2 = i3 + 1;
            } else if (i4 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: E */
    public static final dy2 m1987E(List<dy2> list, int i, int i2) {
        int C = m1985C(list, i);
        if (C >= list.size()) {
            return null;
        }
        dy2 dy2 = list.get(C);
        if (dy2.mo19009b() < i2) {
            return dy2;
        }
        return null;
    }

    /* renamed from: F */
    public static final Object m1988F() {
        return f1506i;
    }

    /* renamed from: G */
    public static final Object m1989G() {
        return f1504g;
    }

    /* renamed from: H */
    public static final Object m1990H(pa3 pa3) {
        if (pa3.mo24511d() != null) {
            return new v33(Integer.valueOf(pa3.mo24508a()), pa3.mo24511d());
        }
        return Integer.valueOf(pa3.mo24508a());
    }

    /* renamed from: I */
    public static final Object m1991I() {
        return f1505h;
    }

    /* renamed from: J */
    public static final Object m1992J() {
        return f1508k;
    }

    /* renamed from: K */
    public static final Object m1993K() {
        return f1507j;
    }

    /* renamed from: L */
    public static final Object m1994L() {
        return f1509l;
    }

    /* renamed from: M */
    public static final <T> T m1995M(eo4<do0<Object>, ? extends r86<? extends Object>> eo4, do0<T> do0) {
        vx2.m53591g(eo4, "<this>");
        vx2.m53591g(do0, "key");
        r86 r86 = (r86) eo4.get(do0);
        if (r86 != null) {
            return r86.getValue();
        }
        return null;
    }

    /* renamed from: N */
    public static final void m1996N(List<dy2> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int D = m1986D(list, i);
        fq2 fq2 = null;
        if (D < 0) {
            int i2 = -(D + 1);
            if (obj != null) {
                fq2 = new fq2();
                fq2.add(obj);
            }
            list.add(i2, new dy2(recomposeScopeImpl, i, fq2));
        } else if (obj == null) {
            list.get(D).mo19012e((fq2<Object>) null);
        } else {
            fq2<Object> a = list.get(D).mo19008a();
            if (a != null) {
                a.add(obj);
            }
        }
    }

    /* renamed from: O */
    public static final boolean m1997O() {
        eo0 eo0 = f1498a;
        if (eo0 == null || !eo0.mo19430a()) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> m1998P() {
        return new HashMap<>();
    }

    /* renamed from: Q */
    public static final int m1999Q(p46 p46, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (p46.mo24404L(i) == i2) {
            return i2;
        }
        if (p46.mo24404L(i2) == i) {
            return i;
        }
        if (p46.mo24404L(i) == p46.mo24404L(i2)) {
            return p46.mo24404L(i);
        }
        int A = m1983A(p46, i, i3);
        int A2 = m1983A(p46, i2, i3);
        int i4 = A - A2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = p46.mo24404L(i);
        }
        int i6 = A2 - A;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = p46.mo24404L(i2);
        }
        while (i != i2) {
            i = p46.mo24404L(i);
            i2 = p46.mo24404L(i2);
        }
        return i;
    }

    /* renamed from: R */
    public static final <K, V> V m2000R(HashMap<K, LinkedHashSet<V>> hashMap, K k) {
        V a0;
        LinkedHashSet linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null || (a0 = CollectionsKt___CollectionsKt.m47330a0(linkedHashSet)) == null) {
            return null;
        }
        m2002T(hashMap, k, a0);
        return a0;
    }

    /* renamed from: S */
    public static final <K, V> boolean m2001S(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    /* renamed from: T */
    public static final <K, V> r37 m2002T(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k);
        }
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2003U(p000.t46 r4, p000.mc5 r5) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r4, r0)
            java.lang.String r0 = "rememberManager"
            p000.vx2.m53591g(r5, r0)
            java.util.Iterator r0 = r4.mo26120d0()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof p000.nc5
            if (r2 == 0) goto L_0x0022
            nc5 r1 = (p000.nc5) r1
            r5.mo11767b(r1)
            goto L_0x000e
        L_0x0022:
            boolean r2 = r1 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r2 == 0) goto L_0x000e
            androidx.compose.runtime.RecomposeScopeImpl r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1
            bo0 r2 = r1.mo3072l()
            if (r2 == 0) goto L_0x000e
            r3 = 1
            r2.mo11740E(r3)
            r1.mo3083w()
            goto L_0x000e
        L_0x0036:
            r4.mo26069D0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerKt.m2003U(t46, mc5):void");
    }

    /* renamed from: V */
    public static final dy2 m2004V(List<dy2> list, int i) {
        int D = m1986D(list, i);
        if (D >= 0) {
            return list.remove(D);
        }
        return null;
    }

    /* renamed from: W */
    public static final void m2005W(List<dy2> list, int i, int i2) {
        int C = m1985C(list, i);
        while (C < list.size() && list.get(C).mo19009b() < i2) {
            list.remove(C);
        }
    }

    /* renamed from: X */
    public static final void m2006X(boolean z) {
        if (!z) {
            m2032x("Check failed".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: Y */
    public static final void m2007Y() {
        eo0 eo0 = f1498a;
        if (eo0 != null) {
            eo0.mo19432c();
        }
    }

    /* renamed from: Z */
    public static final void m2008Z(int i, int i2, int i3, String str) {
        vx2.m53591g(str, "info");
        eo0 eo0 = f1498a;
        if (eo0 != null) {
            eo0.mo19431b(i, i2, i3, str);
        }
    }

    /* renamed from: t */
    public static final boolean m2028t(int i) {
        return i != 0;
    }

    /* renamed from: u */
    public static final int m2029u(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: v */
    public static final List<Object> m2030v(q46 q46, C1628bg bgVar) {
        ArrayList arrayList = new ArrayList();
        p46 D = q46.mo24926D();
        try {
            m2031w(D, arrayList, q46.mo24933j(bgVar));
            r37 r37 = r37.f33317a;
            return arrayList;
        } finally {
            D.mo24414d();
        }
    }

    /* renamed from: w */
    public static final void m2031w(p46 p46, List<Object> list, int i) {
        if (p46.mo24398F(i)) {
            list.add(p46.mo24400H(i));
            return;
        }
        int i2 = i + 1;
        int A = i + p46.mo24393A(i);
        while (i2 < A) {
            m2031w(p46, list, i2);
            i2 += p46.mo24393A(i2);
        }
    }

    /* renamed from: x */
    public static final Void m2032x(String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* renamed from: y */
    public static final eo4<do0<Object>, r86<Object>> m2033y(jy4<?>[] jy4Arr, eo4<do0<Object>, ? extends r86<? extends Object>> eo4, nn0 nn0, int i) {
        nn0.mo2953i(721128344);
        if (m1997O()) {
            m2008Z(721128344, i, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:307)");
        }
        eo4.C2242a builder = cy1.m14609a().builder();
        for (jy4<?> jy4 : jy4Arr) {
            nn0.mo2953i(680852989);
            if (jy4.mo22139a() || !m2034z(eo4, jy4.mo22140b())) {
                do0<?> b = jy4.mo22140b();
                vx2.m53589e(b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                builder.put(b, jy4.mo22140b().mo18866b(jy4.mo22141c(), nn0, 72));
            }
            nn0.mo2968o();
        }
        eo4<do0<Object>, r86<Object>> build = builder.build();
        if (m1997O()) {
            m2007Y();
        }
        nn0.mo2968o();
        return build;
    }

    /* renamed from: z */
    public static final <T> boolean m2034z(eo4<do0<Object>, ? extends r86<? extends Object>> eo4, do0<T> do0) {
        vx2.m53591g(eo4, "<this>");
        vx2.m53591g(do0, "key");
        return eo4.containsKey(do0);
    }
}
