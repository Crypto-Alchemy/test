package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0593c;
import androidx.emoji2.text.C0610f;
import java.util.Arrays;

/* renamed from: androidx.emoji2.text.d */
/* compiled from: EmojiProcessor */
public final class C0604d {

    /* renamed from: a */
    public final C0593c.C0603i f3562a;

    /* renamed from: b */
    public final C0610f f3563b;

    /* renamed from: c */
    public C0593c.C0598d f3564c;

    /* renamed from: d */
    public final boolean f3565d;

    /* renamed from: e */
    public final int[] f3566e;

    /* renamed from: androidx.emoji2.text.d$a */
    /* compiled from: EmojiProcessor */
    public static final class C0605a {
        /* renamed from: a */
        public static int m4563a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i >= 0) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isHighSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                        } else if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        } else {
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        public static int m4564b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.d$b */
    /* compiled from: EmojiProcessor */
    public static final class C0606b {

        /* renamed from: a */
        public int f3567a = 1;

        /* renamed from: b */
        public final C0610f.C0611a f3568b;

        /* renamed from: c */
        public C0610f.C0611a f3569c;

        /* renamed from: d */
        public C0610f.C0611a f3570d;

        /* renamed from: e */
        public int f3571e;

        /* renamed from: f */
        public int f3572f;

        /* renamed from: g */
        public final boolean f3573g;

        /* renamed from: h */
        public final int[] f3574h;

        public C0606b(C0610f.C0611a aVar, boolean z, int[] iArr) {
            this.f3568b = aVar;
            this.f3569c = aVar;
            this.f3573g = z;
            this.f3574h = iArr;
        }

        /* renamed from: d */
        public static boolean m4565d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        public static boolean m4566f(int i) {
            return i == 65038;
        }

        /* renamed from: a */
        public int mo5645a(int i) {
            C0610f.C0611a a = this.f3569c.mo5667a(i);
            int i2 = 3;
            if (this.f3567a != 2) {
                if (a == null) {
                    i2 = mo5649g();
                    this.f3571e = i;
                    return i2;
                }
                this.f3567a = 2;
                this.f3569c = a;
                this.f3572f = 1;
            } else if (a != null) {
                this.f3569c = a;
                this.f3572f++;
            } else {
                if (m4566f(i)) {
                    i2 = mo5649g();
                } else if (!m4565d(i)) {
                    if (this.f3569c.mo5668b() == null) {
                        i2 = mo5649g();
                    } else if (this.f3572f != 1) {
                        this.f3570d = this.f3569c;
                        mo5649g();
                    } else if (mo5650h()) {
                        this.f3570d = this.f3569c;
                        mo5649g();
                    } else {
                        i2 = mo5649g();
                    }
                }
                this.f3571e = i;
                return i2;
            }
            i2 = 2;
            this.f3571e = i;
            return i2;
        }

        /* renamed from: b */
        public ho1 mo5646b() {
            return this.f3569c.mo5668b();
        }

        /* renamed from: c */
        public ho1 mo5647c() {
            return this.f3570d.mo5668b();
        }

        /* renamed from: e */
        public boolean mo5648e() {
            if (this.f3567a != 2 || this.f3569c.mo5668b() == null || (this.f3572f <= 1 && !mo5650h())) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public final int mo5649g() {
            this.f3567a = 1;
            this.f3569c = this.f3568b;
            this.f3572f = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean mo5650h() {
            if (this.f3569c.mo5668b().mo21325j() || m4565d(this.f3571e)) {
                return true;
            }
            if (this.f3573g) {
                if (this.f3574h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3574h, this.f3569c.mo5668b().mo21317b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0604d(C0610f fVar, C0593c.C0603i iVar, C0593c.C0598d dVar, boolean z, int[] iArr) {
        this.f3562a = iVar;
        this.f3563b = fVar;
        this.f3564c = dVar;
        this.f3565d = z;
        this.f3566e = iArr;
    }

    /* renamed from: b */
    public static boolean m4555b(Editable editable, KeyEvent keyEvent, boolean z) {
        io1[] io1Arr;
        if (m4559g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m4558f(selectionStart, selectionEnd) && (io1Arr = (io1[]) editable.getSpans(selectionStart, selectionEnd, io1.class)) != null && io1Arr.length > 0) {
            int length = io1Arr.length;
            int i = 0;
            while (i < length) {
                io1 io1 = io1Arr[i];
                int spanStart = editable.getSpanStart(io1);
                int spanEnd = editable.getSpanEnd(io1);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m4556c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m4558f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C0605a.m4563a(editable, selectionStart, Math.max(i, 0));
                i3 = C0605a.m4564b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            io1[] io1Arr = (io1[]) editable.getSpans(i4, i3, io1.class);
            if (io1Arr != null && io1Arr.length > 0) {
                for (io1 io1 : io1Arr) {
                    int spanStart = editable.getSpanStart(io1);
                    int spanEnd = editable.getSpanEnd(io1);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m4557d(Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 67) {
            z = m4555b(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = m4555b(editable, keyEvent, true);
        }
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: f */
    public static boolean m4558f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: g */
    public static boolean m4559g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: a */
    public final void mo5642a(Spannable spannable, ho1 ho1, int i, int i2) {
        spannable.setSpan(this.f3562a.mo5641a(ho1), i, i2, 33);
    }

    /* renamed from: e */
    public final boolean mo5643e(CharSequence charSequence, int i, int i2, ho1 ho1) {
        if (ho1.mo21319d() == 0) {
            ho1.mo21326k(this.f3564c.mo5618a(charSequence, i, i2, ho1.mo21323h()));
        }
        if (ho1.mo21319d() == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo5644h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p000.e66
            if (r0 == 0) goto L_0x000a
            r1 = r10
            e66 r1 = (p000.e66) r1
            r1.mo19169a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0033
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x012c }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<io1> r5 = p000.io1.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x012c }
            if (r2 > r12) goto L_0x0033
            l47 r1 = new l47     // Catch:{ all -> 0x012c }
            r1.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            goto L_0x0033
        L_0x002b:
            l47 r1 = new l47     // Catch:{ all -> 0x012c }
            r2 = r10
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch:{ all -> 0x012c }
            r1.<init>((android.text.Spannable) r2)     // Catch:{ all -> 0x012c }
        L_0x0033:
            r2 = 0
            if (r1 == 0) goto L_0x0061
            java.lang.Class<io1> r3 = p000.io1.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x012c }
            io1[] r3 = (p000.io1[]) r3     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            if (r4 <= 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            r5 = r2
        L_0x0045:
            if (r5 >= r4) goto L_0x0061
            r6 = r3[r5]     // Catch:{ all -> 0x012c }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x012c }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x012c }
            if (r7 == r12) goto L_0x0056
            r1.removeSpan(r6)     // Catch:{ all -> 0x012c }
        L_0x0056:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x012c }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x012c }
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            if (r11 == r12) goto L_0x0123
            int r3 = r10.length()     // Catch:{ all -> 0x012c }
            if (r11 < r3) goto L_0x006b
            goto L_0x0123
        L_0x006b:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            int r3 = r1.length()     // Catch:{ all -> 0x012c }
            java.lang.Class<io1> r4 = p000.io1.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x012c }
            io1[] r3 = (p000.io1[]) r3     // Catch:{ all -> 0x012c }
            int r3 = r3.length     // Catch:{ all -> 0x012c }
            int r13 = r13 - r3
        L_0x0080:
            androidx.emoji2.text.d$b r3 = new androidx.emoji2.text.d$b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.f r4 = r9.f3563b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.f$a r4 = r4.mo5664f()     // Catch:{ all -> 0x012c }
            boolean r5 = r9.f3565d     // Catch:{ all -> 0x012c }
            int[] r6 = r9.f3566e     // Catch:{ all -> 0x012c }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x012c }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            r5 = r4
            r4 = r2
            r2 = r1
        L_0x0096:
            r1 = r11
        L_0x0097:
            if (r11 >= r12) goto L_0x00e9
            if (r4 >= r13) goto L_0x00e9
            int r6 = r3.mo5645a(r5)     // Catch:{ all -> 0x012c }
            r7 = 1
            if (r6 == r7) goto L_0x00d7
            r7 = 2
            if (r6 == r7) goto L_0x00cb
            r7 = 3
            if (r6 == r7) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            if (r14 != 0) goto L_0x00b5
            ho1 r6 = r3.mo5647c()     // Catch:{ all -> 0x012c }
            boolean r6 = r9.mo5643e(r10, r1, r11, r6)     // Catch:{ all -> 0x012c }
            if (r6 != 0) goto L_0x0096
        L_0x00b5:
            if (r2 != 0) goto L_0x00c1
            l47 r2 = new l47     // Catch:{ all -> 0x012c }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x012c }
            r6.<init>(r10)     // Catch:{ all -> 0x012c }
            r2.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x012c }
        L_0x00c1:
            ho1 r6 = r3.mo5647c()     // Catch:{ all -> 0x012c }
            r9.mo5642a(r2, r6, r1, r11)     // Catch:{ all -> 0x012c }
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00cb:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x012c }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0097
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            goto L_0x0097
        L_0x00d7:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x012c }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00e7
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            r5 = r11
        L_0x00e7:
            r11 = r1
            goto L_0x0097
        L_0x00e9:
            boolean r12 = r3.mo5648e()     // Catch:{ all -> 0x012c }
            if (r12 == 0) goto L_0x010c
            if (r4 >= r13) goto L_0x010c
            if (r14 != 0) goto L_0x00fd
            ho1 r12 = r3.mo5646b()     // Catch:{ all -> 0x012c }
            boolean r12 = r9.mo5643e(r10, r1, r11, r12)     // Catch:{ all -> 0x012c }
            if (r12 != 0) goto L_0x010c
        L_0x00fd:
            if (r2 != 0) goto L_0x0105
            l47 r12 = new l47     // Catch:{ all -> 0x012c }
            r12.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            r2 = r12
        L_0x0105:
            ho1 r12 = r3.mo5646b()     // Catch:{ all -> 0x012c }
            r9.mo5642a(r2, r12, r1, r11)     // Catch:{ all -> 0x012c }
        L_0x010c:
            if (r2 == 0) goto L_0x011a
            android.text.Spannable r11 = r2.mo22649b()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0119
            e66 r10 = (p000.e66) r10
            r10.mo19175d()
        L_0x0119:
            return r11
        L_0x011a:
            if (r0 == 0) goto L_0x0122
            r11 = r10
            e66 r11 = (p000.e66) r11
            r11.mo19175d()
        L_0x0122:
            return r10
        L_0x0123:
            if (r0 == 0) goto L_0x012b
            r11 = r10
            e66 r11 = (p000.e66) r11
            r11.mo19175d()
        L_0x012b:
            return r10
        L_0x012c:
            r11 = move-exception
            if (r0 == 0) goto L_0x0134
            e66 r10 = (p000.e66) r10
            r10.mo19175d()
        L_0x0134:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0604d.mo5644h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
