package net.safemoon.androidwallet.activity;

import android.content.Intent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lne0;", "invoke", "()Lne0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ChooseNetworkActivity.kt */
public final class ChooseNetworkActivity$chainNetworkAdapter$2 extends Lambda implements pc2<ne0> {
    public final /* synthetic */ ChooseNetworkActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChooseNetworkActivity$chainNetworkAdapter$2(ChooseNetworkActivity chooseNetworkActivity) {
        super(0);
        this.this$0 = chooseNetworkActivity;
    }

    public final ne0 invoke() {
        Serializable serializableExtra = this.this$0.getIntent().getSerializableExtra("ARG_SELECTED_TOKEN_NETWORK");
        vx2.m53589e(serializableExtra, "null cannot be cast to non-null type net.safemoon.androidwallet.common.TokenType");
        final ChooseNetworkActivity chooseNetworkActivity = this.this$0;
        return new ne0((TokenType) serializableExtra, new rc2<TokenType, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TokenType) obj);
                return r37.f33317a;
            }

            public final void invoke(TokenType tokenType) {
                vx2.m53591g(tokenType, "it");
                ChooseNetworkActivity chooseNetworkActivity = chooseNetworkActivity;
                Intent intent = new Intent();
                intent.putExtra("ARG_SELECTED_TOKEN_NETWORK", tokenType);
                r37 r37 = r37.f33317a;
                chooseNetworkActivity.setResult(-1, intent);
                chooseNetworkActivity.finish();
            }
        });
    }
}
