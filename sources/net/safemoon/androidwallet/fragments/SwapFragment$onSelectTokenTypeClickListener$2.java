package net.safemoon.androidwallet.fragments;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.domain.listener.dalog.OnSelectTokenTypeClickListener;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;
import p000.ft4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwapFragment$onSelectTokenTypeClickListener$2$a", "invoke", "()Lnet/safemoon/androidwallet/fragments/SwapFragment$onSelectTokenTypeClickListener$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onSelectTokenTypeClickListener$2 extends Lambda implements pc2<C8463a> {
    public final /* synthetic */ SwapFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwapFragment$onSelectTokenTypeClickListener$2$a", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "Lnet/safemoon/androidwallet/common/TokenType;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapFragment$onSelectTokenTypeClickListener$2$a */
    /* compiled from: SwapFragment.kt */
    public static final class C8463a extends OnSelectTokenTypeClickListener {

        /* renamed from: r */
        public final /* synthetic */ SwapFragment f42174r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8463a(SwapFragment swapFragment, C8464b bVar, WeakReference<Activity> weakReference, Map<String, ? extends TokenType> map) {
            super(bVar, weakReference, map);
            this.f42174r = swapFragment;
        }

        /* renamed from: c */
        public TokenType mo57366c() {
            return this.f42174r.mo57710e1();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwapFragment$onSelectTokenTypeClickListener$2$b", "Lft4$a;", "Lnet/safemoon/androidwallet/common/TokenType;", "token", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapFragment$onSelectTokenTypeClickListener$2$b */
    /* compiled from: SwapFragment.kt */
    public static final class C8464b implements ft4.C7102a {

        /* renamed from: a */
        public final /* synthetic */ SwapFragment f42175a;

        public C8464b(SwapFragment swapFragment) {
            this.f42175a = swapFragment;
        }

        /* renamed from: a */
        public void mo51798a(TokenType tokenType) {
            vx2.m53591g(tokenType, "token");
            try {
                this.f42175a.f42147P = true;
                a77.m55428f(this.f42175a.requireContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
            k04<SwapViewModel.C8788c> a0 = this.f42175a.mo57712g1().mo61600a0();
            SwapViewModel.C8788c value = a0.getValue();
            if (value != null) {
                value.mo61640b(tokenType);
            } else {
                value = null;
            }
            a0.setValue(value);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onSelectTokenTypeClickListener$2(SwapFragment swapFragment) {
        super(0);
        this.this$0 = swapFragment;
    }

    public final C8463a invoke() {
        return new C8463a(this.this$0, new C8464b(this.this$0), new WeakReference(this.this$0.requireActivity()), this.this$0.mo57711f1());
    }
}
