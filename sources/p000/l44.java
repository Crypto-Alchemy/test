package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParserException;
import p000.m44;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J0\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006!"}, mo44877d2 = {"Ll44;", "", "", "graphResId", "Landroidx/navigation/NavGraph;", "b", "Landroid/content/res/Resources;", "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "Landroidx/navigation/NavDestination;", "a", "dest", "Lr37;", "f", "Landroid/os/Bundle;", "bundle", "e", "Landroid/content/res/TypedArray;", "Ld44;", "d", "g", "c", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lb54;", "Lb54;", "navigatorProvider", "<init>", "(Landroid/content/Context;Lb54;)V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: l44 */
/* compiled from: NavInflater.kt */
public final class l44 {

    /* renamed from: c */
    public static final C2736a f14406c = new C2736a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final ThreadLocal<TypedValue> f14407d = new ThreadLocal<>();

    /* renamed from: a */
    public final Context f14408a;

    /* renamed from: b */
    public final b54 f14409b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Ll44$a;", "", "Landroid/util/TypedValue;", "value", "Lp44;", "navType", "expectedNavType", "", "argType", "foundType", "a", "(Landroid/util/TypedValue;Lp44;Lp44;Ljava/lang/String;Ljava/lang/String;)Lp44;", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "Ljava/lang/ThreadLocal;", "sTmpValue", "Ljava/lang/ThreadLocal;", "<init>", "()V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: l44$a */
    /* compiled from: NavInflater.kt */
    public static final class C2736a {
        public C2736a() {
        }

        public /* synthetic */ C2736a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final p44<?> mo22646a(TypedValue typedValue, p44<?> p44, p44<?> p442, String str, String str2) throws XmlPullParserException {
            vx2.m53591g(typedValue, "value");
            vx2.m53591g(p442, "expectedNavType");
            vx2.m53591g(str2, "foundType");
            if (p44 != null && p44 != p442) {
                throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
            } else if (p44 == null) {
                return p442;
            } else {
                return p44;
            }
        }
    }

    public l44(Context context, b54 b54) {
        vx2.m53591g(context, "context");
        vx2.m53591g(b54, "navigatorProvider");
        this.f14408a = context;
        this.f14409b = b54;
    }

    /* renamed from: a */
    public final NavDestination mo22639a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        b54 b54 = this.f14409b;
        String name = xmlResourceParser.getName();
        vx2.m53590f(name, "parser.name");
        NavDestination a = b54.mo11359e(name).mo8399a();
        a.mo8404H(this.f14408a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (vx2.m53586b("argument", name2)) {
                    mo22644f(resources, a, attributeSet, i);
                } else if (vx2.m53586b("deepLink", name2)) {
                    mo22645g(resources, a, attributeSet);
                } else if (vx2.m53586b("action", name2)) {
                    mo22641c(resources, a, attributeSet, xmlResourceParser, i);
                } else if (vx2.m53586b("include", name2) && (a instanceof NavGraph)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, i65.NavInclude);
                    vx2.m53590f(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph) a).mo8572Q(mo22640b(obtainAttributes.getResourceId(i65.NavInclude_graph, 0)));
                    r37 r37 = r37.f33317a;
                    obtainAttributes.recycle();
                } else if (a instanceof NavGraph) {
                    ((NavGraph) a).mo8572Q(mo22639a(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.NavGraph mo22640b(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f14408a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            p000.vx2.m53590f(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0065 }
            r4 = 2
            if (r3 == r4) goto L_0x001d
            r5 = 1
            if (r3 != r5) goto L_0x0013
        L_0x001d:
            if (r3 != r4) goto L_0x005b
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "res"
            p000.vx2.m53590f(r0, r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "attrs"
            p000.vx2.m53590f(r2, r4)     // Catch:{ Exception -> 0x0065 }
            androidx.navigation.NavDestination r2 = r6.mo22639a(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0065 }
            boolean r4 = r2 instanceof androidx.navigation.NavGraph     // Catch:{ Exception -> 0x0065 }
            if (r4 == 0) goto L_0x003b
            androidx.navigation.NavGraph r2 = (androidx.navigation.NavGraph) r2     // Catch:{ Exception -> 0x0065 }
            r1.close()
            return r2
        L_0x003b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065 }
            r2.<init>()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x0065 }
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0065 }
            throw r3     // Catch:{ Exception -> 0x0065 }
        L_0x005b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0065 }
            throw r2     // Catch:{ Exception -> 0x0065 }
        L_0x0063:
            r7 = move-exception
            goto L_0x008d
        L_0x0065:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r4.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0063 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0063 }
            throw r3     // Catch:{ all -> 0x0063 }
        L_0x008d:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l44.mo22640b(int):androidx.navigation.NavGraph");
    }

    /* renamed from: c */
    public final void mo22641c(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.f14408a;
        int[] iArr = i55.NavAction;
        vx2.m53590f(iArr, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(i55.NavAction_android_id, 0);
        c44 c44 = new c44(obtainStyledAttributes.getResourceId(i55.NavAction_destination, 0), (m44) null, (Bundle) null, 6, (DefaultConstructorMarker) null);
        m44.C2804a aVar = new m44.C2804a();
        aVar.mo23037d(obtainStyledAttributes.getBoolean(i55.NavAction_launchSingleTop, false));
        aVar.mo23043k(obtainStyledAttributes.getBoolean(i55.NavAction_restoreState, false));
        aVar.mo23041h(obtainStyledAttributes.getResourceId(i55.NavAction_popUpTo, -1), obtainStyledAttributes.getBoolean(i55.NavAction_popUpToInclusive, false), obtainStyledAttributes.getBoolean(i55.NavAction_popUpToSaveState, false));
        aVar.mo23035b(obtainStyledAttributes.getResourceId(i55.NavAction_enterAnim, -1));
        aVar.mo23036c(obtainStyledAttributes.getResourceId(i55.NavAction_exitAnim, -1));
        aVar.mo23038e(obtainStyledAttributes.getResourceId(i55.NavAction_popEnterAnim, -1));
        aVar.mo23039f(obtainStyledAttributes.getResourceId(i55.NavAction_popExitAnim, -1));
        c44.mo11970e(aVar.mo23034a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && vx2.m53586b("argument", xmlResourceParser.getName())) {
                    mo22643e(resources, bundle, attributeSet, i);
                }
            }
        }
        if (!bundle.isEmpty()) {
            c44.mo11969d(bundle);
        }
        navDestination.mo8551J(resourceId, c44);
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: p44<java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: p44<java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: p44<java.lang.Boolean>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: p44<java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: p44<java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: p44<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: p44<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.d44 mo22642d(android.content.res.TypedArray r11, android.content.res.Resources r12, int r13) throws org.xmlpull.v1.XmlPullParserException {
        /*
            r10 = this;
            d44$a r0 = new d44$a
            r0.<init>()
            int r1 = p000.i55.NavArgument_nullable
            r2 = 0
            boolean r1 = r11.getBoolean(r1, r2)
            r0.mo18519c(r1)
            java.lang.ThreadLocal<android.util.TypedValue> r1 = f14407d
            java.lang.Object r3 = r1.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0021
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r1.set(r3)
        L_0x0021:
            int r1 = p000.i55.NavArgument_argType
            java.lang.String r8 = r11.getString(r1)
            r1 = 0
            if (r8 == 0) goto L_0x0036
            p44$l r4 = p000.p44.f16281c
            java.lang.String r13 = r12.getResourcePackageName(r13)
            p44 r13 = r4.mo24372a(r8, r13)
            r6 = r13
            goto L_0x0037
        L_0x0036:
            r6 = r1
        L_0x0037:
            int r13 = p000.i55.NavArgument_android_defaultValue
            boolean r4 = r11.getValue(r13, r3)
            if (r4 == 0) goto L_0x0179
            p44<java.lang.Integer> r1 = p000.p44.f16283e
            java.lang.String r4 = "' for "
            java.lang.String r5 = "unsupported value '"
            r7 = 16
            if (r6 != r1) goto L_0x0083
            int r11 = r3.resourceId
            if (r11 == 0) goto L_0x004f
            r2 = r11
            goto L_0x0057
        L_0x004f:
            int r11 = r3.type
            if (r11 != r7) goto L_0x005d
            int r11 = r3.data
            if (r11 != 0) goto L_0x005d
        L_0x0057:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x0179
        L_0x005d:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.mo24333b()
            r12.append(r13)
            java.lang.String r13 = ". Must be a reference to a resource."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0083:
            int r9 = r3.resourceId
            if (r9 == 0) goto L_0x00c3
            if (r6 != 0) goto L_0x0091
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r6 = r1
            r1 = r11
            goto L_0x0179
        L_0x0091:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.mo24333b()
            r12.append(r13)
            java.lang.String r13 = ". You must use a \""
            r12.append(r13)
            java.lang.String r13 = r1.mo24333b()
            r12.append(r13)
            java.lang.String r13 = "\" type to reference other resources."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c3:
            p44<java.lang.String> r1 = p000.p44.f16291m
            if (r6 != r1) goto L_0x00cd
            java.lang.String r1 = r11.getString(r13)
            goto L_0x0179
        L_0x00cd:
            int r11 = r3.type
            r13 = 3
            if (r11 == r13) goto L_0x0166
            r13 = 4
            if (r11 == r13) goto L_0x0152
            r13 = 5
            if (r11 == r13) goto L_0x0139
            r12 = 18
            if (r11 == r12) goto L_0x0124
            if (r11 < r7) goto L_0x010b
            r12 = 31
            if (r11 > r12) goto L_0x010b
            p44<java.lang.Float> r7 = p000.p44.f16287i
            if (r6 != r7) goto L_0x00f8
            l44$a r4 = f14406c
            java.lang.String r9 = "float"
            r5 = r3
            p44 r6 = r4.mo22646a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            float r11 = (float) r11
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0179
        L_0x00f8:
            l44$a r4 = f14406c
            p44<java.lang.Integer> r7 = p000.p44.f16282d
            java.lang.String r9 = "integer"
            r5 = r3
            p44 r6 = r4.mo22646a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0179
        L_0x010b:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unsupported argument type "
            r12.append(r13)
            int r13 = r3.type
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0124:
            l44$a r4 = f14406c
            p44<java.lang.Boolean> r7 = p000.p44.f16289k
            java.lang.String r9 = "boolean"
            r5 = r3
            p44 r6 = r4.mo22646a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            if (r11 == 0) goto L_0x0134
            r2 = 1
        L_0x0134:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x0179
        L_0x0139:
            l44$a r4 = f14406c
            p44<java.lang.Integer> r7 = p000.p44.f16282d
            java.lang.String r9 = "dimension"
            r5 = r3
            p44 r6 = r4.mo22646a(r5, r6, r7, r8, r9)
            android.util.DisplayMetrics r11 = r12.getDisplayMetrics()
            float r11 = r3.getDimension(r11)
            int r11 = (int) r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0179
        L_0x0152:
            l44$a r4 = f14406c
            p44<java.lang.Float> r7 = p000.p44.f16287i
            java.lang.String r9 = "float"
            r5 = r3
            p44 r6 = r4.mo22646a(r5, r6, r7, r8, r9)
            float r11 = r3.getFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0179
        L_0x0166:
            java.lang.CharSequence r11 = r3.string
            java.lang.String r11 = r11.toString()
            if (r6 != 0) goto L_0x0175
            p44$l r12 = p000.p44.f16281c
            p44 r12 = r12.mo24373b(r11)
            r6 = r12
        L_0x0175:
            java.lang.Object r1 = r6.mo24336e(r11)
        L_0x0179:
            if (r1 == 0) goto L_0x017e
            r0.mo18518b(r1)
        L_0x017e:
            if (r6 == 0) goto L_0x0183
            r0.mo18520d(r6)
        L_0x0183:
            d44 r11 = r0.mo18517a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l44.mo22642d(android.content.res.TypedArray, android.content.res.Resources, int):d44");
    }

    /* renamed from: e */
    public final void mo22643e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, i55.NavArgument);
        vx2.m53590f(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(i55.NavArgument_android_name);
        if (string != null) {
            vx2.m53590f(string, "array.getString(R.stylea…uments must have a name\")");
            d44 d = mo22642d(obtainAttributes, resources, i);
            if (d.mo18510b()) {
                d.mo18512d(string, bundle);
            }
            r37 r37 = r37.f33317a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: f */
    public final void mo22644f(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, i55.NavArgument);
        vx2.m53590f(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(i55.NavArgument_android_name);
        if (string != null) {
            vx2.m53590f(string, "array.getString(R.stylea…uments must have a name\")");
            navDestination.mo8555e(string, mo22642d(obtainAttributes, resources, i));
            r37 r37 = r37.f33317a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: g */
    public final void mo22645g(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        boolean z;
        boolean z2;
        boolean z3;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, i55.NavDeepLink);
        vx2.m53590f(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(i55.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(i55.NavDeepLink_action);
        String string3 = obtainAttributes.getString(i55.NavDeepLink_mimeType);
        boolean z4 = false;
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (string2 == null || string2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (string3 == null || string3.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        NavDeepLink.C1119a aVar = new NavDeepLink.C1119a();
        if (string != null) {
            String packageName = this.f14408a.getPackageName();
            vx2.m53590f(packageName, "context.packageName");
            aVar.mo8535d(yb6.m74332I(string, "${applicationId}", packageName, false, 4, (Object) null));
        }
        if (string2 == null || string2.length() == 0) {
            z4 = true;
        }
        if (!z4) {
            String packageName2 = this.f14408a.getPackageName();
            vx2.m53590f(packageName2, "context.packageName");
            aVar.mo8533b(yb6.m74332I(string2, "${applicationId}", packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.f14408a.getPackageName();
            vx2.m53590f(packageName3, "context.packageName");
            aVar.mo8534c(yb6.m74332I(string3, "${applicationId}", packageName3, false, 4, (Object) null));
        }
        navDestination.mo8556j(aVar.mo8532a());
        r37 r37 = r37.f33317a;
        obtainAttributes.recycle();
    }
}
