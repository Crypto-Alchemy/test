package net.safemoon.androidwallet.fragments;

import android.text.Editable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import p000.C9633yc;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lvc;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddNewTokenFragment.kt */
public final class AddNewTokenFragment$observeViewModel$2 extends Lambda implements rc2<List<? extends C9449vc>, r37> {
    public final /* synthetic */ AddNewTokenFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/AddNewTokenFragment$observeViewModel$2$a", "Lyc$b;", "Lvc;", "item", "", "isSelected", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AddNewTokenFragment$observeViewModel$2$a */
    /* compiled from: AddNewTokenFragment.kt */
    public static final class C8359a implements C9633yc.C9635b {

        /* renamed from: a */
        public final /* synthetic */ AddNewTokenFragment f41880a;

        public C8359a(AddNewTokenFragment addNewTokenFragment) {
            this.f41880a = addNewTokenFragment;
        }

        /* renamed from: a */
        public void mo57418a(C9449vc vcVar, boolean z) {
            vx2.m53591g(vcVar, "item");
            this.f41880a.mo57405L().mo60967n(vcVar, z);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AddNewTokenFragment$observeViewModel$2$b */
    /* compiled from: Comparisons.kt */
    public static final class C8360b<T> implements Comparator {
        public final int compare(T t, T t2) {
            String f = ((C9449vc) t).mo66474f();
            Locale locale = Locale.ROOT;
            String lowerCase = f.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = ((C9449vc) t2).mo66474f().toLowerCase(locale);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return xl0.m54426a(lowerCase, lowerCase2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddNewTokenFragment$observeViewModel$2(AddNewTokenFragment addNewTokenFragment) {
        super(1);
        this.this$0 = addNewTokenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<C9449vc>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<C9449vc> list) {
        ProgressLoading D = this.this$0.f41871A;
        if (D != null) {
            D.mo22266k();
        }
        vx2.m53590f(list, "it");
        List<T> D0 = CollectionsKt___CollectionsKt.m47304D0(list, new C8360b());
        if (this.this$0.f41878y != null) {
            AddNewTokenFragment addNewTokenFragment = this.this$0;
            RecyclerTouchListener E = addNewTokenFragment.f41878y;
            vx2.m53588d(E);
            addNewTokenFragment.mo57408O(E, D0);
        }
        this.this$0.f41877x = new C9633yc(new ArrayList(D0), new C8359a(this.this$0));
        c92 C = this.this$0.f41875r;
        c92 c92 = null;
        if (C == null) {
            vx2.m53605u("binding");
            C = null;
        }
        C.f21629b.setAdapter(this.this$0.f41877x);
        if (D0.size() == this.this$0.f41874k) {
            c92 C2 = this.this$0.f41875r;
            if (C2 == null) {
                vx2.m53605u("binding");
                C2 = null;
            }
            Editable text = C2.f21630c.f34980b.getText();
            if (!(text == null || text.length() == 0)) {
                c92 C3 = this.this$0.f41875r;
                if (C3 == null) {
                    vx2.m53605u("binding");
                } else {
                    c92 = C3;
                }
                c92.f21633f.setVisibility(0);
                return;
            }
        }
        c92 C4 = this.this$0.f41875r;
        if (C4 == null) {
            vx2.m53605u("binding");
        } else {
            c92 = C4;
        }
        c92.f21633f.setVisibility(8);
    }
}
