package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt__SequencesKt;
import net.sqlcipher.database.SQLiteDatabase;

@Navigator.C1127b("activity")
@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u0010B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, mo44877d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$b;", "l", "", "k", "destination", "Landroid/os/Bundle;", "args", "Lm44;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "Landroidx/navigation/NavDestination;", "m", "Landroid/content/Context;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "<init>", "(Landroid/content/Context;)V", "e", "a", "b", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: ActivityNavigator.kt */
public class ActivityNavigator extends Navigator<C1107b> {

    /* renamed from: e */
    public static final C1106a f5966e = new C1106a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public final Context f5967c;

    /* renamed from: d */
    public final Activity f5968d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, mo44877d2 = {"Landroidx/navigation/ActivityNavigator$a;", "", "", "EXTRA_NAV_CURRENT", "Ljava/lang/String;", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "<init>", "()V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.ActivityNavigator$a */
    /* compiled from: ActivityNavigator.kt */
    public static final class C1106a {
        public C1106a() {
        }

        public /* synthetic */ C1106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000,¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0016\u001a\u00020\u0015H\u0017J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0013\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0016R(\u0010#\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R(\u0010'\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@BX\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00028F@BX\u000e¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b+\u0010&¨\u00060"}, mo44877d2 = {"Landroidx/navigation/ActivityNavigator$b;", "Landroidx/navigation/NavDestination;", "", "dataPattern", "X", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lr37;", "H", "packageName", "Z", "Landroid/content/ComponentName;", "name", "V", "action", "U", "Landroid/net/Uri;", "data", "W", "", "O", "toString", "", "other", "equals", "", "hashCode", "Landroid/content/Intent;", "<set-?>", "C", "Landroid/content/Intent;", "T", "()Landroid/content/Intent;", "intent", "Ljava/lang/String;", "S", "()Ljava/lang/String;", "component", "Landroid/content/ComponentName;", "R", "()Landroid/content/ComponentName;", "Q", "Landroidx/navigation/Navigator;", "activityNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.ActivityNavigator$b */
    /* compiled from: ActivityNavigator.kt */
    public static class C1107b extends NavDestination {

        /* renamed from: C */
        public Intent f5969C;

        /* renamed from: H */
        public String f5970H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1107b(Navigator<? extends C1107b> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
            vx2.m53591g(navigator, "activityNavigator");
        }

        /* renamed from: H */
        public void mo8404H(Context context, AttributeSet attributeSet) {
            vx2.m53591g(context, "context");
            vx2.m53591g(attributeSet, "attrs");
            super.mo8404H(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, i65.ActivityNavigator);
            vx2.m53590f(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(i65.ActivityNavigator_targetPackage);
            if (string != null) {
                String packageName = context.getPackageName();
                vx2.m53590f(packageName, "context.packageName");
                string = yb6.m74332I(string, "${applicationId}", packageName, false, 4, (Object) null);
            }
            mo8414Z(string);
            String string2 = obtainAttributes.getString(i65.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                mo8411V(new ComponentName(context, string2));
            }
            mo8410U(obtainAttributes.getString(i65.ActivityNavigator_action));
            String string3 = obtainAttributes.getString(i65.ActivityNavigator_data);
            if (string3 != null) {
                mo8412W(Uri.parse(string3));
            }
            mo8413X(obtainAttributes.getString(i65.ActivityNavigator_dataPattern));
            obtainAttributes.recycle();
        }

        /* renamed from: O */
        public boolean mo8405O() {
            return false;
        }

        /* renamed from: Q */
        public final String mo8406Q() {
            Intent intent = this.f5969C;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        /* renamed from: R */
        public final ComponentName mo8407R() {
            Intent intent = this.f5969C;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* renamed from: S */
        public final String mo8408S() {
            return this.f5970H;
        }

        /* renamed from: T */
        public final Intent mo8409T() {
            return this.f5969C;
        }

        /* renamed from: U */
        public final C1107b mo8410U(String str) {
            if (this.f5969C == null) {
                this.f5969C = new Intent();
            }
            Intent intent = this.f5969C;
            vx2.m53588d(intent);
            intent.setAction(str);
            return this;
        }

        /* renamed from: V */
        public final C1107b mo8411V(ComponentName componentName) {
            if (this.f5969C == null) {
                this.f5969C = new Intent();
            }
            Intent intent = this.f5969C;
            vx2.m53588d(intent);
            intent.setComponent(componentName);
            return this;
        }

        /* renamed from: W */
        public final C1107b mo8412W(Uri uri) {
            if (this.f5969C == null) {
                this.f5969C = new Intent();
            }
            Intent intent = this.f5969C;
            vx2.m53588d(intent);
            intent.setData(uri);
            return this;
        }

        /* renamed from: X */
        public final C1107b mo8413X(String str) {
            this.f5970H = str;
            return this;
        }

        /* renamed from: Z */
        public final C1107b mo8414Z(String str) {
            if (this.f5969C == null) {
                this.f5969C = new Intent();
            }
            Intent intent = this.f5969C;
            vx2.m53588d(intent);
            intent.setPackage(str);
            return this;
        }

        public boolean equals(Object obj) {
            boolean z;
            if (obj == null || !(obj instanceof C1107b) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f5969C;
            if (intent != null) {
                z = intent.filterEquals(((C1107b) obj).f5969C);
            } else if (((C1107b) obj).f5969C == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !vx2.m53586b(this.f5970H, ((C1107b) obj).f5970H)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f5969C;
            int i2 = 0;
            if (intent != null) {
                i = intent.filterHashCode();
            } else {
                i = 0;
            }
            int i3 = (hashCode + i) * 31;
            String str = this.f5970H;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            ComponentName R = mo8407R();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (R != null) {
                sb.append(" class=");
                sb.append(R.getClassName());
            } else {
                String Q = mo8406Q();
                if (Q != null) {
                    sb.append(" action=");
                    sb.append(Q);
                }
            }
            String sb2 = sb.toString();
            vx2.m53590f(sb2, "sb.toString()");
            return sb2;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\f"}, mo44877d2 = {"Landroidx/navigation/ActivityNavigator$c;", "Landroidx/navigation/Navigator$a;", "", "a", "I", "b", "()I", "flags", "Loa;", "activityOptions", "Loa;", "()Loa;", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.ActivityNavigator$c */
    /* compiled from: ActivityNavigator.kt */
    public static final class C1108c implements Navigator.C1126a {

        /* renamed from: a */
        public final int f5971a;

        /* renamed from: a */
        public final C2945oa mo8418a() {
            return null;
        }

        /* renamed from: b */
        public final int mo8419b() {
            return this.f5971a;
        }
    }

    public ActivityNavigator(Context context) {
        Object obj;
        vx2.m53591g(context, "context");
        this.f5967c = context;
        Iterator it = SequencesKt__SequencesKt.m63015j(context, ActivityNavigator$hostActivity$1.INSTANCE).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f5968d = (Activity) obj;
    }

    /* renamed from: k */
    public boolean mo8401k() {
        Activity activity = this.f5968d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: l */
    public C1107b mo8399a() {
        return new C1107b(this);
    }

    /* renamed from: m */
    public NavDestination mo8400d(C1107b bVar, Bundle bundle, m44 m44, Navigator.C1126a aVar) {
        Intent intent;
        int intExtra;
        boolean z;
        vx2.m53591g(bVar, "destination");
        if (bVar.mo8409T() != null) {
            Intent intent2 = new Intent(bVar.mo8409T());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String S = bVar.mo8408S();
                if (S == null || S.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(S);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + S);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z2 = aVar instanceof C1108c;
            if (z2) {
                intent2.addFlags(((C1108c) aVar).mo8419b());
            }
            if (this.f5968d == null) {
                intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            if (m44 != null && m44.mo23030g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f5968d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.mo8563w());
            Resources resources = this.f5967c.getResources();
            if (m44 != null) {
                int c = m44.mo23025c();
                int d = m44.mo23026d();
                if ((c <= 0 || !vx2.m53586b(resources.getResourceTypeName(c), "animator")) && (d <= 0 || !vx2.m53586b(resources.getResourceTypeName(d), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    sb.append(resources.getResourceName(c));
                    sb.append(" and popExit resource ");
                    sb.append(resources.getResourceName(d));
                    sb.append(" when launching ");
                    sb.append(bVar);
                }
            }
            if (z2) {
                ((C1108c) aVar).mo8418a();
                this.f5967c.startActivity(intent2);
            } else {
                this.f5967c.startActivity(intent2);
            }
            if (m44 == null || this.f5968d == null) {
                return null;
            }
            int a = m44.mo23023a();
            int b = m44.mo23024b();
            if ((a > 0 && vx2.m53586b(resources.getResourceTypeName(a), "animator")) || (b > 0 && vx2.m53586b(resources.getResourceTypeName(b), "animator"))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity destinations do not support Animator resource. Ignoring enter resource ");
                sb2.append(resources.getResourceName(a));
                sb2.append(" and exit resource ");
                sb2.append(resources.getResourceName(b));
                sb2.append("when launching ");
                sb2.append(bVar);
                return null;
            } else if (a < 0 && b < 0) {
                return null;
            } else {
                this.f5968d.overridePendingTransition(d75.m43382d(a, 0), d75.m43382d(b, 0));
                return null;
            }
        } else {
            throw new IllegalStateException(("Destination " + bVar.mo8563w() + " does not have an Intent set.").toString());
        }
    }
}
