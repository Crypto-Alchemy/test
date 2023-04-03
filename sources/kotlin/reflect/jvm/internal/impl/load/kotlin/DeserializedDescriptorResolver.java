package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* compiled from: DeserializedDescriptorResolver.kt */
public final class DeserializedDescriptorResolver {

    /* renamed from: b */
    public static final C7511a f39604b = new C7511a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final Set<KotlinClassHeader.Kind> f39605c = my5.m48548d(KotlinClassHeader.Kind.CLASS);

    /* renamed from: d */
    public static final Set<KotlinClassHeader.Kind> f39606d = ny5.m49098h(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* renamed from: e */
    public static final c83 f39607e = new c83(1, 1, 2);

    /* renamed from: f */
    public static final c83 f39608f = new c83(1, 1, 11);

    /* renamed from: g */
    public static final c83 f39609g = new c83(1, 1, 13);

    /* renamed from: a */
    public id1 f39610a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$a */
    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class C7511a {
        public C7511a() {
        }

        public /* synthetic */ C7511a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final c83 mo53808a() {
            return DeserializedDescriptorResolver.f39609g;
        }
    }

    /* renamed from: b */
    public final MemberScope mo53796b(fk4 fk4, tc3 tc3) {
        String[] g;
        Pair<d83, ProtoBuf$Package> pair;
        vx2.m53591g(fk4, "descriptor");
        vx2.m53591g(tc3, "kotlinClass");
        String[] j = mo53804j(tc3, f39606d);
        if (j == null || (g = tc3.mo65261a().mo53826g()) == null) {
            return null;
        }
        try {
            pair = i83.m58875m(j, g);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + tc3.getLocation(), e);
        } catch (Throwable th) {
            if (mo53800f() || tc3.mo65261a().mo53823d().mo50845h()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        ProtoBuf$Package component2 = pair.component2();
        d83 component1 = pair.component1();
        g83 g83 = new g83(tc3, component2, component1, mo53799e(tc3), mo53802h(tc3), mo53797c(tc3));
        return new wd1(fk4, component2, component1, tc3.mo65261a().mo53823d(), g83, mo53798d(), "scope for " + g83 + " in " + fk4, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.INSTANCE);
    }

    /* renamed from: c */
    public final DeserializedContainerAbiStability mo53797c(tc3 tc3) {
        if (mo53798d().mo52440g().mo55886d()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        if (tc3.mo65261a().mo53829j()) {
            return DeserializedContainerAbiStability.FIR_UNSTABLE;
        }
        if (tc3.mo65261a().mo53830k()) {
            return DeserializedContainerAbiStability.IR_UNSTABLE;
        }
        return DeserializedContainerAbiStability.STABLE;
    }

    /* renamed from: d */
    public final id1 mo53798d() {
        id1 id1 = this.f39610a;
        if (id1 != null) {
            return id1;
        }
        vx2.m53605u("components");
        return null;
    }

    /* renamed from: e */
    public final lt2<c83> mo53799e(tc3 tc3) {
        if (mo53800f() || tc3.mo65261a().mo53823d().mo50845h()) {
            return null;
        }
        return new lt2<>(tc3.mo65261a().mo53823d(), c83.f37086i, tc3.getLocation(), tc3.mo65268i());
    }

    /* renamed from: f */
    public final boolean mo53800f() {
        return mo53798d().mo52440g().mo55887e();
    }

    /* renamed from: g */
    public final boolean mo53801g(tc3 tc3) {
        if (mo53798d().mo52440g().mo55884b() || !tc3.mo65261a().mo53828i() || !vx2.m53586b(tc3.mo65261a().mo53823d(), f39608f)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo53802h(tc3 tc3) {
        if ((!mo53798d().mo52440g().mo55888f() || (!tc3.mo65261a().mo53828i() && !vx2.m53586b(tc3.mo65261a().mo53823d(), f39607e))) && !mo53801g(tc3)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final gf0 mo53803i(tc3 tc3) {
        String[] g;
        Pair<d83, ProtoBuf$Class> pair;
        vx2.m53591g(tc3, "kotlinClass");
        String[] j = mo53804j(tc3, f39605c);
        if (j == null || (g = tc3.mo65261a().mo53826g()) == null) {
            return null;
        }
        try {
            pair = i83.m58872i(j, g);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + tc3.getLocation(), e);
        } catch (Throwable th) {
            if (mo53800f() || tc3.mo65261a().mo53823d().mo50845h()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new gf0(pair.component1(), pair.component2(), tc3.mo65261a().mo53823d(), new vc3(tc3, mo53799e(tc3), mo53802h(tc3), mo53797c(tc3)));
    }

    /* renamed from: j */
    public final String[] mo53804j(tc3 tc3, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader a = tc3.mo65261a();
        String[] a2 = a.mo53820a();
        if (a2 == null) {
            a2 = a.mo53821b();
        }
        if (a2 == null || !set.contains(a.mo53822c())) {
            return null;
        }
        return a2;
    }

    /* renamed from: k */
    public final if0 mo53805k(tc3 tc3) {
        vx2.m53591g(tc3, "kotlinClass");
        gf0 i = mo53803i(tc3);
        if (i == null) {
            return null;
        }
        return mo53798d().mo52439f().mo55116d(tc3.mo65268i(), i);
    }

    /* renamed from: l */
    public final void mo53806l(id1 id1) {
        vx2.m53591g(id1, "<set-?>");
        this.f39610a = id1;
    }

    /* renamed from: m */
    public final void mo53807m(jd1 jd1) {
        vx2.m53591g(jd1, "components");
        mo53806l(jd1.mo52664a());
    }
}
