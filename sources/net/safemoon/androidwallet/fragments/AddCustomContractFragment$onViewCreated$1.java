package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomContractFragment.kt */
public final class AddCustomContractFragment$onViewCreated$1 extends Lambda implements rc2<Integer, r37> {
    public final /* synthetic */ AddCustomContractFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCustomContractFragment$onViewCreated$1(AddCustomContractFragment addCustomContractFragment) {
        super(1);
        this.this$0 = addCustomContractFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return r37.f33317a;
    }

    public final void invoke(Integer num) {
        if (num != null) {
            this.this$0.mo57382E().mo61164w().postValue(TokenType.Companion.mo57099b(num.intValue()));
        }
    }
}
