package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Landroid/graphics/Typeface;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", mo48632f = "AndroidFontLoader.android.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2 */
/* compiled from: AndroidFontLoader.android.kt */
public final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements fd2<hu0, ns0<? super Typeface>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ lf5 $this_loadAsync;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader_androidKt$loadAsync$2(lf5 lf5, Context context, ns0<? super AndroidFontLoader_androidKt$loadAsync$2> ns0) {
        super(2, ns0);
        this.$this_loadAsync = lf5;
        this.$context = context;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.$this_loadAsync, this.$context, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super Typeface> ns0) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            return AndroidFontLoader_androidKt.m3251c(this.$this_loadAsync, this.$context);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
