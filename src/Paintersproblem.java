public class Paintersproblem {
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;
        System.out.println("Minimum time to Paint: " + paintersPartition(boards, k));
    }

    public static int paintersPartition(int[] boards, int k) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int length : boards) {
            start = Math.max(start, length);
            end += length;
        }
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(boards, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean isPossible(int[] boards, int k, int maxLen) {
        int painterCount = 1;
        int currLength = 0;
        for (int length : boards) {
            if (currLength + length > maxLen) {
                painterCount++;
                currLength = length;
                if (painterCount > k) {
                    return false;
                }
            }else {
                    currLength += length;
                }
            }
            return true;
        }
}
