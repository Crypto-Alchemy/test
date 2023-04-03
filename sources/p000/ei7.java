package p000;

import android.view.View;
import net.safemoon.androidwallet.activity.WalletManageActivity;
import net.safemoon.androidwallet.common.TokenType;

/* renamed from: ei7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ei7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WalletManageActivity f37559a;

    /* renamed from: d */
    public final /* synthetic */ TokenType f37560d;

    public /* synthetic */ ei7(WalletManageActivity walletManageActivity, TokenType tokenType) {
        this.f37559a = walletManageActivity;
        this.f37560d = tokenType;
    }

    public final void onClick(View view) {
        WalletManageActivity.m65547F1(this.f37559a, this.f37560d, view);
    }
}
