package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "question", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTSecurityQuestionsActivity.kt */
public final class AKTSecurityQuestionsActivity$onPostCreate$1$1 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ C6472s9 $this_apply;
    public final /* synthetic */ AKTSecurityQuestionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSecurityQuestionsActivity$onPostCreate$1$1(C6472s9 s9Var, AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
        super(1);
        this.$this_apply = s9Var;
        this.this$0 = aKTSecurityQuestionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        vx2.m53590f(str, "question");
        String[] strArr = (String[]) StringsKt__StringsKt.m63061B0(str, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (strArr.length > 1) {
            this.$this_apply.f33783u.setText(strArr[1]);
        }
        this.this$0.mo56737D1();
    }
}
