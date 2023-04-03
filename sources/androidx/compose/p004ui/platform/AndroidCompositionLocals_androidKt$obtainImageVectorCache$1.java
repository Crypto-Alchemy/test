package androidx.compose.p004ui.platform;

import android.content.Context;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends Lambda implements rc2<xh1, wh1> {
    public final /* synthetic */ AndroidCompositionLocals_androidKt.C0414a $callbacks;
    public final /* synthetic */ Context $context;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$a", "Lwh1;", "Lr37;", "dispose", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$a */
    /* compiled from: Effects.kt */
    public static final class C0421a implements wh1 {

        /* renamed from: a */
        public final /* synthetic */ Context f1991a;

        /* renamed from: b */
        public final /* synthetic */ AndroidCompositionLocals_androidKt.C0414a f1992b;

        public C0421a(Context context, AndroidCompositionLocals_androidKt.C0414a aVar) {
            this.f1991a = context;
            this.f1992b = aVar;
        }

        public void dispose() {
            this.f1991a.getApplicationContext().unregisterComponentCallbacks(this.f1992b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(Context context, AndroidCompositionLocals_androidKt.C0414a aVar) {
        super(1);
        this.$context = context;
        this.$callbacks = aVar;
    }

    public final wh1 invoke(xh1 xh1) {
        vx2.m53591g(xh1, "$this$DisposableEffect");
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        return new C0421a(this.$context, this.$callbacks);
    }
}
