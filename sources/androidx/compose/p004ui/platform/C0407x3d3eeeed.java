package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", mo48632f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", mo48633l = {1654, 1683}, mo48634m = "boundsUpdatesEventLoop")
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class C0407x3d3eeeed extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0407x3d3eeeed(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, ns0<? super C0407x3d3eeeed> ns0) {
        super(ns0);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3855x(this);
    }
}
