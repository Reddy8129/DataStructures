package Trees;

//import Trees.BTree.Node;

public class Launch {

	public static void main(String[] args) {
		BTree bTree = new BTree();
		BTree.Node root = new BTree.Node(5);
		
		System.out.println("Creating a tree with root value "+root.value);
		bTree.insert(root,6);
		bTree.insert(root,4);
		bTree.insert(root,2);
		bTree.insert(root,3);
		bTree.insert(root,1);
		bTree.insert(root,7);
		bTree.insert(root,9);
		bTree.insert(root,8);
		
		
		
		bTree.traverseInOrder(root);
	}

}
