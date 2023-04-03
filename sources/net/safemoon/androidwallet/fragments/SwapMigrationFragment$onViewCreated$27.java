package net.safemoon.androidwallet.fragments;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$27 extends Lambda implements rc2<Integer, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$27(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return r37.f33317a;
    }

    public final void invoke(Integer num) {
        String obj;
        xa2 h0 = this.this$0.f42181H;
        xa2 xa2 = null;
        if (h0 == null) {
            vx2.m53605u("binding");
            h0 = null;
        }
        boolean z = true;
        h0.f35564b.setVisibility(ol0.m70370l0(num != null && num.intValue() == 1));
        if (num != null && num.intValue() == 1) {
            xa2 h02 = this.this$0.f42181H;
            if (h02 == null) {
                vx2.m53605u("binding");
                h02 = null;
            }
            h02.f35565c.setVisibility(8);
            xa2 h03 = this.this$0.f42181H;
            if (h03 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = h03;
            }
            xa2.f35566d.setVisibility(8);
        } else {
            fe7 j0 = this.this$0.f42184M;
            if (j0 == null) {
                vx2.m53605u("bindingSource");
                j0 = null;
            }
            Editable text = j0.f28840m.getText();
            String obj2 = (text == null || (obj = text.toString()) == null) ? null : StringsKt__StringsKt.m63090V0(obj).toString();
            if (!(obj2 == null || obj2.length() == 0)) {
                z = false;
            }
            if (z) {
                xa2 h04 = this.this$0.f42181H;
                if (h04 == null) {
                    vx2.m53605u("binding");
                    h04 = null;
                }
                h04.f35565c.setVisibility(0);
                xa2 h05 = this.this$0.f42181H;
                if (h05 == null) {
                    vx2.m53605u("binding");
                } else {
                    xa2 = h05;
                }
                xa2.f35566d.setVisibility(8);
            } else {
                xa2 h06 = this.this$0.f42181H;
                if (h06 == null) {
                    vx2.m53605u("binding");
                    h06 = null;
                }
                h06.f35565c.setVisibility(8);
                xa2 h07 = this.this$0.f42181H;
                if (h07 == null) {
                    vx2.m53605u("binding");
                } else {
                    xa2 = h07;
                }
                xa2.f35566d.setVisibility(0);
            }
        }
        if (num != null && num.intValue() == 0) {
            a77.m55425c();
        }
    }
}
