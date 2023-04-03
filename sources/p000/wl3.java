package p000;

import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: wl3 */
/* compiled from: LookupTracker.kt */
public interface wl3 {

    /* renamed from: wl3$a */
    /* compiled from: LookupTracker.kt */
    public static final class C9555a implements wl3 {

        /* renamed from: a */
        public static final C9555a f45737a = new C9555a();

        /* renamed from: a */
        public boolean mo66734a() {
            return false;
        }

        /* renamed from: b */
        public void mo66735b(String str, Position position, String str2, ScopeKind scopeKind, String str3) {
            vx2.m53591g(str, "filePath");
            vx2.m53591g(position, "position");
            vx2.m53591g(str2, "scopeFqName");
            vx2.m53591g(scopeKind, "scopeKind");
            vx2.m53591g(str3, PublicResolver.FUNC_NAME);
        }
    }

    /* renamed from: a */
    boolean mo66734a();

    /* renamed from: b */
    void mo66735b(String str, Position position, String str2, ScopeKind scopeKind, String str3);
}
