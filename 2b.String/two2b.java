package twoa;

public class two2b {



    public static void main(String[] args) {
        final int iterations = 10000;
        final String appendString = "AIET";

        // Test StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendString);
        }
        long endTimeBuffer = System.currentTimeMillis();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendString);
        }
        long endTimeBuilder = System.currentTimeMillis();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Display results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ms");

        // Justification
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("StringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("Both took the same time.");
        }
    }
}
