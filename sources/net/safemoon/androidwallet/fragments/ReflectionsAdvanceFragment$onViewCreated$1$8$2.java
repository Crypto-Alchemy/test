package net.safemoon.androidwallet.fragments;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/view/MotionEvent;", "it", "Lr37;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsAdvanceFragment.kt */
public final class ReflectionsAdvanceFragment$onViewCreated$1$8$2 extends Lambda implements rc2<MotionEvent, r37> {
    public final /* synthetic */ ReflectionsAdvanceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsAdvanceFragment$onViewCreated$1$8$2(ReflectionsAdvanceFragment reflectionsAdvanceFragment) {
        super(1);
        this.this$0 = reflectionsAdvanceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return r37.f33317a;
    }

    public final void invoke(MotionEvent motionEvent) {
        if (motionEvent != null) {
            ReflectionsAdvanceFragment reflectionsAdvanceFragment = this.this$0;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reflectionsAdvanceFragment.mo57585Z(false);
            } else if (actionMasked == 1) {
                reflectionsAdvanceFragment.mo57585Z(true);
            }
        }
    }
}
