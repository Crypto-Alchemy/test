package com.lelloman.identicon.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, mo44877d2 = {"Lcom/lelloman/identicon/drawable/ClassicIdenticonTile;", "", "", "Lcom/lelloman/identicon/drawable/ClassicIdenticonTile$Tiles;", "b", "[Lcom/lelloman/identicon/drawable/ClassicIdenticonTile$Tiles;", "a", "()[Lcom/lelloman/identicon/drawable/ClassicIdenticonTile$Tiles;", "setAll", "([Lcom/lelloman/identicon/drawable/ClassicIdenticonTile$Tiles;)V", "all", "<init>", "()V", "Tiles", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ClassicIdenticonTile.kt */
public final class ClassicIdenticonTile {

    /* renamed from: a */
    public static final ClassicIdenticonTile f25846a = new ClassicIdenticonTile();

    /* renamed from: b */
    public static Tiles[] f25847b = {Tiles.FOUR_SQUARES, Tiles.HALF_SQUARE_TRIANGLE, Tiles.BIG_TRIANGLE, Tiles.HALF_SQUARE_RECTANGLE, Tiles.ROTATED_SQUARE, Tiles.SPEAR_TIP, Tiles.THREE_TRIANGLES, Tiles.SLIM_TRIANGLE, Tiles.LITTLE_SQUARE, Tiles.TWO_TRIANGLES, Tiles.LITTLE_SIDE_SQUARE, Tiles.MARLBORO_TRIANGLE, Tiles.FOUR_TRIANGLES, Tiles.LITTLE_TRIANGLE_INSIDE, Tiles.LITTLE_TRIANGLE_TIP, Tiles.TWO_SQUARES_DIAGONAL, Tiles.LITTLE_ROTATED_SQUARE, Tiles.SHIFTED_MARLBORO_TRIANGLE, Tiles.TUNNELING_TRIANGLES, Tiles.TWO_TIPS_TRIANGLES, Tiles.FOUR_TRIANGLES_FACING_CENTER, Tiles.TWO_SQUARES_STRAIGHT_LINE, Tiles.TWO_TRAPEZOIDS, Tiles.ARROW, Tiles.ROTATE_SQUARE_WITH_HOLE, Tiles.TWO_OPPOSITE_TRIANGLES, Tiles.TRIANGLE_SANDWICH, Tiles.SPIKE, Tiles.FOUR_TRIANGLES_STAR, Tiles.BIG_TRIANGLE_TIP, Tiles.DIAMOND, Tiles.TWO_OPPOSITE_TRIANGLES_BIG};

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4¨\u00065"}, mo44877d2 = {"Lcom/lelloman/identicon/drawable/ClassicIdenticonTile$Tiles;", "", "Landroid/graphics/Canvas;", "canvas", "Lcq6;", "measures", "", "rotation", "Landroid/graphics/Paint;", "bgPaint", "fgPaint", "Lr37;", "draw", "Lbq6;", "tileDrawer", "Lbq6;", "Lkotlin/Function2;", "Landroid/graphics/Path;", "drawer", "<init>", "(Ljava/lang/String;ILfd2;)V", "FOUR_SQUARES", "HALF_SQUARE_TRIANGLE", "BIG_TRIANGLE", "HALF_SQUARE_RECTANGLE", "ROTATED_SQUARE", "SPEAR_TIP", "THREE_TRIANGLES", "SLIM_TRIANGLE", "LITTLE_SQUARE", "TWO_TRIANGLES", "LITTLE_SIDE_SQUARE", "MARLBORO_TRIANGLE", "FOUR_TRIANGLES", "LITTLE_TRIANGLE_INSIDE", "LITTLE_TRIANGLE_TIP", "TWO_SQUARES_DIAGONAL", "LITTLE_ROTATED_SQUARE", "SHIFTED_MARLBORO_TRIANGLE", "TUNNELING_TRIANGLES", "TWO_TIPS_TRIANGLES", "FOUR_TRIANGLES_FACING_CENTER", "TWO_SQUARES_STRAIGHT_LINE", "TWO_TRAPEZOIDS", "ARROW", "ROTATE_SQUARE_WITH_HOLE", "TWO_OPPOSITE_TRIANGLES", "TRIANGLE_SANDWICH", "SPIKE", "FOUR_TRIANGLES_STAR", "BIG_TRIANGLE_TIP", "DIAMOND", "TWO_OPPOSITE_TRIANGLES_BIG", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: ClassicIdenticonTile.kt */
    public enum Tiles {
        FOUR_SQUARES(C50601.INSTANCE),
        HALF_SQUARE_TRIANGLE(C50712.INSTANCE),
        BIG_TRIANGLE(C50823.INSTANCE),
        HALF_SQUARE_RECTANGLE(C50864.INSTANCE),
        ROTATED_SQUARE(C50875.INSTANCE),
        SPEAR_TIP(C50886.INSTANCE),
        THREE_TRIANGLES(C50897.INSTANCE),
        SLIM_TRIANGLE(C50908.INSTANCE),
        LITTLE_SQUARE(C50919.INSTANCE),
        TWO_TRIANGLES(C506110.INSTANCE),
        LITTLE_SIDE_SQUARE(C506211.INSTANCE),
        MARLBORO_TRIANGLE(C506312.INSTANCE),
        FOUR_TRIANGLES(C506413.INSTANCE),
        LITTLE_TRIANGLE_INSIDE(C506514.INSTANCE),
        LITTLE_TRIANGLE_TIP(C506615.INSTANCE),
        TWO_SQUARES_DIAGONAL(C506716.INSTANCE),
        LITTLE_ROTATED_SQUARE(C506817.INSTANCE),
        SHIFTED_MARLBORO_TRIANGLE(C506918.INSTANCE),
        TUNNELING_TRIANGLES(C507019.INSTANCE),
        TWO_TIPS_TRIANGLES(C507220.INSTANCE),
        FOUR_TRIANGLES_FACING_CENTER(C507321.INSTANCE),
        TWO_SQUARES_STRAIGHT_LINE(C507422.INSTANCE),
        TWO_TRAPEZOIDS(C507523.INSTANCE),
        ARROW(C507624.INSTANCE),
        ROTATE_SQUARE_WITH_HOLE(C507725.INSTANCE),
        TWO_OPPOSITE_TRIANGLES(C507826.INSTANCE),
        TRIANGLE_SANDWICH(C507927.INSTANCE),
        SPIKE(C508028.INSTANCE),
        FOUR_TRIANGLES_STAR(C508129.INSTANCE),
        BIG_TRIANGLE_TIP(C508330.INSTANCE),
        DIAMOND(C508431.INSTANCE),
        TWO_OPPOSITE_TRIANGLES_BIG(C508532.INSTANCE);
        
        private final bq6 tileDrawer;

        /* access modifiers changed from: public */
        Tiles(fd2<? super Path, ? super cq6, r37> fd2) {
            this.tileDrawer = new bq6(fd2);
        }

        public final void draw(Canvas canvas, cq6 cq6, int i, Paint paint, Paint paint2) {
            vx2.m53591g(canvas, "canvas");
            vx2.m53591g(cq6, "measures");
            vx2.m53591g(paint, "bgPaint");
            vx2.m53591g(paint2, "fgPaint");
            this.tileDrawer.mo29696a(canvas, cq6, i, paint, paint2);
        }
    }

    /* renamed from: a */
    public final Tiles[] mo38330a() {
        return f25847b;
    }
}
