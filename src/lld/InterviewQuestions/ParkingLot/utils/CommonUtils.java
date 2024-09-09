package lld.InterviewQuestions.ParkingLot.utils;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CommonUtils {
    public static String generateISOTimestamp() {
        Instant now = Instant.now();
        ZonedDateTime zdt = now.atZone(ZoneId.systemDefault());
        String isoTimestamp = zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        return isoTimestamp;
    }

    public static int generateParkingId() {
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }
}
