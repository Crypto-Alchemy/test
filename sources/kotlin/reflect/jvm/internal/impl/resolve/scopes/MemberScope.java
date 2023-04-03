package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;

/* compiled from: MemberScope.kt */
public interface MemberScope extends we5 {

    /* renamed from: a */
    public static final Companion f40114a = Companion.f40115a;

    /* compiled from: MemberScope.kt */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f40115a = new Companion();

        /* renamed from: b */
        public static final rc2<r24, Boolean> f40116b = MemberScope$Companion$ALL_NAME_FILTER$1.INSTANCE;

        /* renamed from: a */
        public final rc2<r24, Boolean> mo55095a() {
            return f40116b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$a */
    /* compiled from: MemberScope.kt */
    public static final class C7667a extends qs3 {

        /* renamed from: b */
        public static final C7667a f40117b = new C7667a();

        /* renamed from: a */
        public Set<r24> mo50860a() {
            return ny5.m49095e();
        }

        /* renamed from: d */
        public Set<r24> mo50863d() {
            return ny5.m49095e();
        }

        /* renamed from: g */
        public Set<r24> mo50866g() {
            return ny5.m49095e();
        }
    }

    /* renamed from: a */
    Set<r24> mo50860a();

    /* renamed from: b */
    Collection<? extends fx4> mo50861b(r24 r24, ul3 ul3);

    /* renamed from: c */
    Collection<? extends C7428e> mo50862c(r24 r24, ul3 ul3);

    /* renamed from: d */
    Set<r24> mo50863d();

    /* renamed from: g */
    Set<r24> mo50866g();
}
