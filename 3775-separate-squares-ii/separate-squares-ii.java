import java.util.*;

class Solution {

    static class Event {
        long y, x1, x2;
        int type; // +1 add, -1 remove
        Event(long y, long x1, long x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }
    }

    public double separateSquares(int[][] squares) {
        List<Event> events = new ArrayList<>();

        for (int[] s : squares) {
            long x = s[0], y = s[1], l = s[2];
            events.add(new Event(y, x, x + l, 1));
            events.add(new Event(y + l, x, x + l, -1));
        }

        events.sort(Comparator.comparingLong(e -> e.y));

        TreeMap<Long, Integer> active = new TreeMap<>();
        List<double[]> segments = new ArrayList<>();

        long prevY = events.get(0).y;
        double total = 0;
        int i = 0;

        while (i < events.size()) {
            long currY = events.get(i).y;
            long height = currY - prevY;

            if (height > 0) {
                double width = unionWidth(active);
                if (width > 0) {
                    segments.add(new double[]{prevY, currY, width});
                    total += width * height;
                }
            }

            while (i < events.size() && events.get(i).y == currY) {
                Event e = events.get(i);
                active.put(e.x1, active.getOrDefault(e.x1, 0) + e.type);
                active.put(e.x2, active.getOrDefault(e.x2, 0) - e.type);
                if (active.get(e.x1) == 0) active.remove(e.x1);
                if (active.get(e.x2) == 0) active.remove(e.x2);
                i++;
            }
            prevY = currY;
        }

        double half = total / 2, acc = 0;

        for (double[] s : segments) {
            double area = (s[1] - s[0]) * s[2];
            if (acc + area >= half) {
                return s[0] + (half - acc) / s[2];
            }
            acc += area;
        }
        return 0;
    }

    private double unionWidth(TreeMap<Long, Integer> map) {
        double width = 0;
        int count = 0;
        Long prev = null;

        for (var e : map.entrySet()) {
            if (count > 0) width += e.getKey() - prev;
            count += e.getValue();
            prev = e.getKey();
        }
        return width;
    }
}
