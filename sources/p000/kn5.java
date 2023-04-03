package p000;

import kotlin.Metadata;
import org.koin.core.logger.Level;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lkn5;", "Lad7;", "Lr37;", "onCleared", "Lorg/koin/core/scope/Scope;", "a", "Lorg/koin/core/scope/Scope;", "b", "()Lorg/koin/core/scope/Scope;", "c", "(Lorg/koin/core/scope/Scope;)V", "scope", "<init>", "()V", "koin-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: kn5 */
/* compiled from: ScopeHandlerViewModel.kt */
public final class kn5 extends ad7 {

    /* renamed from: a */
    public Scope f38929a;

    /* renamed from: b */
    public final Scope mo52961b() {
        return this.f38929a;
    }

    /* renamed from: c */
    public final void mo52962c(Scope scope) {
        this.f38929a = scope;
    }

    public void onCleared() {
        super.onCleared();
        Scope scope = this.f38929a;
        if (scope != null && scope.mo64998o()) {
            tk3 j = scope.mo64993j();
            String str = "Closing scope " + this.f38929a;
            Level level = Level.DEBUG;
            if (j.mo66081b(level)) {
                j.mo66080a(level, str);
            }
            scope.mo64985d();
        }
        this.f38929a = null;
    }
}
