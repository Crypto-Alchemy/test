package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ContactViewModel$deleteContact$1", mo48632f = "ContactViewModel.kt", mo48633l = {225}, mo48634m = "invokeSuspend")
/* compiled from: ContactViewModel.kt */
public final class ContactViewModel$deleteContact$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ pc2<r37> $callBack;
    public final /* synthetic */ IContact $editContact;
    public int label;
    public final /* synthetic */ ContactViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ContactViewModel$deleteContact$1$1", mo48632f = "ContactViewModel.kt", mo48633l = {226}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.ContactViewModel$deleteContact$1$1 */
    /* compiled from: ContactViewModel.kt */
    public static final class C86571 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86571(contactViewModel, iContact, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86571) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                gr0 i2 = contactViewModel.mo61099i();
                String linkId = iContact.getLinkId();
                this.label = 1;
                if (i2.mo51972a(linkId, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hu0 a = cd7.m11843a(contactViewModel);
            final pc2<r37> pc2 = pc2;
            y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C86581>) null) {
                public int label;

                public final ns0<r37> create(Object obj, ns0<?> ns0) {
                    return 

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public ContactViewModel$deleteContact$1(ContactViewModel contactViewModel, IContact iContact, pc2<r37> pc2, ns0<? super ContactViewModel$deleteContact$1> ns0) {
                        super(2, ns0);
                        this.this$0 = contactViewModel;
                        this.$editContact = iContact;
                        this.$callBack = pc2;
                    }

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return new ContactViewModel$deleteContact$1(this.this$0, this.$editContact, this.$callBack, ns0);
                    }

                    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                        return ((ContactViewModel$deleteContact$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object d = wx2.m54101d();
                        int i = this.label;
                        if (i == 0) {
                            hg5.m45199b(obj);
                            CoroutineDispatcher b = qh1.m71265b();
                            final ContactViewModel contactViewModel = this.this$0;
                            final IContact iContact = this.$editContact;
                            final pc2<r37> pc2 = this.$callBack;
                            C86571 r1 = new C86571((ns0<? super C86571>) null);
                            this.label = 1;
                            if (b50.m55768e(b, r1, this) == d) {
                                return d;
                            }
                        } else if (i == 1) {
                            hg5.m45199b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return r37.f33317a;
                    }
                }
