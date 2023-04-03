package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1330o;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B-\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lk26;", "Landroidx/recyclerview/widget/o;", "Lvc;", "Lm26;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "f", "holder", "position", "Lr37;", "c", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "d", "Ljava/lang/String;", "selectedTokenSymbolType", "Lkotlin/Function1;", "e", "Lrc2;", "onItemClick", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: k26 */
/* compiled from: SimpleITokenAdapter.kt */
public final class k26 extends C1330o<C9449vc, m26> {

    /* renamed from: a */
    public final Context f38845a;

    /* renamed from: d */
    public final String f38846d;

    /* renamed from: e */
    public final rc2<C9449vc, r37> f38847e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k26(Context context, String str, rc2<? super C9449vc, r37> rc2) {
        super(l26.f40565a);
        vx2.m53591g(context, "context");
        vx2.m53591g(rc2, "onItemClick");
        this.f38845a = context;
        this.f38846d = str;
        this.f38847e = rc2;
    }

    /* renamed from: d */
    public static final void m59662d(k26 k26, C9449vc vcVar, View view) {
        vx2.m53591g(k26, "this$0");
        rc2<C9449vc, r37> rc2 = k26.f38847e;
        vx2.m53590f(vcVar, "model");
        rc2.invoke(vcVar);
    }

    /* renamed from: e */
    public static final void m59663e(k26 k26, C9449vc vcVar, View view) {
        vx2.m53591g(k26, "this$0");
        rc2<C9449vc, r37> rc2 = k26.f38847e;
        vx2.m53590f(vcVar, "model");
        rc2.invoke(vcVar);
    }

    /* renamed from: c */
    public void onBindViewHolder(m26 m26, int i) {
        vx2.m53591g(m26, "holder");
        C9449vc vcVar = (C9449vc) getItem(i);
        vx2.m53590f(vcVar, "model");
        m26.mo56008a(vcVar);
        m26.mo56010c().setOnClickListener(new i26(this, vcVar));
        m26.mo56009b().setOnClickListener(new j26(this, vcVar));
    }

    /* renamed from: f */
    public m26 onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        ry2 c = ry2.m51434c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        vx2.m53590f(c, "inflate(\n               …      false\n            )");
        return new m26(c, this.f38845a, this.f38846d);
    }
}
