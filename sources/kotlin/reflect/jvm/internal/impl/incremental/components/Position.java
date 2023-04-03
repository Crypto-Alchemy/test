package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LookupLocation.kt */
public final class Position implements Serializable {
    public static final C7439a Companion = new C7439a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public static final Position f39386a = new Position(-1, -1);
    private final int column;
    private final int line;

    /* renamed from: kotlin.reflect.jvm.internal.impl.incremental.components.Position$a */
    /* compiled from: LookupLocation.kt */
    public static final class C7439a {
        public C7439a() {
        }

        public /* synthetic */ C7439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Position mo53408a() {
            return Position.f39386a;
        }
    }

    public Position(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ')';
    }
}
