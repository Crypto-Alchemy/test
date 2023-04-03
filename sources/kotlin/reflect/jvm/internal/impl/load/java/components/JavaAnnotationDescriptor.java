package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: JavaAnnotationMapper.kt */
public class JavaAnnotationDescriptor implements C9460vl, ot4 {

    /* renamed from: f */
    public static final /* synthetic */ i93<Object>[] f39428f = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    public final u82 f39429a;

    /* renamed from: b */
    public final a66 f39430b;

    /* renamed from: c */
    public final q84 f39431c;

    /* renamed from: d */
    public final i03 f39432d;

    /* renamed from: e */
    public final boolean f39433e;

    public JavaAnnotationDescriptor(pf3 pf3, h03 h03, u82 u82) {
        a66 a66;
        i03 i03;
        Collection<i03> b;
        vx2.m53591g(pf3, "c");
        vx2.m53591g(u82, "fqName");
        this.f39429a = u82;
        if (h03 == null || (a66 = pf3.mo65296a().mo67017t().mo50460a(h03)) == null) {
            a66 = a66.f36360a;
            vx2.m53590f(a66, "NO_SOURCE");
        }
        this.f39430b = a66;
        this.f39431c = pf3.mo65300e().mo51164i(new JavaAnnotationDescriptor$type$2(pf3, this));
        if (h03 == null || (b = h03.mo52088b()) == null) {
            i03 = null;
        } else {
            i03 = (i03) CollectionsKt___CollectionsKt.m47330a0(b);
        }
        this.f39432d = i03;
        boolean z = true;
        this.f39433e = (h03 == null || !h03.mo52090j()) ? false : z;
    }

    /* renamed from: a */
    public final i03 mo53477a() {
        return this.f39432d;
    }

    /* renamed from: b */
    public d36 getType() {
        return (d36) ca6.m56364a(this.f39431c, this, f39428f[0]);
    }

    /* renamed from: e */
    public u82 mo53263e() {
        return this.f39429a;
    }

    /* renamed from: f */
    public Map<r24, fq0<?>> mo53264f() {
        return C6177b.m47361i();
    }

    public a66 getSource() {
        return this.f39430b;
    }

    /* renamed from: j */
    public boolean mo53479j() {
        return this.f39433e;
    }
}
