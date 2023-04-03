package net.safemoon.androidwallet.viewmodels.factory;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0729l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/factory/MyViewModelFactory;", "Landroidx/lifecycle/l$b;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lad7;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "activity", "<init>", "(Ljava/lang/ref/WeakReference;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MyViewModelFactory.kt */
public final class MyViewModelFactory implements C0729l.C0733b {

    /* renamed from: a */
    public final WeakReference<Activity> f43096a;

    public MyViewModelFactory(WeakReference<Activity> weakReference) {
        vx2.m53591g(weakReference, "activity");
        this.f43096a = weakReference;
    }

    /* renamed from: a */
    public <T extends ad7> T mo6370a(Class<T> cls) {
        T contactViewModel;
        vx2.m53591g(cls, "modelClass");
        Activity activity = this.f43096a.get();
        vx2.m53588d(activity);
        Context applicationContext = activity.getApplicationContext();
        vx2.m53590f(applicationContext, "activity.get()!!.applicationContext");
        if (vx2.m53586b(cls, MyTokensListViewModel.class)) {
            Activity activity2 = this.f43096a.get();
            vx2.m53588d(activity2);
            Application application = activity2.getApplication();
            ip2 b = c67.f37071a.mo50813b(applicationContext);
            y57 y57 = new y57(applicationContext);
            vx2.m53590f(application, "application");
            return new MyTokensListViewModel(application, y57, b);
        }
        if (vx2.m53586b(cls, pt5.class)) {
            Activity activity3 = this.f43096a.get();
            vx2.m53588d(activity3);
            Application application2 = activity3.getApplication();
            vx2.m53590f(application2, "activity.get()!!.application");
            contactViewModel = new pt5(application2, C7126gf.f38011a.mo51908b(applicationContext));
        } else if (vx2.m53586b(cls, SelectFiatViewModel.class)) {
            Activity activity4 = this.f43096a.get();
            vx2.m53588d(activity4);
            Application application3 = activity4.getApplication();
            vx2.m53590f(application3, "activity.get()!!.application");
            contactViewModel = new SelectFiatViewModel(application3, c02.f37027a.mo50769b(applicationContext));
        } else if (vx2.m53586b(cls, ContactViewModel.class)) {
            Activity activity5 = this.f43096a.get();
            vx2.m53588d(activity5);
            Application application4 = activity5.getApplication();
            vx2.m53590f(application4, "activity.get()!!.application");
            contactViewModel = new ContactViewModel(application4, lr0.f40678a.mo55965a(applicationContext), new tf2());
        } else if (vx2.m53586b(cls, CustomContractTokenViewModel.class)) {
            Activity activity6 = this.f43096a.get();
            vx2.m53588d(activity6);
            Application application5 = activity6.getApplication();
            vx2.m53590f(application5, "application");
            return new CustomContractTokenViewModel(application5, new MyViewModelFactory$create$1(this), new MyViewModelFactory$create$2(this), new MyViewModelFactory$create$3(this), new MyViewModelFactory$create$4(this));
        } else {
            vx2.m53589e((Object) null, "null cannot be cast to non-null type T of net.safemoon.androidwallet.viewmodels.factory.MyViewModelFactory.create");
            return null;
        }
        return contactViewModel;
    }

    /* renamed from: b */
    public /* synthetic */ ad7 mo6371b(Class cls, zv0 zv0) {
        return ed7.m16079b(this, cls, zv0);
    }
}
