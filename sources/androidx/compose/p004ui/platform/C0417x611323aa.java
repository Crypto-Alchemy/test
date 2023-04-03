package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2 */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class C0417x611323aa extends Lambda implements rc2<xh1, wh1> {
    public final /* synthetic */ ai1 $saveableStateRegistry;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$a", "Lwh1;", "Lr37;", "dispose", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$a */
    /* compiled from: Effects.kt */
    public static final class C0418a implements wh1 {

        /* renamed from: a */
        public final /* synthetic */ ai1 f1990a;

        public C0418a(ai1 ai1) {
            this.f1990a = ai1;
        }

        public void dispose() {
            this.f1990a.mo311b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0417x611323aa(ai1 ai1) {
        super(1);
        this.$saveableStateRegistry = ai1;
    }

    public final wh1 invoke(xh1 xh1) {
        vx2.m53591g(xh1, "$this$DisposableEffect");
        return new C0418a(this.$saveableStateRegistry);
    }
}
