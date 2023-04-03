package p000;

import android.content.Context;
import androidx.room.RoomDatabase;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0013"}, mo44877d2 = {"Lih5;", "", "T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Landroidx/room/RoomDatabase;", "Landroid/content/Context;", "context", "Landroidx/room/RoomDatabase$a;", "c", "name", "a", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ih5 */
/* compiled from: Room.kt */
public final class ih5 {

    /* renamed from: a */
    public static final ih5 f13264a = new ih5();

    /* renamed from: a */
    public static final <T extends RoomDatabase> RoomDatabase.C1366a<T> m19629a(Context context, Class<T> cls, String str) {
        boolean z;
        vx2.m53591g(context, "context");
        vx2.m53591g(cls, "klass");
        if (str == null || yb6.m74325B(str)) {
            z = true;
        } else {
            z = false;
        }
        if (true ^ z) {
            return new RoomDatabase.C1366a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    /* renamed from: b */
    public static final <T, C> T m19630b(Class<C> cls, String str) {
        boolean z;
        String str2;
        vx2.m53591g(cls, "klass");
        vx2.m53591g(str, "suffix");
        Package packageR = cls.getPackage();
        vx2.m53588d(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        vx2.m53588d(canonicalName);
        vx2.m53590f(name, "fullPackage");
        boolean z2 = false;
        if (name.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            canonicalName = canonicalName.substring(name.length() + 1);
            vx2.m53590f(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = yb6.m74331H(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            vx2.m53589e(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    /* renamed from: c */
    public static final <T extends RoomDatabase> RoomDatabase.C1366a<T> m19631c(Context context, Class<T> cls) {
        vx2.m53591g(context, "context");
        vx2.m53591g(cls, "klass");
        return new RoomDatabase.C1366a<>(context, cls, (String) null);
    }
}
