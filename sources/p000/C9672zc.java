package p000;

import android.content.Context;
import androidx.lifecycle.C0729l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper;
import net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lzc;", "Landroidx/lifecycle/l$b;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lad7;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "context", "<init>", "(Ljava/lang/ref/WeakReference;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zc */
/* compiled from: AddNewTokensViewModelFactory.kt */
public final class C9672zc implements C0729l.C0733b {

    /* renamed from: a */
    public final WeakReference<Context> f46350a;

    public C9672zc(WeakReference<Context> weakReference) {
        vx2.m53591g(weakReference, "context");
        this.f46350a = weakReference;
    }

    /* renamed from: a */
    public <T extends ad7> T mo6370a(Class<T> cls) {
        vx2.m53591g(cls, "modelClass");
        Context context = this.f46350a.get();
        vx2.m53588d(context);
        Context applicationContext = context.getApplicationContext();
        vx2.m53588d(applicationContext);
        on2 b = C7126gf.f38011a.mo51908b(applicationContext);
        c67 c67 = c67.f37071a;
        return new AddNewTokensViewModel(b, new TokenDisplayModelMapper(applicationContext, new vf2(c67.mo50813b(applicationContext))), c67.mo50813b(applicationContext), yy0.f46294a.mo67189a(applicationContext));
    }

    /* renamed from: b */
    public /* synthetic */ ad7 mo6371b(Class cls, zv0 zv0) {
        return ed7.m16079b(this, cls, zv0);
    }
}
