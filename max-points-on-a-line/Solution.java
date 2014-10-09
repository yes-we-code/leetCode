import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
	public int maxPoints(Point[] points) {
		int max = 0;

		// handle the case where all points are identical
		for (int i = 0; i < points.length; i++) {
			if (isPointsEqual(points[i], points[0])) {
				max++;
			}
		}

		// find non-(0,0,0) sets
		Map<List<Integer>, Set<Integer>> mapPairs = new HashMap<>();
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				// ignore identical points, which corresponds to (0,0,0)
				if (isPointsEqual(points[i], points[j])) {
					continue;
				}

				// add i, j to the set of points (indexes) where the points are on
				// the same line passing through point i and point j
				List<Integer> generalForm = getGeneralForm(points[i], points[j]);
				if (!mapPairs.containsKey(generalForm)) {
					mapPairs.put(generalForm, new HashSet<Integer>());
				}
				mapPairs.get(generalForm).add(i);
				mapPairs.get(generalForm).add(j);
			}
		}

		// update max by going through all non-(0,0,0) sets
		for (Set<Integer> set : mapPairs.values()) {
			max = Math.max(set.size(), max);
		}

		return max;
	}

	public boolean isPointsEqual (Point pt1, Point pt2) {
		return (pt1.x == pt2.x && pt2.y == pt2.y);
	}

	public int getGcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		return b == 0 ? a : getGcd(b, a % b);
	}

	public List<Integer> normalize(int a, int b, int c) {
		int newA = a, newB = b, newC = c;
		if (a == 0) {
			if (b < 0) {
				newB *= -1;
				newC *= -1;
			}
			int gcd = getGcd(b, c);
			if (gcd > 0) {
				newB /= gcd;
				newC /= gcd;
			}
		} else {
			if (a < 0) {
				newA *= -1;
				newB *= -1;
				newC *= -1;
			}
			int gcd = getGcd(getGcd(a, b), c);
			if (gcd > 0) {
				newA /= gcd;
				newB /= gcd;
				newC /= gcd;
			}
		}
		List<Integer> list = new ArrayList<>();
		list.add(newA);
		list.add(newB);
		list.add(newC);
		return list;
	}

	public List<Integer> getGeneralForm(Point pt1, Point pt2) {
		int x1 = pt1.x;
		int x2 = pt2.x;
		int y1 = pt1.y;
		int y2 = pt2.y;

		// Get general form coefficients based on two-point form
		int a = y2 - y1;
		int b = x1 - x2;
		int c = x1 * y2 - x2 * y1;

		return normalize(a, b, c);
	}
}
