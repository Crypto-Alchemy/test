package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lr86;", "it", "Lr37;", "invoke", "(Lr86;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateEnterObserver$1 */
/* compiled from: SnapshotStateObserver.kt */
public final class C0350x6befda94 extends Lambda implements rc2<r86<?>, r37> {
    public final /* synthetic */ SnapshotStateObserver.ObservedScopeMap this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0350x6befda94(SnapshotStateObserver.ObservedScopeMap observedScopeMap) {
        super(1);
        this.this$0 = observedScopeMap;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((r86<?>) (r86) obj);
        return r37.f33317a;
    }

    public final void invoke(r86<?> r86) {
        vx2.m53591g(r86, "it");
        SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
        observedScopeMap.f1608j = observedScopeMap.f1608j + 1;
    }
}
