package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: ni5 */
/* compiled from: RuntimeErrorReporter.kt */
public final class ni5 implements gr1 {

    /* renamed from: b */
    public static final ni5 f43483b = new ni5();

    /* renamed from: a */
    public void mo51978a(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + callableMemberDescriptor);
    }

    /* renamed from: b */
    public void mo51979b(if0 if0, List<String> list) {
        vx2.m53591g(if0, "descriptor");
        vx2.m53591g(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + if0.getName() + ", unresolved classes " + list);
    }
}
