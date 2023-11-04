package Level00;

public class BinTreeEx {
	
	public static void main(String[] args) {
		BinTree<Integer, String> tree = new BinTree<>();
		
		tree.add(5, "홍길동5");
		tree.add(3, "홍길동3");
		tree.add(2, "홍길동2");
		tree.add(4, "홍길동4");
		tree.add(8, "홍길동8");
		tree.add(6, "홍길동6");
		
		tree.print();
		
		String data = tree.search(4);
		System.out.println(data);
		data = tree.search(10);
		
	}
}
