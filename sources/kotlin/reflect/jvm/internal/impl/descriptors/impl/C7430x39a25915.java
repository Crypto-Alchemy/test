package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C7430x39a25915 extends Lambda implements pc2<rn0> {
    public final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7430x39a25915(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(0);
        this.this$0 = moduleDescriptorImpl;
    }

    public final rn0 invoke() {
        kx3 y0 = this.this$0.f39307x;
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        if (y0 != null) {
            List<ModuleDescriptorImpl> a = y0.mo55788a();
            this.this$0.mo53290I0();
            a.contains(this.this$0);
            for (ModuleDescriptorImpl H0 : a) {
                boolean unused = H0.mo53295N0();
            }
            ArrayList arrayList = new ArrayList(dk0.m43495u(a, 10));
            for (ModuleDescriptorImpl E0 : a) {
                hk4 E02 = E0.f39308y;
                vx2.m53588d(E02);
                arrayList.add(E02);
            }
            return new rn0(arrayList, "CompositeProvider@ModuleDescriptor for " + this.this$0.getName());
        }
        throw new AssertionError("Dependencies of module " + moduleDescriptorImpl.mo53291J0() + " were not set before querying module content");
    }
}
