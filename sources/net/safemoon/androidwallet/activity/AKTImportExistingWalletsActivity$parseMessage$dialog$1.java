package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTImportExistingWalletsActivity.kt */
public final class AKTImportExistingWalletsActivity$parseMessage$dialog$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ String $mnemonic;
    public final /* synthetic */ AKTImportExistingWalletsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTImportExistingWalletsActivity$parseMessage$dialog$1(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, String str) {
        super(0);
        this.this$0 = aKTImportExistingWalletsActivity;
        this.$mnemonic = str;
    }

    public final void invoke() {
        AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity = this.this$0;
        String str = this.$mnemonic;
        vx2.m53590f(str, "mnemonic");
        AKTImportExistingWalletsActivity.m64911a1(aKTImportExistingWalletsActivity, str, true, false, 4, (Object) null);
    }
}
