package net.safemoon.androidwallet.fragments.collectibles;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;
import net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lqj0;", "invoke", "()Lqj0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CollectibleFragment.kt */
public final class CollectibleFragment$collectionsAdapter$2 extends Lambda implements pc2<qj0> {
    public final /* synthetic */ CollectibleFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleFragment$collectionsAdapter$2(CollectibleFragment collectibleFragment) {
        super(0);
        this.this$0 = collectibleFragment;
    }

    public final qj0 invoke() {
        final CollectibleFragment collectibleFragment = this.this$0;
        C85271 r1 = new rc2<RoomCollectionAndNft, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RoomCollectionAndNft) obj);
                return r37.f33317a;
            }

            public final void invoke(RoomCollectionAndNft roomCollectionAndNft) {
                vx2.m53591g(roomCollectionAndNft, "it");
                collectibleFragment.mo57962O(roomCollectionAndNft.getCollection());
            }
        };
        final CollectibleFragment collectibleFragment2 = this.this$0;
        return new qj0(r1, new fd2<RoomCollectionAndNft, TYPE_DELETE_NFT, r37>() {

            @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
            /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$collectionsAdapter$2$2$a */
            /* compiled from: CollectibleFragment.kt */
            public /* synthetic */ class C8535a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f42309a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT[] r0 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r1 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.HIDE     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r1 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r1 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.DELETE_FOREVER     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f42309a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$collectionsAdapter$2.C85282.C8535a.<clinit>():void");
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((RoomCollectionAndNft) obj, (TYPE_DELETE_NFT) obj2);
                return r37.f33317a;
            }

            public final void invoke(RoomCollectionAndNft roomCollectionAndNft, TYPE_DELETE_NFT type_delete_nft) {
                final RoomCollectionAndNft roomCollectionAndNft2 = roomCollectionAndNft;
                vx2.m53591g(roomCollectionAndNft2, "it");
                vx2.m53591g(type_delete_nft, "type");
                int i = C8535a.f42309a[type_delete_nft.ordinal()];
                if (i == 1) {
                    WeakReference weakReference = new WeakReference(collectibleFragment2.requireActivity());
                    Integer valueOf = Integer.valueOf(R.string.alert_remove_this_collection);
                    Integer valueOf2 = Integer.valueOf(R.string.action_yes);
                    Integer valueOf3 = Integer.valueOf(R.string.action_no);
                    final CollectibleFragment collectibleFragment = collectibleFragment2;
                    C9001np.m69934S(weakReference, (Integer) null, (String) null, valueOf, (String) null, valueOf2, valueOf3, (Integer) null, (Integer) null, new rc2<DialogInterface, r37>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DialogInterface) obj);
                            return r37.f33317a;
                        }

                        public final void invoke(DialogInterface dialogInterface) {
                            vx2.m53591g(dialogInterface, "<anonymous parameter 0>");
                            collectibleFragment.mo57959L().mo61049R(roomCollectionAndNft2, true);
                        }
                    }, C85302.INSTANCE, 20, (Object) null);
                } else if (i == 2) {
                    WeakReference weakReference2 = new WeakReference(collectibleFragment2.requireActivity());
                    Integer valueOf4 = Integer.valueOf(R.string.alert_back_this_collection);
                    Integer valueOf5 = Integer.valueOf(R.string.action_yes);
                    Integer valueOf6 = Integer.valueOf(R.string.action_no);
                    final CollectibleFragment collectibleFragment2 = collectibleFragment2;
                    C9001np.m69934S(weakReference2, (Integer) null, (String) null, valueOf4, (String) null, valueOf5, valueOf6, (Integer) null, (Integer) null, new rc2<DialogInterface, r37>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DialogInterface) obj);
                            return r37.f33317a;
                        }

                        public final void invoke(DialogInterface dialogInterface) {
                            vx2.m53591g(dialogInterface, "<anonymous parameter 0>");
                            collectibleFragment2.mo57959L().mo61049R(roomCollectionAndNft2, false);
                        }
                    }, C85324.INSTANCE, 20, (Object) null);
                } else if (i == 3) {
                    WeakReference weakReference3 = new WeakReference(collectibleFragment2.requireActivity());
                    Integer valueOf7 = Integer.valueOf(R.string.alert_delete_this_collection);
                    Integer valueOf8 = Integer.valueOf(R.string.action_yes);
                    Integer valueOf9 = Integer.valueOf(R.string.action_no);
                    final CollectibleFragment collectibleFragment3 = collectibleFragment2;
                    C9001np.m69934S(weakReference3, (Integer) null, (String) null, valueOf7, (String) null, valueOf8, valueOf9, (Integer) null, (Integer) null, new rc2<DialogInterface, r37>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DialogInterface) obj);
                            return r37.f33317a;
                        }

                        public final void invoke(DialogInterface dialogInterface) {
                            vx2.m53591g(dialogInterface, "<anonymous parameter 0>");
                            collectibleFragment3.mo57959L().mo61050S(roomCollectionAndNft2);
                        }
                    }, C85346.INSTANCE, 20, (Object) null);
                }
            }
        });
    }
}
