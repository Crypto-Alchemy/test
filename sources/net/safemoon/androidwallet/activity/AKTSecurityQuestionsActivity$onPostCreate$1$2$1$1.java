package net.safemoon.androidwallet.activity;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTSecurityQuestionsActivity.kt */
public final class AKTSecurityQuestionsActivity$onPostCreate$1$2$1$1 extends Lambda implements rc2<String, r37> {
    public final /* synthetic */ C6472s9 $this_apply;
    public final /* synthetic */ AKTSecurityQuestionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSecurityQuestionsActivity$onPostCreate$1$2$1$1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity, C6472s9 s9Var) {
        super(1);
        this.this$0 = aKTSecurityQuestionsActivity;
        this.$this_apply = s9Var;
    }

    /* renamed from: c */
    public static final void m65185c(C6472s9 s9Var) {
        vx2.m53591g(s9Var, "$this_apply");
        a77.m55429g(s9Var.f33773k);
    }

    /* renamed from: d */
    public static final void m65186d(C6472s9 s9Var) {
        vx2.m53591g(s9Var, "$this_apply");
        a77.m55429g(s9Var.f33772j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return r37.f33317a;
    }

    public final void invoke(String str) {
        vx2.m53591g(str, "it");
        if (vx2.m53586b(str, this.this$0.mo56744b1())) {
            this.this$0.f41349X = true;
            this.$this_apply.f33783u.setVisibility(8);
            this.$this_apply.f33773k.setVisibility(0);
            new Handler(Looper.getMainLooper()).postDelayed(new C8225h(this.$this_apply), 200);
        } else {
            this.this$0.f41349X = false;
            this.$this_apply.f33783u.setVisibility(0);
            this.$this_apply.f33773k.setVisibility(8);
            this.this$0.f41347Q.postValue(str);
            new Handler(Looper.getMainLooper()).postDelayed(new C8226i(this.$this_apply), 200);
        }
        this.this$0.mo56740X0();
    }
}
