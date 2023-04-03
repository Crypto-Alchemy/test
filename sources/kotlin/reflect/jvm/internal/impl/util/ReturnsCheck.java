package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p000.de0;

/* compiled from: modifierChecks.kt */
public abstract class ReturnsCheck implements de0 {

    /* renamed from: a */
    public final String f40314a;

    /* renamed from: b */
    public final rc2<C7389b, xc3> f40315b;

    /* renamed from: c */
    public final String f40316c;

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsBoolean extends ReturnsCheck {

        /* renamed from: d */
        public static final ReturnsBoolean f40317d = new ReturnsBoolean();

        public ReturnsBoolean() {
            super("Boolean", C77381.INSTANCE, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsInt extends ReturnsCheck {

        /* renamed from: d */
        public static final ReturnsInt f40318d = new ReturnsInt();

        public ReturnsInt() {
            super("Int", C77391.INSTANCE, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsUnit extends ReturnsCheck {

        /* renamed from: d */
        public static final ReturnsUnit f40319d = new ReturnsUnit();

        public ReturnsUnit() {
            super("Unit", C77401.INSTANCE, (DefaultConstructorMarker) null);
        }
    }

    public ReturnsCheck(String str, rc2<? super C7389b, ? extends xc3> rc2) {
        this.f40314a = str;
        this.f40315b = rc2;
        this.f40316c = "must return " + str;
    }

    public /* synthetic */ ReturnsCheck(String str, rc2 rc2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rc2);
    }

    /* renamed from: a */
    public String mo51175a(C7425c cVar) {
        return de0.C6971a.m56837a(this, cVar);
    }

    /* renamed from: b */
    public boolean mo51176b(C7425c cVar) {
        vx2.m53591g(cVar, "functionDescriptor");
        return vx2.m53586b(cVar.getReturnType(), this.f40315b.invoke(DescriptorUtilsKt.m62445f(cVar)));
    }

    public String getDescription() {
        return this.f40316c;
    }
}
