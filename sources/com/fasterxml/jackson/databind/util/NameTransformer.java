package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        public final NameTransformer _t1;
        public final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        public String reverse(String str) {
            String reverse = this._t1.reverse(str);
            if (reverse != null) {
                return this._t2.reverse(reverse);
            }
            return reverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        public String reverse(String str) {
            return str;
        }

        public String transform(String str) {
            return str;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$a */
    public static class C2056a extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f10166a;

        /* renamed from: d */
        public final /* synthetic */ String f10167d;

        public C2056a(String str, String str2) {
            this.f10166a = str;
            this.f10167d = str2;
        }

        public String reverse(String str) {
            if (!str.startsWith(this.f10166a)) {
                return null;
            }
            String substring = str.substring(this.f10166a.length());
            if (substring.endsWith(this.f10167d)) {
                return substring.substring(0, substring.length() - this.f10167d.length());
            }
            return null;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.f10166a + "','" + this.f10167d + "')]";
        }

        public String transform(String str) {
            return this.f10166a + str + this.f10167d;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$b */
    public static class C2057b extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f10168a;

        public C2057b(String str) {
            this.f10168a = str;
        }

        public String reverse(String str) {
            if (str.startsWith(this.f10168a)) {
                return str.substring(this.f10168a.length());
            }
            return null;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.f10168a + "')]";
        }

        public String transform(String str) {
            return this.f10168a + str;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$c */
    public static class C2058c extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f10169a;

        public C2058c(String str) {
            this.f10169a = str;
        }

        public String reverse(String str) {
            if (str.endsWith(this.f10169a)) {
                return str.substring(0, str.length() - this.f10169a.length());
            }
            return null;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.f10169a + "')]";
        }

        public String transform(String str) {
            return str + this.f10169a;
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        boolean z;
        boolean z2 = true;
        if (str == null || str.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (str2 == null || str2.isEmpty()) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                return new C2056a(str, str2);
            }
            return new C2057b(str);
        } else if (z2) {
            return new C2058c(str2);
        } else {
            return NOP;
        }
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
