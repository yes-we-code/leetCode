import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestSolution {

	@Test
	public void testGcd() {
		Solution sol = new Solution();
		assertEquals(0, sol.getGcd(0, 0));
		assertEquals(100, sol.getGcd(0, 100));
		assertEquals(100, sol.getGcd(100, 0));
		assertEquals(100, sol.getGcd(100, 100));
		assertEquals(20, sol.getGcd(100, 120));
	}

	@Test
	public void testGetGeneralForm() {
		Solution sol = new Solution();
		Point pt1 = new Point(0, 1);
		Point pt2 = new Point(1, 2);
		List<Integer> list = sol.getGeneralForm(pt1, pt2);
		assertEquals(3, list.size());
		assertEquals(1, list.get(0).intValue());
		assertEquals(-1, list.get(1).intValue());
		assertEquals(-1, list.get(2).intValue());
	}

	public Point[] parsePoints(String str) {
		int state = 0;
		List<Point> list = new ArrayList<>();
		StringBuffer sbX = new StringBuffer();
		StringBuffer sbY = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				sbX.setLength(0);
				sbY.setLength(0);
				state = 1;
			} else if (state == 1) {
				if (ch == ',') {
					state = 2;
				} else {
					sbX.append(ch);
				}
			} else if (state == 2) {
				if (ch == ')') {
					Point pt = new Point(Integer.parseInt(sbX.toString().trim()),
							Integer.parseInt(sbY.toString().trim()));
					list.add(pt);
					state = 0;
				} else {
					sbY.append(ch);
				}
			}
		}
		return list.toArray(new Point[0]);
	}

	@Test
	public void testMaxPoints() {
		Solution sol = new Solution();
		Point[] points;
		points = new Point[0];
		assertEquals(0, sol.maxPoints(points));
		points = parsePoints("[(0, 0)]");
		assertEquals(1, sol.maxPoints(points));
		points = parsePoints("[(10,10),(10,10)]");
		assertEquals(2, sol.maxPoints(points));
		points = parsePoints("[(40,-23),(9,138),(429,115),(50,-17),(-3,80),(-10,33),(5,-21),(-3,80),(-6,-65),(-18,26),(-6,-65),(5,72),(0,77),(-9,86),(10,-2),(-8,85),(21,130),(18,-6),(-18,26),(-1,-15),(10,-2),(8,69),(-4,63),(0,3),(-4,40),(-7,84),(-8,7),(30,154),(16,-5),(6,90),(18,-6),(5,77),(-4,77),(7,-13),(-1,-45),(16,-5),(-9,86),(-16,11),(-7,84),(1,76),(3,77),(10,67),(1,-37),(-10,-81),(4,-11),(-20,13),(-10,77),(6,-17),(-27,2),(-10,-81),(10,-1),(-9,1),(-8,43),(2,2),(2,-21),(3,82),(8,-1),(10,-1),(-9,1),(-12,42),(16,-5),(-5,-61),(20,-7),(9,-35),(10,6),(12,106),(5,-21),(-5,82),(6,71),(-15,34),(-10,87),(-14,-12),(12,106),(-5,82),(-46,-45),(-4,63),(16,-5),(4,1),(-3,-53),(0,-17),(9,98),(-18,26),(-9,86),(2,77),(-2,-49),(1,76),(-3,-38),(-8,7),(-17,-37),(5,72),(10,-37),(-4,-57),(-3,-53),(3,74),(-3,-11),(-8,7),(1,88),(-12,42),(1,-37),(2,77),(-6,77),(5,72),(-4,-57),(-18,-33),(-12,42),(-9,86),(2,77),(-8,77),(-3,77),(9,-42),(16,41),(-29,-37),(0,-41),(-21,18),(-27,-34),(0,77),(3,74),(-7,-69),(-21,18),(27,146),(-20,13),(21,130),(-6,-65),(14,-4),(0,3),(9,-5),(6,-29),(-2,73),(-1,-15),(1,76),(-4,77),(6,-29)]");
		assertEquals(25, sol.maxPoints(points));
	}
}
