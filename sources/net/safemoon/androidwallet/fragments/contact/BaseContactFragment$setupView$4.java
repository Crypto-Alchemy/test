package net.safemoon.androidwallet.fragments.contact;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "isChecked", "Lr37;", "invoke", "(Z)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BaseContactFragment.kt */
public final class BaseContactFragment$setupView$4 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ BaseContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContactFragment$setupView$4(BaseContactFragment baseContactFragment) {
        super(1);
        this.this$0 = baseContactFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return r37.f33317a;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.this$0.mo58071L().mo61103m().postValue(Common.f42577a.mo60896a(true));
        } else {
            this.this$0.mo58071L().mo61103m().postValue(ck0.m33062j());
        }
    }
}
