package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p000.cd0;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class LazyPackageViewDescriptorImpl$memberScope$1 extends Lambda implements pc2<MemberScope> {
    public final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    public final MemberScope invoke() {
        if (this.this$0.isEmpty()) {
            return MemberScope.C7667a.f40117b;
        }
        List<fk4> c0 = this.this$0.mo53282c0();
        ArrayList arrayList = new ArrayList(dk0.m43495u(c0, 10));
        for (fk4 m : c0) {
            arrayList.add(m.mo51712m());
        }
        List v0 = CollectionsKt___CollectionsKt.m47351v0(arrayList, new kc6(this.this$0.getModule(), this.this$0.mo53283e()));
        cd0.C6935a aVar = cd0.f37102d;
        return aVar.mo50868a("package view scope for " + this.this$0.mo53283e() + " in " + this.this$0.getModule().getName(), v0);
    }
}
