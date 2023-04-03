package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$33 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$33(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return r37.f33317a;
    }

    public final void invoke(Boolean bool) {
        vx2.m53590f(bool, "it");
        fe7 fe7 = null;
        if (!bool.booleanValue() || this.this$0.mo57712g1().mo61561G0().getValue() == null) {
            this.this$0.mo57718r1(false);
            fe7 w0 = this.this$0.f42160q1;
            if (w0 == null) {
                vx2.m53605u("bindingSource");
                w0 = null;
            }
            w0.f28844q.setVisibility(8);
            fe7 v0 = this.this$0.f42162r1;
            if (v0 == null) {
                vx2.m53605u("bindingDestination");
                v0 = null;
            }
            v0.f28844q.setVisibility(8);
            fe7 w02 = this.this$0.f42160q1;
            if (w02 == null) {
                vx2.m53605u("bindingSource");
                w02 = null;
            }
            w02.f28841n.setEnabled(true);
            fe7 w03 = this.this$0.f42160q1;
            if (w03 == null) {
                vx2.m53605u("bindingSource");
                w03 = null;
            }
            w03.f28840m.setEnabled(true);
            fe7 v02 = this.this$0.f42162r1;
            if (v02 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = v02;
            }
            fe7.f28841n.setEnabled(true);
            return;
        }
        SwapViewModel.C8786a value = this.this$0.mo57712g1().mo61561G0().getValue();
        vx2.m53588d(value);
        if (value.mo61635b()) {
            fe7 w04 = this.this$0.f42160q1;
            if (w04 == null) {
                vx2.m53605u("bindingSource");
                w04 = null;
            }
            w04.f28844q.setVisibility(8);
            fe7 v03 = this.this$0.f42162r1;
            if (v03 == null) {
                vx2.m53605u("bindingDestination");
                v03 = null;
            }
            v03.f28844q.setVisibility(0);
            fe7 w05 = this.this$0.f42160q1;
            if (w05 == null) {
                vx2.m53605u("bindingSource");
                w05 = null;
            }
            w05.f28841n.setEnabled(true);
            fe7 w06 = this.this$0.f42160q1;
            if (w06 == null) {
                vx2.m53605u("bindingSource");
                w06 = null;
            }
            w06.f28840m.setEnabled(true);
            fe7 v04 = this.this$0.f42162r1;
            if (v04 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = v04;
            }
            fe7.f28841n.setEnabled(false);
        } else {
            fe7 w07 = this.this$0.f42160q1;
            if (w07 == null) {
                vx2.m53605u("bindingSource");
                w07 = null;
            }
            w07.f28844q.setVisibility(0);
            fe7 v05 = this.this$0.f42162r1;
            if (v05 == null) {
                vx2.m53605u("bindingDestination");
                v05 = null;
            }
            v05.f28844q.setVisibility(8);
            fe7 w08 = this.this$0.f42160q1;
            if (w08 == null) {
                vx2.m53605u("bindingSource");
                w08 = null;
            }
            w08.f28841n.setEnabled(false);
            fe7 w09 = this.this$0.f42160q1;
            if (w09 == null) {
                vx2.m53605u("bindingSource");
                w09 = null;
            }
            w09.f28840m.setEnabled(false);
            fe7 v06 = this.this$0.f42162r1;
            if (v06 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = v06;
            }
            fe7.f28841n.setEnabled(true);
        }
        this.this$0.mo57718r1(true);
    }
}
