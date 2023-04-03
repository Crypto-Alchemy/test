package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Account */
class AccountPhantomReference extends PhantomReference<Account> {
    private static ReferenceQueue<Account> queue = new ReferenceQueue<>();
    private static Set<AccountPhantomReference> references = new HashSet();
    private long nativeHandle;

    private AccountPhantomReference(Account account, long j) {
        super(account, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (AccountPhantomReference accountPhantomReference = (AccountPhantomReference) queue.poll(); accountPhantomReference != null; accountPhantomReference = (AccountPhantomReference) queue.poll()) {
            Account.nativeDelete(accountPhantomReference.nativeHandle);
            references.remove(accountPhantomReference);
        }
    }

    public static void register(Account account, long j) {
        references.add(new AccountPhantomReference(account, j));
    }
}
