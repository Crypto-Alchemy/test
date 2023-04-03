package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;

/* renamed from: eh0 */
/* compiled from: CloneableClassScope.kt */
public final class eh0 extends GivenFunctionsMemberScope {

    /* renamed from: e */
    public static final C7049a f37543e = new C7049a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final r24 f37544f;

    /* renamed from: eh0$a */
    /* compiled from: CloneableClassScope.kt */
    public static final class C7049a {
        public C7049a() {
        }

        public /* synthetic */ C7049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final r24 mo51468a() {
            return eh0.f37544f;
        }
    }

    static {
        r24 h = r24.m71445h("clone");
        vx2.m53590f(h, "identifier(\"clone\")");
        f37544f = h;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eh0(da6 da6, if0 if0) {
        super(da6, if0);
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(if0, "containingClass");
    }

    /* renamed from: i */
    public List<C7425c> mo51467i() {
        h26 f1 = h26.m58388f1(mo55093l(), C6983dm.f37317b.mo51228b(), f37544f, CallableMemberDescriptor.Kind.DECLARATION, a66.f36360a);
        f1.mo52098L0((h85) null, mo55093l().mo52460D0(), ck0.m33062j(), ck0.m33062j(), ck0.m33062j(), DescriptorUtilsKt.m62445f(mo55093l()).mo53169i(), Modality.OPEN, ed1.f37508c);
        return bk0.m32598e(f1);
    }
}
