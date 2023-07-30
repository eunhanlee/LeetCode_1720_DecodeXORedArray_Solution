package org.example;

public class Solution {
    /**
     * Decodes the given encoded array using XOR operation and returns the original array.
     *
     * @param encoded The XOR-encoded array
     * @param first   The value of the first element in the decoded array
     * @return The decoded original array
     */
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] decoded = new int[n + 1];
        decoded[0] = first;

        for (int i = 0; i < n; i++) {
            decoded[i + 1] = decoded[i] ^ encoded[i];
        }

        return decoded;
    }
}
