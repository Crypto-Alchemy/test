package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$22 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$22(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return r37.f33317a;
    }

    public final void invoke(Boolean bool) {
        vx2.m53590f(bool, "it");
        fe7 fe7 = null;
        if (!bool.booleanValue() || this.this$0.mo57762F0().mo61464d0().getValue() == null) {
            this.this$0.mo57765Q0(false);
            fe7 j0 = this.this$0.f42184M;
            if (j0 == null) {
                vx2.m53605u("bindingSource");
                j0 = null;
            }
            j0.f28844q.setVisibility(8);
            fe7 i0 = this.this$0.f42185P;
            if (i0 == null) {
                vx2.m53605u("bindingDestination");
                i0 = null;
            }
            i0.f28844q.setVisibility(8);
            fe7 j02 = this.this$0.f42184M;
            if (j02 == null) {
                vx2.m53605u("bindingSource");
                j02 = null;
            }
            j02.f28841n.setEnabled(true);
            fe7 j03 = this.this$0.f42184M;
            if (j03 == null) {
                vx2.m53605u("bindingSource");
                j03 = null;
            }
            j03.f28840m.setEnabled(true);
            fe7 i02 = this.this$0.f42185P;
            if (i02 == null) {
                vx2.m53605u("bindingDestination");
                i02 = null;
            }
            i02.f28841n.setEnabled(true);
            fe7 i03 = this.this$0.f42185P;
            if (i03 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = i03;
            }
            fe7.f28840m.setEnabled(false);
            return;
        }
        SwapMigrationViewModel.C8738a value = this.this$0.mo57762F0().mo61464d0().getValue();
        vx2.m53588d(value);
        if (value.mo61485b()) {
            fe7 j04 = this.this$0.f42184M;
            if (j04 == null) {
                vx2.m53605u("bindingSource");
                j04 = null;
            }
            j04.f28844q.setVisibility(8);
            fe7 i04 = this.this$0.f42185P;
            if (i04 == null) {
                vx2.m53605u("bindingDestination");
                i04 = null;
            }
            i04.f28844q.setVisibility(0);
            fe7 j05 = this.this$0.f42184M;
            if (j05 == null) {
                vx2.m53605u("bindingSource");
                j05 = null;
            }
            j05.f28841n.setEnabled(true);
            fe7 j06 = this.this$0.f42184M;
            if (j06 == null) {
                vx2.m53605u("bindingSource");
                j06 = null;
            }
            j06.f28840m.setEnabled(true);
            fe7 i05 = this.this$0.f42185P;
            if (i05 == null) {
                vx2.m53605u("bindingDestination");
                i05 = null;
            }
            i05.f28841n.setEnabled(false);
            fe7 i06 = this.this$0.f42185P;
            if (i06 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = i06;
            }
            fe7.f28840m.setEnabled(false);
        } else {
            fe7 j07 = this.this$0.f42184M;
            if (j07 == null) {
                vx2.m53605u("bindingSource");
                j07 = null;
            }
            j07.f28844q.setVisibility(0);
            fe7 i07 = this.this$0.f42185P;
            if (i07 == null) {
                vx2.m53605u("bindingDestination");
                i07 = null;
            }
            i07.f28844q.setVisibility(8);
            fe7 j08 = this.this$0.f42184M;
            if (j08 == null) {
                vx2.m53605u("bindingSource");
                j08 = null;
            }
            j08.f28841n.setEnabled(false);
            fe7 j09 = this.this$0.f42184M;
            if (j09 == null) {
                vx2.m53605u("bindingSource");
                j09 = null;
            }
            j09.f28840m.setEnabled(false);
            fe7 i08 = this.this$0.f42185P;
            if (i08 == null) {
                vx2.m53605u("bindingDestination");
                i08 = null;
            }
            i08.f28841n.setEnabled(true);
            fe7 i09 = this.this$0.f42185P;
            if (i09 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = i09;
            }
            fe7.f28840m.setEnabled(false);
        }
        this.this$0.mo57765Q0(true);
    }
}
