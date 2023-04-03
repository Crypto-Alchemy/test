package net.safemoon.androidwallet.views;

import android.view.LayoutInflater;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: MyTextInputLayout.kt */
public final class MyTextInputLayout$customEnd$2 extends Lambda implements pc2<View> {
    public final /* synthetic */ MyTextInputLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTextInputLayout$customEnd$2(MyTextInputLayout myTextInputLayout) {
        super(0);
        this.this$0 = myTextInputLayout;
    }

    public final View invoke() {
        return LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.view_til_end_layout, this.this$0, false);
    }
}
