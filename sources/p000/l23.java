package p000;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;

/* renamed from: l23 */
/* compiled from: JavaTypeResolver.kt */
public final class l23 {

    /* renamed from: a */
    public static final u82 f40563a = new u82("java.lang.Class");

    /* renamed from: b */
    public static final f17 m63662b(a17 a17, f23 f23) {
        vx2.m53591g(a17, "typeParameter");
        vx2.m53591g(f23, "attr");
        if (f23.mo51582e() == TypeUsage.SUPERTYPE) {
            return new h17(f86.m57642b(a17));
        }
        return new StarProjectionImpl(a17);
    }

    /* renamed from: c */
    public static final f23 m63663c(TypeUsage typeUsage, boolean z, a17 a17) {
        Set set;
        vx2.m53591g(typeUsage, "<this>");
        if (a17 != null) {
            set = my5.m48548d(a17);
        } else {
            set = null;
        }
        return new f23(typeUsage, (JavaTypeFlexibility) null, z, set, (d36) null, 18, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ f23 m63664d(TypeUsage typeUsage, boolean z, a17 a17, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            a17 = null;
        }
        return m63663c(typeUsage, z, a17);
    }
}
