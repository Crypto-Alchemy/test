package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: n84 */
/* compiled from: OverridingStrategy.kt */
public abstract class n84 extends jj4 {
    /* renamed from: b */
    public void mo52728b(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        vx2.m53591g(callableMemberDescriptor, "first");
        vx2.m53591g(callableMemberDescriptor2, "second");
        mo50137e(callableMemberDescriptor, callableMemberDescriptor2);
    }

    /* renamed from: c */
    public void mo52729c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        vx2.m53591g(callableMemberDescriptor, "fromSuper");
        vx2.m53591g(callableMemberDescriptor2, "fromCurrent");
        mo50137e(callableMemberDescriptor, callableMemberDescriptor2);
    }

    /* renamed from: e */
    public abstract void mo50137e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);
}
