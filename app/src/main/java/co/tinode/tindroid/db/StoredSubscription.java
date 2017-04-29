package co.tinode.tindroid.db;

import co.tinode.tinodesdk.LocalData;
import co.tinode.tinodesdk.model.Subscription;

/**
 * Subscription record
 */
public class StoredSubscription implements LocalData.Payload {
    public long id;
    public long topicId;
    public long userId;
    public int status;
    public int senderIdx;

    public static long getId(Subscription sub) {
        StoredSubscription ss = (StoredSubscription) sub.getLocal();
        return ss.id;
    }
}