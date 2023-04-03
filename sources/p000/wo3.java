package p000;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;

/* renamed from: wo3 */
/* compiled from: MaterialTextInputPicker */
public final class wo3<S> extends oo4<S> {

    /* renamed from: d */
    public int f35398d;

    /* renamed from: e */
    public DateSelector<S> f35399e;

    /* renamed from: g */
    public CalendarConstraints f35400g;

    /* renamed from: wo3$a */
    /* compiled from: MaterialTextInputPicker */
    public class C6671a extends sh4<S> {
        public C6671a() {
        }

        /* renamed from: a */
        public void mo32616a() {
            Iterator<sh4<S>> it = wo3.this.f32416a.iterator();
            while (it.hasNext()) {
                it.next().mo32616a();
            }
        }

        /* renamed from: b */
        public void mo32617b(S s) {
            Iterator<sh4<S>> it = wo3.this.f32416a.iterator();
            while (it.hasNext()) {
                it.next().mo32617b(s);
            }
        }
    }

    /* renamed from: j */
    public static <T> wo3<T> m53994j(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        wo3<T> wo3 = new wo3<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        wo3.setArguments(bundle);
        return wo3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f35398d = bundle.getInt("THEME_RES_ID_KEY");
        this.f35399e = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f35400g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f35399e.mo32514J(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f35398d)), viewGroup, bundle, this.f35400g, new C6671a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f35398d);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f35399e);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f35400g);
    }
}
