package net.safemoon.androidwallet.fragments.contact;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "result", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BaseContactFragment.kt */
public final class BaseContactFragment$initSelectChainFragmentState$1 extends Lambda implements rc2<List<? extends TokenType>, r37> {
    public final /* synthetic */ BaseContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContactFragment$initSelectChainFragmentState$1(BaseContactFragment baseContactFragment) {
        super(1);
        this.this$0 = baseContactFragment;
    }

    /* renamed from: b */
    public static final void m67974b(List list, BaseContactFragment baseContactFragment) {
        List list2;
        vx2.m53591g(baseContactFragment, "this$0");
        if (list == null) {
            list2 = ck0.m33062j();
        } else {
            list2 = list;
        }
        if (list2.size() == Common.f42577a.mo60896a(true).size()) {
            baseContactFragment.mo58070K().f21183i.setChecked(true);
            baseContactFragment.mo58071L().mo61103m().postValue(list);
            return;
        }
        baseContactFragment.mo58070K().f21183i.setChecked(false);
        k04<List<TokenType>> m = baseContactFragment.mo58071L().mo61103m();
        if (list == null) {
            list = ck0.m33062j();
        }
        m.postValue(list);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends TokenType>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<? extends TokenType> list) {
        if (list != null) {
            new Handler(Looper.getMainLooper()).post(new C8564a(list, this.this$0));
        }
    }
}
