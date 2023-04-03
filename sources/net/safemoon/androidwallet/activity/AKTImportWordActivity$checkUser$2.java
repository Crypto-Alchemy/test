package net.safemoon.androidwallet.activity;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo44877d2 = {"", "address", "privateKey", "<anonymous parameter 2>", "", "isBlackList", "Lr37;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTImportWordActivity.kt */
public final class AKTImportWordActivity$checkUser$2 extends Lambda implements kd2<String, String, String, Boolean, r37> {
    public final /* synthetic */ String $aktMnemonic;
    public final /* synthetic */ AKTImportWordActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTImportWordActivity$checkUser$2(AKTImportWordActivity aKTImportWordActivity, String str) {
        super(4);
        this.this$0 = aKTImportWordActivity;
        this.$aktMnemonic = str;
    }

    /* renamed from: b */
    public static final void m65004b(DialogInterface dialogInterface) {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((String) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue());
        return r37.f33317a;
    }

    public final void invoke(String str, String str2, String str3, boolean z) {
        if (z) {
            if (this.this$0.f8528r != null) {
                this.this$0.f8528r.mo22266k();
            }
            fy0.m57956e(this.this$0, Integer.valueOf(R.string.warning_title), R.string.warning_black_list_address, true, new C8224g());
            return;
        }
        this.this$0.mo56690t0(str, str2, this.$aktMnemonic);
    }
}
