package p000;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: oo4 */
/* compiled from: PickerFragment */
public abstract class oo4<S> extends Fragment {

    /* renamed from: a */
    public final LinkedHashSet<sh4<S>> f32416a = new LinkedHashSet<>();

    /* renamed from: h */
    public boolean mo32539h(sh4<S> sh4) {
        return this.f32416a.add(sh4);
    }

    /* renamed from: i */
    public void mo46444i() {
        this.f32416a.clear();
    }
}
