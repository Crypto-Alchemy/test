package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import p000.C3658y8;

/* renamed from: t8 */
/* compiled from: AccessibilityNodeInfoCompat */
public class C3335t8 {

    /* renamed from: d */
    public static int f17979d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f17980a;

    /* renamed from: b */
    public int f17981b = -1;

    /* renamed from: c */
    public int f17982c = -1;

    /* renamed from: t8$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3336a {

        /* renamed from: A */
        public static final C3336a f17983A = new C3336a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);

        /* renamed from: B */
        public static final C3336a f17984B = new C3336a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (C3658y8) null, C3658y8.C3663e.class);

        /* renamed from: C */
        public static final C3336a f17985C = new C3336a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);

        /* renamed from: D */
        public static final C3336a f17986D = new C3336a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);

        /* renamed from: E */
        public static final C3336a f17987E = new C3336a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);

        /* renamed from: F */
        public static final C3336a f17988F = new C3336a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);

        /* renamed from: G */
        public static final C3336a f17989G;

        /* renamed from: H */
        public static final C3336a f17990H;

        /* renamed from: I */
        public static final C3336a f17991I;

        /* renamed from: J */
        public static final C3336a f17992J;

        /* renamed from: K */
        public static final C3336a f17993K = new C3336a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);

        /* renamed from: L */
        public static final C3336a f17994L;

        /* renamed from: M */
        public static final C3336a f17995M;

        /* renamed from: N */
        public static final C3336a f17996N;

        /* renamed from: O */
        public static final C3336a f17997O;

        /* renamed from: P */
        public static final C3336a f17998P;

        /* renamed from: Q */
        public static final C3336a f17999Q;

        /* renamed from: R */
        public static final C3336a f18000R;

        /* renamed from: S */
        public static final C3336a f18001S;

        /* renamed from: T */
        public static final C3336a f18002T;

        /* renamed from: U */
        public static final C3336a f18003U;

        /* renamed from: e */
        public static final C3336a f18004e = new C3336a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C3336a f18005f = new C3336a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C3336a f18006g = new C3336a(4, (CharSequence) null);

        /* renamed from: h */
        public static final C3336a f18007h = new C3336a(8, (CharSequence) null);

        /* renamed from: i */
        public static final C3336a f18008i = new C3336a(16, (CharSequence) null);

        /* renamed from: j */
        public static final C3336a f18009j = new C3336a(32, (CharSequence) null);

        /* renamed from: k */
        public static final C3336a f18010k = new C3336a(64, (CharSequence) null);

        /* renamed from: l */
        public static final C3336a f18011l = new C3336a(128, (CharSequence) null);

        /* renamed from: m */
        public static final C3336a f18012m;

        /* renamed from: n */
        public static final C3336a f18013n;

        /* renamed from: o */
        public static final C3336a f18014o;

        /* renamed from: p */
        public static final C3336a f18015p;

        /* renamed from: q */
        public static final C3336a f18016q = new C3336a(4096, (CharSequence) null);

        /* renamed from: r */
        public static final C3336a f18017r = new C3336a(8192, (CharSequence) null);

        /* renamed from: s */
        public static final C3336a f18018s = new C3336a(Http2.INITIAL_MAX_FRAME_SIZE, (CharSequence) null);

        /* renamed from: t */
        public static final C3336a f18019t = new C3336a(32768, (CharSequence) null);

        /* renamed from: u */
        public static final C3336a f18020u = new C3336a(65536, (CharSequence) null);

        /* renamed from: v */
        public static final C3336a f18021v = new C3336a(131072, (CharSequence) null, (Class<? extends C3658y8.C3659a>) C3658y8.C3665g.class);

        /* renamed from: w */
        public static final C3336a f18022w = new C3336a(262144, (CharSequence) null);

        /* renamed from: x */
        public static final C3336a f18023x = new C3336a(524288, (CharSequence) null);

        /* renamed from: y */
        public static final C3336a f18024y = new C3336a(1048576, (CharSequence) null);

        /* renamed from: z */
        public static final C3336a f18025z = new C3336a(2097152, (CharSequence) null, (Class<? extends C3658y8.C3659a>) C3658y8.C3666h.class);

        /* renamed from: a */
        public final Object f18026a;

        /* renamed from: b */
        public final int f18027b;

        /* renamed from: c */
        public final Class<? extends C3658y8.C3659a> f18028c;

        /* renamed from: d */
        public final C3658y8 f18029d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            Class<C3658y8.C3661c> cls = C3658y8.C3661c.class;
            Class<C3658y8.C3660b> cls2 = C3658y8.C3660b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = null;
            f18012m = new C3336a(256, (CharSequence) null, (Class<? extends C3658y8.C3659a>) cls2);
            f18013n = new C3336a((int) RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, (CharSequence) null, (Class<? extends C3658y8.C3659a>) cls2);
            f18014o = new C3336a((int) RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, (CharSequence) null, (Class<? extends C3658y8.C3659a>) cls);
            f18015p = new C3336a(2048, (CharSequence) null, (Class<? extends C3658y8.C3659a>) cls);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction = null;
            }
            f17989G = new C3336a(accessibilityAction, 16908358, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 29) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction2 = null;
            }
            f17990H = new C3336a(accessibilityAction2, 16908359, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            f17991I = new C3336a(accessibilityAction3, 16908360, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 29) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction4 = null;
            }
            f17992J = new C3336a(accessibilityAction4, 16908361, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 24) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction5 = null;
            }
            f17994L = new C3336a(accessibilityAction5, 16908349, (CharSequence) null, (C3658y8) null, C3658y8.C3664f.class);
            if (i >= 26) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction6 = null;
            }
            f17995M = new C3336a(accessibilityAction6, 16908354, (CharSequence) null, (C3658y8) null, C3658y8.C3662d.class);
            if (i >= 28) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction7 = null;
            }
            f17996N = new C3336a(accessibilityAction7, 16908356, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 28) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction8 = null;
            }
            f17997O = new C3336a(accessibilityAction8, 16908357, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction9 = null;
            }
            f17998P = new C3336a(accessibilityAction9, 16908362, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 30) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityAction10 = null;
            }
            f17999Q = new C3336a(accessibilityAction10, 16908372, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction11 = null;
            }
            f18000R = new C3336a(accessibilityAction11, 16908373, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction12 = null;
            }
            f18001S = new C3336a(accessibilityAction12, 16908374, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction13 = null;
            }
            f18002T = new C3336a(accessibilityAction13, 16908375, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
            if (i >= 33) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f18003U = new C3336a(accessibilityAction14, 16908376, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
        }

        public C3336a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
        }

        /* renamed from: a */
        public C3336a mo26280a(CharSequence charSequence, C3658y8 y8Var) {
            return new C3336a((Object) null, this.f18027b, charSequence, y8Var, this.f18028c);
        }

        /* renamed from: b */
        public int mo26281b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f18026a).getId();
        }

        /* renamed from: c */
        public CharSequence mo26282c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f18026a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26283d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                y8 r0 = r4.f18029d
                r1 = 0
                if (r0 == 0) goto L_0x003d
                r0 = 0
                java.lang.Class<? extends y8$a> r2 = r4.f18028c
                if (r2 == 0) goto L_0x0036
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x001e }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x001e }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x001e }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x001e }
                y8$a r1 = (p000.C3658y8.C3659a) r1     // Catch:{ Exception -> 0x001e }
                r1.mo27984a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0036
            L_0x001d:
                r0 = r1
            L_0x001e:
                java.lang.Class<? extends y8$a> r6 = r4.f18028c
                if (r6 != 0) goto L_0x0025
                java.lang.String r6 = "null"
                goto L_0x0029
            L_0x0025:
                java.lang.String r6 = r6.getName()
            L_0x0029:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to execute command with argument class ViewCommandArgument: "
                r1.append(r2)
                r1.append(r6)
            L_0x0036:
                y8 r6 = r4.f18029d
                boolean r5 = r6.mo5572a(r5, r0)
                return r5
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C3335t8.C3336a.mo26283d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C3336a)) {
                return false;
            }
            C3336a aVar = (C3336a) obj;
            Object obj2 = this.f18026a;
            if (obj2 == null) {
                if (aVar.f18026a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f18026a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f18026a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C3336a(int i, CharSequence charSequence, C3658y8 y8Var) {
            this((Object) null, i, charSequence, y8Var, (Class<? extends C3658y8.C3659a>) null);
        }

        public C3336a(Object obj) {
            this(obj, 0, (CharSequence) null, (C3658y8) null, (Class<? extends C3658y8.C3659a>) null);
        }

        public C3336a(int i, CharSequence charSequence, Class<? extends C3658y8.C3659a> cls) {
            this((Object) null, i, charSequence, (C3658y8) null, cls);
        }

        public C3336a(Object obj, int i, CharSequence charSequence, C3658y8 y8Var, Class<? extends C3658y8.C3659a> cls) {
            this.f18027b = i;
            this.f18029d = y8Var;
            if (obj == null) {
                this.f18026a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f18026a = obj;
            }
            this.f18028c = cls;
        }
    }

    /* renamed from: t8$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3337b {

        /* renamed from: a */
        public final Object f18030a;

        public C3337b(Object obj) {
            this.f18030a = obj;
        }

        /* renamed from: a */
        public static C3337b m27594a(int i, int i2, boolean z) {
            return new C3337b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: b */
        public static C3337b m27595b(int i, int i2, boolean z, int i3) {
            return new C3337b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: t8$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3338c {

        /* renamed from: a */
        public final Object f18031a;

        public C3338c(Object obj) {
            this.f18031a = obj;
        }

        /* renamed from: a */
        public static C3338c m27596a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C3338c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* renamed from: t8$d */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3339d {

        /* renamed from: a */
        public final Object f18032a;

        public C3339d(Object obj) {
            this.f18032a = obj;
        }

        /* renamed from: a */
        public static C3339d m27597a(int i, float f, float f2, float f3) {
            return new C3339d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public C3335t8(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f17980a = accessibilityNodeInfo;
    }

    /* renamed from: R */
    public static C3335t8 m27493R() {
        return m27495S0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: S */
    public static C3335t8 m27494S(C3335t8 t8Var) {
        return m27495S0(AccessibilityNodeInfo.obtain(t8Var.f17980a));
    }

    /* renamed from: S0 */
    public static C3335t8 m27495S0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3335t8(accessibilityNodeInfo);
    }

    /* renamed from: T */
    public static C3335t8 m27496T(View view) {
        return m27495S0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: j */
    public static String m27497j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /*16384*/:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: q */
    public static ClickableSpan[] m27498q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public String mo26186A() {
        if (x40.m29875d()) {
            return this.f17980a.getUniqueId();
        }
        return this.f17980a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: A0 */
    public void mo26187A0(View view) {
        this.f17981b = -1;
        this.f17980a.setParent(view);
    }

    /* renamed from: B */
    public String mo26188B() {
        return this.f17980a.getViewIdResourceName();
    }

    /* renamed from: B0 */
    public void mo26189B0(View view, int i) {
        this.f17981b = i;
        this.f17980a.setParent(view, i);
    }

    /* renamed from: C */
    public final boolean mo26190C() {
        return !mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: C0 */
    public void mo26191C0(boolean z) {
        this.f17980a.setPassword(z);
    }

    /* renamed from: D */
    public final int mo26192D(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f17979d;
        f17979d = i2 + 1;
        return i2;
    }

    /* renamed from: D0 */
    public void mo26193D0(C3339d dVar) {
        this.f17980a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f18032a);
    }

    /* renamed from: E */
    public boolean mo26194E() {
        return this.f17980a.isAccessibilityFocused();
    }

    /* renamed from: E0 */
    public void mo26195E0(CharSequence charSequence) {
        this.f17980a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: F */
    public boolean mo26196F() {
        return this.f17980a.isCheckable();
    }

    /* renamed from: F0 */
    public void mo26197F0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17980a.setScreenReaderFocusable(z);
        } else {
            mo26226Z(1, z);
        }
    }

    /* renamed from: G */
    public boolean mo26198G() {
        return this.f17980a.isChecked();
    }

    /* renamed from: G0 */
    public void mo26199G0(boolean z) {
        this.f17980a.setScrollable(z);
    }

    /* renamed from: H */
    public boolean mo26200H() {
        return this.f17980a.isClickable();
    }

    /* renamed from: H0 */
    public void mo26201H0(boolean z) {
        this.f17980a.setSelected(z);
    }

    /* renamed from: I */
    public boolean mo26202I() {
        return this.f17980a.isEnabled();
    }

    /* renamed from: I0 */
    public void mo26203I0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17980a.setShowingHintText(z);
        } else {
            mo26226Z(4, z);
        }
    }

    /* renamed from: J */
    public boolean mo26204J() {
        return this.f17980a.isFocusable();
    }

    /* renamed from: J0 */
    public void mo26205J0(View view) {
        this.f17982c = -1;
        this.f17980a.setSource(view);
    }

    /* renamed from: K */
    public boolean mo26206K() {
        return this.f17980a.isFocused();
    }

    /* renamed from: K0 */
    public void mo26207K0(View view, int i) {
        this.f17982c = i;
        this.f17980a.setSource(view, i);
    }

    /* renamed from: L */
    public boolean mo26208L() {
        return this.f17980a.isLongClickable();
    }

    /* renamed from: L0 */
    public void mo26209L0(CharSequence charSequence) {
        if (x40.m29873b()) {
            this.f17980a.setStateDescription(charSequence);
        } else {
            this.f17980a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: M */
    public boolean mo26210M() {
        return this.f17980a.isPassword();
    }

    /* renamed from: M0 */
    public void mo26211M0(CharSequence charSequence) {
        this.f17980a.setText(charSequence);
    }

    /* renamed from: N */
    public boolean mo26212N() {
        return this.f17980a.isScrollable();
    }

    /* renamed from: N0 */
    public void mo26213N0(int i, int i2) {
        this.f17980a.setTextSelection(i, i2);
    }

    /* renamed from: O */
    public boolean mo26214O() {
        return this.f17980a.isSelected();
    }

    /* renamed from: O0 */
    public void mo26215O0(View view) {
        this.f17980a.setTraversalAfter(view);
    }

    /* renamed from: P */
    public boolean mo26216P() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f17980a.isShowingHintText();
        }
        return mo26250l(4);
    }

    /* renamed from: P0 */
    public void mo26217P0(String str) {
        this.f17980a.setViewIdResourceName(str);
    }

    /* renamed from: Q */
    public boolean mo26218Q() {
        return this.f17980a.isVisibleToUser();
    }

    /* renamed from: Q0 */
    public void mo26219Q0(boolean z) {
        this.f17980a.setVisibleToUser(z);
    }

    /* renamed from: R0 */
    public AccessibilityNodeInfo mo26220R0() {
        return this.f17980a;
    }

    /* renamed from: U */
    public boolean mo26221U(int i, Bundle bundle) {
        return this.f17980a.performAction(i, bundle);
    }

    /* renamed from: V */
    public void mo26222V() {
        this.f17980a.recycle();
    }

    /* renamed from: W */
    public boolean mo26223W(C3336a aVar) {
        return this.f17980a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f18026a);
    }

    /* renamed from: X */
    public final void mo26224X(View view) {
        SparseArray<WeakReference<ClickableSpan>> x = mo26274x(view);
        if (x != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < x.size(); i++) {
                if (x.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                x.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: Y */
    public void mo26225Y(boolean z) {
        this.f17980a.setAccessibilityFocused(z);
    }

    /* renamed from: Z */
    public final void mo26226Z(int i, boolean z) {
        Bundle s = mo26263s();
        if (s != null) {
            int i2 = s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: a */
    public void mo26227a(int i) {
        this.f17980a.addAction(i);
    }

    @Deprecated
    /* renamed from: a0 */
    public void mo26228a0(Rect rect) {
        this.f17980a.setBoundsInParent(rect);
    }

    /* renamed from: b */
    public void mo26229b(C3336a aVar) {
        this.f17980a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f18026a);
    }

    /* renamed from: b0 */
    public void mo26230b0(Rect rect) {
        this.f17980a.setBoundsInScreen(rect);
    }

    /* renamed from: c */
    public void mo26231c(View view) {
        this.f17980a.addChild(view);
    }

    /* renamed from: c0 */
    public void mo26232c0(boolean z) {
        this.f17980a.setCanOpenPopup(z);
    }

    /* renamed from: d */
    public void mo26233d(View view, int i) {
        this.f17980a.addChild(view, i);
    }

    /* renamed from: d0 */
    public void mo26234d0(boolean z) {
        this.f17980a.setCheckable(z);
    }

    /* renamed from: e */
    public final void mo26235e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: e0 */
    public void mo26236e0(boolean z) {
        this.f17980a.setChecked(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3335t8)) {
            return false;
        }
        C3335t8 t8Var = (C3335t8) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f17980a;
        if (accessibilityNodeInfo == null) {
            if (t8Var.f17980a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(t8Var.f17980a)) {
            return false;
        }
        if (this.f17982c == t8Var.f17982c && this.f17981b == t8Var.f17981b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo26238f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            mo26240g();
            mo26224X(view);
            ClickableSpan[] q = m27498q(charSequence);
            if (q != null && q.length > 0) {
                mo26263s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", q35.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> v = mo26270v(view);
                for (int i = 0; i < q.length; i++) {
                    int D = mo26192D(q[i], v);
                    v.put(D, new WeakReference(q[i]));
                    mo26235e(q[i], (Spanned) charSequence, D);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo26239f0(CharSequence charSequence) {
        this.f17980a.setClassName(charSequence);
    }

    /* renamed from: g */
    public final void mo26240g() {
        this.f17980a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f17980a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f17980a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f17980a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: g0 */
    public void mo26241g0(boolean z) {
        this.f17980a.setClickable(z);
    }

    /* renamed from: h */
    public final List<Integer> mo26242h(String str) {
        ArrayList<Integer> integerArrayList = this.f17980a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f17980a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: h0 */
    public void mo26243h0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f17980a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C3337b) obj).f18030a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f17980a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C3336a> mo26245i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f17980a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3336a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void mo26246i0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f17980a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C3338c) obj).f18031a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: j0 */
    public void mo26247j0(CharSequence charSequence) {
        this.f17980a.setContentDescription(charSequence);
    }

    @Deprecated
    /* renamed from: k */
    public int mo26248k() {
        return this.f17980a.getActions();
    }

    /* renamed from: k0 */
    public void mo26249k0(boolean z) {
        this.f17980a.setContentInvalid(z);
    }

    /* renamed from: l */
    public final boolean mo26250l(int i) {
        Bundle s = mo26263s();
        if (s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    public void mo26251l0(boolean z) {
        this.f17980a.setDismissable(z);
    }

    @Deprecated
    /* renamed from: m */
    public void mo26252m(Rect rect) {
        this.f17980a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void mo26253m0(boolean z) {
        this.f17980a.setEditable(z);
    }

    /* renamed from: n */
    public void mo26254n(Rect rect) {
        this.f17980a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void mo26255n0(boolean z) {
        this.f17980a.setEnabled(z);
    }

    /* renamed from: o */
    public int mo26256o() {
        return this.f17980a.getChildCount();
    }

    /* renamed from: o0 */
    public void mo26257o0(CharSequence charSequence) {
        this.f17980a.setError(charSequence);
    }

    /* renamed from: p */
    public CharSequence mo26258p() {
        return this.f17980a.getClassName();
    }

    /* renamed from: p0 */
    public void mo26259p0(boolean z) {
        this.f17980a.setFocusable(z);
    }

    /* renamed from: q0 */
    public void mo26260q0(boolean z) {
        this.f17980a.setFocused(z);
    }

    /* renamed from: r */
    public CharSequence mo26261r() {
        return this.f17980a.getContentDescription();
    }

    /* renamed from: r0 */
    public void mo26262r0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17980a.setHeading(z);
        } else {
            mo26226Z(2, z);
        }
    }

    /* renamed from: s */
    public Bundle mo26263s() {
        return this.f17980a.getExtras();
    }

    /* renamed from: s0 */
    public void mo26264s0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17980a.setHintText(charSequence);
        } else {
            this.f17980a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public CharSequence mo26265t() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f17980a.getHintText();
        }
        return this.f17980a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    /* renamed from: t0 */
    public void mo26266t0(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17980a.setImportantForAccessibility(z);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo26252m(rect);
        sb.append("; boundsInParent: " + rect);
        mo26254n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo26272w());
        sb.append("; className: ");
        sb.append(mo26258p());
        sb.append("; text: ");
        sb.append(mo26278z());
        sb.append("; contentDescription: ");
        sb.append(mo26261r());
        sb.append("; viewId: ");
        sb.append(mo26188B());
        sb.append("; uniqueId: ");
        sb.append(mo26186A());
        sb.append("; checkable: ");
        sb.append(mo26196F());
        sb.append("; checked: ");
        sb.append(mo26198G());
        sb.append("; focusable: ");
        sb.append(mo26204J());
        sb.append("; focused: ");
        sb.append(mo26206K());
        sb.append("; selected: ");
        sb.append(mo26214O());
        sb.append("; clickable: ");
        sb.append(mo26200H());
        sb.append("; longClickable: ");
        sb.append(mo26208L());
        sb.append("; enabled: ");
        sb.append(mo26202I());
        sb.append("; password: ");
        sb.append(mo26210M());
        sb.append("; scrollable: " + mo26212N());
        sb.append("; [");
        List<C3336a> i = mo26245i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            C3336a aVar = i.get(i2);
            String j = m27497j(aVar.mo26281b());
            if (j.equals("ACTION_UNKNOWN") && aVar.mo26282c() != null) {
                j = aVar.mo26282c().toString();
            }
            sb.append(j);
            if (i2 != i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public int mo26268u() {
        return this.f17980a.getMovementGranularities();
    }

    /* renamed from: u0 */
    public void mo26269u0(int i) {
        this.f17980a.setLiveRegion(i);
    }

    /* renamed from: v */
    public final SparseArray<WeakReference<ClickableSpan>> mo26270v(View view) {
        SparseArray<WeakReference<ClickableSpan>> x = mo26274x(view);
        if (x != null) {
            return x;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(q35.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: v0 */
    public void mo26271v0(boolean z) {
        this.f17980a.setLongClickable(z);
    }

    /* renamed from: w */
    public CharSequence mo26272w() {
        return this.f17980a.getPackageName();
    }

    /* renamed from: w0 */
    public void mo26273w0(int i) {
        this.f17980a.setMaxTextLength(i);
    }

    /* renamed from: x */
    public final SparseArray<WeakReference<ClickableSpan>> mo26274x(View view) {
        return (SparseArray) view.getTag(q35.tag_accessibility_clickable_spans);
    }

    /* renamed from: x0 */
    public void mo26275x0(int i) {
        this.f17980a.setMovementGranularities(i);
    }

    /* renamed from: y */
    public CharSequence mo26276y() {
        if (x40.m29873b()) {
            return this.f17980a.getStateDescription();
        }
        return this.f17980a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* renamed from: y0 */
    public void mo26277y0(CharSequence charSequence) {
        this.f17980a.setPackageName(charSequence);
    }

    /* renamed from: z */
    public CharSequence mo26278z() {
        if (!mo26190C()) {
            return this.f17980a.getText();
        }
        List<Integer> h = mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = mo26242h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f17980a.getText(), 0, this.f17980a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C3657y7(h4.get(i).intValue(), this, mo26263s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: z0 */
    public void mo26279z0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17980a.setPaneTitle(charSequence);
        } else {
            this.f17980a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }
}
