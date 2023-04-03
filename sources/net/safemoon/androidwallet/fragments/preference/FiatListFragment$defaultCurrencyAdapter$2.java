package net.safemoon.androidwallet.fragments.preference;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import p000.tz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/preference/FiatListFragment$defaultCurrencyAdapter$2$a", "invoke", "()Lnet/safemoon/androidwallet/fragments/preference/FiatListFragment$defaultCurrencyAdapter$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: FiatListFragment.kt */
public final class FiatListFragment$defaultCurrencyAdapter$2 extends Lambda implements pc2<C8579a> {
    public final /* synthetic */ FiatListFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/preference/FiatListFragment$defaultCurrencyAdapter$2$a", "Ltz1;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.preference.FiatListFragment$defaultCurrencyAdapter$2$a */
    /* compiled from: FiatListFragment.kt */
    public static final class C8579a extends tz1 {
        public C8579a(C85782 r1) {
            super(r1);
        }

        /* renamed from: c */
        public Fiat mo57146c() {
            return rz1.f44501a.mo65771a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FiatListFragment$defaultCurrencyAdapter$2(FiatListFragment fiatListFragment) {
        super(0);
        this.this$0 = fiatListFragment;
    }

    public final C8579a invoke() {
        final FiatListFragment fiatListFragment = this.this$0;
        return new C8579a(new tz1.C9373a() {
            /* renamed from: a */
            public void mo57147a(Fiat fiat) {
                vx2.m53591g(fiat, "item");
                ProgressLoading v = fiatListFragment.mo58143z();
                FragmentManager childFragmentManager = fiatListFragment.getChildFragmentManager();
                vx2.m53590f(childFragmentManager, "childFragmentManager");
                v.mo57295D(childFragmentManager);
                fiatListFragment.mo58139B().mo61379n(fiat, true, new FiatListFragment$defaultCurrencyAdapter$2$2$onClick$1(fiatListFragment));
            }
        });
    }
}
