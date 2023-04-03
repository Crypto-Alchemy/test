package zendesk.belvedere;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import okhttp3.internal.http2.Http2;

@SuppressLint({"ViewConstructor"})
public class KeyboardHelper extends FrameLayout {

    /* renamed from: a */
    public final int f46643a = getStatusBarHeight();

    /* renamed from: d */
    public int f46644d = -1;

    /* renamed from: e */
    public int f46645e = -1;

    /* renamed from: g */
    public boolean f46646g = false;

    /* renamed from: k */
    public List<WeakReference<C9791c>> f46647k = new ArrayList();

    /* renamed from: r */
    public C9792d f46648r;

    /* renamed from: s */
    public EditText f46649s;

    /* renamed from: zendesk.belvedere.KeyboardHelper$a */
    public static class C9789a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ EditText f46650a;

        public C9789a(EditText editText) {
            this.f46650a = editText;
        }

        public void run() {
            InputMethodManager inputMethodManager;
            if (this.f46650a.requestFocus() && (inputMethodManager = (InputMethodManager) this.f46650a.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(this.f46650a, 1);
            }
        }
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$b */
    public class C9790b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final Activity f46651a;

        public /* synthetic */ C9790b(KeyboardHelper keyboardHelper, Activity activity, C9789a aVar) {
            this(activity);
        }

        public void onGlobalLayout() {
            boolean z;
            int a = KeyboardHelper.this.mo73669j(this.f46651a);
            KeyboardHelper keyboardHelper = KeyboardHelper.this;
            if (a > 0) {
                z = true;
            } else {
                z = false;
            }
            boolean unused = keyboardHelper.f46646g = z;
            if (a > 0 && KeyboardHelper.this.f46645e != a) {
                int unused2 = KeyboardHelper.this.f46645e = a;
                if (KeyboardHelper.this.f46648r != null) {
                    KeyboardHelper.this.f46648r.mo73677a(a);
                }
            }
            if (KeyboardHelper.this.f46647k == null || a <= 0) {
                KeyboardHelper.this.mo73670m();
            } else {
                KeyboardHelper.this.mo73671n();
            }
        }

        public C9790b(Activity activity) {
            this.f46651a = activity;
        }
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$c */
    public interface C9791c {
        void onKeyboardDismissed();

        void onKeyboardVisible();
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$d */
    public interface C9792d {
        /* renamed from: a */
        void mo73677a(int i);
    }

    public KeyboardHelper(Activity activity) {
        super(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(d25.belvedere_dummy_edit_text_size);
        setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        EditText editText = new EditText(activity);
        this.f46649s = editText;
        editText.setFocusable(true);
        this.f46649s.setFocusableInTouchMode(true);
        this.f46649s.setVisibility(0);
        this.f46649s.setImeOptions(SQLiteDatabase.CREATE_IF_NECESSARY);
        this.f46649s.setInputType(Http2.INITIAL_MAX_FRAME_SIZE);
        addView(this.f46649s);
        activity.getWindow().getDecorView().findViewById(16908290).getViewTreeObserver().addOnGlobalLayoutListener(new C9790b(this, activity, (C9789a) null));
    }

    private int getCachedInset() {
        if (this.f46644d == -1) {
            this.f46644d = getViewInset();
        }
        return this.f46644d;
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private int getViewInset() {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj == null) {
                return 0;
            }
            Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
            declaredField2.setAccessible(true);
            return ((Rect) declaredField2.get(obj)).bottom;
        } catch (Exception unused) {
            return 0;
        }
    }

    private int getViewPortHeight() {
        return (getRootView().getHeight() - this.f46643a) - getCachedInset();
    }

    /* renamed from: k */
    public static void m75398k(Activity activity) {
        InputMethodManager inputMethodManager;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: l */
    public static KeyboardHelper m75399l(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof KeyboardHelper) {
                return (KeyboardHelper) viewGroup.getChildAt(i);
            }
        }
        KeyboardHelper keyboardHelper = new KeyboardHelper(activity);
        viewGroup.addView(keyboardHelper);
        return keyboardHelper;
    }

    /* renamed from: o */
    public static void m75400o(EditText editText) {
        editText.post(new C9789a(editText));
    }

    public EditText getInputTrap() {
        return this.f46649s;
    }

    public int getKeyboardHeight() {
        return this.f46645e;
    }

    /* renamed from: i */
    public void mo73668i(C9791c cVar) {
        this.f46647k.add(new WeakReference(cVar));
    }

    /* renamed from: j */
    public final int mo73669j(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return getViewPortHeight() - (rect.bottom - rect.top);
    }

    /* renamed from: m */
    public final void mo73670m() {
        for (WeakReference next : this.f46647k) {
            if (next.get() != null) {
                ((C9791c) next.get()).onKeyboardDismissed();
            }
        }
    }

    /* renamed from: n */
    public final void mo73671n() {
        for (WeakReference next : this.f46647k) {
            if (next.get() != null) {
                ((C9791c) next.get()).onKeyboardVisible();
            }
        }
    }

    public void setKeyboardHeightListener(C9792d dVar) {
        this.f46648r = dVar;
    }
}
