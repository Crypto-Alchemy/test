package zendesk.belvedere;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C9836j;

/* renamed from: zendesk.belvedere.b */
/* compiled from: ImageStream */
public class C9802b extends Fragment {

    /* renamed from: a */
    public WeakReference<KeyboardHelper> f46690a = new WeakReference<>((Object) null);

    /* renamed from: d */
    public List<WeakReference<C9804b>> f46691d = new ArrayList();

    /* renamed from: e */
    public List<WeakReference<C9806d>> f46692e = new ArrayList();

    /* renamed from: g */
    public List<WeakReference<C9805c>> f46693g = new ArrayList();

    /* renamed from: k */
    public C9825h f46694k = null;

    /* renamed from: r */
    public BelvedereUi.UiConfig f46695r = null;

    /* renamed from: s */
    public boolean f46696s = false;

    /* renamed from: x */
    public C9836j f46697x;

    /* renamed from: y */
    public n90<List<MediaResult>> f46698y;

    /* renamed from: zendesk.belvedere.b$a */
    /* compiled from: ImageStream */
    public class C9803a extends n90<List<MediaResult>> {
        public C9803a() {
        }

        public void success(List<MediaResult> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (MediaResult next : list) {
                if (next.mo73703l() <= C9802b.this.f46695r.mo73618c() || C9802b.this.f46695r.mo73618c() == -1) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() != list.size()) {
                Toast.makeText(C9802b.this.getContext(), q45.belvedere_image_stream_file_too_large, 0).show();
            }
            C9802b.this.mo73739q(arrayList);
        }
    }

    /* renamed from: zendesk.belvedere.b$b */
    /* compiled from: ImageStream */
    public interface C9804b {
        void onDismissed();

        void onMediaDeselected(List<MediaResult> list);

        void onMediaSelected(List<MediaResult> list);

        void onVisible();
    }

    /* renamed from: zendesk.belvedere.b$c */
    /* compiled from: ImageStream */
    public interface C9805c {
        void onScroll(int i, int i2, float f);
    }

    /* renamed from: zendesk.belvedere.b$d */
    /* compiled from: ImageStream */
    public interface C9806d {
        /* renamed from: a */
        void mo73752a(List<MediaResult> list);
    }

    /* renamed from: i */
    public void mo73731i(C9804b bVar) {
        this.f46691d.add(new WeakReference(bVar));
    }

    /* renamed from: j */
    public void mo73732j(C9805c cVar) {
        this.f46693g.add(new WeakReference(cVar));
    }

    /* renamed from: k */
    public void mo73733k() {
        if (mo73736n()) {
            this.f46694k.dismiss();
        }
    }

    /* renamed from: l */
    public KeyboardHelper mo73734l() {
        return this.f46690a.get();
    }

    /* renamed from: m */
    public void mo73735m(List<MediaIntent> list, C9836j.C9840d dVar) {
        this.f46697x.mo73810i(this, list, dVar);
    }

    /* renamed from: n */
    public boolean mo73736n() {
        if (this.f46694k != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public void mo73737o() {
        this.f46698y = null;
        for (WeakReference<C9804b> weakReference : this.f46691d) {
            C9804b bVar = (C9804b) weakReference.get();
            if (bVar != null) {
                bVar.onDismissed();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f46698y = new C9803a();
        C9800a.m75438c(requireContext()).mo73726e(i, i2, intent, this.f46698y, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f46697x = new C9836j();
    }

    public void onPause() {
        super.onPause();
        C9825h hVar = this.f46694k;
        if (hVar != null) {
            hVar.dismiss();
            this.f46696s = true;
            return;
        }
        this.f46696s = false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f46697x.mo73812k(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: p */
    public void mo73738p(List<MediaResult> list) {
        for (WeakReference<C9804b> weakReference : this.f46691d) {
            C9804b bVar = (C9804b) weakReference.get();
            if (bVar != null) {
                bVar.onMediaDeselected(list);
            }
        }
    }

    /* renamed from: q */
    public void mo73739q(List<MediaResult> list) {
        for (WeakReference<C9804b> weakReference : this.f46691d) {
            C9804b bVar = (C9804b) weakReference.get();
            if (bVar != null) {
                bVar.onMediaSelected(list);
            }
        }
    }

    /* renamed from: r */
    public void mo73740r(List<MediaResult> list) {
        for (WeakReference<C9806d> weakReference : this.f46692e) {
            C9806d dVar = (C9806d) weakReference.get();
            if (dVar != null) {
                dVar.mo73752a(list);
            }
        }
    }

    /* renamed from: s */
    public void mo73741s(int i, int i2, float f) {
        for (WeakReference<C9805c> weakReference : this.f46693g) {
            C9805c cVar = (C9805c) weakReference.get();
            if (cVar != null) {
                cVar.onScroll(i, i2, f);
            }
        }
    }

    /* renamed from: t */
    public void mo73742t() {
        for (WeakReference<C9804b> weakReference : this.f46691d) {
            C9804b bVar = (C9804b) weakReference.get();
            if (bVar != null) {
                bVar.onVisible();
            }
        }
    }

    /* renamed from: u */
    public void mo73743u(C9825h hVar, BelvedereUi.UiConfig uiConfig) {
        this.f46694k = hVar;
        if (uiConfig != null) {
            this.f46695r = uiConfig;
        }
    }

    /* renamed from: v */
    public void mo73744v(KeyboardHelper keyboardHelper) {
        this.f46690a = new WeakReference<>(keyboardHelper);
    }

    /* renamed from: w */
    public boolean mo73745w() {
        return this.f46696s;
    }
}
