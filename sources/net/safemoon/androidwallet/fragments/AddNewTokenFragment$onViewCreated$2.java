package net.safemoon.androidwallet.fragments;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddNewTokenFragment.kt */
public final class AddNewTokenFragment$onViewCreated$2 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ AddNewTokenFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddNewTokenFragment$onViewCreated$2(AddNewTokenFragment addNewTokenFragment) {
        super(1);
        this.this$0 = addNewTokenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenType tokenType) {
        c92 C = this.this$0.f41875r;
        if (C == null) {
            vx2.m53605u("binding");
            C = null;
        }
        AppCompatImageView appCompatImageView = C.f21632e.f34317c;
        vx2.m53590f(appCompatImageView, "binding.toolbar.ivToolbarAction");
        int i = 0;
        if (!(tokenType != TokenType.MULTI_COIN)) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        this.this$0.mo57409P();
        AddNewTokensViewModel B = this.this$0.mo57405L();
        vx2.m53590f(tokenType, "it");
        B.mo60966m(tokenType);
        this.this$0.mo57412a0();
        this.this$0.mo57411V();
    }
}
