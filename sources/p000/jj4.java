package p000;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: jj4 */
/* compiled from: OverridingStrategy.kt */
public abstract class jj4 {
    /* renamed from: a */
    public abstract void mo50135a(CallableMemberDescriptor callableMemberDescriptor);

    /* renamed from: b */
    public abstract void mo52728b(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    /* renamed from: c */
    public abstract void mo52729c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    /* renamed from: d */
    public void mo50136d(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
        vx2.m53591g(callableMemberDescriptor, "member");
        vx2.m53591g(collection, "overridden");
        callableMemberDescriptor.mo50952x0(collection);
    }
}
