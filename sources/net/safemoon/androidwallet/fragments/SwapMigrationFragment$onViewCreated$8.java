package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.Gas;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/Gas;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/common/Gas;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$8 extends Lambda implements rc2<Gas, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.fragments.SwapMigrationFragment$onViewCreated$8$a */
    /* compiled from: SwapMigrationFragment.kt */
    public /* synthetic */ class C8474a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42198a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                net.safemoon.androidwallet.model.common.Gas[] r0 = net.safemoon.androidwallet.model.common.Gas.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Standard     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Fast     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Lightning     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f42198a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwapMigrationFragment$onViewCreated$8.C8474a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$8(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Gas) obj);
        return r37.f33317a;
    }

    public final void invoke(Gas gas) {
        int i = gas == null ? -1 : C8474a.f42198a[gas.ordinal()];
        xa2 xa2 = null;
        if (i == 1) {
            xa2 h0 = this.this$0.f42181H;
            if (h0 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = h0;
            }
            xa2.f35576n.setText(this.this$0.getString(R.string.swap_speed_standard));
        } else if (i == 2) {
            xa2 h02 = this.this$0.f42181H;
            if (h02 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = h02;
            }
            xa2.f35576n.setText(this.this$0.getString(R.string.swap_speed_fast));
        } else if (i == 3) {
            xa2 h03 = this.this$0.f42181H;
            if (h03 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = h03;
            }
            xa2.f35576n.setText(this.this$0.getString(R.string.swap_speed_lightning));
        }
    }
}
