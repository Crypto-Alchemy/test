package net.safemoon.androidwallet.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0013J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/ClipRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "changed", "", "l", "t", "r", "b", "Lr37;", "onLayout", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ClipRecyclerView.kt */
public final class ClipRecyclerView extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipRecyclerView(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setPadding(0, 0, 0, ap3.m31899b(ol0.m70379u(this)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
    }
}
