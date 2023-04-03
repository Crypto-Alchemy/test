package p000;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\u0010"}, mo44877d2 = {"Lhg;", "Log;", "Landroid/content/Context;", "context", "Landroid/view/View;", "anchorView", "Lkotlin/Function1;", "", "Lr37;", "callBack", "j", "Lkotlin/Function0;", "onShowListener", "onDismissListener", "<init>", "(Lpc2;Lpc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hg */
/* compiled from: AnchorCollectionsOption.kt */
public final class C7182hg extends C9024og {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7182hg(pc2<r37> pc2, pc2<r37> pc22) {
        super(pc2, pc22);
        vx2.m53591g(pc2, "onShowListener");
        vx2.m53591g(pc22, "onDismissListener");
    }

    /* renamed from: k */
    public static final void m58549k(rc2 rc2, C7182hg hgVar, View view) {
        vx2.m53591g(rc2, "$callBack");
        vx2.m53591g(hgVar, "this$0");
        rc2.invoke(Integer.valueOf(view.getId()));
        hgVar.mo62905d();
    }

    /* renamed from: l */
    public static final void m58550l(rc2 rc2, C7182hg hgVar, View view) {
        vx2.m53591g(rc2, "$callBack");
        vx2.m53591g(hgVar, "this$0");
        rc2.invoke(Integer.valueOf(view.getId()));
        hgVar.mo62905d();
    }

    /* renamed from: j */
    public final C7182hg mo52199j(Context context, View view, rc2<? super Integer, r37> rc2) {
        vx2.m53591g(context, "context");
        vx2.m53591g(view, "anchorView");
        vx2.m53591g(rc2, "callBack");
        ue1 a = ue1.m52812a(mo62903b(context, -2, R.layout.dialog_anchor_collection_option));
        a.f34586b.setOnClickListener(new C7077fg(rc2, this));
        a.f34587c.setOnClickListener(new C7127gg(rc2, this));
        mo62907f(view);
        return this;
    }
}
