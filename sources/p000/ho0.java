package p000;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, mo44877d2 = {"T", "Landroidx/lifecycle/LiveData;", "b", "", "", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ho0 */
/* compiled from: ComputeData.kt */
public final class ho0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, mo44877d2 = {"ho0$a", "Lpf4;", "obj", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "", "a", "Z", "initialized", "b", "Ljava/lang/Object;", "lastObj", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ho0$a */
    /* compiled from: ComputeData.kt */
    public static final class C7186a implements pf4<T> {

        /* renamed from: a */
        public boolean f38237a;

        /* renamed from: b */
        public T f38238b;

        /* renamed from: c */
        public final /* synthetic */ ls3<T> f38239c;

        public C7186a(ls3<T> ls3) {
            this.f38239c = ls3;
        }

        public void onChanged(T t) {
            if (!this.f38237a) {
                this.f38237a = true;
                this.f38238b = t;
                ls3<T> ls3 = this.f38239c;
                vx2.m53588d(t);
                ls3.postValue(t);
            } else if ((t == null && this.f38238b != null) || !vx2.m53586b(t, this.f38238b)) {
                this.f38238b = t;
                ls3<T> ls32 = this.f38239c;
                vx2.m53588d(t);
                ls32.postValue(t);
            }
        }
    }

    /* renamed from: a */
    public static final float m58584a(Number number) {
        vx2.m53591g(number, "<this>");
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: b */
    public static final <T> LiveData<T> m58585b(LiveData<T> liveData) {
        vx2.m53591g(liveData, "<this>");
        ls3 ls3 = new ls3();
        ls3.mo22951a(liveData, new C7186a(ls3));
        return ls3;
    }
}
