package com.caverock.androidsvg;

import androidx.media3.common.PlaybackException;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

public class CSSParser {

    /* renamed from: a */
    public MediaType f9027a;

    /* renamed from: b */
    public Source f9028b;

    /* renamed from: c */
    public boolean f9029c;

    public enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;
        

        /* renamed from: a */
        public static final Map<String, PseudoClassIdents> f9034a = null;

        /* access modifiers changed from: public */
        static {
            f9034a = new HashMap();
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    f9034a.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        public static PseudoClassIdents fromString(String str) {
            PseudoClassIdents pseudoClassIdents = f9034a.get(str);
            if (pseudoClassIdents != null) {
                return pseudoClassIdents;
            }
            return UNSUPPORTED;
        }
    }

    public enum Source {
        Document,
        RenderOptions
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$a */
    public static /* synthetic */ class C1809a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9037a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f9038b;

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|(3:59|60|62)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x013b */
        static {
            /*
                com.caverock.androidsvg.CSSParser$PseudoClassIdents[] r0 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9038b = r0
                r1 = 1
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r2 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.first_child     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9038b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r3 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.last_child     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.only_child     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.first_of_type     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.last_of_type     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.only_of_type     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.root     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.empty     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_child     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_last_child     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5 = 10
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_of_type     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r5 = 11
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_last_of_type     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r5 = 12
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.not     // Catch:{ NoSuchFieldError -> 0x009c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5 = 13
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.target     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r5 = 14
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.lang     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r5 = 15
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.link     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r5 = 16
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.visited     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r5 = 17
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.hover     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r5 = 18
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.active     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r5 = 19
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.focus     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r5 = 20
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.enabled     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r5 = 21
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.disabled     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r5 = 22
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.checked     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r5 = 23
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r3 = f9038b     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r4 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.indeterminate     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r5 = 24
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                com.caverock.androidsvg.CSSParser$AttribOp[] r3 = com.caverock.androidsvg.CSSParser.AttribOp.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9037a = r3
                com.caverock.androidsvg.CSSParser$AttribOp r4 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS     // Catch:{ NoSuchFieldError -> 0x0131 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0131 }
            L_0x0131:
                int[] r1 = f9037a     // Catch:{ NoSuchFieldError -> 0x013b }
                com.caverock.androidsvg.CSSParser$AttribOp r3 = com.caverock.androidsvg.CSSParser.AttribOp.INCLUDES     // Catch:{ NoSuchFieldError -> 0x013b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x013b }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x013b }
            L_0x013b:
                int[] r0 = f9037a     // Catch:{ NoSuchFieldError -> 0x0145 }
                com.caverock.androidsvg.CSSParser$AttribOp r1 = com.caverock.androidsvg.CSSParser.AttribOp.DASHMATCH     // Catch:{ NoSuchFieldError -> 0x0145 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0145 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0145 }
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.C1809a.<clinit>():void");
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$b */
    public static class C1810b {

        /* renamed from: a */
        public final String f9039a;

        /* renamed from: b */
        public final AttribOp f9040b;

        /* renamed from: c */
        public final String f9041c;

        public C1810b(String str, AttribOp attribOp, String str2) {
            this.f9039a = str;
            this.f9040b = attribOp;
            this.f9041c = str2;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$c */
    public static class C1811c extends SVGParser.C1890g {

        /* renamed from: com.caverock.androidsvg.CSSParser$c$a */
        public static class C1812a {

            /* renamed from: a */
            public int f9042a;

            /* renamed from: b */
            public int f9043b;

            public C1812a(int i, int i2) {
                this.f9042a = i;
                this.f9043b = i2;
            }
        }

        public C1811c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* renamed from: C */
        public final int mo12699C(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            int i2 = 65;
            if (i < 65 || i > 70) {
                i2 = 97;
                if (i < 97 || i > 102) {
                    return -1;
                }
            }
            return (i - i2) + 10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
            r2 = mo12910f('-');
         */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.caverock.androidsvg.CSSParser.C1811c.C1812a mo12700D() throws com.caverock.androidsvg.CSSParseException {
            /*
                r13 = this;
                boolean r0 = r13.mo12912h()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                int r0 = r13.f9317b
                r2 = 40
                boolean r2 = r13.mo12910f(r2)
                if (r2 != 0) goto L_0x0013
                return r1
            L_0x0013:
                r13.mo12904A()
                java.lang.String r2 = "odd"
                boolean r2 = r13.mo12911g(r2)
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0027
                com.caverock.androidsvg.CSSParser$c$a r2 = new com.caverock.androidsvg.CSSParser$c$a
                r2.<init>(r3, r4)
                goto L_0x00c5
            L_0x0027:
                java.lang.String r2 = "even"
                boolean r2 = r13.mo12911g(r2)
                r5 = 0
                if (r2 == 0) goto L_0x0037
                com.caverock.androidsvg.CSSParser$c$a r2 = new com.caverock.androidsvg.CSSParser$c$a
                r2.<init>(r3, r5)
                goto L_0x00c5
            L_0x0037:
                r2 = 43
                boolean r3 = r13.mo12910f(r2)
                r6 = -1
                r7 = 45
                if (r3 == 0) goto L_0x0043
                goto L_0x004b
            L_0x0043:
                boolean r3 = r13.mo12910f(r7)
                if (r3 == 0) goto L_0x004b
                r3 = r6
                goto L_0x004c
            L_0x004b:
                r3 = r4
            L_0x004c:
                java.lang.String r8 = r13.f9316a
                int r9 = r13.f9317b
                int r10 = r13.f9318c
                dx2 r8 = p000.dx2.m15491c(r8, r9, r10, r5)
                if (r8 == 0) goto L_0x005e
                int r9 = r8.mo18999a()
                r13.f9317b = r9
            L_0x005e:
                r9 = 110(0x6e, float:1.54E-43)
                boolean r9 = r13.mo12910f(r9)
                if (r9 != 0) goto L_0x0072
                r9 = 78
                boolean r9 = r13.mo12910f(r9)
                if (r9 == 0) goto L_0x006f
                goto L_0x0072
            L_0x006f:
                r2 = r8
                r8 = r1
                goto L_0x00ad
            L_0x0072:
                if (r8 == 0) goto L_0x0075
                goto L_0x007e
            L_0x0075:
                dx2 r8 = new dx2
                r9 = 1
                int r11 = r13.f9317b
                r8.<init>(r9, r11)
            L_0x007e:
                r13.mo12904A()
                boolean r2 = r13.mo12910f(r2)
                if (r2 != 0) goto L_0x008e
                boolean r2 = r13.mo12910f(r7)
                if (r2 == 0) goto L_0x008e
                r4 = r6
            L_0x008e:
                if (r2 == 0) goto L_0x00a9
                r13.mo12904A()
                java.lang.String r2 = r13.f9316a
                int r6 = r13.f9317b
                int r7 = r13.f9318c
                dx2 r2 = p000.dx2.m15491c(r2, r6, r7, r5)
                if (r2 == 0) goto L_0x00a6
                int r6 = r2.mo18999a()
                r13.f9317b = r6
                goto L_0x00aa
            L_0x00a6:
                r13.f9317b = r0
                return r1
            L_0x00a9:
                r2 = r1
            L_0x00aa:
                r12 = r4
                r4 = r3
                r3 = r12
            L_0x00ad:
                com.caverock.androidsvg.CSSParser$c$a r6 = new com.caverock.androidsvg.CSSParser$c$a
                if (r8 != 0) goto L_0x00b3
                r4 = r5
                goto L_0x00b8
            L_0x00b3:
                int r7 = r8.mo19000d()
                int r4 = r4 * r7
            L_0x00b8:
                if (r2 != 0) goto L_0x00bb
                goto L_0x00c1
            L_0x00bb:
                int r2 = r2.mo19000d()
                int r5 = r3 * r2
            L_0x00c1:
                r6.<init>(r4, r5)
                r2 = r6
            L_0x00c5:
                r13.mo12904A()
                r3 = 41
                boolean r3 = r13.mo12910f(r3)
                if (r3 == 0) goto L_0x00d1
                return r2
            L_0x00d1:
                r13.f9317b = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.C1811c.mo12700D():com.caverock.androidsvg.CSSParser$c$a");
        }

        /* renamed from: E */
        public final String mo12701E() {
            if (mo12912h()) {
                return null;
            }
            String q = mo12921q();
            if (q != null) {
                return q;
            }
            return mo12704H();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
            r2 = mo12916l().intValue();
         */
        /* renamed from: F */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo12702F() {
            /*
                r8 = this;
                boolean r0 = r8.mo12912h()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = r8.f9316a
                int r2 = r8.f9317b
                char r0 = r0.charAt(r2)
                r2 = 39
                if (r0 == r2) goto L_0x0019
                r2 = 34
                if (r0 == r2) goto L_0x0019
                return r1
            L_0x0019:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r8.f9317b
                r3 = 1
                int r2 = r2 + r3
                r8.f9317b = r2
                java.lang.Integer r2 = r8.mo12916l()
                int r2 = r2.intValue()
            L_0x002c:
                r4 = -1
                if (r2 == r4) goto L_0x0087
                if (r2 == r0) goto L_0x0087
                r5 = 92
                if (r2 != r5) goto L_0x007a
                java.lang.Integer r2 = r8.mo12916l()
                int r2 = r2.intValue()
                if (r2 != r4) goto L_0x0040
                goto L_0x002c
            L_0x0040:
                r5 = 10
                if (r2 == r5) goto L_0x0071
                r5 = 13
                if (r2 == r5) goto L_0x0071
                r5 = 12
                if (r2 != r5) goto L_0x004d
                goto L_0x0071
            L_0x004d:
                int r5 = r8.mo12699C(r2)
                if (r5 == r4) goto L_0x007a
                r6 = r3
            L_0x0054:
                r7 = 5
                if (r6 > r7) goto L_0x006c
                java.lang.Integer r2 = r8.mo12916l()
                int r2 = r2.intValue()
                int r7 = r8.mo12699C(r2)
                if (r7 != r4) goto L_0x0066
                goto L_0x006c
            L_0x0066:
                int r5 = r5 * 16
                int r5 = r5 + r7
                int r6 = r6 + 1
                goto L_0x0054
            L_0x006c:
                char r4 = (char) r5
                r1.append(r4)
                goto L_0x002c
            L_0x0071:
                java.lang.Integer r2 = r8.mo12916l()
                int r2 = r2.intValue()
                goto L_0x002c
            L_0x007a:
                char r2 = (char) r2
                r1.append(r2)
                java.lang.Integer r2 = r8.mo12916l()
                int r2 = r2.intValue()
                goto L_0x002c
            L_0x0087:
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.C1811c.mo12702F():java.lang.String");
        }

        /* renamed from: G */
        public final List<String> mo12703G() throws CSSParseException {
            if (mo12912h()) {
                return null;
            }
            int i = this.f9317b;
            if (!mo12910f('(')) {
                return null;
            }
            mo12904A();
            ArrayList arrayList = null;
            do {
                String H = mo12704H();
                if (H == null) {
                    this.f9317b = i;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H);
                mo12904A();
            } while (mo12930z());
            if (mo12910f(')')) {
                return arrayList;
            }
            this.f9317b = i;
            return null;
        }

        /* renamed from: H */
        public String mo12704H() {
            int P = mo12712P();
            int i = this.f9317b;
            if (P == i) {
                return null;
            }
            String substring = this.f9316a.substring(i, P);
            this.f9317b = P;
            return substring;
        }

        /* renamed from: I */
        public String mo12705I() {
            char charAt;
            int C;
            StringBuilder sb = new StringBuilder();
            while (!mo12912h() && (charAt = this.f9316a.charAt(this.f9317b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !mo12915k(charAt) && !Character.isISOControl(charAt)) {
                this.f9317b++;
                if (charAt == '\\') {
                    if (!mo12912h()) {
                        String str = this.f9316a;
                        int i = this.f9317b;
                        this.f9317b = i + 1;
                        charAt = str.charAt(i);
                        if (!(charAt == 10 || charAt == 13 || charAt == 12)) {
                            int C2 = mo12699C(charAt);
                            if (C2 != -1) {
                                for (int i2 = 1; i2 <= 5 && !mo12912h() && (C = mo12699C(this.f9316a.charAt(this.f9317b))) != -1; i2++) {
                                    this.f9317b++;
                                    C2 = (C2 * 16) + C;
                                }
                                sb.append((char) C2);
                            }
                        }
                    }
                }
                sb.append((char) charAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        /* renamed from: J */
        public String mo12706J() {
            if (mo12912h()) {
                return null;
            }
            int i = this.f9317b;
            int charAt = this.f9316a.charAt(i);
            int i2 = i;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !mo12914j(charAt)) {
                if (!mo12915k(charAt)) {
                    i2 = this.f9317b + 1;
                }
                charAt = mo12905a();
            }
            if (this.f9317b > i) {
                return this.f9316a.substring(i, i2);
            }
            this.f9317b = i;
            return null;
        }

        /* renamed from: K */
        public final List<C1824o> mo12707K() throws CSSParseException {
            List<C1825p> list;
            List<C1813d> list2;
            if (mo12912h()) {
                return null;
            }
            int i = this.f9317b;
            if (!mo12910f('(')) {
                return null;
            }
            mo12904A();
            List<C1824o> L = mo12708L();
            if (L == null) {
                this.f9317b = i;
                return null;
            } else if (!mo12910f(')')) {
                this.f9317b = i;
                return null;
            } else {
                Iterator<C1824o> it = L.iterator();
                while (it.hasNext() && (list = it.next().f9058a) != null) {
                    Iterator<C1825p> it2 = list.iterator();
                    while (it2.hasNext() && (list2 = it2.next().f9063d) != null) {
                        Iterator<C1813d> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (it3.next() instanceof C1816g) {
                                    return null;
                                }
                            }
                        }
                    }
                }
                return L;
            }
        }

        /* renamed from: L */
        public final List<C1824o> mo12708L() throws CSSParseException {
            if (mo12912h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            C1824o oVar = new C1824o((C1809a) null);
            while (!mo12912h() && mo12709M(oVar)) {
                if (mo12930z()) {
                    arrayList.add(oVar);
                    oVar = new C1824o((C1809a) null);
                }
            }
            if (!oVar.mo12736f()) {
                arrayList.add(oVar);
            }
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0133  */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo12709M(com.caverock.androidsvg.CSSParser.C1824o r11) throws com.caverock.androidsvg.CSSParseException {
            /*
                r10 = this;
                boolean r0 = r10.mo12912h()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                int r0 = r10.f9317b
                boolean r2 = r11.mo12736f()
                r3 = 0
                if (r2 != 0) goto L_0x002d
                r2 = 62
                boolean r2 = r10.mo12910f(r2)
                if (r2 == 0) goto L_0x001f
                com.caverock.androidsvg.CSSParser$Combinator r2 = com.caverock.androidsvg.CSSParser.Combinator.CHILD
                r10.mo12904A()
                goto L_0x002e
            L_0x001f:
                r2 = 43
                boolean r2 = r10.mo12910f(r2)
                if (r2 == 0) goto L_0x002d
                com.caverock.androidsvg.CSSParser$Combinator r2 = com.caverock.androidsvg.CSSParser.Combinator.FOLLOWS
                r10.mo12904A()
                goto L_0x002e
            L_0x002d:
                r2 = r3
            L_0x002e:
                r4 = 42
                boolean r4 = r10.mo12910f(r4)
                if (r4 == 0) goto L_0x003c
                com.caverock.androidsvg.CSSParser$p r4 = new com.caverock.androidsvg.CSSParser$p
                r4.<init>(r2, r3)
                goto L_0x004d
            L_0x003c:
                java.lang.String r4 = r10.mo12704H()
                if (r4 == 0) goto L_0x004c
                com.caverock.androidsvg.CSSParser$p r5 = new com.caverock.androidsvg.CSSParser$p
                r5.<init>(r2, r4)
                r11.mo12733c()
                r4 = r5
                goto L_0x004d
            L_0x004c:
                r4 = r3
            L_0x004d:
                boolean r5 = r10.mo12912h()
                if (r5 != 0) goto L_0x012c
                r5 = 46
                boolean r5 = r10.mo12910f(r5)
                if (r5 == 0) goto L_0x007b
                if (r4 != 0) goto L_0x0062
                com.caverock.androidsvg.CSSParser$p r4 = new com.caverock.androidsvg.CSSParser$p
                r4.<init>(r2, r3)
            L_0x0062:
                java.lang.String r5 = r10.mo12704H()
                if (r5 == 0) goto L_0x0073
                com.caverock.androidsvg.CSSParser$AttribOp r6 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS
                java.lang.String r7 = "class"
                r4.mo12739a(r7, r6, r5)
                r11.mo12732b()
                goto L_0x004d
            L_0x0073:
                com.caverock.androidsvg.CSSParseException r11 = new com.caverock.androidsvg.CSSParseException
                java.lang.String r0 = "Invalid \".class\" simpleSelectors"
                r11.<init>(r0)
                throw r11
            L_0x007b:
                r5 = 35
                boolean r5 = r10.mo12910f(r5)
                if (r5 == 0) goto L_0x00a3
                if (r4 != 0) goto L_0x008a
                com.caverock.androidsvg.CSSParser$p r4 = new com.caverock.androidsvg.CSSParser$p
                r4.<init>(r2, r3)
            L_0x008a:
                java.lang.String r5 = r10.mo12704H()
                if (r5 == 0) goto L_0x009b
                com.caverock.androidsvg.CSSParser$AttribOp r6 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS
                java.lang.String r7 = "id"
                r4.mo12739a(r7, r6, r5)
                r11.mo12734d()
                goto L_0x004d
            L_0x009b:
                com.caverock.androidsvg.CSSParseException r11 = new com.caverock.androidsvg.CSSParseException
                java.lang.String r0 = "Invalid \"#id\" simpleSelectors"
                r11.<init>(r0)
                throw r11
            L_0x00a3:
                r5 = 91
                boolean r5 = r10.mo12910f(r5)
                if (r5 == 0) goto L_0x0118
                if (r4 != 0) goto L_0x00b2
                com.caverock.androidsvg.CSSParser$p r4 = new com.caverock.androidsvg.CSSParser$p
                r4.<init>(r2, r3)
            L_0x00b2:
                r10.mo12904A()
                java.lang.String r5 = r10.mo12704H()
                java.lang.String r6 = "Invalid attribute simpleSelectors"
                if (r5 == 0) goto L_0x0112
                r10.mo12904A()
                r7 = 61
                boolean r7 = r10.mo12910f(r7)
                if (r7 == 0) goto L_0x00cb
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS
                goto L_0x00e2
            L_0x00cb:
                java.lang.String r7 = "~="
                boolean r7 = r10.mo12911g(r7)
                if (r7 == 0) goto L_0x00d6
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.INCLUDES
                goto L_0x00e2
            L_0x00d6:
                java.lang.String r7 = "|="
                boolean r7 = r10.mo12911g(r7)
                if (r7 == 0) goto L_0x00e1
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.DASHMATCH
                goto L_0x00e2
            L_0x00e1:
                r7 = r3
            L_0x00e2:
                if (r7 == 0) goto L_0x00f7
                r10.mo12904A()
                java.lang.String r8 = r10.mo12701E()
                if (r8 == 0) goto L_0x00f1
                r10.mo12904A()
                goto L_0x00f8
            L_0x00f1:
                com.caverock.androidsvg.CSSParseException r11 = new com.caverock.androidsvg.CSSParseException
                r11.<init>(r6)
                throw r11
            L_0x00f7:
                r8 = r3
            L_0x00f8:
                r9 = 93
                boolean r9 = r10.mo12910f(r9)
                if (r9 == 0) goto L_0x010c
                if (r7 != 0) goto L_0x0104
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.EXISTS
            L_0x0104:
                r4.mo12739a(r5, r7, r8)
                r11.mo12732b()
                goto L_0x004d
            L_0x010c:
                com.caverock.androidsvg.CSSParseException r11 = new com.caverock.androidsvg.CSSParseException
                r11.<init>(r6)
                throw r11
            L_0x0112:
                com.caverock.androidsvg.CSSParseException r11 = new com.caverock.androidsvg.CSSParseException
                r11.<init>(r6)
                throw r11
            L_0x0118:
                r5 = 58
                boolean r5 = r10.mo12910f(r5)
                if (r5 == 0) goto L_0x012c
                if (r4 != 0) goto L_0x0127
                com.caverock.androidsvg.CSSParser$p r4 = new com.caverock.androidsvg.CSSParser$p
                r4.<init>(r2, r3)
            L_0x0127:
                r10.mo12711O(r11, r4)
                goto L_0x004d
            L_0x012c:
                if (r4 == 0) goto L_0x0133
                r11.mo12731a(r4)
                r11 = 1
                return r11
            L_0x0133:
                r10.f9317b = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.C1811c.mo12709M(com.caverock.androidsvg.CSSParser$o):boolean");
        }

        /* renamed from: N */
        public String mo12710N() {
            if (mo12912h()) {
                return null;
            }
            int i = this.f9317b;
            if (!mo12911g("url(")) {
                return null;
            }
            mo12904A();
            String F = mo12702F();
            if (F == null) {
                F = mo12705I();
            }
            if (F == null) {
                this.f9317b = i;
                return null;
            }
            mo12904A();
            if (mo12912h() || mo12911g(")")) {
                return F;
            }
            this.f9317b = i;
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.caverock.androidsvg.CSSParser$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.caverock.androidsvg.CSSParser$g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.caverock.androidsvg.CSSParser$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.caverock.androidsvg.CSSParser$e} */
        /* JADX WARNING: type inference failed for: r2v4, types: [com.caverock.androidsvg.CSSParser$i] */
        /* JADX WARNING: type inference failed for: r2v7, types: [com.caverock.androidsvg.CSSParser$i] */
        /* JADX WARNING: type inference failed for: r2v8, types: [com.caverock.androidsvg.CSSParser$j] */
        /* JADX WARNING: type inference failed for: r2v9, types: [com.caverock.androidsvg.CSSParser$f] */
        /* JADX WARNING: type inference failed for: r2v16, types: [com.caverock.androidsvg.CSSParser$k] */
        /* JADX WARNING: type inference failed for: r2v17, types: [com.caverock.androidsvg.CSSParser$h] */
        /* JADX WARNING: type inference failed for: r2v18, types: [com.caverock.androidsvg.CSSParser$h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo12711O(com.caverock.androidsvg.CSSParser.C1824o r21, com.caverock.androidsvg.CSSParser.C1825p r22) throws com.caverock.androidsvg.CSSParseException {
            /*
                r20 = this;
                r0 = r22
                java.lang.String r1 = r20.mo12704H()
                if (r1 == 0) goto L_0x0144
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r2 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.fromString(r1)
                int[] r3 = com.caverock.androidsvg.CSSParser.C1809a.f9038b
                int r4 = r2.ordinal()
                r3 = r3[r4]
                java.lang.String r4 = "Invalid or missing parameter section for pseudo class: "
                r5 = 1
                r6 = 0
                r7 = 0
                switch(r3) {
                    case 1: goto L_0x012c;
                    case 2: goto L_0x011b;
                    case 3: goto L_0x0110;
                    case 4: goto L_0x00fb;
                    case 5: goto L_0x00e9;
                    case 6: goto L_0x00dc;
                    case 7: goto L_0x00d0;
                    case 8: goto L_0x00c4;
                    case 9: goto L_0x007f;
                    case 10: goto L_0x007f;
                    case 11: goto L_0x007f;
                    case 12: goto L_0x007f;
                    case 13: goto L_0x0054;
                    case 14: goto L_0x004a;
                    case 15: goto L_0x003d;
                    case 16: goto L_0x0033;
                    case 17: goto L_0x0033;
                    case 18: goto L_0x0033;
                    case 19: goto L_0x0033;
                    case 20: goto L_0x0033;
                    case 21: goto L_0x0033;
                    case 22: goto L_0x0033;
                    case 23: goto L_0x0033;
                    case 24: goto L_0x0033;
                    default: goto L_0x001c;
                }
            L_0x001c:
                com.caverock.androidsvg.CSSParseException r0 = new com.caverock.androidsvg.CSSParseException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unsupported pseudo class: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0033:
                com.caverock.androidsvg.CSSParser$h r2 = new com.caverock.androidsvg.CSSParser$h
                r2.<init>(r1)
                r21.mo12732b()
                goto L_0x0140
            L_0x003d:
                r20.mo12703G()
                com.caverock.androidsvg.CSSParser$h r2 = new com.caverock.androidsvg.CSSParser$h
                r2.<init>(r1)
                r21.mo12732b()
                goto L_0x0140
            L_0x004a:
                com.caverock.androidsvg.CSSParser$k r2 = new com.caverock.androidsvg.CSSParser$k
                r2.<init>(r7)
                r21.mo12732b()
                goto L_0x0140
            L_0x0054:
                java.util.List r2 = r20.mo12707K()
                if (r2 == 0) goto L_0x006a
                com.caverock.androidsvg.CSSParser$g r1 = new com.caverock.androidsvg.CSSParser$g
                r1.<init>(r2)
                int r2 = r1.mo12716b()
                r3 = r21
                r3.f9059b = r2
            L_0x0067:
                r2 = r1
                goto L_0x0140
            L_0x006a:
                com.caverock.androidsvg.CSSParseException r0 = new com.caverock.androidsvg.CSSParseException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x007f:
                r3 = r21
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r7 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_child
                if (r2 == r7) goto L_0x008c
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r7 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_of_type
                if (r2 != r7) goto L_0x008a
                goto L_0x008c
            L_0x008a:
                r11 = r6
                goto L_0x008d
            L_0x008c:
                r11 = r5
            L_0x008d:
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r7 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_of_type
                if (r2 == r7) goto L_0x0098
                com.caverock.androidsvg.CSSParser$PseudoClassIdents r7 = com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_last_of_type
                if (r2 != r7) goto L_0x0096
                goto L_0x0098
            L_0x0096:
                r12 = r6
                goto L_0x0099
            L_0x0098:
                r12 = r5
            L_0x0099:
                com.caverock.androidsvg.CSSParser$c$a r2 = r20.mo12700D()
                if (r2 == 0) goto L_0x00af
                com.caverock.androidsvg.CSSParser$e r1 = new com.caverock.androidsvg.CSSParser$e
                int r9 = r2.f9042a
                int r10 = r2.f9043b
                java.lang.String r13 = r0.f9061b
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13)
                r21.mo12732b()
                goto L_0x0067
            L_0x00af:
                com.caverock.androidsvg.CSSParseException r0 = new com.caverock.androidsvg.CSSParseException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x00c4:
                r3 = r21
                com.caverock.androidsvg.CSSParser$f r2 = new com.caverock.androidsvg.CSSParser$f
                r2.<init>(r7)
                r21.mo12732b()
                goto L_0x0140
            L_0x00d0:
                r3 = r21
                com.caverock.androidsvg.CSSParser$j r2 = new com.caverock.androidsvg.CSSParser$j
                r2.<init>(r7)
                r21.mo12732b()
                goto L_0x0140
            L_0x00dc:
                r3 = r21
                com.caverock.androidsvg.CSSParser$i r2 = new com.caverock.androidsvg.CSSParser$i
                java.lang.String r1 = r0.f9061b
                r2.<init>(r5, r1)
                r21.mo12732b()
                goto L_0x0140
            L_0x00e9:
                r3 = r21
                com.caverock.androidsvg.CSSParser$e r2 = new com.caverock.androidsvg.CSSParser$e
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 1
                java.lang.String r11 = r0.f9061b
                r6 = r2
                r6.<init>(r7, r8, r9, r10, r11)
                r21.mo12732b()
                goto L_0x0140
            L_0x00fb:
                r3 = r21
                com.caverock.androidsvg.CSSParser$e r2 = new com.caverock.androidsvg.CSSParser$e
                r13 = 0
                r14 = 1
                r15 = 1
                r16 = 1
                java.lang.String r1 = r0.f9061b
                r12 = r2
                r17 = r1
                r12.<init>(r13, r14, r15, r16, r17)
                r21.mo12732b()
                goto L_0x0140
            L_0x0110:
                r3 = r21
                com.caverock.androidsvg.CSSParser$i r2 = new com.caverock.androidsvg.CSSParser$i
                r2.<init>(r6, r7)
                r21.mo12732b()
                goto L_0x0140
            L_0x011b:
                r3 = r21
                com.caverock.androidsvg.CSSParser$e r2 = new com.caverock.androidsvg.CSSParser$e
                r9 = 0
                r10 = 1
                r11 = 0
                r12 = 0
                r13 = 0
                r8 = r2
                r8.<init>(r9, r10, r11, r12, r13)
                r21.mo12732b()
                goto L_0x0140
            L_0x012c:
                r3 = r21
                com.caverock.androidsvg.CSSParser$e r2 = new com.caverock.androidsvg.CSSParser$e
                r15 = 0
                r16 = 1
                r17 = 1
                r18 = 0
                r19 = 0
                r14 = r2
                r14.<init>(r15, r16, r17, r18, r19)
                r21.mo12732b()
            L_0x0140:
                r0.mo12740b(r2)
                return
            L_0x0144:
                com.caverock.androidsvg.CSSParseException r0 = new com.caverock.androidsvg.CSSParseException
                java.lang.String r1 = "Invalid pseudo class"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.C1811c.mo12711O(com.caverock.androidsvg.CSSParser$o, com.caverock.androidsvg.CSSParser$p):void");
        }

        /* renamed from: P */
        public final int mo12712P() {
            int i;
            if (mo12912h()) {
                return this.f9317b;
            }
            int i2 = this.f9317b;
            int charAt = this.f9316a.charAt(i2);
            if (charAt == 45) {
                charAt = mo12905a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i2;
            } else {
                int a = mo12905a();
                while (true) {
                    if ((a < 65 || a > 90) && ((a < 97 || a > 122) && !((a >= 48 && a <= 57) || a == 45 || a == 95))) {
                        break;
                    }
                    a = mo12905a();
                }
                i = this.f9317b;
            }
            this.f9317b = i2;
            return i;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$d */
    public interface C1813d {
        /* renamed from: a */
        boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var);
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$e */
    public static class C1814e implements C1813d {

        /* renamed from: a */
        public int f9044a;

        /* renamed from: b */
        public int f9045b;

        /* renamed from: c */
        public boolean f9046c;

        /* renamed from: d */
        public boolean f9047d;

        /* renamed from: e */
        public String f9048e;

        public C1814e(int i, int i2, boolean z, boolean z2, String str) {
            this.f9044a = i;
            this.f9045b = i2;
            this.f9046c = z;
            this.f9047d = z2;
            this.f9048e = str;
        }

        /* renamed from: a */
        public boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var) {
            String str;
            int i;
            int i2;
            int i3;
            if (!this.f9047d || this.f9048e != null) {
                str = this.f9048e;
            } else {
                str = j0Var.mo12765o();
            }
            SVG.C1844h0 h0Var = j0Var.f9211b;
            if (h0Var != null) {
                Iterator<SVG.C1852l0> it = h0Var.mo12772b().iterator();
                i2 = 0;
                i = 0;
                while (it.hasNext()) {
                    SVG.C1848j0 j0Var2 = (SVG.C1848j0) it.next();
                    if (j0Var2 == j0Var) {
                        i2 = i;
                    }
                    if (str == null || j0Var2.mo12765o().equals(str)) {
                        i++;
                    }
                }
            } else {
                i2 = 0;
                i = 1;
            }
            if (this.f9046c) {
                i3 = i2 + 1;
            } else {
                i3 = i - i2;
            }
            int i4 = this.f9044a;
            if (i4 != 0) {
                int i5 = this.f9045b;
                if ((i3 - i5) % i4 != 0) {
                    return false;
                }
                if (Integer.signum(i3 - i5) == 0 || Integer.signum(i3 - this.f9045b) == Integer.signum(this.f9044a)) {
                    return true;
                }
                return false;
            } else if (i3 == this.f9045b) {
                return true;
            } else {
                return false;
            }
        }

        public String toString() {
            String str;
            if (this.f9046c) {
                str = "";
            } else {
                str = "last-";
            }
            if (this.f9047d) {
                return String.format("nth-%schild(%dn%+d of type <%s>)", new Object[]{str, Integer.valueOf(this.f9044a), Integer.valueOf(this.f9045b), this.f9048e});
            }
            return String.format("nth-%schild(%dn%+d)", new Object[]{str, Integer.valueOf(this.f9044a), Integer.valueOf(this.f9045b)});
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$f */
    public static class C1815f implements C1813d {
        public C1815f() {
        }

        public /* synthetic */ C1815f(C1809a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var) {
            if (!(j0Var instanceof SVG.C1844h0) || ((SVG.C1844h0) j0Var).mo12772b().size() == 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "empty";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$g */
    public static class C1816g implements C1813d {

        /* renamed from: a */
        public List<C1824o> f9049a;

        public C1816g(List<C1824o> list) {
            this.f9049a = list;
        }

        /* renamed from: a */
        public boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var) {
            for (C1824o l : this.f9049a) {
                if (CSSParser.m12674l(mVar, l, j0Var)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public int mo12716b() {
            int i = Integer.MIN_VALUE;
            for (C1824o oVar : this.f9049a) {
                int i2 = oVar.f9059b;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }

        public String toString() {
            return "not(" + this.f9049a + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$h */
    public static class C1817h implements C1813d {

        /* renamed from: a */
        public String f9050a;

        public C1817h(String str) {
            this.f9050a = str;
        }

        /* renamed from: a */
        public boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var) {
            return false;
        }

        public String toString() {
            return this.f9050a;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$i */
    public static class C1818i implements C1813d {

        /* renamed from: a */
        public boolean f9051a;

        /* renamed from: b */
        public String f9052b;

        public C1818i(boolean z, String str) {
            this.f9051a = z;
            this.f9052b = str;
        }

        /* renamed from: a */
        public boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var) {
            String str;
            int i;
            if (!this.f9051a || this.f9052b != null) {
                str = this.f9052b;
            } else {
                str = j0Var.mo12765o();
            }
            SVG.C1844h0 h0Var = j0Var.f9211b;
            if (h0Var != null) {
                Iterator<SVG.C1852l0> it = h0Var.mo12772b().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVG.C1848j0 j0Var2 = (SVG.C1848j0) it.next();
                    if (str == null || j0Var2.mo12765o().equals(str)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            if (i == 1) {
                return true;
            }
            return false;
        }

        public String toString() {
            if (!this.f9051a) {
                return String.format("only-child", new Object[0]);
            }
            return String.format("only-of-type <%s>", new Object[]{this.f9052b});
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$j */
    public static class C1819j implements C1813d {
        public C1819j() {
        }

        public /* synthetic */ C1819j(C1809a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var) {
            if (j0Var.f9211b == null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "root";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$k */
    public static class C1820k implements C1813d {
        public C1820k() {
        }

        public /* synthetic */ C1820k(C1809a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo12713a(C1822m mVar, SVG.C1848j0 j0Var) {
            if (mVar == null || j0Var != mVar.f9056a) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "target";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$l */
    public static class C1821l {

        /* renamed from: a */
        public C1824o f9053a;

        /* renamed from: b */
        public SVG.Style f9054b;

        /* renamed from: c */
        public Source f9055c;

        public C1821l(C1824o oVar, SVG.Style style, Source source) {
            this.f9053a = oVar;
            this.f9054b = style;
            this.f9055c = source;
        }

        public String toString() {
            return String.valueOf(this.f9053a) + " {...} (src=" + this.f9055c + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$m */
    public static class C1822m {

        /* renamed from: a */
        public SVG.C1848j0 f9056a;

        public String toString() {
            SVG.C1848j0 j0Var = this.f9056a;
            if (j0Var == null) {
                return "";
            }
            return String.format("<%s id=\"%s\">", new Object[]{j0Var.mo12765o(), this.f9056a.f9199c});
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$n */
    public static class C1823n {

        /* renamed from: a */
        public List<C1821l> f9057a = null;

        /* renamed from: a */
        public void mo12724a(C1821l lVar) {
            if (this.f9057a == null) {
                this.f9057a = new ArrayList();
            }
            for (int i = 0; i < this.f9057a.size(); i++) {
                if (this.f9057a.get(i).f9053a.f9059b > lVar.f9053a.f9059b) {
                    this.f9057a.add(i, lVar);
                    return;
                }
            }
            this.f9057a.add(lVar);
        }

        /* renamed from: b */
        public void mo12725b(C1823n nVar) {
            if (nVar.f9057a != null) {
                if (this.f9057a == null) {
                    this.f9057a = new ArrayList(nVar.f9057a.size());
                }
                for (C1821l a : nVar.f9057a) {
                    mo12724a(a);
                }
            }
        }

        /* renamed from: c */
        public List<C1821l> mo12726c() {
            return this.f9057a;
        }

        /* renamed from: d */
        public boolean mo12727d() {
            List<C1821l> list = this.f9057a;
            if (list == null || list.isEmpty()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void mo12728e(Source source) {
            List<C1821l> list = this.f9057a;
            if (list != null) {
                Iterator<C1821l> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f9055c == source) {
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: f */
        public int mo12729f() {
            List<C1821l> list = this.f9057a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f9057a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (C1821l lVar : this.f9057a) {
                sb.append(lVar.toString());
                sb.append(10);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$p */
    public static class C1825p {

        /* renamed from: a */
        public Combinator f9060a = null;

        /* renamed from: b */
        public String f9061b = null;

        /* renamed from: c */
        public List<C1810b> f9062c = null;

        /* renamed from: d */
        public List<C1813d> f9063d = null;

        public C1825p(Combinator combinator, String str) {
            this.f9060a = combinator == null ? Combinator.DESCENDANT : combinator;
            this.f9061b = str;
        }

        /* renamed from: a */
        public void mo12739a(String str, AttribOp attribOp, String str2) {
            if (this.f9062c == null) {
                this.f9062c = new ArrayList();
            }
            this.f9062c.add(new C1810b(str, attribOp, str2));
        }

        /* renamed from: b */
        public void mo12740b(C1813d dVar) {
            if (this.f9063d == null) {
                this.f9063d = new ArrayList();
            }
            this.f9063d.add(dVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Combinator combinator = this.f9060a;
            if (combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f9061b;
            if (str == null) {
                str = Marker.ANY_MARKER;
            }
            sb.append(str);
            List<C1810b> list = this.f9062c;
            if (list != null) {
                for (C1810b next : list) {
                    sb.append('[');
                    sb.append(next.f9039a);
                    int i = C1809a.f9037a[next.f9040b.ordinal()];
                    if (i == 1) {
                        sb.append('=');
                        sb.append(next.f9041c);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(next.f9041c);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(next.f9041c);
                    }
                    sb.append(']');
                }
            }
            List<C1813d> list2 = this.f9063d;
            if (list2 != null) {
                for (C1813d append : list2) {
                    sb.append(':');
                    sb.append(append);
                }
            }
            return sb.toString();
        }
    }

    public CSSParser(Source source) {
        this(MediaType.screen, source);
    }

    /* renamed from: a */
    public static int m12668a(List<SVG.C1844h0> list, int i, SVG.C1848j0 j0Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        SVG.C1844h0 h0Var = list.get(i);
        SVG.C1844h0 h0Var2 = j0Var.f9211b;
        if (h0Var != h0Var2) {
            return -1;
        }
        for (SVG.C1852l0 l0Var : h0Var2.mo12772b()) {
            if (l0Var == j0Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m12669b(String str, MediaType mediaType) {
        C1811c cVar = new C1811c(str);
        cVar.mo12904A();
        return m12670c(m12672h(cVar), mediaType);
    }

    /* renamed from: c */
    public static boolean m12670c(List<MediaType> list, MediaType mediaType) {
        for (MediaType next : list) {
            if (next == MediaType.all) {
                return true;
            }
            if (next == mediaType) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static List<String> m12671f(String str) {
        C1811c cVar = new C1811c(str);
        ArrayList arrayList = null;
        while (!cVar.mo12912h()) {
            String r = cVar.mo12922r();
            if (r != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r);
                cVar.mo12904A();
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List<MediaType> m12672h(C1811c cVar) {
        String w;
        ArrayList arrayList = new ArrayList();
        while (!cVar.mo12912h() && (w = cVar.mo12927w()) != null) {
            try {
                arrayList.add(MediaType.valueOf(w));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.mo12930z()) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static boolean m12673k(C1822m mVar, C1824o oVar, int i, List<SVG.C1844h0> list, int i2, SVG.C1848j0 j0Var) {
        C1825p e = oVar.mo12735e(i);
        if (!m12676n(mVar, e, list, i2, j0Var)) {
            return false;
        }
        Combinator combinator = e.f9060a;
        if (combinator == Combinator.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 >= 0) {
                if (m12675m(mVar, oVar, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        } else if (combinator == Combinator.CHILD) {
            return m12675m(mVar, oVar, i - 1, list, i2);
        } else {
            int a = m12668a(list, i2, j0Var);
            if (a <= 0) {
                return false;
            }
            return m12673k(mVar, oVar, i - 1, list, i2, (SVG.C1848j0) j0Var.f9211b.mo12772b().get(a - 1));
        }
    }

    /* renamed from: l */
    public static boolean m12674l(C1822m mVar, C1824o oVar, SVG.C1848j0 j0Var) {
        ArrayList arrayList = new ArrayList();
        for (SVG.C1844h0 h0Var = j0Var.f9211b; h0Var != null; h0Var = ((SVG.C1852l0) h0Var).f9211b) {
            arrayList.add(0, h0Var);
        }
        int size = arrayList.size() - 1;
        if (oVar.mo12737g() == 1) {
            return m12676n(mVar, oVar.mo12735e(0), arrayList, size, j0Var);
        }
        return m12673k(mVar, oVar, oVar.mo12737g() - 1, arrayList, size, j0Var);
    }

    /* renamed from: m */
    public static boolean m12675m(C1822m mVar, C1824o oVar, int i, List<SVG.C1844h0> list, int i2) {
        C1825p e = oVar.mo12735e(i);
        SVG.C1848j0 j0Var = (SVG.C1848j0) list.get(i2);
        if (!m12676n(mVar, e, list, i2, j0Var)) {
            return false;
        }
        Combinator combinator = e.f9060a;
        if (combinator == Combinator.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (m12675m(mVar, oVar, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        } else if (combinator == Combinator.CHILD) {
            return m12675m(mVar, oVar, i - 1, list, i2 - 1);
        } else {
            int a = m12668a(list, i2, j0Var);
            if (a <= 0) {
                return false;
            }
            return m12673k(mVar, oVar, i - 1, list, i2, (SVG.C1848j0) j0Var.f9211b.mo12772b().get(a - 1));
        }
    }

    /* renamed from: n */
    public static boolean m12676n(C1822m mVar, C1825p pVar, List<SVG.C1844h0> list, int i, SVG.C1848j0 j0Var) {
        List<String> list2;
        String str = pVar.f9061b;
        if (str != null && !str.equals(j0Var.mo12765o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C1810b> list3 = pVar.f9062c;
        if (list3 != null) {
            for (C1810b next : list3) {
                String str2 = next.f9039a;
                str2.hashCode();
                if (!str2.equals("id")) {
                    if (!str2.equals("class") || (list2 = j0Var.f9203g) == null || !list2.contains(next.f9041c)) {
                        return false;
                    }
                } else if (!next.f9041c.equals(j0Var.f9199c)) {
                    return false;
                }
            }
        }
        List<C1813d> list4 = pVar.f9063d;
        if (list4 == null) {
            return true;
        }
        for (C1813d a : list4) {
            if (!a.mo12713a(mVar, j0Var)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static void m12677p(String str, Object... objArr) {
        String.format(str, objArr);
    }

    /* renamed from: d */
    public C1823n mo12693d(String str) {
        C1811c cVar = new C1811c(str);
        cVar.mo12904A();
        return mo12697j(cVar);
    }

    /* renamed from: e */
    public final void mo12694e(C1823n nVar, C1811c cVar) throws CSSParseException {
        String H = cVar.mo12704H();
        cVar.mo12904A();
        if (H != null) {
            if (!this.f9029c && H.equals("media")) {
                List<MediaType> h = m12672h(cVar);
                if (cVar.mo12910f('{')) {
                    cVar.mo12904A();
                    if (m12670c(h, this.f9027a)) {
                        this.f9029c = true;
                        nVar.mo12725b(mo12697j(cVar));
                        this.f9029c = false;
                    } else {
                        mo12697j(cVar);
                    }
                    if (!cVar.mo12912h() && !cVar.mo12910f('}')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new CSSParseException("Invalid @media rule: missing rule set");
                }
            } else if (this.f9029c || !H.equals("import")) {
                m12677p("Ignoring @%s rule", H);
                mo12698o(cVar);
            } else {
                String N = cVar.mo12710N();
                if (N == null) {
                    N = cVar.mo12702F();
                }
                if (N != null) {
                    cVar.mo12904A();
                    m12672h(cVar);
                    if (cVar.mo12912h() || cVar.mo12910f(';')) {
                        SVG.m12725g();
                    } else {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new CSSParseException("Invalid @import rule: expected string or url()");
                }
            }
            cVar.mo12904A();
            return;
        }
        throw new CSSParseException("Invalid '@' rule");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.caverock.androidsvg.SVG.Style mo12695g(com.caverock.androidsvg.CSSParser.C1811c r5) throws com.caverock.androidsvg.CSSParseException {
        /*
            r4 = this;
            com.caverock.androidsvg.SVG$Style r0 = new com.caverock.androidsvg.SVG$Style
            r0.<init>()
        L_0x0005:
            java.lang.String r1 = r5.mo12704H()
            r5.mo12904A()
            r2 = 58
            boolean r2 = r5.mo12910f(r2)
            if (r2 == 0) goto L_0x0061
            r5.mo12904A()
            java.lang.String r2 = r5.mo12706J()
            if (r2 == 0) goto L_0x0059
            r5.mo12904A()
            r3 = 33
            boolean r3 = r5.mo12910f(r3)
            if (r3 == 0) goto L_0x003f
            r5.mo12904A()
            java.lang.String r3 = "important"
            boolean r3 = r5.mo12911g(r3)
            if (r3 == 0) goto L_0x0037
            r5.mo12904A()
            goto L_0x003f
        L_0x0037:
            com.caverock.androidsvg.CSSParseException r5 = new com.caverock.androidsvg.CSSParseException
            java.lang.String r0 = "Malformed rule set: found unexpected '!'"
            r5.<init>(r0)
            throw r5
        L_0x003f:
            r3 = 59
            r5.mo12910f(r3)
            com.caverock.androidsvg.SVGParser.m12880S0(r0, r1, r2)
            r5.mo12904A()
            boolean r1 = r5.mo12912h()
            if (r1 != 0) goto L_0x0058
            r1 = 125(0x7d, float:1.75E-43)
            boolean r1 = r5.mo12910f(r1)
            if (r1 == 0) goto L_0x0005
        L_0x0058:
            return r0
        L_0x0059:
            com.caverock.androidsvg.CSSParseException r5 = new com.caverock.androidsvg.CSSParseException
            java.lang.String r0 = "Expected property value"
            r5.<init>(r0)
            throw r5
        L_0x0061:
            com.caverock.androidsvg.CSSParseException r5 = new com.caverock.androidsvg.CSSParseException
            java.lang.String r0 = "Expected ':'"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.mo12695g(com.caverock.androidsvg.CSSParser$c):com.caverock.androidsvg.SVG$Style");
    }

    /* renamed from: i */
    public final boolean mo12696i(C1823n nVar, C1811c cVar) throws CSSParseException {
        List<C1824o> B = cVar.mo12708L();
        if (B == null || B.isEmpty()) {
            return false;
        }
        if (cVar.mo12910f('{')) {
            cVar.mo12904A();
            SVG.Style g = mo12695g(cVar);
            cVar.mo12904A();
            for (C1824o lVar : B) {
                nVar.mo12724a(new C1821l(lVar, g, this.f9028b));
            }
            return true;
        }
        throw new CSSParseException("Malformed rule block: expected '{'");
    }

    /* renamed from: j */
    public final C1823n mo12697j(C1811c cVar) {
        C1823n nVar = new C1823n();
        while (!cVar.mo12912h()) {
            try {
                if (!cVar.mo12911g("<!--")) {
                    if (!cVar.mo12911g("-->")) {
                        if (!cVar.mo12910f('@')) {
                            if (!mo12696i(nVar, cVar)) {
                                break;
                            }
                        } else {
                            mo12694e(nVar, cVar);
                        }
                    }
                }
            } catch (CSSParseException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("CSS parser terminated early due to error: ");
                sb.append(e.getMessage());
            }
        }
        return nVar;
    }

    /* renamed from: o */
    public final void mo12698o(C1811c cVar) {
        int i = 0;
        while (!cVar.mo12912h()) {
            int intValue = cVar.mo12916l().intValue();
            if (intValue != 59 || i != 0) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public CSSParser(MediaType mediaType, Source source) {
        this.f9029c = false;
        this.f9027a = mediaType;
        this.f9028b = source;
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$o */
    public static class C1824o {

        /* renamed from: a */
        public List<C1825p> f9058a;

        /* renamed from: b */
        public int f9059b;

        public C1824o() {
            this.f9058a = null;
            this.f9059b = 0;
        }

        /* renamed from: a */
        public void mo12731a(C1825p pVar) {
            if (this.f9058a == null) {
                this.f9058a = new ArrayList();
            }
            this.f9058a.add(pVar);
        }

        /* renamed from: b */
        public void mo12732b() {
            this.f9059b += 1000;
        }

        /* renamed from: c */
        public void mo12733c() {
            this.f9059b++;
        }

        /* renamed from: d */
        public void mo12734d() {
            this.f9059b += PlaybackException.CUSTOM_ERROR_CODE_BASE;
        }

        /* renamed from: e */
        public C1825p mo12735e(int i) {
            return this.f9058a.get(i);
        }

        /* renamed from: f */
        public boolean mo12736f() {
            List<C1825p> list = this.f9058a;
            if (list == null || list.isEmpty()) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public int mo12737g() {
            List<C1825p> list = this.f9058a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (C1825p append : this.f9058a) {
                sb.append(append);
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f9059b);
            sb.append(']');
            return sb.toString();
        }

        public /* synthetic */ C1824o(C1809a aVar) {
            this();
        }
    }
}
