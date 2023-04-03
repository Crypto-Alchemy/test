package androidx.media3.p005ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0836t;
import androidx.media3.common.C0837u;
import androidx.media3.common.C0842w;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.ui.TrackSelectionView */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: A */
    public xs6 f5923A;

    /* renamed from: B */
    public CheckedTextView[][] f5924B;

    /* renamed from: C */
    public boolean f5925C;

    /* renamed from: H */
    public Comparator<C1094c> f5926H;

    /* renamed from: I */
    public C1095d f5927I;

    /* renamed from: a */
    public final int f5928a;

    /* renamed from: d */
    public final LayoutInflater f5929d;

    /* renamed from: e */
    public final CheckedTextView f5930e;

    /* renamed from: g */
    public final CheckedTextView f5931g;

    /* renamed from: k */
    public final C1093b f5932k;

    /* renamed from: r */
    public final List<C0842w.C0843a> f5933r;

    /* renamed from: s */
    public final Map<C0836t, C0837u> f5934s;

    /* renamed from: x */
    public boolean f5935x;

    /* renamed from: y */
    public boolean f5936y;

    /* renamed from: androidx.media3.ui.TrackSelectionView$b */
    public class C1093b implements View.OnClickListener {
        public C1093b() {
        }

        public void onClick(View view) {
            TrackSelectionView.this.mo8369c(view);
        }
    }

    /* renamed from: androidx.media3.ui.TrackSelectionView$c */
    public static final class C1094c {

        /* renamed from: a */
        public final C0842w.C0843a f5938a;

        /* renamed from: b */
        public final int f5939b;

        public C1094c(C0842w.C0843a aVar, int i) {
            this.f5938a = aVar;
            this.f5939b = i;
        }

        /* renamed from: a */
        public C0792h mo8384a() {
            return this.f5938a.mo6953c(this.f5939b);
        }
    }

    /* renamed from: androidx.media3.ui.TrackSelectionView$d */
    public interface C1095d {
        /* renamed from: a */
        void mo8385a(boolean z, Map<C0836t, C0837u> map);
    }

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static Map<C0836t, C0837u> m8081b(Map<C0836t, C0837u> map, List<C0842w.C0843a> list, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C0837u uVar = map.get(list.get(i).mo6952b());
            if (uVar != null && (z || hashMap.isEmpty())) {
                hashMap.put(uVar.f4475a, uVar);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public final void mo8369c(View view) {
        if (view == this.f5930e) {
            mo8371e();
        } else if (view == this.f5931g) {
            mo8370d();
        } else {
            mo8372f(view);
        }
        mo8377i();
        C1095d dVar = this.f5927I;
        if (dVar != null) {
            dVar.mo8385a(getIsDisabled(), getOverrides());
        }
    }

    /* renamed from: d */
    public final void mo8370d() {
        this.f5925C = false;
        this.f5934s.clear();
    }

    /* renamed from: e */
    public final void mo8371e() {
        this.f5925C = true;
        this.f5934s.clear();
    }

    /* renamed from: f */
    public final void mo8372f(View view) {
        boolean z = false;
        this.f5925C = false;
        C1094c cVar = (C1094c) C2725kr.m20985e(view.getTag());
        C0836t b = cVar.f5938a.mo6952b();
        int i = cVar.f5939b;
        C0837u uVar = this.f5934s.get(b);
        if (uVar == null) {
            if (!this.f5936y && this.f5934s.size() > 0) {
                this.f5934s.clear();
            }
            this.f5934s.put(b, new C0837u(b, ImmutableList.m36628of(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(uVar.f4476d);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean g = mo8373g(cVar.f5938a);
        if (g || mo8376h()) {
            z = true;
        }
        if (isChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.f5934s.remove(b);
            } else {
                this.f5934s.put(b, new C0837u(b, arrayList));
            }
        } else if (isChecked) {
        } else {
            if (g) {
                arrayList.add(Integer.valueOf(i));
                this.f5934s.put(b, new C0837u(b, arrayList));
                return;
            }
            this.f5934s.put(b, new C0837u(b, ImmutableList.m36628of(Integer.valueOf(i))));
        }
    }

    /* renamed from: g */
    public final boolean mo8373g(C0842w.C0843a aVar) {
        if (!this.f5935x || !aVar.mo6955e()) {
            return false;
        }
        return true;
    }

    public boolean getIsDisabled() {
        return this.f5925C;
    }

    public Map<C0836t, C0837u> getOverrides() {
        return this.f5934s;
    }

    /* renamed from: h */
    public final boolean mo8376h() {
        if (!this.f5936y || this.f5933r.size() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo8377i() {
        boolean z;
        this.f5930e.setChecked(this.f5925C);
        CheckedTextView checkedTextView = this.f5931g;
        if (this.f5925C || this.f5934s.size() != 0) {
            z = false;
        } else {
            z = true;
        }
        checkedTextView.setChecked(z);
        for (int i = 0; i < this.f5924B.length; i++) {
            C0837u uVar = this.f5934s.get(this.f5933r.get(i).mo6952b());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f5924B[i];
                if (i2 >= checkedTextViewArr.length) {
                    break;
                }
                if (uVar != null) {
                    this.f5924B[i][i2].setChecked(uVar.f4476d.contains(Integer.valueOf(((C1094c) C2725kr.m20985e(checkedTextViewArr[i2].getTag())).f5939b)));
                } else {
                    checkedTextViewArr[i2].setChecked(false);
                }
                i2++;
            }
        }
    }

    /* renamed from: j */
    public final void mo8378j() {
        int i;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f5933r.isEmpty()) {
            this.f5930e.setEnabled(false);
            this.f5931g.setEnabled(false);
            return;
        }
        this.f5930e.setEnabled(true);
        this.f5931g.setEnabled(true);
        this.f5924B = new CheckedTextView[this.f5933r.size()][];
        boolean h = mo8376h();
        for (int i2 = 0; i2 < this.f5933r.size(); i2++) {
            C0842w.C0843a aVar = this.f5933r.get(i2);
            boolean g = mo8373g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f5924B;
            int i3 = aVar.f4549a;
            checkedTextViewArr[i2] = new CheckedTextView[i3];
            C1094c[] cVarArr = new C1094c[i3];
            for (int i4 = 0; i4 < aVar.f4549a; i4++) {
                cVarArr[i4] = new C1094c(aVar, i4);
            }
            Comparator<C1094c> comparator = this.f5926H;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                if (i5 == 0) {
                    addView(this.f5929d.inflate(b45.exo_list_divider, this, false));
                }
                if (g || h) {
                    i = 17367056;
                } else {
                    i = 17367055;
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f5929d.inflate(i, this, false);
                checkedTextView.setBackgroundResource(this.f5928a);
                checkedTextView.setText(this.f5923A.mo18635a(cVarArr[i5].mo8384a()));
                checkedTextView.setTag(cVarArr[i5]);
                if (aVar.mo6959h(i5)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f5932k);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f5924B[i2][i5] = checkedTextView;
                addView(checkedTextView);
            }
        }
        mo8377i();
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f5935x != z) {
            this.f5935x = z;
            mo8378j();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f5936y != z) {
            this.f5936y = z;
            if (!z && this.f5934s.size() > 1) {
                Map<C0836t, C0837u> b = m8081b(this.f5934s, this.f5933r, false);
                this.f5934s.clear();
                this.f5934s.putAll(b);
            }
            mo8378j();
        }
    }

    public void setShowDisableOption(boolean z) {
        int i;
        CheckedTextView checkedTextView = this.f5930e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkedTextView.setVisibility(i);
    }

    public void setTrackNameProvider(xs6 xs6) {
        this.f5923A = (xs6) C2725kr.m20985e(xs6);
        mo8378j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f5928a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f5929d = from;
        C1093b bVar = new C1093b();
        this.f5932k = bVar;
        this.f5923A = new da1(getResources());
        this.f5933r = new ArrayList();
        this.f5934s = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f5930e = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(t45.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(b45.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f5931g = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(t45.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
