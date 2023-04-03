package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;

public class AlertController {

    /* renamed from: A */
    public NestedScrollView f401A;

    /* renamed from: B */
    public int f402B = 0;

    /* renamed from: C */
    public Drawable f403C;

    /* renamed from: D */
    public ImageView f404D;

    /* renamed from: E */
    public TextView f405E;

    /* renamed from: F */
    public TextView f406F;

    /* renamed from: G */
    public View f407G;

    /* renamed from: H */
    public ListAdapter f408H;

    /* renamed from: I */
    public int f409I = -1;

    /* renamed from: J */
    public int f410J;

    /* renamed from: K */
    public int f411K;

    /* renamed from: L */
    public int f412L;

    /* renamed from: M */
    public int f413M;

    /* renamed from: N */
    public int f414N;

    /* renamed from: O */
    public int f415O;

    /* renamed from: P */
    public boolean f416P;

    /* renamed from: Q */
    public int f417Q = 0;

    /* renamed from: R */
    public Handler f418R;

    /* renamed from: S */
    public final View.OnClickListener f419S = new C0112a();

    /* renamed from: a */
    public final Context f420a;

    /* renamed from: b */
    public final C3629xm f421b;

    /* renamed from: c */
    public final Window f422c;

    /* renamed from: d */
    public final int f423d;

    /* renamed from: e */
    public CharSequence f424e;

    /* renamed from: f */
    public CharSequence f425f;

    /* renamed from: g */
    public ListView f426g;

    /* renamed from: h */
    public View f427h;

    /* renamed from: i */
    public int f428i;

    /* renamed from: j */
    public int f429j;

    /* renamed from: k */
    public int f430k;

    /* renamed from: l */
    public int f431l;

    /* renamed from: m */
    public int f432m;

    /* renamed from: n */
    public boolean f433n = false;

    /* renamed from: o */
    public Button f434o;

    /* renamed from: p */
    public CharSequence f435p;

    /* renamed from: q */
    public Message f436q;

    /* renamed from: r */
    public Drawable f437r;

    /* renamed from: s */
    public Button f438s;

    /* renamed from: t */
    public CharSequence f439t;

    /* renamed from: u */
    public Message f440u;

    /* renamed from: v */
    public Drawable f441v;

    /* renamed from: w */
    public Button f442w;

    /* renamed from: x */
    public CharSequence f443x;

    /* renamed from: y */
    public Message f444y;

    /* renamed from: z */
    public Drawable f445z;

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f446a;

        /* renamed from: d */
        public final int f447d;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public void setHasDecor(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f446a;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f447d;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j65.RecycleListView);
            this.f447d = obtainStyledAttributes.getDimensionPixelOffset(j65.RecycleListView_paddingBottomNoButtons, -1);
            this.f446a = obtainStyledAttributes.getDimensionPixelOffset(j65.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0112a implements View.OnClickListener {
        public C0112a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f434o && (message4 = alertController.f436q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f438s && (message3 = alertController.f440u) != null) {
                message = Message.obtain(message3);
            } else if (view != alertController.f442w || (message2 = alertController.f444y) == null) {
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f418R.obtainMessage(1, alertController2.f421b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0113b {

        /* renamed from: A */
        public int f449A;

        /* renamed from: B */
        public int f450B;

        /* renamed from: C */
        public int f451C;

        /* renamed from: D */
        public int f452D;

        /* renamed from: E */
        public boolean f453E = false;

        /* renamed from: F */
        public boolean[] f454F;

        /* renamed from: G */
        public boolean f455G;

        /* renamed from: H */
        public boolean f456H;

        /* renamed from: I */
        public int f457I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f458J;

        /* renamed from: K */
        public Cursor f459K;

        /* renamed from: L */
        public String f460L;

        /* renamed from: M */
        public String f461M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f462N;

        /* renamed from: O */
        public C0118e f463O;

        /* renamed from: P */
        public boolean f464P = true;

        /* renamed from: a */
        public final Context f465a;

        /* renamed from: b */
        public final LayoutInflater f466b;

        /* renamed from: c */
        public int f467c = 0;

        /* renamed from: d */
        public Drawable f468d;

        /* renamed from: e */
        public int f469e = 0;

        /* renamed from: f */
        public CharSequence f470f;

        /* renamed from: g */
        public View f471g;

        /* renamed from: h */
        public CharSequence f472h;

        /* renamed from: i */
        public CharSequence f473i;

        /* renamed from: j */
        public Drawable f474j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f475k;

        /* renamed from: l */
        public CharSequence f476l;

        /* renamed from: m */
        public Drawable f477m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f478n;

        /* renamed from: o */
        public CharSequence f479o;

        /* renamed from: p */
        public Drawable f480p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f481q;

        /* renamed from: r */
        public boolean f482r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f483s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f484t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f485u;

        /* renamed from: v */
        public CharSequence[] f486v;

        /* renamed from: w */
        public ListAdapter f487w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f488x;

        /* renamed from: y */
        public int f489y;

        /* renamed from: z */
        public View f490z;

        /* renamed from: androidx.appcompat.app.AlertController$b$a */
        public class C0114a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f491a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0114a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f491a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0113b.this.f454F;
                if (zArr != null && zArr[i]) {
                    this.f491a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        public class C0115b extends CursorAdapter {

            /* renamed from: a */
            public final int f493a;

            /* renamed from: d */
            public final int f494d;

            /* renamed from: e */
            public final /* synthetic */ RecycleListView f495e;

            /* renamed from: g */
            public final /* synthetic */ AlertController f496g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0115b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f495e = recycleListView;
                this.f496g = alertController;
                Cursor cursor2 = getCursor();
                this.f493a = cursor2.getColumnIndexOrThrow(C0113b.this.f460L);
                this.f494d = cursor2.getColumnIndexOrThrow(C0113b.this.f461M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f493a));
                RecycleListView recycleListView = this.f495e;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f494d) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0113b.this.f466b.inflate(this.f496g.f413M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$c */
        public class C0116c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AlertController f498a;

            public C0116c(AlertController alertController) {
                this.f498a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0113b.this.f488x.onClick(this.f498a.f421b, i);
                if (!C0113b.this.f456H) {
                    this.f498a.f421b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$d */
        public class C0117d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f500a;

            /* renamed from: d */
            public final /* synthetic */ AlertController f501d;

            public C0117d(RecycleListView recycleListView, AlertController alertController) {
                this.f500a = recycleListView;
                this.f501d = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0113b.this.f454F;
                if (zArr != null) {
                    zArr[i] = this.f500a.isItemChecked(i);
                }
                C0113b.this.f458J.onClick(this.f501d.f421b, i, this.f500a.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$e */
        public interface C0118e {
            /* renamed from: a */
            void mo1012a(ListView listView);
        }

        public C0113b(Context context) {
            this.f465a = context;
            this.f482r = true;
            this.f466b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void mo1005a(AlertController alertController) {
            View view = this.f471g;
            if (view != null) {
                alertController.mo989k(view);
            } else {
                CharSequence charSequence = this.f470f;
                if (charSequence != null) {
                    alertController.mo994p(charSequence);
                }
                Drawable drawable = this.f468d;
                if (drawable != null) {
                    alertController.mo991m(drawable);
                }
                int i = this.f467c;
                if (i != 0) {
                    alertController.mo990l(i);
                }
                int i2 = this.f469e;
                if (i2 != 0) {
                    alertController.mo990l(alertController.mo981c(i2));
                }
            }
            CharSequence charSequence2 = this.f472h;
            if (charSequence2 != null) {
                alertController.mo992n(charSequence2);
            }
            CharSequence charSequence3 = this.f473i;
            if (!(charSequence3 == null && this.f474j == null)) {
                alertController.mo988j(-1, charSequence3, this.f475k, (Message) null, this.f474j);
            }
            CharSequence charSequence4 = this.f476l;
            if (!(charSequence4 == null && this.f477m == null)) {
                alertController.mo988j(-2, charSequence4, this.f478n, (Message) null, this.f477m);
            }
            CharSequence charSequence5 = this.f479o;
            if (!(charSequence5 == null && this.f480p == null)) {
                alertController.mo988j(-3, charSequence5, this.f481q, (Message) null, this.f480p);
            }
            if (!(this.f486v == null && this.f459K == null && this.f487w == null)) {
                mo1006b(alertController);
            }
            View view2 = this.f490z;
            if (view2 == null) {
                int i3 = this.f489y;
                if (i3 != 0) {
                    alertController.mo995q(i3);
                }
            } else if (this.f453E) {
                alertController.mo997s(view2, this.f449A, this.f450B, this.f451C, this.f452D);
            } else {
                alertController.mo996r(view2);
            }
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1006b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f466b
                int r1 = r11.f412L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f455G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f459K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$b$a r9 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r10.f465a
                int r4 = r11.f413M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f486v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$b$b r9 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r10.f465a
                android.database.Cursor r4 = r10.f459K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f456H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f414N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f415O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f459K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f465a
                android.database.Cursor r5 = r10.f459K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f460L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f487w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$d r9 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r10.f465a
                java.lang.CharSequence[] r3 = r10.f486v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$b$e r1 = r10.f463O
                if (r1 == 0) goto L_0x0072
                r1.mo1012a(r0)
            L_0x0072:
                r11.f408H = r9
                int r1 = r10.f457I
                r11.f409I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f488x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f458J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f462N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.f456H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.f455G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f426g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0113b.mo1006b(androidx.appcompat.app.AlertController):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C0119c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f503a;

        public C0119c(DialogInterface dialogInterface) {
            this.f503a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f503a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0120d extends ArrayAdapter<CharSequence> {
        public C0120d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C3629xm xmVar, Window window) {
        this.f420a = context;
        this.f421b = xmVar;
        this.f422c = window;
        this.f418R = new C0119c(xmVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j65.AlertDialog, m15.alertDialogStyle, 0);
        this.f410J = obtainStyledAttributes.getResourceId(j65.AlertDialog_android_layout, 0);
        this.f411K = obtainStyledAttributes.getResourceId(j65.AlertDialog_buttonPanelSideLayout, 0);
        this.f412L = obtainStyledAttributes.getResourceId(j65.AlertDialog_listLayout, 0);
        this.f413M = obtainStyledAttributes.getResourceId(j65.AlertDialog_multiChoiceItemLayout, 0);
        this.f414N = obtainStyledAttributes.getResourceId(j65.AlertDialog_singleChoiceItemLayout, 0);
        this.f415O = obtainStyledAttributes.getResourceId(j65.AlertDialog_listItemLayout, 0);
        this.f416P = obtainStyledAttributes.getBoolean(j65.AlertDialog_showTitle, true);
        this.f423d = obtainStyledAttributes.getDimensionPixelSize(j65.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        xmVar.supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    public static boolean m688a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m688a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m689y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(m15.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo980b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public int mo981c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f420a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo982d() {
        return this.f426g;
    }

    /* renamed from: e */
    public void mo983e() {
        this.f421b.setContentView(mo987i());
        mo1002x();
    }

    /* renamed from: f */
    public boolean mo984f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f401A;
        if (nestedScrollView == null || !nestedScrollView.mo5426m(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo985g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f401A;
        if (nestedScrollView == null || !nestedScrollView.mo5426m(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final ViewGroup mo986h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: i */
    public final int mo987i() {
        int i = this.f411K;
        if (i == 0) {
            return this.f410J;
        }
        if (this.f417Q == 1) {
            return i;
        }
        return this.f410J;
    }

    /* renamed from: j */
    public void mo988j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f418R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f443x = charSequence;
            this.f444y = message;
            this.f445z = drawable;
        } else if (i == -2) {
            this.f439t = charSequence;
            this.f440u = message;
            this.f441v = drawable;
        } else if (i == -1) {
            this.f435p = charSequence;
            this.f436q = message;
            this.f437r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: k */
    public void mo989k(View view) {
        this.f407G = view;
    }

    /* renamed from: l */
    public void mo990l(int i) {
        this.f403C = null;
        this.f402B = i;
        ImageView imageView = this.f404D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f404D.setImageResource(this.f402B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: m */
    public void mo991m(Drawable drawable) {
        this.f403C = drawable;
        this.f402B = 0;
        ImageView imageView = this.f404D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f404D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo992n(CharSequence charSequence) {
        this.f425f = charSequence;
        TextView textView = this.f406F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: o */
    public final void mo993o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f422c.findViewById(j35.scrollIndicatorUp);
        View findViewById2 = this.f422c.findViewById(j35.scrollIndicatorDown);
        ga7.m17728H0(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: p */
    public void mo994p(CharSequence charSequence) {
        this.f424e = charSequence;
        TextView textView = this.f405E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo995q(int i) {
        this.f427h = null;
        this.f428i = i;
        this.f433n = false;
    }

    /* renamed from: r */
    public void mo996r(View view) {
        this.f427h = view;
        this.f428i = 0;
        this.f433n = false;
    }

    /* renamed from: s */
    public void mo997s(View view, int i, int i2, int i3, int i4) {
        this.f427h = view;
        this.f428i = 0;
        this.f433n = true;
        this.f429j = i;
        this.f430k = i2;
        this.f431l = i3;
        this.f432m = i4;
    }

    /* renamed from: t */
    public final void mo998t(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f434o = button;
        button.setOnClickListener(this.f419S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f435p) || this.f437r != null) {
            this.f434o.setText(this.f435p);
            Drawable drawable = this.f437r;
            if (drawable != null) {
                int i = this.f423d;
                drawable.setBounds(0, 0, i, i);
                this.f434o.setCompoundDrawables(this.f437r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f434o.setVisibility(0);
            z = true;
        } else {
            this.f434o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f438s = button2;
        button2.setOnClickListener(this.f419S);
        if (!TextUtils.isEmpty(this.f439t) || this.f441v != null) {
            this.f438s.setText(this.f439t);
            Drawable drawable2 = this.f441v;
            if (drawable2 != null) {
                int i2 = this.f423d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f438s.setCompoundDrawables(this.f441v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f438s.setVisibility(0);
            z |= true;
        } else {
            this.f438s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f442w = button3;
        button3.setOnClickListener(this.f419S);
        if (!TextUtils.isEmpty(this.f443x) || this.f445z != null) {
            this.f442w.setText(this.f443x);
            Drawable drawable3 = this.f445z;
            if (drawable3 != null) {
                int i3 = this.f423d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f442w.setCompoundDrawables(this.f445z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f442w.setVisibility(0);
            z |= true;
        } else {
            this.f442w.setVisibility(8);
        }
        if (m689y(this.f420a)) {
            if (z) {
                mo980b(this.f434o);
            } else if (z) {
                mo980b(this.f438s);
            } else if (z) {
                mo980b(this.f442w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: u */
    public final void mo999u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f422c.findViewById(j35.scrollView);
        this.f401A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f401A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f406F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f425f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f401A.removeView(this.f406F);
            if (this.f426g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f401A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f401A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f426g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    public final void mo1000v(ViewGroup viewGroup) {
        View view = this.f427h;
        boolean z = false;
        if (view == null) {
            if (this.f428i != 0) {
                view = LayoutInflater.from(this.f420a).inflate(this.f428i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m688a(view)) {
            this.f422c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f422c.findViewById(j35.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f433n) {
                frameLayout.setPadding(this.f429j, this.f430k, this.f431l, this.f432m);
            }
            if (this.f426g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = Utils.FLOAT_EPSILON;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    public final void mo1001w(ViewGroup viewGroup) {
        if (this.f407G != null) {
            viewGroup.addView(this.f407G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f422c.findViewById(j35.title_template).setVisibility(8);
            return;
        }
        this.f404D = (ImageView) this.f422c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f424e)) || !this.f416P) {
            this.f422c.findViewById(j35.title_template).setVisibility(8);
            this.f404D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f422c.findViewById(j35.alertTitle);
        this.f405E = textView;
        textView.setText(this.f424e);
        int i = this.f402B;
        if (i != 0) {
            this.f404D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f403C;
        if (drawable != null) {
            this.f404D.setImageDrawable(drawable);
            return;
        }
        this.f405E.setPadding(this.f404D.getPaddingLeft(), this.f404D.getPaddingTop(), this.f404D.getPaddingRight(), this.f404D.getPaddingBottom());
        this.f404D.setVisibility(8);
    }

    /* renamed from: x */
    public final void mo1002x() {
        boolean z;
        boolean z2;
        boolean z3;
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f422c.findViewById(j35.parentPanel);
        int i = j35.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = j35.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = j35.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(j35.customPanel);
        mo1000v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup h = mo986h(findViewById7, findViewById4);
        ViewGroup h2 = mo986h(findViewById8, findViewById5);
        ViewGroup h3 = mo986h(findViewById9, findViewById6);
        mo999u(h2);
        mo998t(h3);
        mo1001w(h);
        char c = 0;
        if (viewGroup.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        if (h == null || h.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (h3 == null || h3.getVisibility() == 8) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(z3 || h2 == null || (findViewById2 = h2.findViewById(j35.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f401A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f425f == null && this.f426g == null)) {
                view = h.findViewById(j35.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(h2 == null || (findViewById = h2.findViewById(j35.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f426g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view2 = this.f426g;
            if (view2 == null) {
                view2 = this.f401A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                mo993o(h2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f426g;
        if (listView2 != null && (listAdapter = this.f408H) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.f409I;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }
}
