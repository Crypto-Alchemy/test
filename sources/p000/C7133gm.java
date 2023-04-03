package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;

/* renamed from: gm */
/* compiled from: Annotations.kt */
public final class C7133gm {
    /* renamed from: a */
    public static final C6983dm m58141a(C6983dm dmVar, C6983dm dmVar2) {
        vx2.m53591g(dmVar, "first");
        vx2.m53591g(dmVar2, "second");
        if (dmVar.isEmpty()) {
            return dmVar2;
        }
        if (dmVar2.isEmpty()) {
            return dmVar;
        }
        return new CompositeAnnotations(dmVar, dmVar2);
    }
}
