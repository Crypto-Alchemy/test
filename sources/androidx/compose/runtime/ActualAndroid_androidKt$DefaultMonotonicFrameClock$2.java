package androidx.compose.runtime;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lyx3;", "invoke", "()Lyx3;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ActualAndroid.android.kt */
public final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends Lambda implements pc2<yx3> {
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 INSTANCE = new ActualAndroid_androidKt$DefaultMonotonicFrameClock$2();

    public ActualAndroid_androidKt$DefaultMonotonicFrameClock$2() {
        super(0);
    }

    public final yx3 invoke() {
        if (Looper.getMainLooper() != null) {
            return DefaultChoreographerFrameClock.f1510a;
        }
        return SdkStubsFallbackFrameClock.f1564a;
    }
}
