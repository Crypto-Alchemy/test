package p000;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.views.FixedForAppBarLayoutManager;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0014\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0016\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u001a\u0010 \u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001f\u001a\u00020\u001aH\u0002R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010-R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\t0)8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101¨\u00065"}, mo44877d2 = {"Lf14;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lf14$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "g", "Lkotlin/Function1;", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "Lr37;", "onClick", "k", "Lnet/safemoon/androidwallet/views/FixedForAppBarLayoutManager;", "layoutManager", "j", "holder", "position", "e", "getItemCount", "", "newItemList", "l", "h", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "c", "fromPosition", "toPosition", "d", "isAllowed", "i", "a", "Lnet/safemoon/androidwallet/views/FixedForAppBarLayoutManager;", "Lhz2;", "Lhz2;", "binding", "Landroid/content/res/Resources;", "Landroid/content/res/Resources;", "resources", "", "", "Ljava/util/List;", "defaultTokens", "Lrc2;", "onClickListener", "r", "b", "()Ljava/util/List;", "movingList", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f14 */
/* compiled from: MyTokensAdapter.kt */
public final class f14 extends RecyclerView.Adapter<C7062a> {

    /* renamed from: a */
    public FixedForAppBarLayoutManager f37699a;

    /* renamed from: d */
    public hz2 f37700d;

    /* renamed from: e */
    public Resources f37701e;

    /* renamed from: g */
    public final List<String> f37702g;

    /* renamed from: k */
    public rc2<? super UserTokenItemDisplayModel, r37> f37703k;

    /* renamed from: r */
    public final List<UserTokenItemDisplayModel> f37704r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010 \u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006#"}, mo44877d2 = {"Lf14$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lhz2;", "a", "Lhz2;", "getBinding", "()Lhz2;", "binding", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "ivTokenIcon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "tvTokenName", "g", "tvTokenSymbol", "e", "tvTokenBalance", "f", "tvTokenPercent", "tvTokenNativeBalance", "Landroid/view/View;", "h", "Landroid/view/View;", "()Landroid/view/View;", "vDivider", "i", "ivPercentageDirection", "<init>", "(Lhz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: f14$a */
    /* compiled from: MyTokensAdapter.kt */
    public static final class C7062a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final hz2 f37705a;

        /* renamed from: b */
        public final ImageView f37706b;

        /* renamed from: c */
        public final TextView f37707c;

        /* renamed from: d */
        public final TextView f37708d;

        /* renamed from: e */
        public final TextView f37709e;

        /* renamed from: f */
        public final TextView f37710f;

        /* renamed from: g */
        public final TextView f37711g;

        /* renamed from: h */
        public final View f37712h;

        /* renamed from: i */
        public final ImageView f37713i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7062a(hz2 hz2) {
            super(hz2.mo43432b());
            vx2.m53591g(hz2, "binding");
            this.f37705a = hz2;
            ImageView imageView = hz2.f29768c;
            vx2.m53590f(imageView, "binding.ivTokenIcon");
            this.f37706b = imageView;
            TextView textView = hz2.f29771f;
            vx2.m53590f(textView, "binding.tvTokenName");
            this.f37707c = textView;
            TextView textView2 = hz2.f29774i;
            vx2.m53590f(textView2, "binding.tvTokenSymbol");
            this.f37708d = textView2;
            TextView textView3 = hz2.f29770e;
            vx2.m53590f(textView3, "binding.tvTokenBalance");
            this.f37709e = textView3;
            TextView textView4 = hz2.f29773h;
            vx2.m53590f(textView4, "binding.tvTokenPercent");
            this.f37710f = textView4;
            TextView textView5 = hz2.f29772g;
            vx2.m53590f(textView5, "binding.tvTokenNativeBalance");
            this.f37711g = textView5;
            View view = hz2.f29775j;
            vx2.m53590f(view, "binding.vDivider");
            this.f37712h = view;
            ImageView imageView2 = hz2.f29767b;
            vx2.m53590f(imageView2, "binding.ivPercentageDirection");
            this.f37713i = imageView2;
        }

        /* renamed from: a */
        public final ImageView mo51570a() {
            return this.f37713i;
        }

        /* renamed from: b */
        public final ImageView mo51571b() {
            return this.f37706b;
        }

        /* renamed from: c */
        public final TextView mo51572c() {
            return this.f37709e;
        }

        /* renamed from: d */
        public final TextView mo51573d() {
            return this.f37707c;
        }

        /* renamed from: e */
        public final TextView mo51574e() {
            return this.f37711g;
        }

        /* renamed from: f */
        public final TextView mo51575f() {
            return this.f37710f;
        }

        /* renamed from: g */
        public final TextView mo51576g() {
            return this.f37708d;
        }

        /* renamed from: h */
        public final View mo51577h() {
            return this.f37712h;
        }
    }

    public f14() {
        ArrayList arrayList = new ArrayList();
        for (Pair<TokenType, List<String>> second : ApplicationRoomDatabase.f41664p.mo57121d()) {
            arrayList.addAll((Collection) second.getSecond());
        }
        this.f37702g = arrayList;
        this.f37704r = new ArrayList();
    }

    /* renamed from: f */
    public static final void m57529f(f14 f14, UserTokenItemDisplayModel userTokenItemDisplayModel, View view) {
        vx2.m53591g(f14, "this$0");
        vx2.m53591g(userTokenItemDisplayModel, "$model");
        rc2<? super UserTokenItemDisplayModel, r37> rc2 = f14.f37703k;
        if (rc2 != null) {
            rc2.invoke(userTokenItemDisplayModel);
        }
    }

    /* renamed from: b */
    public final List<UserTokenItemDisplayModel> mo51560b() {
        return this.f37704r;
    }

    /* renamed from: c */
    public final boolean mo51561c(RecyclerView.C1231a0 a0Var) {
        if (a0Var == null) {
            return false;
        }
        return a0Var.itemView.isSelected();
    }

    /* renamed from: d */
    public final void mo51562d(int i, int i2) {
        Collections.swap(this.f37704r, i, i2);
        notifyItemMoved(i, i2);
    }

    /* renamed from: e */
    public void onBindViewHolder(C7062a aVar, int i) {
        boolean z;
        int i2;
        vx2.m53591g(aVar, "holder");
        UserTokenItemDisplayModel userTokenItemDisplayModel = this.f37704r.get(i);
        ol0.m70336P(aVar.mo51571b(), userTokenItemDisplayModel.getIconResId(), userTokenItemDisplayModel.getIconFile(), userTokenItemDisplayModel.getSymbol());
        if (ol0.m70328H(userTokenItemDisplayModel.getSymbol())) {
            ol0.m70335O(aVar.mo51571b(), userTokenItemDisplayModel.getCmcId(), userTokenItemDisplayModel.getSymbol());
        }
        aVar.mo51573d().setText(userTokenItemDisplayModel.getName());
        aVar.mo51576g().setText(userTokenItemDisplayModel.getSymbol());
        int i3 = 0;
        try {
            double percentChange1h = userTokenItemDisplayModel.getPercentChange1h();
            TextView f = aVar.mo51575f();
            cb6 cb6 = cb6.f21669a;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(percentChange1h)}, 1));
            vx2.m53590f(format, "format(format, *args)");
            f.setText(format + "%");
        } catch (Exception unused) {
            aVar.mo51575f().setText("");
        }
        ol0.m70337Q(aVar.mo51574e(), userTokenItemDisplayModel.getNativeBalance());
        ol0.m70333M(aVar.mo51572c(), userTokenItemDisplayModel.getBalanceInUSDT(), true);
        View h = aVar.mo51577h();
        if (i + 1 != getItemCount()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = 8;
        }
        h.setVisibility(i3);
        aVar.itemView.setOnClickListener(new e14(this, userTokenItemDisplayModel));
        try {
            if (userTokenItemDisplayModel.getPercentChange1h() >= Utils.DOUBLE_EPSILON) {
                i2 = R.drawable.arrow_up;
            } else {
                i2 = R.drawable.arrow_down;
            }
            C1710a.m12225u(aVar.mo51570a()).mo23162w(Integer.valueOf(i2)).mo11553K0(aVar.mo51570a());
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage != null) {
                String simpleName = f14.class.getSimpleName();
                vx2.m53590f(simpleName, "this::class.java.simpleName");
                ol0.m70350b0(localizedMessage, simpleName);
            }
        }
        mo51566i(aVar, !this.f37702g.contains(userTokenItemDisplayModel.getSymbolWithType()));
    }

    /* renamed from: g */
    public C7062a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        hz2 a = hz2.m45422a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_my_tokens_screen, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        this.f37700d = a;
        hz2 hz2 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        Resources resources = a.mo43432b().getContext().getResources();
        vx2.m53590f(resources, "binding.root.context.resources");
        this.f37701e = resources;
        hz2 hz22 = this.f37700d;
        if (hz22 == null) {
            vx2.m53605u("binding");
        } else {
            hz2 = hz22;
        }
        return new C7062a(hz2);
    }

    public int getItemCount() {
        return this.f37704r.size();
    }

    /* renamed from: h */
    public final void mo51565h(int i) {
        this.f37704r.remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, getItemCount());
    }

    /* renamed from: i */
    public final void mo51566i(RecyclerView.C1231a0 a0Var, boolean z) {
        if (a0Var != null) {
            a0Var.itemView.setSelected(z);
        }
    }

    /* renamed from: j */
    public final void mo51567j(FixedForAppBarLayoutManager fixedForAppBarLayoutManager) {
        vx2.m53591g(fixedForAppBarLayoutManager, "layoutManager");
        this.f37699a = fixedForAppBarLayoutManager;
    }

    /* renamed from: k */
    public final void mo51568k(rc2<? super UserTokenItemDisplayModel, r37> rc2) {
        this.f37703k = rc2;
    }

    /* renamed from: l */
    public final void mo51569l(List<UserTokenItemDisplayModel> list) {
        vx2.m53591g(list, "newItemList");
        this.f37704r.clear();
        this.f37704r.addAll(list);
        notifyDataSetChanged();
    }
}
