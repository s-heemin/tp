package Generator;

import java.util.UUID;

public class UniqueKey {
    /*     멀티 스레드 환경에서 uid가 같아질 수 있기 때문에
     유저들의 uid는 db에서 auto increments를 통해서 발급받는다.*/
    public static long generateKey() {
        long currentTimeMillis = System.currentTimeMillis();
        UUID uuid = UUID.randomUUID();

        // UUID의 most significant bits와 least significant bits를 합쳐서 long으로 변환
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long uniqueKey = (mostSignificantBits ^ leastSignificantBits) + currentTimeMillis;

        return uniqueKey;
    }
}
