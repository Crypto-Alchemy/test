package net.safemoon.androidwallet.fragments;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.common.PaymentMethod;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lvc;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TokenListFragment.kt */
public final class TokenListFragment$loadTokens$1$1 extends Lambda implements rc2<List<? extends C9449vc>, r37> {
    public final /* synthetic */ ab2 $this_apply;
    public final /* synthetic */ TokenListFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TokenListFragment$loadTokens$1$1$a */
    /* compiled from: Comparisons.kt */
    public static final class C8488a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((C9449vc) t).mo66474f(), ((C9449vc) t2).mo66474f());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TokenListFragment$loadTokens$1$1$b */
    /* compiled from: Comparisons.kt */
    public static final class C8489b<T> implements Comparator {
        public final int compare(T t, T t2) {
            C9449vc vcVar = (C9449vc) t2;
            String g = vcVar.mo66475g();
            TokenType.C8246a aVar = TokenType.Companion;
            C9449vc vcVar2 = (C9449vc) t;
            return xl0.m54426a(Boolean.valueOf(vx2.m53586b(g, aVar.mo57099b(vcVar.mo66469b()).getNativeToken())), Boolean.valueOf(vx2.m53586b(vcVar2.mo66475g(), aVar.mo57099b(vcVar2.mo66469b()).getNativeToken())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenListFragment$loadTokens$1$1(ab2 ab2, TokenListFragment tokenListFragment) {
        super(1);
        this.$this_apply = ab2;
        this.this$0 = tokenListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<C9449vc>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<C9449vc> list) {
        new f14();
        RecyclerView recyclerView = this.$this_apply.f20880b;
        vx2.m53590f(list, "it");
        TokenListFragment tokenListFragment = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            boolean x = tokenListFragment.mo57856E();
            zo2 a = ap2.m55613a(((C9449vc) next).mo66476h());
            if (x ? a.mo67356d() : a.mo67357e()) {
                arrayList.add(next);
            }
        }
        List D0 = CollectionsKt___CollectionsKt.m47304D0(CollectionsKt___CollectionsKt.m47304D0(arrayList, new C8488a()), new C8489b());
        final TokenListFragment tokenListFragment2 = this.this$0;
        recyclerView.setAdapter(new lr6(D0, new rc2<C9449vc, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C9449vc) obj);
                return r37.f33317a;
            }

            public final void invoke(C9449vc vcVar) {
                vx2.m53591g(vcVar, "it");
                if (!vcVar.mo66478i()) {
                    tokenListFragment2.mo57853B().mo60967n(vcVar, true);
                }
                tokenListFragment2.mo57854C(PaymentMethod.MOONPAY, ap2.m55613a(vcVar.mo66476h()).mo67355c(), TokenType.Companion.mo57099b(vcVar.mo66469b()).getCoinType().getValue());
            }
        }));
    }
}
