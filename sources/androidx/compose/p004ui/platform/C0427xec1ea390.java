package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
public final class C0427xec1ea390 extends Lambda implements pc2<r37> {
    public final /* synthetic */ gl5 $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0427xec1ea390(boolean z, gl5 gl5, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = gl5;
        this.$key = str;
    }

    public final void invoke() {
        if (this.$registered) {
            this.$androidxRegistry.mo20650j(this.$key);
        }
    }
}
