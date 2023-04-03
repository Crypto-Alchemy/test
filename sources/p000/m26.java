package p000;

import android.content.Context;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\f\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lm26;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lvc;", "model", "Lr37;", "a", "Lry2;", "Lry2;", "getBinding", "()Lry2;", "binding", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "c", "Ljava/lang/String;", "selectedTokenSymbolType", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "Landroidx/constraintlayout/widget/ConstraintLayout;", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "e", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "()Lcom/google/android/material/checkbox/MaterialCheckBox;", "cbAddToken", "<init>", "(Lry2;Landroid/content/Context;Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: m26 */
/* compiled from: SimpleITokenAdapter.kt */
public final class m26 extends RecyclerView.C1231a0 {

    /* renamed from: a */
    public final ry2 f40739a;

    /* renamed from: b */
    public final Context f40740b;

    /* renamed from: c */
    public final String f40741c;

    /* renamed from: d */
    public final ConstraintLayout f40742d;

    /* renamed from: e */
    public final MaterialCheckBox f40743e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m26(ry2 ry2, Context context, String str) {
        super(ry2.mo47565b());
        vx2.m53591g(ry2, "binding");
        vx2.m53591g(context, "context");
        this.f40739a = ry2;
        this.f40740b = context;
        this.f40741c = str;
        ConstraintLayout b = ry2.mo47565b();
        vx2.m53590f(b, "binding.root");
        this.f40742d = b;
        MaterialCheckBox materialCheckBox = ry2.f33666c;
        vx2.m53590f(materialCheckBox, "binding.cbAddToken");
        this.f40743e = materialCheckBox;
        MaterialCardView materialCardView = ry2.f33668e;
        vx2.m53590f(materialCardView, "rowBG");
        materialCardView.setVisibility(8);
        MaterialCardView materialCardView2 = ry2.f33669f;
        vx2.m53590f(materialCardView2, "rowFG");
        materialCardView2.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo56008a(C9449vc vcVar) {
        vx2.m53591g(vcVar, "model");
        ry2 ry2 = this.f40739a;
        ry2.f33670g.setText(this.f40740b.getResources().getString(R.string.add_new_tokens_item_name, new Object[]{vcVar.mo66474f(), vcVar.mo66475g()}));
        ImageView imageView = ry2.f33667d;
        vx2.m53590f(imageView, "ivTokenIcon");
        ol0.m70336P(imageView, vcVar.mo66472e(), vcVar.mo66471d(), vcVar.mo66475g());
        if (ol0.m70328H(vcVar.mo66475g())) {
            String c = q70.m71187c(vcVar.mo66468a(), vcVar.mo66475g(), (Integer) null, 2, (Object) null);
            ImageView imageView2 = ry2.f33667d;
            vx2.m53590f(imageView2, "ivTokenIcon");
            ol0.m70335O(imageView2, c, vcVar.mo66475g());
        }
        ry2.f33666c.setChecked(vx2.m53586b(this.f40741c, vcVar.mo66476h()));
    }

    /* renamed from: b */
    public final MaterialCheckBox mo56009b() {
        return this.f40743e;
    }

    /* renamed from: c */
    public final ConstraintLayout mo56010c() {
        return this.f40742d;
    }
}
