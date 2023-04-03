package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: me6 */
/* compiled from: suspendFunctionTypes.kt */
public final class me6 {

    /* renamed from: a */
    public static final i04 f40904a;

    static {
        vo1 vo1 = new vo1(nr1.f43548a.mo62789i(), C7395c.f39105j);
        ClassKind classKind = ClassKind.INTERFACE;
        r24 g = C7395c.f39108m.mo66201g();
        a66 a66 = a66.f36360a;
        da6 da6 = LockBasedStorageManager.f40224e;
        i04 i04 = new i04(vo1, classKind, false, false, g, a66, da6);
        i04.mo52341G0(Modality.ABSTRACT);
        i04.mo52343I0(ed1.f37510e);
        i04.mo52342H0(bk0.m32598e(b17.m55708L0(i04, C6983dm.f37317b.mo51228b(), false, Variance.IN_VARIANCE, r24.m71445h("T"), 0, da6)));
        i04.mo52339E0();
        f40904a = i04;
    }

    /* renamed from: a */
    public static final d36 m64317a(xc3 xc3) {
        vx2.m53591g(xc3, "suspendFunType");
        ce2.m56411q(xc3);
        C7389b h = TypeUtilsKt.m62952h(xc3);
        C6983dm annotations = xc3.getAnnotations();
        xc3 j = ce2.m56404j(xc3);
        List<xc3> e = ce2.m56399e(xc3);
        List<f17> l = ce2.m56406l(xc3);
        ArrayList arrayList = new ArrayList(dk0.m43495u(l, 10));
        for (f17 type : l) {
            arrayList.add(type.getType());
        }
        rz6 h2 = rz6.f44504d.mo65783h();
        yz6 g = f40904a.mo50046g();
        vx2.m53590f(g, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        List v0 = CollectionsKt___CollectionsKt.m47351v0(arrayList, KotlinTypeFactory.m62853i(h2, g, bk0.m32598e(TypeUtilsKt.m62945a(ce2.m56405k(xc3))), false, (bd3) null, 16, (Object) null));
        d36 I = TypeUtilsKt.m62952h(xc3).mo53151I();
        vx2.m53590f(I, "suspendFunType.builtIns.nullableAnyType");
        return ce2.m56397c(h, annotations, j, e, v0, (List) null, I, false, 128, (Object) null).mo51121O0(xc3.mo51135I0());
    }
}
