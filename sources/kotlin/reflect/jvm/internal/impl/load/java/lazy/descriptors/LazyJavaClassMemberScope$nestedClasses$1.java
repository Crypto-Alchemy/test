package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.t03;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements rc2<r24, jf0> {

    /* renamed from: $c */
    public final /* synthetic */ pf3 f39509$c;
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, pf3 pf3) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
        this.f39509$c = pf3;
    }

    public final jf0 invoke(r24 r24) {
        r24 r242 = r24;
        vx2.m53591g(r242, PublicResolver.FUNC_NAME);
        if (!((Set) this.this$0.f39505r.invoke()).contains(r242)) {
            f13 f13 = (f13) ((Map) this.this$0.f39506s.invoke()).get(r242);
            if (f13 == null) {
                return null;
            }
            q84 i = this.f39509$c.mo65300e().mo51164i(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this.this$0));
            return yq1.m74586F0(this.f39509$c.mo65300e(), this.this$0.mo53531C(), r24, i, of3.m70255a(this.f39509$c, f13), this.f39509$c.mo65296a().mo67017t().mo50460a(f13));
        }
        t03 d = this.f39509$c.mo65296a().mo67001d();
        nf0 g = DescriptorUtilsKt.m62446g(this.this$0.mo53531C());
        vx2.m53588d(g);
        nf0 d2 = g.mo62675d(r242);
        vx2.m53590f(d2, "ownerDescriptor.classId!…createNestedClassId(name)");
        p03 c = d.mo65955c(new t03.C9320b(d2, (byte[]) null, this.this$0.f39502o, 2, (DefaultConstructorMarker) null));
        if (c == null) {
            return null;
        }
        pf3 pf3 = this.f39509$c;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(pf3, this.this$0.mo53531C(), c, (if0) null, 8, (DefaultConstructorMarker) null);
        pf3.mo65296a().mo67002e().mo66383a(lazyJavaClassDescriptor);
        return lazyJavaClassDescriptor;
    }
}
