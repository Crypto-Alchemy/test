package net.safemoon.androidwallet.views.carousel;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ContactCarouselView.kt */
public final class ContactCarouselView$itemWidth$2 extends Lambda implements pc2<Integer> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactCarouselView$itemWidth$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final Integer invoke() {
        Context context = this.$context;
        vx2.m53589e(context, "null cannot be cast to non-null type android.app.Activity");
        return Integer.valueOf(ol0.m70321A((Activity) context) / 5);
    }
}
