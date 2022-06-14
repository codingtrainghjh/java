package memory;

public class EqualTest {

	public static void main(String[] args) {

		int[] a = new int[5]; // �迭�� 0���� �ʱ�ȭ
		int[] b = a; // ���� ����
		int[] c = new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length); // ��������

		b[0] = 100;

		System.out.println(a[0]);

		System.out.println(a == b);

		// ��Ʈ��
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "hi";
		String s4 = "hi";
		System.out.println(s3 == s4);

		s1 = null;
		s2 = null;
	}

}
