package net.safemoon.androidwallet.views;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Ljh4;", "invoke", "()Ljh4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CustomKeyBoard.kt */
public final class CustomKeyBoard$onKeyboardVisibilityListener$2 extends Lambda implements pc2<jh4> {
    public final /* synthetic */ CustomKeyBoard this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomKeyBoard$onKeyboardVisibilityListener$2(CustomKeyBoard customKeyBoard) {
        super(0);
        this.this$0 = customKeyBoard;
    }

    public final jh4 invoke() {
        Context context = this.this$0.getContext();
        vx2.m53589e(context, "null cannot be cast to non-null type net.safemoon.androidwallet.interfaces.OnKeyboardVisibilityListener");
        return (jh4) context;
    }
}
