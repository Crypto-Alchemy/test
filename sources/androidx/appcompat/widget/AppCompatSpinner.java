package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0147a;

public class AppCompatSpinner extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: y */
    public static final int[] f1038y = {16843505};

    /* renamed from: a */
    public final C3155qm f1039a;

    /* renamed from: d */
    public final Context f1040d;

    /* renamed from: e */
    public k82 f1041e;

    /* renamed from: g */
    public SpinnerAdapter f1042g;

    /* renamed from: k */
    public final boolean f1043k;

    /* renamed from: r */
    public C0227i f1044r;

    /* renamed from: s */
    public int f1045s;

    /* renamed from: x */
    public final Rect f1046x;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0215a();

        /* renamed from: a */
        public boolean f1047a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public class C0215a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1047a ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1047a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0216a extends k82 {

        /* renamed from: A */
        public final /* synthetic */ C0223h f1048A;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0216a(View view, C0223h hVar) {
            super(view);
            this.f1048A = hVar;
        }

        /* renamed from: b */
        public w06 mo1281b() {
            return this.f1048A;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo1282c() {
            if (AppCompatSpinner.this.getInternalPopup().mo2021a()) {
                return true;
            }
            AppCompatSpinner.this.mo1986b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class C0217b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0217b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo2021a()) {
                AppCompatSpinner.this.mo1986b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0218c.m1355a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public static final class C0218c {
        /* renamed from: a */
        public static void m1355a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static final class C0219d {
        /* renamed from: a */
        public static int m1356a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        public static int m1357b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        public static void m1358c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        public static void m1359d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public static final class C0220e {
        /* renamed from: a */
        public static void m1360a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public class C0221f implements C0227i, DialogInterface.OnClickListener {

        /* renamed from: a */
        public C0147a f1051a;

        /* renamed from: d */
        public ListAdapter f1052d;

        /* renamed from: e */
        public CharSequence f1053e;

        public C0221f() {
        }

        /* renamed from: a */
        public boolean mo2021a() {
            C0147a aVar = this.f1051a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        /* renamed from: b */
        public void mo2022b(Drawable drawable) {
        }

        /* renamed from: d */
        public int mo2023d() {
            return 0;
        }

        public void dismiss() {
            C0147a aVar = this.f1051a;
            if (aVar != null) {
                aVar.dismiss();
                this.f1051a = null;
            }
        }

        /* renamed from: f */
        public void mo2025f(int i) {
        }

        /* renamed from: g */
        public CharSequence mo2026g() {
            return this.f1053e;
        }

        /* renamed from: h */
        public Drawable mo2027h() {
            return null;
        }

        /* renamed from: i */
        public void mo2028i(CharSequence charSequence) {
            this.f1053e = charSequence;
        }

        /* renamed from: j */
        public void mo2029j(int i) {
        }

        /* renamed from: k */
        public void mo2030k(int i) {
        }

        /* renamed from: l */
        public void mo2031l(int i, int i2) {
            if (this.f1052d != null) {
                C0147a.C0148a aVar = new C0147a.C0148a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1053e;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                C0147a create = aVar.mo1207j(this.f1052d, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
                this.f1051a = create;
                ListView b = create.mo1191b();
                C0219d.m1359d(b, i);
                C0219d.m1358c(b, i2);
                this.f1051a.show();
            }
        }

        /* renamed from: m */
        public int mo2032m() {
            return 0;
        }

        /* renamed from: n */
        public void mo2033n(ListAdapter listAdapter) {
            this.f1052d = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f1052d.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public static class C0222g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public SpinnerAdapter f1055a;

        /* renamed from: d */
        public ListAdapter f1056d;

        public C0222g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1055a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1056d = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                C0220e.m1360a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof yo6) {
                yo6 yo6 = (yo6) spinnerAdapter;
                if (yo6.getDropDownViewTheme() == null) {
                    yo6.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1056d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1055a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1055a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1055a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1055a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1055a;
            if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1056d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1055a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1055a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    public class C0223h extends ListPopupWindow implements C0227i {

        /* renamed from: w1 */
        public CharSequence f1058w1;

        /* renamed from: x1 */
        public ListAdapter f1059x1;

        /* renamed from: y1 */
        public final Rect f1060y1 = new Rect();

        /* renamed from: z1 */
        public int f1061z1;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        public class C0224a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AppCompatSpinner f1062a;

            public C0224a(AppCompatSpinner appCompatSpinner) {
                this.f1062a = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0223h hVar = C0223h.this;
                    AppCompatSpinner.this.performItemClick(view, i, hVar.f1059x1.getItemId(i));
                }
                C0223h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        public class C0225b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0225b() {
            }

            public void onGlobalLayout() {
                C0223h hVar = C0223h.this;
                if (!hVar.mo2050U(AppCompatSpinner.this)) {
                    C0223h.this.dismiss();
                    return;
                }
                C0223h.this.mo2048S();
                C0223h.super.mo1329c();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        public class C0226c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1065a;

            public C0226c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1065a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1065a);
                }
            }
        }

        public C0223h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2179D(AppCompatSpinner.this);
            mo2185J(true);
            mo2190O(0);
            mo2187L(new C0224a(AppCompatSpinner.this));
        }

        /* renamed from: S */
        public void mo2048S() {
            int i;
            int i2;
            Drawable h = mo2196h();
            int i3 = 0;
            if (h != null) {
                h.getPadding(AppCompatSpinner.this.f1046x);
                if (re7.m26176b(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f1046x.right;
                } else {
                    i2 = -AppCompatSpinner.this.f1046x.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f1046x;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.f1045s;
            if (i4 == -2) {
                int a = appCompatSpinner.mo1985a((SpinnerAdapter) this.f1059x1, mo2196h());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1046x;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a > i6) {
                    a = i6;
                }
                mo2181F(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                mo2181F((width - paddingLeft) - paddingRight);
            } else {
                mo2181F(i4);
            }
            if (re7.m26176b(AppCompatSpinner.this)) {
                i = i3 + (((width - paddingRight) - mo2208z()) - mo2049T());
            } else {
                i = i3 + paddingLeft + mo2049T();
            }
            mo2195f(i);
        }

        /* renamed from: T */
        public int mo2049T() {
            return this.f1061z1;
        }

        /* renamed from: U */
        public boolean mo2050U(View view) {
            if (!ga7.m17746S(view) || !view.getGlobalVisibleRect(this.f1060y1)) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public CharSequence mo2026g() {
            return this.f1058w1;
        }

        /* renamed from: i */
        public void mo2028i(CharSequence charSequence) {
            this.f1058w1 = charSequence;
        }

        /* renamed from: k */
        public void mo2030k(int i) {
            this.f1061z1 = i;
        }

        /* renamed from: l */
        public void mo2031l(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a = mo1328a();
            mo2048S();
            mo2184I(2);
            super.mo1329c();
            ListView p = mo1338p();
            p.setChoiceMode(1);
            C0219d.m1359d(p, i);
            C0219d.m1358c(p, i2);
            mo2191P(AppCompatSpinner.this.getSelectedItemPosition());
            if (!a && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0225b bVar = new C0225b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo2186K(new C0226c(bVar));
            }
        }

        /* renamed from: n */
        public void mo2033n(ListAdapter listAdapter) {
            super.mo2033n(listAdapter);
            this.f1059x1 = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    public interface C0227i {
        /* renamed from: a */
        boolean mo2021a();

        /* renamed from: b */
        void mo2022b(Drawable drawable);

        /* renamed from: d */
        int mo2023d();

        void dismiss();

        /* renamed from: f */
        void mo2025f(int i);

        /* renamed from: g */
        CharSequence mo2026g();

        /* renamed from: h */
        Drawable mo2027h();

        /* renamed from: i */
        void mo2028i(CharSequence charSequence);

        /* renamed from: j */
        void mo2029j(int i);

        /* renamed from: k */
        void mo2030k(int i);

        /* renamed from: l */
        void mo2031l(int i, int i2);

        /* renamed from: m */
        int mo2032m();

        /* renamed from: n */
        void mo2033n(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public int mo1985a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1046x);
        Rect rect = this.f1046x;
        return i2 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void mo1986b() {
        this.f1044r.mo2031l(C0219d.m1357b(this), C0219d.m1356a(this));
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.f1039a;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            return iVar.mo2023d();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            return iVar.mo2032m();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1044r != null) {
            return this.f1045s;
        }
        return super.getDropDownWidth();
    }

    public final C0227i getInternalPopup() {
        return this.f1044r;
    }

    public Drawable getPopupBackground() {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            return iVar.mo2027h();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1040d;
    }

    public CharSequence getPrompt() {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            return iVar.mo2026g();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1039a;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1039a;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0227i iVar = this.f1044r;
        if (iVar != null && iVar.mo2021a()) {
            this.f1044r.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1044r != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1985a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1047a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0217b());
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0227i iVar = this.f1044r;
        if (iVar == null || !iVar.mo2021a()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f1047a = z;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        k82 k82 = this.f1041e;
        if (k82 == null || !k82.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0227i iVar = this.f1044r;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.mo2021a()) {
            return true;
        }
        mo1986b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1039a;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1039a;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            iVar.mo2030k(i);
            this.f1044r.mo2025f(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            iVar.mo2029j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1044r != null) {
            this.f1045s = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            iVar.mo2022b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C2554in.m19714b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0227i iVar = this.f1044r;
        if (iVar != null) {
            iVar.mo2028i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.f1039a;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1039a;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.spinnerStyle);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1043k) {
            this.f1042g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1044r != null) {
            Context context = this.f1040d;
            if (context == null) {
                context = getContext();
            }
            this.f1044r.mo2033n(new C0222g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r10 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f1046x = r0
            android.content.Context r0 = r5.getContext()
            p000.xo6.m30262a(r5, r0)
            int[] r0 = p000.j65.Spinner
            r1 = 0
            yq6 r0 = p000.yq6.m30733v(r6, r7, r0, r8, r1)
            qm r2 = new qm
            r2.<init>(r5)
            r5.f1039a = r2
            if (r10 == 0) goto L_0x0029
            hs0 r2 = new hs0
            r2.<init>((android.content.Context) r6, (android.content.res.Resources.Theme) r10)
            r5.f1040d = r2
            goto L_0x003b
        L_0x0029:
            int r10 = p000.j65.Spinner_popupTheme
            int r10 = r0.mo28188n(r10, r1)
            if (r10 == 0) goto L_0x0039
            hs0 r2 = new hs0
            r2.<init>((android.content.Context) r6, (int) r10)
            r5.f1040d = r2
            goto L_0x003b
        L_0x0039:
            r5.f1040d = r6
        L_0x003b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L_0x0061
            int[] r10 = f1038y     // Catch:{ Exception -> 0x005d, all -> 0x0056 }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch:{ Exception -> 0x005d, all -> 0x0056 }
            boolean r3 = r10.hasValue(r1)     // Catch:{ Exception -> 0x005e, all -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r9 = r10.getInt(r1, r1)     // Catch:{ Exception -> 0x005e, all -> 0x0053 }
        L_0x004f:
            r10.recycle()
            goto L_0x0061
        L_0x0053:
            r6 = move-exception
            r2 = r10
            goto L_0x0057
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.recycle()
        L_0x005c:
            throw r6
        L_0x005d:
            r10 = r2
        L_0x005e:
            if (r10 == 0) goto L_0x0061
            goto L_0x004f
        L_0x0061:
            r10 = 1
            if (r9 == 0) goto L_0x009e
            if (r9 == r10) goto L_0x0067
            goto L_0x00ae
        L_0x0067:
            androidx.appcompat.widget.AppCompatSpinner$h r9 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r5.f1040d
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f1040d
            int[] r4 = p000.j65.Spinner
            yq6 r1 = p000.yq6.m30733v(r3, r7, r4, r8, r1)
            int r3 = p000.j65.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo28187m(r3, r4)
            r5.f1045s = r3
            int r3 = p000.j65.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo28181g(r3)
            r9.mo2193b(r3)
            int r3 = p000.j65.Spinner_android_prompt
            java.lang.String r3 = r0.mo28189o(r3)
            r9.mo2028i(r3)
            r1.mo28194w()
            r5.f1044r = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.f1041e = r1
            goto L_0x00ae
        L_0x009e:
            androidx.appcompat.widget.AppCompatSpinner$f r9 = new androidx.appcompat.widget.AppCompatSpinner$f
            r9.<init>()
            r5.f1044r = r9
            int r1 = p000.j65.Spinner_android_prompt
            java.lang.String r1 = r0.mo28189o(r1)
            r9.mo2028i(r1)
        L_0x00ae:
            int r9 = p000.j65.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.mo28191q(r9)
            if (r9 == 0) goto L_0x00c6
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = p000.i45.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00c6:
            r0.mo28194w()
            r5.f1043k = r10
            android.widget.SpinnerAdapter r6 = r5.f1042g
            if (r6 == 0) goto L_0x00d4
            r5.setAdapter((android.widget.SpinnerAdapter) r6)
            r5.f1042g = r2
        L_0x00d4:
            qm r6 = r5.f1039a
            r6.mo25147e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
