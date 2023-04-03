package p000;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: f10 */
/* compiled from: BidiFormatter */
public final class f10 {

    /* renamed from: d */
    public static final hn6 f11472d;

    /* renamed from: e */
    public static final String f11473e = Character.toString(8206);

    /* renamed from: f */
    public static final String f11474f = Character.toString(8207);

    /* renamed from: g */
    public static final f10 f11475g;

    /* renamed from: h */
    public static final f10 f11476h;

    /* renamed from: a */
    public final boolean f11477a;

    /* renamed from: b */
    public final int f11478b;

    /* renamed from: c */
    public final hn6 f11479c;

    /* renamed from: f10$a */
    /* compiled from: BidiFormatter */
    public static final class C2258a {

        /* renamed from: a */
        public boolean f11480a;

        /* renamed from: b */
        public int f11481b;

        /* renamed from: c */
        public hn6 f11482c;

        public C2258a() {
            mo19575c(f10.m16440e(Locale.getDefault()));
        }

        /* renamed from: b */
        public static f10 m16448b(boolean z) {
            if (z) {
                return f10.f11476h;
            }
            return f10.f11475g;
        }

        /* renamed from: a */
        public f10 mo19574a() {
            if (this.f11481b == 2 && this.f11482c == f10.f11472d) {
                return m16448b(this.f11480a);
            }
            return new f10(this.f11480a, this.f11481b, this.f11482c);
        }

        /* renamed from: c */
        public final void mo19575c(boolean z) {
            this.f11480a = z;
            this.f11482c = f10.f11472d;
            this.f11481b = 2;
        }
    }

    /* renamed from: f10$b */
    /* compiled from: BidiFormatter */
    public static class C2259b {

        /* renamed from: f */
        public static final byte[] f11483f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f11484a;

        /* renamed from: b */
        public final boolean f11485b;

        /* renamed from: c */
        public final int f11486c;

        /* renamed from: d */
        public int f11487d;

        /* renamed from: e */
        public char f11488e;

        static {
            for (int i = 0; i < 1792; i++) {
                f11483f[i] = Character.getDirectionality(i);
            }
        }

        public C2259b(CharSequence charSequence, boolean z) {
            this.f11484a = charSequence;
            this.f11485b = z;
            this.f11486c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m16451c(char c) {
            if (c < 1792) {
                return f11483f[c];
            }
            return Character.getDirectionality(c);
        }

        /* renamed from: a */
        public byte mo19576a() {
            char charAt = this.f11484a.charAt(this.f11487d - 1);
            this.f11488e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f11484a, this.f11487d);
                this.f11487d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f11487d--;
            byte c = m16451c(this.f11488e);
            if (!this.f11485b) {
                return c;
            }
            char c2 = this.f11488e;
            if (c2 == '>') {
                return mo19582h();
            }
            if (c2 == ';') {
                return mo19580f();
            }
            return c;
        }

        /* renamed from: b */
        public byte mo19577b() {
            char charAt = this.f11484a.charAt(this.f11487d);
            this.f11488e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f11484a, this.f11487d);
                this.f11487d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f11487d++;
            byte c = m16451c(this.f11488e);
            if (!this.f11485b) {
                return c;
            }
            char c2 = this.f11488e;
            if (c2 == '<') {
                return mo19583i();
            }
            if (c2 == '&') {
                return mo19581g();
            }
            return c;
        }

        /* renamed from: d */
        public int mo19578d() {
            this.f11487d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f11487d < this.f11486c && i == 0) {
                byte b = mo19577b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f11487d > 0) {
                switch (mo19576a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        public int mo19579e() {
            this.f11487d = this.f11486c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f11487d > 0) {
                    byte a = mo19576a();
                    if (a != 0) {
                        if (a == 1 || a == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i2 == 0) {
                            }
                        } else if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i--;
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                        }
                    }
                }
                return 0;
            }
        }

        /* renamed from: f */
        public final byte mo19580f() {
            char charAt;
            int i = this.f11487d;
            do {
                int i2 = this.f11487d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11484a;
                int i3 = i2 - 1;
                this.f11487d = i3;
                charAt = charSequence.charAt(i3);
                this.f11488e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f11487d = i;
            this.f11488e = ';';
            return 13;
        }

        /* renamed from: g */
        public final byte mo19581g() {
            char charAt;
            do {
                int i = this.f11487d;
                if (i >= this.f11486c) {
                    return 12;
                }
                CharSequence charSequence = this.f11484a;
                this.f11487d = i + 1;
                charAt = charSequence.charAt(i);
                this.f11488e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        public final byte mo19582h() {
            char charAt;
            int i = this.f11487d;
            while (true) {
                int i2 = this.f11487d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11484a;
                int i3 = i2 - 1;
                this.f11487d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f11488e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f11487d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f11484a;
                        int i5 = i4 - 1;
                        this.f11487d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f11488e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f11487d = i;
            this.f11488e = '>';
            return 13;
        }

        /* renamed from: i */
        public final byte mo19583i() {
            char charAt;
            int i = this.f11487d;
            while (true) {
                int i2 = this.f11487d;
                if (i2 < this.f11486c) {
                    CharSequence charSequence = this.f11484a;
                    this.f11487d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f11488e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f11487d;
                            if (i3 >= this.f11486c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f11484a;
                            this.f11487d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f11488e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f11487d = i;
                    this.f11488e = '<';
                    return 13;
                }
            }
        }
    }

    static {
        hn6 hn6 = in6.f13326c;
        f11472d = hn6;
        f11475g = new f10(false, 2, hn6);
        f11476h = new f10(true, 2, hn6);
    }

    public f10(boolean z, int i, hn6 hn6) {
        this.f11477a = z;
        this.f11478b = i;
        this.f11479c = hn6;
    }

    /* renamed from: a */
    public static int m16437a(CharSequence charSequence) {
        return new C2259b(charSequence, false).mo19578d();
    }

    /* renamed from: b */
    public static int m16438b(CharSequence charSequence) {
        return new C2259b(charSequence, false).mo19579e();
    }

    /* renamed from: c */
    public static f10 m16439c() {
        return new C2258a().mo19574a();
    }

    /* renamed from: e */
    public static boolean m16440e(Locale locale) {
        if (jo6.m20327a(locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo19567d() {
        if ((this.f11478b & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo19568f(CharSequence charSequence, hn6 hn6) {
        boolean isRtl = hn6.isRtl(charSequence, 0, charSequence.length());
        if (!this.f11477a && (isRtl || m16438b(charSequence) == 1)) {
            return f11473e;
        }
        if (!this.f11477a) {
            return "";
        }
        if (!isRtl || m16438b(charSequence) == -1) {
            return f11474f;
        }
        return "";
    }

    /* renamed from: g */
    public final String mo19569g(CharSequence charSequence, hn6 hn6) {
        boolean isRtl = hn6.isRtl(charSequence, 0, charSequence.length());
        if (!this.f11477a && (isRtl || m16437a(charSequence) == 1)) {
            return f11473e;
        }
        if (!this.f11477a) {
            return "";
        }
        if (!isRtl || m16437a(charSequence) == -1) {
            return f11474f;
        }
        return "";
    }

    /* renamed from: h */
    public CharSequence mo19570h(CharSequence charSequence) {
        return mo19571i(charSequence, this.f11479c, true);
    }

    /* renamed from: i */
    public CharSequence mo19571i(CharSequence charSequence, hn6 hn6, boolean z) {
        hn6 hn62;
        char c;
        hn6 hn63;
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = hn6.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo19567d() && z) {
            if (isRtl) {
                hn63 = in6.f13325b;
            } else {
                hn63 = in6.f13324a;
            }
            spannableStringBuilder.append(mo19569g(charSequence, hn63));
        }
        if (isRtl != this.f11477a) {
            if (isRtl) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (isRtl) {
                hn62 = in6.f13325b;
            } else {
                hn62 = in6.f13324a;
            }
            spannableStringBuilder.append(mo19568f(charSequence, hn62));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String mo19572j(String str) {
        return mo19573k(str, this.f11479c, true);
    }

    /* renamed from: k */
    public String mo19573k(String str, hn6 hn6, boolean z) {
        if (str == null) {
            return null;
        }
        return mo19571i(str, hn6, z).toString();
    }
}
