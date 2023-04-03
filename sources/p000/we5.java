package p000;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: we5 */
/* compiled from: ResolutionScope.kt */
public interface we5 {

    /* renamed from: we5$a */
    /* compiled from: ResolutionScope.kt */
    public static final class C9516a {
        /* renamed from: a */
        public static /* synthetic */ Collection m73584a(we5 we5, yc1 yc1, rc2<r24, Boolean> rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    yc1 = yc1.f46177o;
                }
                if ((i & 2) != 0) {
                    rc2 = MemberScope.f40114a.mo55095a();
                }
                return we5.mo50865f(yc1, rc2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    /* renamed from: e */
    eg0 mo50864e(r24 r24, ul3 ul3);

    /* renamed from: f */
    Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2);
}
