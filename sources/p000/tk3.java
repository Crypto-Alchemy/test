package p000;

import kotlin.Metadata;
import org.koin.core.logger.Level;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H&J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, mo44877d2 = {"Ltk3;", "", "Lorg/koin/core/logger/Level;", "level", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Lr37;", "a", "lvl", "", "b", "Lorg/koin/core/logger/Level;", "getLevel", "()Lorg/koin/core/logger/Level;", "setLevel", "(Lorg/koin/core/logger/Level;)V", "<init>", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tk3 */
/* compiled from: Logger.kt */
public abstract class tk3 {

    /* renamed from: a */
    public Level f44770a;

    public tk3(Level level) {
        vx2.m53591g(level, "level");
        this.f44770a = level;
    }

    /* renamed from: a */
    public abstract void mo66080a(Level level, String str);

    /* renamed from: b */
    public final boolean mo66081b(Level level) {
        vx2.m53591g(level, "lvl");
        if (this.f44770a.compareTo(level) <= 0) {
            return true;
        }
        return false;
    }
}
