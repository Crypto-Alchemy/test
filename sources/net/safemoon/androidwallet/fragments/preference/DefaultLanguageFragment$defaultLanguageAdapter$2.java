package net.safemoon.androidwallet.fragments.preference;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.common.LanguageItem;
import net.safemoon.androidwallet.repository.FcmDataSource;
import net.safemoon.androidwallet.utils.Common;
import p000.xd3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/preference/DefaultLanguageFragment$defaultLanguageAdapter$2$a", "invoke", "()Lnet/safemoon/androidwallet/fragments/preference/DefaultLanguageFragment$defaultLanguageAdapter$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: DefaultLanguageFragment.kt */
public final class DefaultLanguageFragment$defaultLanguageAdapter$2 extends Lambda implements pc2<C8576a> {
    public final /* synthetic */ DefaultLanguageFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/preference/DefaultLanguageFragment$defaultLanguageAdapter$2$a", "Lxd3;", "", "e", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.preference.DefaultLanguageFragment$defaultLanguageAdapter$2$a */
    /* compiled from: DefaultLanguageFragment.kt */
    public static final class C8576a extends xd3 {

        /* renamed from: e */
        public final /* synthetic */ DefaultLanguageFragment f42407e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8576a(DefaultLanguageFragment defaultLanguageFragment, C85752 r2) {
            super(r2);
            this.f42407e = defaultLanguageFragment;
        }

        /* renamed from: e */
        public String mo58135e() {
            g06 g06 = g06.f37938a;
            Context requireContext = this.f42407e.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            return g06.mo51832a(requireContext);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultLanguageFragment$defaultLanguageAdapter$2(DefaultLanguageFragment defaultLanguageFragment) {
        super(0);
        this.this$0 = defaultLanguageFragment;
    }

    public final C8576a invoke() {
        final DefaultLanguageFragment defaultLanguageFragment = this.this$0;
        return new C8576a(this.this$0, new xd3.C9595a() {
            /* renamed from: a */
            public void mo58134a(LanguageItem languageItem) {
                vx2.m53591g(languageItem, "item");
                ProgressLoading w = defaultLanguageFragment.mo58125A();
                FragmentManager childFragmentManager = defaultLanguageFragment.getChildFragmentManager();
                vx2.m53590f(childFragmentManager, "childFragmentManager");
                w.mo57295D(childFragmentManager);
                FcmDataSource u = defaultLanguageFragment.mo58129y();
                Common common = Common.f42577a;
                Context requireContext = defaultLanguageFragment.requireContext();
                vx2.m53590f(requireContext, "requireContext()");
                FcmDataSource.m68151g(u, common.mo60902h(requireContext, languageItem.getLanguageCode()), (String) null, false, new DefaultLanguageFragment$defaultLanguageAdapter$2$2$onClick$1(defaultLanguageFragment, languageItem), 6, (Object) null);
            }
        });
    }
}
