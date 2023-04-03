package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

/* renamed from: rz6 */
/* compiled from: TypeAttributes.kt */
public final class rz6 extends C7807ks<oz6<?>, oz6<?>> {

    /* renamed from: d */
    public static final C9292a f44504d = new C9292a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final rz6 f44505e = new rz6((List<? extends oz6<?>>) ck0.m33062j());

    /* renamed from: rz6$a */
    /* compiled from: TypeAttributes.kt */
    public static final class C9292a extends TypeRegistry<oz6<?>, oz6<?>> {
        public C9292a() {
        }

        public /* synthetic */ C9292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public <T extends oz6<?>> int mo55398b(ConcurrentHashMap<q83<? extends oz6<?>>, Integer> concurrentHashMap, q83<T> q83, rc2<? super q83<? extends oz6<?>>, Integer> rc2) {
            int intValue;
            vx2.m53591g(concurrentHashMap, "<this>");
            vx2.m53591g(q83, "kClass");
            vx2.m53591g(rc2, "compute");
            Integer num = concurrentHashMap.get(q83);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(q83);
                if (num2 == null) {
                    Integer invoke = rc2.invoke(q83);
                    concurrentHashMap.putIfAbsent(q83, Integer.valueOf(invoke.intValue()));
                    num2 = invoke;
                }
                vx2.m53590f(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                intValue = num2.intValue();
            }
            return intValue;
        }

        /* renamed from: g */
        public final rz6 mo65782g(List<? extends oz6<?>> list) {
            vx2.m53591g(list, "attributes");
            if (list.isEmpty()) {
                return mo65783h();
            }
            return new rz6(list, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public final rz6 mo65783h() {
            return rz6.f44505e;
        }
    }

    public rz6(List<? extends oz6<?>> list) {
        for (oz6 oz6 : list) {
            mo55773k(oz6.mo52237b(), oz6);
        }
    }

    public /* synthetic */ rz6(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends oz6<?>>) list);
    }

    /* renamed from: j */
    public TypeRegistry<oz6<?>, oz6<?>> mo65776j() {
        return f44504d;
    }

    /* renamed from: q */
    public final rz6 mo65777q(rz6 rz6) {
        oz6 oz6;
        vx2.m53591g(rz6, "other");
        if (isEmpty() && rz6.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f44504d.mo55401e()) {
            int intValue2 = intValue.intValue();
            oz6 oz62 = (oz6) mo55772e().get(intValue2);
            oz6 oz63 = (oz6) rz6.mo55772e().get(intValue2);
            if (oz62 != null) {
                oz6 = oz62.mo52236a(oz63);
            } else if (oz63 != null) {
                oz6 = oz63.mo52236a(oz62);
            } else {
                oz6 = null;
            }
            ak0.m55531a(arrayList, oz6);
        }
        return f44504d.mo65782g(arrayList);
    }

    /* renamed from: r */
    public final boolean mo65778r(oz6<?> oz6) {
        vx2.m53591g(oz6, "attribute");
        if (mo55772e().get(f44504d.mo55400d(oz6.mo52237b())) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final rz6 mo65779s(rz6 rz6) {
        oz6 oz6;
        vx2.m53591g(rz6, "other");
        if (isEmpty() && rz6.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f44504d.mo55401e()) {
            int intValue2 = intValue.intValue();
            oz6 oz62 = (oz6) mo55772e().get(intValue2);
            oz6 oz63 = (oz6) rz6.mo55772e().get(intValue2);
            if (oz62 != null) {
                oz6 = oz62.mo52238c(oz63);
            } else if (oz63 != null) {
                oz6 = oz63.mo52238c(oz62);
            } else {
                oz6 = null;
            }
            ak0.m55531a(arrayList, oz6);
        }
        return f44504d.mo65782g(arrayList);
    }

    /* renamed from: t */
    public final rz6 mo65780t(oz6<?> oz6) {
        vx2.m53591g(oz6, "attribute");
        if (mo65778r(oz6)) {
            return this;
        }
        if (isEmpty()) {
            return new rz6(oz6);
        }
        return f44504d.mo65782g(CollectionsKt___CollectionsKt.m47351v0(CollectionsKt___CollectionsKt.m47311K0(this), oz6));
    }

    /* renamed from: u */
    public final rz6 mo65781u(oz6<?> oz6) {
        vx2.m53591g(oz6, "attribute");
        if (isEmpty()) {
            return this;
        }
        C7913mq e = mo55772e();
        ArrayList arrayList = new ArrayList();
        for (Object next : e) {
            if (!vx2.m53586b((oz6) next, oz6)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == mo55772e().mo56310e()) {
            return this;
        }
        return f44504d.mo65782g(arrayList);
    }

    public rz6(oz6<?> oz6) {
        this((List<? extends oz6<?>>) bk0.m32598e(oz6));
    }
}
